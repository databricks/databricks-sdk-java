package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ExternalBrowserCredentialsProviderTest {
  @Test
  void clientAndConsentTest() throws IOException {
    FixtureServer.FixtureMapping fixture =
        new FixtureServer.FixtureMapping.Builder()
            .validateMethod("GET")
            .validatePath("/oidc/.well-known/oauth-authorization-server")
            .withResponse("{\"token_endpoint\": \"tokenEndPointFromServer\"}")
            .build();
    try (FixtureServer fixtures = new FixtureServer()) {
      fixtures.with(fixture).with(fixture);
      DatabricksConfig config =
          new DatabricksConfig()
              .setAuthType("external-browser")
              .setHost(fixtures.getUrl())
              .setClientId("test-client-id")
              .setHttpClient(new CommonsHttpClient(30));
      config.resolve();

      assertEquals("tokenEndPointFromServer", config.getOidcEndpoints().getTokenEndpoint());

      OAuthClient testClient = new OAuthClient(config);
      assertEquals("test-client-id", testClient.getClientId());

      Consent testConsent = testClient.initiateConsent();
      assertEquals("tokenEndPointFromServer", testConsent.getTokenUrl());
      assertEquals("test-client-id", testConsent.getClientId());
      String authUrl = testConsent.getAuthUrl();
      assertNotNull(authUrl);
      assertTrue(authUrl.contains("response_type=code"));
      assertTrue(authUrl.contains("client_id=test-client-id"));
      assertTrue(authUrl.contains("redirect_uri=http://localhost:8080/callback"));
      assertTrue(authUrl.contains("scope=offline_access%20clusters%20sql"));
    }
  }

  @Test
  void clientAndConsentTestWithCustomRedirectUrl() throws IOException {
    FixtureServer.FixtureMapping fixture =
        new FixtureServer.FixtureMapping.Builder()
            .validateMethod("GET")
            .validatePath("/oidc/.well-known/oauth-authorization-server")
            .withResponse("{\"token_endpoint\": \"tokenEndPointFromServer\"}")
            .build();
    try (FixtureServer fixtures = new FixtureServer()) {
      fixtures.with(fixture).with(fixture);
      DatabricksConfig config =
          new DatabricksConfig()
              .setAuthType("external-browser")
              .setHost(fixtures.getUrl())
              .setClientId("test-client-id")
              .setHttpClient(new CommonsHttpClient(30))
              .setOAuthRedirectUrl("http://localhost:8010")
              .setScopes(Arrays.asList("sql"));
      config.resolve();

      assertEquals("tokenEndPointFromServer", config.getOidcEndpoints().getTokenEndpoint());

      OAuthClient testClient = new OAuthClient(config);
      assertEquals("test-client-id", testClient.getClientId());

      Consent testConsent = testClient.initiateConsent();
      assertEquals("tokenEndPointFromServer", testConsent.getTokenUrl());
      assertEquals("test-client-id", testConsent.getClientId());
      String authUrl = testConsent.getAuthUrl();
      assertNotNull(authUrl);
      assertTrue(authUrl.contains("response_type=code"));
      assertTrue(authUrl.contains("client_id=test-client-id"));
      assertTrue(authUrl.contains("redirect_uri=http://localhost:8010"));
      assertTrue(authUrl.contains("scope=sql"));
    }
  }

  @Test
  void openIDConnectEndPointsTestAccounts() throws IOException {
    String testHost = "https://localhost:8080";
    DatabricksConfig config =
        new DatabricksConfig()
            .setAuthType("external-browser")
            .setHost("https://localhost:8080")
            .setHttpClient(new CommonsHttpClient(30))
            .setAccountId("testAccountId");
    config.resolve();

    String prefix = testHost + "/oidc/accounts/" + config.getAccountId();
    assertEquals(prefix + "/v1/token", config.getOidcEndpoints().getTokenEndpoint());
    assertEquals(prefix + "/v1/authorize", config.getOidcEndpoints().getAuthorizationEndpoint());
  }

  @Test
  void exchangeTest() throws IOException {
    HttpClient hc = Mockito.mock(HttpClient.class);
    String response =
        "{\"access_token\": \"accessTokenFromServer\", \"token_type\": \"tokenTypeFromServer\", \"expires_in\": \"10\", \"refresh_token\": \"refreshTokenFromServer\"}";

    // Mock because it's a POST Request to http client
    Mockito.doReturn(new Response(response)).when(hc).execute(any(Request.class));

    Consent testConsent =
        new Consent.Builder()
            .withClientId("testId")
            .withClientSecret("testSecret")
            .withAuthUrl("https://testUrl")
            .withTokenUrl("testToken")
            .withRedirectUrl("https://localhost:8080")
            .withState("testState")
            .withVerifier("testVerifier")
            .withHttpClient(hc)
            .build();

    Map<String, String> queryError = new HashMap<>();
    queryError.put("error", "testError");
    queryError.put("error_description", "testErrorDescription");
    try {
      testConsent.exchangeCallbackParameters(queryError);
    } catch (DatabricksException e) {
      assertEquals("testError: testErrorDescription", e.getMessage());
    }

    Map<String, String> queryNoCodeCallback = new HashMap<>();
    try {
      testConsent.exchangeCallbackParameters(queryNoCodeCallback);
    } catch (DatabricksException e) {
      assertEquals("No code returned in callback", e.getMessage());
    }

    Map<String, String> queryCreds = new HashMap<>();
    queryCreds.put("code", "testCode");
    queryCreds.put("state", "testState");
    SessionCredentials creds = testConsent.exchangeCallbackParameters(queryCreds);
    assertEquals("accessTokenFromServer", creds.token.getAccessToken());
    assertEquals("refreshTokenFromServer", creds.token.getRefreshToken());
  }

  @Test
  void clientCredentials() throws IOException {
    HttpClient hc = Mockito.mock(HttpClient.class);
    String response =
        "{\"access_token\": \"accessTokenFromServer\", \"token_type\": \"tokenTypeFromServer\", \"expires_in\": \"10\", \"refresh_token\": \"refreshTokenFromServer\"}";
    Mockito.doReturn(new Response(response)).when(hc).execute(any(Request.class));

    ClientCredentials clientCredentials =
        new ClientCredentials.Builder()
            .withHttpClient(hc)
            .withClientId("testClientId")
            .withClientSecret("abc")
            .withTokenUrl("https://tokenUrl")
            .build();
    Token token = clientCredentials.refresh();
    assertEquals("accessTokenFromServer", token.getAccessToken());
    assertEquals("refreshTokenFromServer", token.getRefreshToken());
  }

  @Test
  void sessionCredentials() throws IOException {
    HttpClient hc = Mockito.mock(HttpClient.class);
    String response =
        "{\"access_token\": \"accessTokenFromServer\", \"token_type\": \"tokenTypeFromServer\", \"expires_in\": \"10\", \"refresh_token\": \"refreshTokenFromServer\"}";
    Mockito.doReturn(new Response(response)).when(hc).execute(any(Request.class));

    SessionCredentials sessionCredentials =
        new SessionCredentials.Builder()
            .withHttpClient(hc)
            .withClientId("testClientId")
            .withClientSecret("abc")
            .withTokenUrl("https://tokenUrl")
            .withToken(
                new Token(
                    "originalAccessToken",
                    "originalTokenType",
                    "originalRefreshToken",
                    LocalDateTime.MAX))
            .build();
    Token token = sessionCredentials.refresh();

    // We check that we are actually getting the token from server response (that is defined
    // above) rather than what was given while creating session credentials
    assertEquals("accessTokenFromServer", token.getAccessToken());
    assertEquals("refreshTokenFromServer", token.getRefreshToken());
  }
}
