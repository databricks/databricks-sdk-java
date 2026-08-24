package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.DatabricksConfig;
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
