package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.HeaderFactory;
import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class ExternalBrowserCredentialsProviderTest {
  @Test
  void clientAndConsentTest() throws IOException {
    FixtureServer.FixtureMapping fixture =
        new FixtureServer.FixtureMapping.Builder()
            .validateMethod("GET")
            .validatePath("/oidc/.well-known/oauth-authorization-server")
            .withResponse("{\"token_endpoint\": \"tokenEndPointFromServer\"}", 200)
            .build();
    try (FixtureServer fixtures = new FixtureServer()) {
      fixtures.with(fixture).with(fixture);
      DatabricksConfig config =
          new DatabricksConfig()
              .setAuthType("external-browser")
              .setHost(fixtures.getUrl())
              .setClientId("test-client-id")
              .setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build());
      config.resolve();

      assertEquals("tokenEndPointFromServer", config.getOidcEndpoints().getTokenEndpoint());

      OAuthClient testClient =
          new OAuthClient.Builder()
              .withHttpClient(config.getHttpClient())
              .withClientId(config.getClientId())
              .withClientSecret(config.getClientSecret())
              .withHost(config.getHost())
              .withRedirectUrl(config.getEffectiveOAuthRedirectUrl())
              .withScopes(config.getScopes())
              .build();
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
            .withResponse("{\"token_endpoint\": \"tokenEndPointFromServer\"}", 200)
            .build();
    try (FixtureServer fixtures = new FixtureServer()) {
      fixtures.with(fixture).with(fixture);
      DatabricksConfig config =
          new DatabricksConfig()
              .setAuthType("external-browser")
              .setHost(fixtures.getUrl())
              .setClientId("test-client-id")
              .setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build())
              .setOAuthRedirectUrl("http://localhost:8010")
              .setScopes(Arrays.asList("sql"));
      config.resolve();

      assertEquals("tokenEndPointFromServer", config.getOidcEndpoints().getTokenEndpoint());

      OAuthClient testClient =
          new OAuthClient.Builder()
              .withHttpClient(config.getHttpClient())
              .withClientId(config.getClientId())
              .withClientSecret(config.getClientSecret())
              .withHost(config.getHost())
              .withRedirectUrl(config.getEffectiveOAuthRedirectUrl())
              .withScopes(config.getScopes())
              .build();
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
    DatabricksConfig config =
        new DatabricksConfig()
            .setAuthType("external-browser")
            .setHost("https://accounts.cloud.databricks.com")
            .setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build())
            .setAccountId("testAccountId");
    config.resolve();

    String prefix = "https://accounts.cloud.databricks.com/oidc/accounts/" + config.getAccountId();
    assertEquals(prefix + "/v1/token", config.getOidcEndpoints().getTokenEndpoint());
    assertEquals(prefix + "/v1/authorize", config.getOidcEndpoints().getAuthorizationEndpoint());
  }

  @Test
  void exchangeTest() throws IOException {
    HttpClient hc = Mockito.mock(HttpClient.class);
    String response =
        "{\"access_token\": \"accessTokenFromServer\", \"token_type\": \"tokenTypeFromServer\", \"expires_in\": \"10\", \"refresh_token\": \"refreshTokenFromServer\"}";
    URL url = new URL("https://databricks.com/");

    // Mock because it's a POST Request to http client
    Mockito.doReturn(new Response(response, url)).when(hc).execute(any(Request.class));

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
    URL url = new URL("https://databricks.com/");
    Mockito.doReturn(new Response(response, url)).when(hc).execute(any(Request.class));

    ClientCredentials clientCredentials =
        new ClientCredentials.Builder()
            .withHttpClient(hc)
            .withClientId("testClientId")
            .withClientSecret("abc")
            .withTokenUrl("https://tokenUrl")
            .build();
    Token token = clientCredentials.getToken();
    assertEquals("accessTokenFromServer", token.getAccessToken());
    assertEquals("refreshTokenFromServer", token.getRefreshToken());
  }

  @Test
  void sessionCredentials() throws IOException {
    HttpClient hc = Mockito.mock(HttpClient.class);
    String response =
        "{\"access_token\": \"accessTokenFromServer\", \"token_type\": \"tokenTypeFromServer\", \"expires_in\": \"10\", \"refresh_token\": \"refreshTokenFromServer\"}";
    URL url = new URL("https://databricks.com/");
    Mockito.doReturn(new Response(response, url)).when(hc).execute(any(Request.class));

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
                    Instant.MAX))
            .build();
    Token token = sessionCredentials.getToken();

    // We check that we are actually getting the token from server response (that is defined
    // above) rather than what was given while creating session credentials
    assertEquals("accessTokenFromServer", token.getAccessToken());
    assertEquals("refreshTokenFromServer", token.getRefreshToken());
  }

  // Token caching tests

  @Test
  void cacheWithValidTokenTest() throws IOException {
    // Create mock HTTP client for token refresh
    HttpClient mockHttpClient = Mockito.mock(HttpClient.class);
    String refreshResponse =
        "{\"access_token\": \"refreshed_access_token\", \"token_type\": \"Bearer\", \"expires_in\": \"3600\", \"refresh_token\": \"new_refresh_token\"}";
    URL url = new URL("https://test.databricks.com/");
    Mockito.doReturn(new Response(refreshResponse, url))
        .when(mockHttpClient)
        .execute(any(Request.class));

    // Create an valid token with valid refresh token
    Instant futureTime = Instant.now().plusSeconds(3600);
    Token validToken = new Token("valid_access_token", "Bearer", "valid_refresh_token", futureTime);

    // Create mock token cache that returns the valid token
    TokenCache mockTokenCache = Mockito.mock(TokenCache.class);
    Mockito.doReturn(validToken).when(mockTokenCache).load();

    // Create config with HTTP client and mock token cache
    DatabricksConfig config =
        new DatabricksConfig()
            .setAuthType("external-browser")
            .setHost("https://test.databricks.com")
            .setClientId("test-client-id")
            .setHttpClient(mockHttpClient);

    // We need to provide OIDC endpoints for token refresh
    OpenIDConnectEndpoints endpoints =
        new OpenIDConnectEndpoints(
            "https://test.databricks.com/token", "https://test.databricks.com/authorize");

    // Create our provider with the mock token cache and mock the browser auth method
    ExternalBrowserCredentialsProvider provider =
        Mockito.spy(new ExternalBrowserCredentialsProvider(mockTokenCache));

    // Spy on the config to inject the endpoints
    DatabricksConfig spyConfig = Mockito.spy(config);
    Mockito.doReturn(endpoints).when(spyConfig).getOidcEndpoints();

    // Configure provider
    HeaderFactory headerFactory = provider.configure(spyConfig);

    // Verify headers contain the refreshed token even though the cached token is valid
    Map<String, String> headers = headerFactory.headers();
    assertEquals("Bearer refreshed_access_token", headers.get("Authorization"));

    // Verify token was loaded from cache
    Mockito.verify(mockTokenCache, Mockito.times(1)).load();

    // Verify HTTP call was made to refresh the token
    Mockito.verify(mockHttpClient, Mockito.times(1)).execute(any(Request.class));

    // Verify performBrowserAuth was NOT called since refresh succeeded
    Mockito.verify(provider, Mockito.never())
        .performBrowserAuth(
            any(DatabricksConfig.class),
            any(String.class),
            any(String.class),
            any(TokenCache.class));

    // Verify token was saved back to cache
    Mockito.verify(mockTokenCache, Mockito.times(1)).save(any(Token.class));

    // Capture the token that was saved to cache to verify it's the refreshed token
    ArgumentCaptor<Token> tokenCaptor = ArgumentCaptor.forClass(Token.class);
    Mockito.verify(mockTokenCache).save(tokenCaptor.capture());
    Token savedToken = tokenCaptor.getValue();

    // Verify the saved token contains the refreshed values from the HTTP response
    assertEquals(
        "refreshed_access_token",
        savedToken.getAccessToken(),
        "Should save refreshed access token to cache");
    assertEquals(
        "new_refresh_token",
        savedToken.getRefreshToken(),
        "Should save new refresh token to cache");
  }

  @Test
  void cacheWithInvalidAccessTokenValidRefreshTest() throws IOException {
    // Create mock HTTP client for token refresh
    HttpClient mockHttpClient = Mockito.mock(HttpClient.class);
    String refreshResponse =
        "{\"access_token\": \"refreshed_access_token\", \"token_type\": \"Bearer\", \"expires_in\": \"3600\", \"refresh_token\": \"new_refresh_token\"}";
    URL url = new URL("https://test.databricks.com/");
    Mockito.doReturn(new Response(refreshResponse, url))
        .when(mockHttpClient)
        .execute(any(Request.class));

    // Create an expired token with valid refresh token
    Instant pastTime = Instant.now().minusSeconds(3600);
    Token expiredToken =
        new Token("expired_access_token", "Bearer", "valid_refresh_token", pastTime);

    // Create mock token cache that returns the expired token
    TokenCache mockTokenCache = Mockito.mock(TokenCache.class);
    Mockito.doReturn(expiredToken).when(mockTokenCache).load();

    // Create config with HTTP client and mock token cache
    DatabricksConfig config =
        new DatabricksConfig()
            .setAuthType("external-browser")
            .setHost("https://test.databricks.com")
            .setClientId("test-client-id")
            .setHttpClient(mockHttpClient);

    // We need to provide OIDC endpoints for token refresh
    OpenIDConnectEndpoints endpoints =
        new OpenIDConnectEndpoints(
            "https://test.databricks.com/token", "https://test.databricks.com/authorize");

    // Create our provider with the mock token cache
    ExternalBrowserCredentialsProvider provider =
        Mockito.spy(new ExternalBrowserCredentialsProvider(mockTokenCache));

    // Spy on the config to inject the endpoints
    DatabricksConfig spyConfig = Mockito.spy(config);
    Mockito.doReturn(endpoints).when(spyConfig).getOidcEndpoints();

    // Configure provider
    HeaderFactory headerFactory = provider.configure(spyConfig);

    // Verify headers contain the refreshed token, not the browser auth token or expired token
    Map<String, String> headers = headerFactory.headers();
    assertEquals("Bearer refreshed_access_token", headers.get("Authorization"));

    // Verify token was loaded from cache
    Mockito.verify(mockTokenCache, Mockito.times(1)).load();

    // Verify HTTP call was made to refresh the token
    Mockito.verify(mockHttpClient, Mockito.times(1)).execute(any(Request.class));

    // Verify performBrowserAuth was NOT called since refresh succeeded
    Mockito.verify(provider, Mockito.never())
        .performBrowserAuth(
            any(DatabricksConfig.class),
            any(String.class),
            any(String.class),
            any(TokenCache.class));

    // Verify token was saved back to cache
    Mockito.verify(mockTokenCache, Mockito.times(1)).save(any(Token.class));

    // Capture the token that was saved to cache to verify it's the refreshed token
    ArgumentCaptor<Token> tokenCaptor = ArgumentCaptor.forClass(Token.class);
    Mockito.verify(mockTokenCache).save(tokenCaptor.capture());
    Token savedToken = tokenCaptor.getValue();

    // Verify the saved token contains the refreshed values from the HTTP response
    assertEquals(
        "refreshed_access_token",
        savedToken.getAccessToken(),
        "Should save refreshed access token to cache");
    assertEquals(
        "new_refresh_token",
        savedToken.getRefreshToken(),
        "Should save new refresh token to cache");
  }

  @Test
  void cacheWithInvalidAccessTokenRefreshFailingTest() throws IOException {
    // Create HTTP client that fails when refreshing token
    HttpClient mockHttpClient = Mockito.mock(HttpClient.class);
    Mockito.doThrow(new IOException("Failed to refresh token"))
        .when(mockHttpClient)
        .execute(any(Request.class));

    // Create an expired token with invalid refresh token
    Instant pastTime = Instant.now().minusSeconds(3600);
    Token expiredToken =
        new Token("expired_access_token", "Bearer", "invalid_refresh_token", pastTime);

    // Create mock token cache that returns the expired token
    TokenCache mockTokenCache = Mockito.mock(TokenCache.class);
    Mockito.doReturn(expiredToken).when(mockTokenCache).load();

    // Setup browser auth result (should be used as fallback)
    Token browserAuthToken =
        new Token(
            "browser_access_token",
            "Bearer",
            "browser_refresh_token",
            Instant.now().plusSeconds(3600));

    SessionCredentials sessionCredentials =
        new SessionCredentials.Builder()
            .withToken(browserAuthToken)
            .withClientId("test-client-id")
            .withTokenUrl("https://test-token-url")
            .build();

    CachedTokenSource browserAuthTokenSource =
        new CachedTokenSource.Builder(sessionCredentials).withToken(browserAuthToken).build();

    // Create config with failing HTTP client and mock token cache
    DatabricksConfig config =
        new DatabricksConfig()
            .setAuthType("external-browser")
            .setHost("https://test.databricks.com")
            .setClientId("test-client-id")
            .setHttpClient(mockHttpClient);

    // We need to provide OIDC endpoints for token refresh attempt
    OpenIDConnectEndpoints endpoints =
        new OpenIDConnectEndpoints(
            "https://test.databricks.com/token", "https://test.databricks.com/authorize");

    // Create our provider and mock the browser auth method
    ExternalBrowserCredentialsProvider provider =
        Mockito.spy(new ExternalBrowserCredentialsProvider(mockTokenCache));
    Mockito.doReturn(browserAuthTokenSource)
        .when(provider)
        .performBrowserAuth(any(DatabricksConfig.class), any(), any(), any(TokenCache.class));

    // Spy on the config to inject the endpoints
    DatabricksConfig spyConfig = Mockito.spy(config);
    Mockito.doReturn(endpoints).when(spyConfig).getOidcEndpoints();

    // Configure provider
    HeaderFactory headerFactory = provider.configure(spyConfig);
    assertNotNull(headerFactory);

    // Verify headers contain the browser auth token (fallback)
    Map<String, String> headers = headerFactory.headers();
    assertEquals("Bearer browser_access_token", headers.get("Authorization"));

    // Verify token was loaded from cache
    Mockito.verify(mockTokenCache, Mockito.times(1)).load();

    // Verify performBrowserAuth was called since refresh failed
    Mockito.verify(provider, Mockito.times(1))
        .performBrowserAuth(any(DatabricksConfig.class), any(), any(), any(TokenCache.class));

    // Verify token was saved after browser auth (for the new token)
    Mockito.verify(mockTokenCache, Mockito.times(1)).save(any(Token.class));
  }

  @Test
  void cacheWithInvalidTokensTest() throws IOException {
    // Create completely invalid token (no refresh token)
    Instant pastTime = Instant.now().minusSeconds(3600);
    Token invalidToken = new Token("expired_access_token", "Bearer", null, pastTime);

    // Create mock token cache that returns the invalid token
    TokenCache mockTokenCache = Mockito.mock(TokenCache.class);
    Mockito.doReturn(invalidToken).when(mockTokenCache).load();

    // Setup browser auth result (should be used as fallback)
    Token browserAuthToken =
        new Token(
            "browser_access_token",
            "Bearer",
            "browser_refresh_token",
            Instant.now().plusSeconds(3600));

    SessionCredentials sessionCredentials =
        new SessionCredentials.Builder()
            .withToken(browserAuthToken)
            .withClientId("test-client-id")
            .withTokenUrl("https://test-token-url")
            .build();

    CachedTokenSource browserAuthTokenSource =
        new CachedTokenSource.Builder(sessionCredentials).withToken(browserAuthToken).build();

    // Create simple config
    DatabricksConfig config =
        new DatabricksConfig()
            .setAuthType("external-browser")
            .setHost("https://test.databricks.com")
            .setClientId("test-client-id");

    // Create our provider and mock the browser auth method
    ExternalBrowserCredentialsProvider provider =
        Mockito.spy(new ExternalBrowserCredentialsProvider(mockTokenCache));
    Mockito.doReturn(browserAuthTokenSource)
        .when(provider)
        .performBrowserAuth(any(DatabricksConfig.class), any(), any(), any(TokenCache.class));

    // Configure provider
    HeaderFactory headerFactory = provider.configure(config);
    assertNotNull(headerFactory);
    // Verify headers contain the browser auth token (fallback)
    Map<String, String> headers = headerFactory.headers();
    assertEquals("Bearer browser_access_token", headers.get("Authorization"));

    // Verify token was loaded from cache
    Mockito.verify(mockTokenCache, Mockito.times(1)).load();

    // Verify performBrowserAuth was called since we had an invalid token
    Mockito.verify(provider, Mockito.times(1))
        .performBrowserAuth(any(DatabricksConfig.class), any(), any(), any(TokenCache.class));

    // Verify token was saved after browser auth (for the new token)
    Mockito.verify(mockTokenCache, Mockito.times(1)).save(any(Token.class));
  }
}
