package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.FormRequest;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

class DatabricksOAuthTokenSourceTest {
  // Test constants
  private static final String TOKEN = "test-access-token";
  private static final String TOKEN_TYPE = "Bearer";
  private static final String REFRESH_TOKEN = "test-refresh-token";
  private static final int EXPIRES_IN = 3600;

  private static final String TEST_HOST = "https://test.databricks.com";
  private static final String TEST_TOKEN_ENDPOINT = TEST_HOST + "/oidc/v1/token";
  private static final String TEST_AUTHORIZATION_ENDPOINT = TEST_HOST + "/authorize";
  private static final String TEST_CLIENT_ID = "test-client-id";
  private static final String TEST_ID_TOKEN = "test-id-token";
  private static final String TEST_AUDIENCE = "test-audience";
  private static final String TEST_ACCOUNT_ID = "test-account-id";

  /**
   * Test case data for parameterized token source tests. Each case defines a specific OAuth token
   * exchange scenario.
   */
  private static class TestCase {
    final String name; // Descriptive name of the test case
    final String clientId; // Client ID to use
    final String host; // Host to use
    final OpenIDConnectEndpoints endpoints; // OIDC endpoints
    final IDTokenSource idTokenSource; // ID token source
    final HttpClient httpClient; // HTTP client
    final String audience; // Custom audience value if provided
    final String accountId; // Account ID if provided
    final String expectedAudience; // Expected audience used in token exchange
    final Class<? extends Exception> expectedException; // Expected exception type if any

    TestCase(
        String name,
        String clientId,
        String host,
        OpenIDConnectEndpoints endpoints,
        IDTokenSource idTokenSource,
        HttpClient httpClient,
        String audience,
        String accountId,
        String expectedAudience,
        Class<? extends Exception> expectedException) {
      this.name = name;
      this.clientId = clientId;
      this.host = host;
      this.endpoints = endpoints;
      this.idTokenSource = idTokenSource;
      this.httpClient = httpClient;
      this.audience = audience;
      this.accountId = accountId;
      this.expectedAudience = expectedAudience;
      this.expectedException = expectedException;
    }

    @Override
    public String toString() {
      return name;
    }
  }

  /**
   * Provides test cases for OAuth token exchange scenarios. Includes success cases with different
   * audience configurations and various error cases.
   */
  private static Stream<TestCase> provideTestCases() throws MalformedURLException {
    // Create valid components for reuse
    OpenIDConnectEndpoints testEndpoints =
        new OpenIDConnectEndpoints(TEST_TOKEN_ENDPOINT, TEST_AUTHORIZATION_ENDPOINT);
    IDTokenSource testIdTokenSource = Mockito.mock(IDTokenSource.class);
    IDToken idToken = new IDToken(TEST_ID_TOKEN);
    when(testIdTokenSource.getIDToken(any())).thenReturn(idToken);

    // Create success response for token exchange tests
    Map<String, Object> successResponse = new HashMap<>();
    successResponse.put("access_token", TOKEN);
    successResponse.put("token_type", TOKEN_TYPE);
    successResponse.put("refresh_token", REFRESH_TOKEN);
    successResponse.put("expires_in", EXPIRES_IN);

    // Create error response for invalid requests
    Map<String, Object> errorResponse = new HashMap<>();
    errorResponse.put("error", "invalid_request");
    errorResponse.put("error_description", "Invalid client ID");

    try {
      ObjectMapper mapper = new ObjectMapper();
      final String errorJson = mapper.writeValueAsString(errorResponse);
      final String successJson = mapper.writeValueAsString(successResponse);

      // Create the expected request that will be used in all test cases
      Map<String, String> formParams = new HashMap<>();
      formParams.put("client_id", TEST_CLIENT_ID);
      formParams.put("subject_token", TEST_ID_TOKEN);
      formParams.put("subject_token_type", "urn:ietf:params:oauth:token-type:jwt");
      formParams.put("grant_type", "urn:ietf:params:oauth:grant-type:token-exchange");
      formParams.put("scope", "all-apis");
      FormRequest expectedRequest = new FormRequest(TEST_TOKEN_ENDPOINT, formParams);

      return Stream.of(
          // Token exchange test cases
          new TestCase(
              "Default audience from token endpoint",
              TEST_CLIENT_ID,
              TEST_HOST,
              testEndpoints,
              testIdTokenSource,
              createMockHttpClient(expectedRequest, 200, successJson),
              null,
              null,
              TEST_TOKEN_ENDPOINT,
              null),
          new TestCase(
              "Custom audience provided",
              TEST_CLIENT_ID,
              TEST_HOST,
              testEndpoints,
              testIdTokenSource,
              createMockHttpClient(expectedRequest, 200, successJson),
              TEST_AUDIENCE,
              null,
              TEST_AUDIENCE,
              null),
          new TestCase(
              "Custom audience takes precedence over account ID",
              TEST_CLIENT_ID,
              TEST_HOST,
              testEndpoints,
              testIdTokenSource,
              createMockHttpClient(expectedRequest, 200, successJson),
              TEST_AUDIENCE,
              TEST_ACCOUNT_ID,
              TEST_AUDIENCE,
              null),
          new TestCase(
              "Account ID used as audience when no custom audience",
              TEST_CLIENT_ID,
              TEST_HOST,
              testEndpoints,
              testIdTokenSource,
              createMockHttpClient(expectedRequest, 200, successJson),
              null,
              TEST_ACCOUNT_ID,
              TEST_ACCOUNT_ID,
              null),
          new TestCase(
              "Invalid request returns 400",
              TEST_CLIENT_ID,
              TEST_HOST,
              testEndpoints,
              testIdTokenSource,
              createMockHttpClient(expectedRequest, 400, errorJson),
              null,
              null,
              TEST_TOKEN_ENDPOINT,
              DatabricksException.class),
          new TestCase(
              "Network error during token exchange",
              TEST_CLIENT_ID,
              TEST_HOST,
              testEndpoints,
              testIdTokenSource,
              createMockHttpClientWithError(expectedRequest),
              null,
              null,
              TEST_TOKEN_ENDPOINT,
              DatabricksException.class),
          new TestCase(
              "Invalid JSON response from server",
              TEST_CLIENT_ID,
              TEST_HOST,
              testEndpoints,
              testIdTokenSource,
              createMockHttpClient(expectedRequest, 200, "invalid json"),
              null,
              null,
              TEST_TOKEN_ENDPOINT,
              DatabricksException.class),
          // Parameter validation test cases
          new TestCase(
              "Null client ID",
              null,
              TEST_HOST,
              testEndpoints,
              testIdTokenSource,
              createMockHttpClient(expectedRequest, 200, successJson),
              null,
              null,
              null,
              NullPointerException.class),
          new TestCase(
              "Empty client ID",
              "",
              TEST_HOST,
              testEndpoints,
              testIdTokenSource,
              createMockHttpClient(expectedRequest, 200, successJson),
              null,
              null,
              null,
              IllegalArgumentException.class),
          new TestCase(
              "Null host",
              TEST_CLIENT_ID,
              null,
              testEndpoints,
              testIdTokenSource,
              createMockHttpClient(expectedRequest, 200, successJson),
              null,
              null,
              null,
              NullPointerException.class),
          new TestCase(
              "Empty host",
              TEST_CLIENT_ID,
              "",
              testEndpoints,
              testIdTokenSource,
              createMockHttpClient(expectedRequest, 200, successJson),
              null,
              null,
              null,
              IllegalArgumentException.class),
          new TestCase(
              "Null endpoints",
              TEST_CLIENT_ID,
              TEST_HOST,
              null,
              testIdTokenSource,
              createMockHttpClient(expectedRequest, 200, successJson),
              null,
              null,
              null,
              NullPointerException.class),
          new TestCase(
              "Null IDTokenSource",
              TEST_CLIENT_ID,
              TEST_HOST,
              testEndpoints,
              null,
              createMockHttpClient(expectedRequest, 200, successJson),
              null,
              null,
              null,
              NullPointerException.class),
          new TestCase(
              "Null HttpClient",
              TEST_CLIENT_ID,
              TEST_HOST,
              testEndpoints,
              testIdTokenSource,
              null,
              null,
              null,
              null,
              NullPointerException.class));
    } catch (IOException e) {
      throw new RuntimeException("Failed to create test cases", e);
    }
  }

  private static HttpClient createMockHttpClient(
      FormRequest expectedRequest, int statusCode, String responseBody) {
    try {
      HttpClient mockHttpClient = Mockito.mock(HttpClient.class);
      String statusMessage = statusCode == 200 ? "OK" : "Bad Request";
      when(mockHttpClient.execute(expectedRequest))
          .thenReturn(new Response(responseBody, statusCode, statusMessage, new URL(TEST_HOST)));
      return mockHttpClient;
    } catch (IOException e) {
      throw new RuntimeException("Failed to create mock HTTP client", e);
    }
  }

  private static HttpClient createMockHttpClientWithError(FormRequest expectedRequest) {
    try {
      HttpClient mockHttpClient = Mockito.mock(HttpClient.class);
      when(mockHttpClient.execute(expectedRequest)).thenThrow(new IOException("Network error"));
      return mockHttpClient;
    } catch (IOException e) {
      throw new RuntimeException("Failed to create mock HTTP client with error", e);
    }
  }

  /**
   * Tests OAuth token exchange with various configurations and error scenarios. Verifies correct
   * audience selection, token exchange, and error handling.
   */
  @ParameterizedTest(name = "{0}")
  @MethodSource("provideTestCases")
  void testTokenSource(TestCase testCase) {
    DatabricksOAuthTokenSource.Builder builder =
        new DatabricksOAuthTokenSource.Builder(
            testCase.clientId,
            testCase.host,
            testCase.endpoints,
            testCase.idTokenSource,
            testCase.httpClient);

    builder.audience(testCase.audience);
    builder.accountId(testCase.accountId);

    DatabricksOAuthTokenSource tokenSource = builder.build();

    if (testCase.expectedException != null) {
      assertThrows(testCase.expectedException, () -> tokenSource.getToken());
    } else {
      // Verify successful token exchange
      Token token = tokenSource.getToken();
      assertEquals(TOKEN, token.getAccessToken());
      assertEquals(TOKEN_TYPE, token.getTokenType());
      assertEquals(REFRESH_TOKEN, token.getRefreshToken());

      // Verify correct audience was used
      verify(testCase.idTokenSource, atLeastOnce()).getIDToken(testCase.expectedAudience);
    }
  }
}
