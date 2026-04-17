package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;

import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.oauth.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

class AzureMsiCredentialsProviderTest {

  private static final String WORKSPACE_RESOURCE_ID = "/a/b/c";
  private static final String RESOURCE = "https://management.azure.com/";
  private static final String ACCESS_TOKEN = "test-access-token";
  private static final String TOKEN_TYPE = "Bearer";
  private static final ObjectMapper MAPPER = new ObjectMapper();

  private static CachedTokenSource mockTokenSource(String tokenValue) {
    TokenSource inner = Mockito.mock(TokenSource.class);
    Mockito.when(inner.getToken())
        .thenReturn(new Token(tokenValue, "Bearer", Instant.now().plusSeconds(3600)));
    return new CachedTokenSource.Builder(inner).build();
  }

  private static Response makeImdsTokenResponse(
      String accessToken, String tokenType, String expiresOn) throws Exception {
    Map<String, Object> body = new HashMap<>();
    if (accessToken != null) body.put("access_token", accessToken);
    if (tokenType != null) body.put("token_type", tokenType);
    if (expiresOn != null) body.put("expires_on", expiresOn);
    String json = MAPPER.writeValueAsString(body);
    return new Response(json, new URL("http://169.254.169.254/"));
  }

  // ── Token source tests ──────────────────────────────────────────────────

  @Nested
  @TestInstance(TestInstance.Lifecycle.PER_CLASS)
  class TokenSourceTests {

    @Test
    void testHappyPath() throws Exception {
      HttpClient mockClient = Mockito.mock(HttpClient.class);
      long expiresOn = Instant.now().plusSeconds(3600).getEpochSecond();
      Mockito.when(mockClient.execute(any()))
          .thenReturn(makeImdsTokenResponse(ACCESS_TOKEN, TOKEN_TYPE, String.valueOf(expiresOn)));

      AzureMsiTokenSource tokenSource = new AzureMsiTokenSource(mockClient, RESOURCE, null);
      Token token = tokenSource.getToken();

      assertEquals(ACCESS_TOKEN, token.getAccessToken());
      assertEquals(TOKEN_TYPE, token.getTokenType());
      assertEquals(Instant.ofEpochSecond(expiresOn), token.getExpiry());
    }

    @Test
    void testRequestIncludesCorrectParams() throws Exception {
      HttpClient mockClient = Mockito.mock(HttpClient.class);
      long expiresOn = Instant.now().plusSeconds(3600).getEpochSecond();
      Mockito.when(mockClient.execute(any()))
          .thenReturn(makeImdsTokenResponse(ACCESS_TOKEN, TOKEN_TYPE, String.valueOf(expiresOn)));

      AzureMsiTokenSource tokenSource = new AzureMsiTokenSource(mockClient, RESOURCE, null);
      tokenSource.getToken();

      ArgumentCaptor<Request> captor = ArgumentCaptor.forClass(Request.class);
      Mockito.verify(mockClient).execute(captor.capture());
      Request req = captor.getValue();

      assertEquals("GET", req.getMethod());
      assertTrue(req.getUrl().contains("169.254.169.254/metadata/identity/oauth2/token"));
      assertEquals("true", req.getHeaders().get("Metadata"));
      assertTrue(req.getUri().toString().contains("api-version=2018-02-01"));
      assertTrue(
          req.getUri()
              .toString()
              .contains("resource=" + java.net.URLEncoder.encode(RESOURCE, "UTF-8")));
      assertFalse(req.getUri().toString().contains("client_id"));
    }

    Stream<Arguments> clientIdCases() {
      return Stream.of(
          Arguments.of("my-client-id", true, "non-empty client_id is included"),
          Arguments.of("", false, "empty client_id is excluded"),
          Arguments.of(null, false, "null client_id is excluded"));
    }

    @ParameterizedTest(name = "{2}")
    @MethodSource("clientIdCases")
    void testClientIdInRequest(String clientId, boolean expectPresent, String description)
        throws Exception {
      HttpClient mockClient = Mockito.mock(HttpClient.class);
      long expiresOn = Instant.now().plusSeconds(3600).getEpochSecond();
      Mockito.when(mockClient.execute(any()))
          .thenReturn(makeImdsTokenResponse(ACCESS_TOKEN, TOKEN_TYPE, String.valueOf(expiresOn)));

      AzureMsiTokenSource tokenSource = new AzureMsiTokenSource(mockClient, RESOURCE, clientId);
      tokenSource.getToken();

      ArgumentCaptor<Request> captor = ArgumentCaptor.forClass(Request.class);
      Mockito.verify(mockClient).execute(captor.capture());
      String uri = captor.getValue().getUri().toString();

      if (expectPresent) {
        assertTrue(uri.contains("client_id=" + clientId));
      } else {
        assertFalse(uri.contains("client_id"));
      }
    }

    Stream<Arguments> invalidResponseCases() {
      return Stream.of(
          Arguments.of(null, TOKEN_TYPE, "1700000000", "access_token", "missing access_token"),
          Arguments.of(ACCESS_TOKEN, null, "1700000000", "token_type", "missing token_type"),
          Arguments.of(ACCESS_TOKEN, TOKEN_TYPE, null, "expires_on", "missing expires_on"),
          Arguments.of(
              ACCESS_TOKEN,
              TOKEN_TYPE,
              "not-a-number",
              "Invalid 'expires_on' value",
              "non-numeric expires_on"),
          Arguments.of(
              ACCESS_TOKEN,
              TOKEN_TYPE,
              "99999999999999999999999999999",
              "Invalid 'expires_on' value",
              "overflow expires_on"));
    }

    @ParameterizedTest(name = "{4}")
    @MethodSource("invalidResponseCases")
    void testInvalidResponseThrowsException(
        String accessToken,
        String tokenType,
        String expiresOn,
        String expectedMessage,
        String description)
        throws Exception {
      HttpClient mockClient = Mockito.mock(HttpClient.class);
      Mockito.when(mockClient.execute(any()))
          .thenReturn(makeImdsTokenResponse(accessToken, tokenType, expiresOn));

      AzureMsiTokenSource tokenSource = new AzureMsiTokenSource(mockClient, RESOURCE, null);

      DatabricksException ex = assertThrows(DatabricksException.class, tokenSource::getToken);
      assertTrue(
          ex.getMessage().contains(expectedMessage),
          "Expected '" + expectedMessage + "' in: " + ex.getMessage());
    }

    @Test
    void testNon200StatusThrowsException() throws Exception {
      HttpClient mockClient = Mockito.mock(HttpClient.class);
      Mockito.when(mockClient.execute(any()))
          .thenReturn(
              new Response("Not Found", 404, "Not Found", new URL("http://169.254.169.254/")));

      AzureMsiTokenSource tokenSource = new AzureMsiTokenSource(mockClient, RESOURCE, null);

      DatabricksException ex = assertThrows(DatabricksException.class, tokenSource::getToken);
      assertTrue(ex.getMessage().contains("status code 404"));
    }

    @Test
    void testIOExceptionThrowsDatabricksException() throws Exception {
      HttpClient mockClient = Mockito.mock(HttpClient.class);
      Mockito.when(mockClient.execute(any())).thenThrow(new IOException("connection refused"));

      AzureMsiTokenSource tokenSource = new AzureMsiTokenSource(mockClient, RESOURCE, null);

      DatabricksException ex = assertThrows(DatabricksException.class, tokenSource::getToken);
      assertTrue(ex.getMessage().contains("Failed to request MSI token from IMDS endpoint"));
      assertTrue(ex.getMessage().contains("connection refused"));
    }
  }

  // ── Credentials provider tests ──────────────────────────────────────────

  @Nested
  @TestInstance(TestInstance.Lifecycle.PER_CLASS)
  class ProviderTests {

    @Test
    void testAuthType() {
      assertEquals("azure-msi", new AzureMsiCredentialsProvider().authType());
    }

    Stream<Arguments> returnsNullCases() {
      return Stream.of(
          Arguments.of(
              "https://accounts.cloud.databricks.com", true, null, false, "non-Azure host"),
          Arguments.of(
              "https://adb-123.4.azuredatabricks.net", false, null, false, "MSI not enabled"),
          Arguments.of(null, true, null, true, "neither host nor resource ID"));
    }

    @ParameterizedTest(name = "returns null when {4}")
    @MethodSource("returnsNullCases")
    void testReturnsNull(
        String host,
        boolean azureUseMsi,
        String resourceId,
        boolean mockIsAzure,
        String description) {
      AzureMsiCredentialsProvider provider = Mockito.spy(new AzureMsiCredentialsProvider());
      DatabricksConfig config;
      if (mockIsAzure) {
        config = Mockito.spy(new DatabricksConfig().setCredentialsProvider(provider));
        Mockito.doReturn(true).when(config).isAzure();
      } else {
        config = new DatabricksConfig().setCredentialsProvider(provider);
        if (host != null) config.setHost(host);
        if (resourceId != null) config.setAzureWorkspaceResourceId(resourceId);
      }
      if (azureUseMsi) config.setAzureUseMsi(true);

      assertNull(provider.configure(config));
    }

    @Test
    void testHappyFlowWithResourceId() throws Exception {
      // Mirrors TestMsiHappyFlow from Go SDK.
      AzureMsiCredentialsProvider provider = Mockito.spy(new AzureMsiCredentialsProvider());

      CachedTokenSource armTokenSource = mockTokenSource("bcd");
      CachedTokenSource innerTokenSource = mockTokenSource("cde");
      CachedTokenSource cloudTokenSource = mockTokenSource("def");
      Mockito.doReturn(armTokenSource)
          .doReturn(innerTokenSource)
          .doReturn(cloudTokenSource)
          .when(provider)
          .tokenSourceFor(any(), anyString());

      HttpClient mockClient = Mockito.mock(HttpClient.class);
      Map<String, Object> armResponse = new HashMap<>();
      Map<String, Object> properties = new HashMap<>();
      properties.put("workspaceUrl", "abc.azuredatabricks.net");
      armResponse.put("properties", properties);
      Mockito.when(mockClient.execute(any()))
          .thenReturn(
              new Response(
                  MAPPER.writeValueAsString(armResponse),
                  200,
                  "OK",
                  new URL("https://management.azure.com/")));

      DatabricksConfig config =
          new DatabricksConfig()
              .setCredentialsProvider(provider)
              .setAzureWorkspaceResourceId(WORKSPACE_RESOURCE_ID)
              .setAzureUseMsi(true)
              .setHttpClient(mockClient);

      OAuthHeaderFactory result = provider.configure(config);

      assertNotNull(result);
      Map<String, String> headers = result.headers();
      assertEquals("Bearer cde", headers.get("Authorization"));
      assertEquals("def", headers.get("X-Databricks-Azure-SP-Management-Token"));
      assertEquals(WORKSPACE_RESOURCE_ID, headers.get("X-Databricks-Azure-Workspace-Resource-Id"));

      // Verify host was resolved and ARM call was correct.
      assertEquals("https://abc.azuredatabricks.net", config.getHost());
      ArgumentCaptor<Request> reqCaptor = ArgumentCaptor.forClass(Request.class);
      Mockito.verify(mockClient).execute(reqCaptor.capture());
      assertTrue(reqCaptor.getValue().getUrl().contains(WORKSPACE_RESOURCE_ID));
      assertEquals("Bearer bcd", reqCaptor.getValue().getHeaders().get("Authorization"));

      // Verify tokenSourceFor was called 3 times: ARM, inner, cloud.
      ArgumentCaptor<String> resCaptor = ArgumentCaptor.forClass(String.class);
      Mockito.verify(provider, Mockito.times(3)).tokenSourceFor(any(), resCaptor.capture());
      assertEquals("https://management.azure.com/", resCaptor.getAllValues().get(0));
      assertEquals(AzureEnvironment.ARM_DATABRICKS_RESOURCE_ID, resCaptor.getAllValues().get(1));
      assertEquals("https://management.core.windows.net/", resCaptor.getAllValues().get(2));
    }

    @Test
    void testFailsOnResolveWorkspace() throws Exception {
      // Mirrors TestMsiFailsOnResolveWorkspace from Go SDK.
      AzureMsiCredentialsProvider provider = Mockito.spy(new AzureMsiCredentialsProvider());
      CachedTokenSource armTokenSource = mockTokenSource("bcd");
      Mockito.doReturn(armTokenSource).when(provider).tokenSourceFor(any(), anyString());

      HttpClient mockClient = Mockito.mock(HttpClient.class);
      Mockito.when(mockClient.execute(any()))
          .thenReturn(
              new Response(
                  "Not Found", 404, "Not Found", new URL("https://management.azure.com/")));

      DatabricksConfig config =
          new DatabricksConfig()
              .setCredentialsProvider(provider)
              .setAzureWorkspaceResourceId(WORKSPACE_RESOURCE_ID)
              .setAzureUseMsi(true)
              .setHttpClient(mockClient);

      assertThrows(DatabricksException.class, () -> provider.configure(config));
    }

    @Test
    void testHappyFlowWithHostAndNoResourceId() {
      // Mirrors TestMsiHappyFlowWithHostAndNoResourceID from Go SDK.
      AzureMsiCredentialsProvider provider = Mockito.spy(new AzureMsiCredentialsProvider());

      CachedTokenSource innerTokenSource = mockTokenSource("cde");
      CachedTokenSource cloudTokenSource = mockTokenSource("def");
      Mockito.doReturn(innerTokenSource)
          .doReturn(cloudTokenSource)
          .when(provider)
          .tokenSourceFor(any(), anyString());

      DatabricksConfig config =
          new DatabricksConfig()
              .setHost("https://adb-123.4.azuredatabricks.net")
              .setCredentialsProvider(provider)
              .setAzureUseMsi(true);

      OAuthHeaderFactory result = provider.configure(config);

      assertNotNull(result);
      Map<String, String> headers = result.headers();
      assertEquals("Bearer cde", headers.get("Authorization"));
      assertEquals("def", headers.get("X-Databricks-Azure-SP-Management-Token"));
      assertNull(headers.get("X-Databricks-Azure-Workspace-Resource-Id"));

      // Verify tokenSourceFor called with correct resources (no ARM call).
      ArgumentCaptor<String> resCaptor = ArgumentCaptor.forClass(String.class);
      Mockito.verify(provider, Mockito.times(2)).tokenSourceFor(any(), resCaptor.capture());
      assertEquals(AzureEnvironment.ARM_DATABRICKS_RESOURCE_ID, resCaptor.getAllValues().get(0));
      assertEquals("https://management.core.windows.net/", resCaptor.getAllValues().get(1));
    }

    @Test
    void testWithClientId() {
      // Mirrors TestMsiTokenNotFound scenario from Go SDK.
      AzureMsiCredentialsProvider provider = Mockito.spy(new AzureMsiCredentialsProvider());

      CachedTokenSource innerTokenSource = mockTokenSource("cde");
      CachedTokenSource cloudTokenSource = mockTokenSource("def");
      Mockito.doReturn(innerTokenSource)
          .doReturn(cloudTokenSource)
          .when(provider)
          .tokenSourceFor(any(), anyString());

      DatabricksConfig config =
          new DatabricksConfig()
              .setHost("https://adb-123.4.azuredatabricks.net")
              .setCredentialsProvider(provider)
              .setAzureUseMsi(true)
              .setAzureClientId("abc");

      OAuthHeaderFactory result = provider.configure(config);

      assertNotNull(result);
      assertEquals("Bearer cde", result.headers().get("Authorization"));
    }
  }
}
