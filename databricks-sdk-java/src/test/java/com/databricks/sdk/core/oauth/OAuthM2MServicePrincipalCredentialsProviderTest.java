package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class OAuthM2MServicePrincipalCredentialsProviderTest {
  // Verifies that M2M includes assume_group every time an expired client-credentials token is
  // minted, rather than only on the initial request.
  @Test
  void everyTokenMintIncludesTheGroup() {
    RecordingHttpClient httpClient = new RecordingHttpClient();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            .setAccountId("account-123")
            .setDiscoveryUrl("https://accounts.cloud.databricks.com/discovery")
            .setClientId("client-id")
            .setClientSecret("client-secret")
            .setGroupId("group-123")
            .setHttpClient(httpClient)
            .setDisableAsyncTokenRefresh(true);

    OAuthHeaderFactory headers =
        new OAuthM2MServicePrincipalCredentialsProvider().configure(config);

    assertEquals("Bearer token-1", headers.headers().get("Authorization"));
    assertEquals("Bearer token-2", headers.headers().get("Authorization"));
    assertEquals(2, httpClient.tokenBodies.size());
    for (String body : httpClient.tokenBodies) {
      assertTrue(body.contains("grant_type=client_credentials"));
      assertTrue(body.contains("assume_group=group-123"));
      assertFalse(body.contains("refresh_token"));
    }
  }

  // Verifies that a server rejection is returned after one grouped M2M request and is never
  // retried without assume_group.
  @Test
  void groupServerRejectionDoesNotFallback() {
    RejectingHttpClient httpClient = new RejectingHttpClient();
    DatabricksConfig config = config(httpClient, "group-123");

    OAuthHeaderFactory headers =
        new OAuthM2MServicePrincipalCredentialsProvider().configure(config);

    assertThrows(DatabricksException.class, headers::headers);
    assertEquals(1, httpClient.tokenBodies.size());
    assertTrue(httpClient.tokenBodies.get(0).contains("assume_group=group-123"));
  }

  // Verifies that separate M2M clients for normal access and different groups each cache only
  // their own access token.
  @Test
  void cachesAreIsolatedByClient() {
    GroupTokenHttpClient httpClient = new GroupTokenHttpClient();
    String[][] testCases = {
      {null, "Bearer token-normal"},
      {"group-a", "Bearer token-group-a"},
      {"group-b", "Bearer token-group-b"}
    };

    for (String[] testCase : testCases) {
      OAuthHeaderFactory headers =
          new OAuthM2MServicePrincipalCredentialsProvider()
              .configure(config(httpClient, testCase[0]));

      assertEquals(testCase[1], headers.headers().get("Authorization"));
      assertEquals(testCase[1], headers.headers().get("Authorization"));
    }

    assertEquals(testCases.length, httpClient.tokenBodies.size());
  }

  /** Creates a fixed M2M configuration using the supplied HTTP client and optional group. */
  private static DatabricksConfig config(HttpClient httpClient, String groupId) {
    return new DatabricksConfig()
        .setHost("https://accounts.cloud.databricks.com")
        .setAccountId("account-123")
        .setDiscoveryUrl("https://accounts.cloud.databricks.com/discovery")
        .setClientId("client-id")
        .setClientSecret("client-secret")
        .setGroupId(groupId)
        .setHttpClient(httpClient)
        .setDisableAsyncTokenRefresh(true);
  }

  private abstract static class TokenHttpClient implements HttpClient {
    final List<String> tokenBodies = new ArrayList<>();

    /** Returns OIDC discovery metadata for GET requests and records every token request body. */
    @Override
    public Response execute(Request request) throws IOException {
      if (request.getMethod().equals("GET")) {
        return new Response(
            "{\"token_endpoint\":\"https://accounts.cloud.databricks.com/oidc/accounts/account-123/v1/token\","
                + "\"authorization_endpoint\":\"https://accounts.cloud.databricks.com/oidc/accounts/account-123/v1/authorize\"}",
            200,
            "OK",
            new URL(request.getUrl()));
      }

      tokenBodies.add(request.getBodyString());
      return tokenResponse(request);
    }

    /** Creates the response for a recorded token request. */
    abstract Response tokenResponse(Request request) throws IOException;
  }

  private static class RejectingHttpClient extends TokenHttpClient {
    /** Simulates a token endpoint that rejects group assumption. */
    @Override
    Response tokenResponse(Request request) throws IOException {
      return new Response(
          "{\"error\":\"invalid_target\"}", 400, "Bad Request", new URL(request.getUrl()));
    }
  }

  private static class GroupTokenHttpClient extends TokenHttpClient {
    /** Returns a distinct token for normal access and for each assumed group. */
    @Override
    Response tokenResponse(Request request) throws IOException {
      String body = request.getBodyString();
      String token = "token-normal";
      if (body.contains("assume_group=group-a")) {
        token = "token-group-a";
      } else if (body.contains("assume_group=group-b")) {
        token = "token-group-b";
      }

      return new Response(
          String.format(
              "{\"access_token\":\"%s\",\"token_type\":\"Bearer\",\"expires_in\":3600}", token),
          200,
          "OK",
          new URL(request.getUrl()));
    }
  }

  private static class RecordingHttpClient implements HttpClient {
    private final List<String> tokenBodies = new ArrayList<>();

    @Override
    public Response execute(Request request) throws IOException {
      if (request.getMethod().equals("GET")) {
        return new Response(
            "{\"token_endpoint\":\"https://accounts.cloud.databricks.com/oidc/accounts/account-123/v1/token\","
                + "\"authorization_endpoint\":\"https://accounts.cloud.databricks.com/oidc/accounts/account-123/v1/authorize\"}",
            200,
            "OK",
            new URL(request.getUrl()));
      }
      tokenBodies.add(request.getBodyString());
      return new Response(
          String.format(
              "{\"access_token\":\"token-%d\",\"token_type\":\"Bearer\",\"expires_in\":0}",
              tokenBodies.size()),
          200,
          "OK",
          new URL(request.getUrl()));
    }
  }
}
