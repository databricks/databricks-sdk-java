package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ExternalBrowserCredentialsProviderTest {
  @Test
  void clientAndConsentTest() {
    try (FixtureServer fixtures = new FixtureServer()) {
      fixtures.with(
          "GET /oidc/.well-known/oauth-authorization-server",
          "{\"token_endpoint\": \"tokenEndPointFromServer\"}");
      String clientID = "test-client-id";
      DatabricksConfig config =
          new DatabricksConfig()
              .setAuthType("external-browser")
              .setHost(fixtures.getUrl())
              .setClientId(clientID)
              .setHttpClient(new CommonsHttpClient(30));
      config.resolve();

      OAuthClient testClient = new OAuthClient(config);
      assertEquals(testClient.getClientId(), clientID);

      Consent testConsent = testClient.initiateConsent();
      assertEquals(testConsent.getTokenUrl(), "tokenEndPointFromServer");
      assertEquals(testConsent.getClientId(), "test-client-id");
      assertNotNull(testConsent.getAuthUrl());
    } catch (IOException e) {
      throw new DatabricksException(e.getMessage());
    }
  }

  @Test
  void exchangeTest() {
    try {
      CommonsHttpClient hc = Mockito.spy(new CommonsHttpClient(30));
      String resp =
          "{\"access_token\": \"accessTokenFromServer\", \"token_type\": \"tokenTypeFromServer\", \"expires_in\": \"10\", \"refresh_token\": \"refreshTokenFromServer\"}";

      // Mock because it's a POST Request to http client
      Mockito.doReturn(new Response(resp)).when(hc).execute(any(Request.class));

      Consent mockConsent =
          Mockito.spy(
              new Consent.Builder()
                  .withClientId("testId")
                  .withClientSecret("testSecret")
                  .withAuthUrl("https://testUrl")
                  .withTokenUrl("testToken")
                  .withRedirectUrl("https://localhost:8080")
                  .withState("testState")
                  .withVerifier("testVerifier")
                  .withHttpClient(hc)
                  .build());

      Map<String, String> queryError = new HashMap<>();
      queryError.put("error", "testError");
      queryError.put("error_description", "testErrorDescription");
      try {
        mockConsent.exchangeCallbackParameters(queryError);
      } catch (DatabricksException e) {
        assertEquals(e.getMessage(), "testError: testErrorDescription");
      }

      Map<String, String> queryNoCodeCallback = new HashMap<>();
      try {
        mockConsent.exchangeCallbackParameters(queryNoCodeCallback);
      } catch (DatabricksException e) {
        assertEquals(e.getMessage(), "No code returned in callback");
      }

      Map<String, String> queryCreds = new HashMap<>();
      queryCreds.put("code", "testCode");
      queryCreds.put("state", "testState");
      RefreshableCredentials creds = mockConsent.exchangeCallbackParameters(queryCreds);
      assertEquals(creds.token.getAccessToken(), "accessTokenFromServer");
      assertEquals(creds.token.getRefreshToken(), "refreshTokenFromServer");
    } catch (IOException e) {
      throw new DatabricksException(e.getMessage());
    }
  }

  @Test
  void clientCredentials() {
    try {
      CommonsHttpClient hc = Mockito.spy(new CommonsHttpClient(30));
      String resp =
          "{\"access_token\": \"accessTokenFromServer\", \"token_type\": \"tokenTypeFromServer\", \"expires_in\": \"10\", \"refresh_token\": \"refreshTokenFromServer\"}";

      Mockito.doReturn(new Response(resp)).when(hc).execute(any(Request.class));
      ClientCredentials clientCredentials =
          new ClientCredentials.Builder()
              .withHttpClient(hc)
              .withClientId("testClientId")
              .withClientSecret("abc")
              .withTokenUrl("https://tokenUrl")
              .build();
      Token token = clientCredentials.refresh();
      assertEquals(token.getAccessToken(), "accessTokenFromServer");
      assertEquals(token.getRefreshToken(), "refreshTokenFromServer");
    } catch (IOException e) {
      throw new DatabricksException(e.getMessage());
    }
  }

  @Test
  void refreshableCredentials() {
    try {
      CommonsHttpClient hc = Mockito.spy(new CommonsHttpClient(30));
      String resp =
          "{\"access_token\": \"accessTokenFromServer\", \"token_type\": \"tokenTypeFromServer\", \"expires_in\": \"10\", \"refresh_token\": \"refreshTokenFromServer\"}";

      Mockito.doReturn(new Response(resp)).when(hc).execute(any(Request.class));
      RefreshableCredentials refreshableCredentials =
          new RefreshableCredentials.Builder()
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
      Token token = refreshableCredentials.refresh();

      // We check that we are actually getting the token from server response (that is defined
      // above) rather than what was given while creating refreshable credentials
      assertEquals(token.getAccessToken(), "accessTokenFromServer");
      assertEquals(token.getRefreshToken(), "refreshTokenFromServer");
    } catch (IOException e) {
      throw new DatabricksException(e.getMessage());
    }
  }
}
