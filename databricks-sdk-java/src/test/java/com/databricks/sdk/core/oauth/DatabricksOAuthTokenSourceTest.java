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
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
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

  // Error message constants
  private static final String ERROR_NULL = "Required parameter '%s' cannot be null";
  private static final String ERROR_EMPTY = "Required parameter '%s' cannot be empty";

  private IDTokenSource mockIdTokenSource;

  @BeforeEach
  void setUp() {
    mockIdTokenSource = Mockito.mock(IDTokenSource.class);
    IDToken idToken = new IDToken(TEST_ID_TOKEN);
    when(mockIdTokenSource.getIDToken(any())).thenReturn(idToken);
  }

  /**
   * Test case data for parameterized token source tests. Each case defines a specific OAuth token
   * exchange scenario.
   */
  private static class TestCase {
    final String name; // Descriptive name of the test case
    final String audience; // Custom audience value if provided
    final String accountId; // Account ID if provided
    final String expectedAudience; // Expected audience used in token exchange
    final HttpClient mockHttpClient; // Pre-configured mock HTTP client
    final Class<? extends Exception> expectedException; // Expected exception type if any

    TestCase(
        String name,
        String audience,
        String accountId,
        String expectedAudience,
        int statusCode,
        Object responseBody,
        HttpClient mockHttpClient,
        Class<? extends Exception> expectedException) {
      this.name = name;
      this.audience = audience;
      this.accountId = accountId;
      this.expectedAudience = expectedAudience;
      this.mockHttpClient = mockHttpClient;
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
  private static Stream<TestCase> provideTestCases() {
    try {
      // Success response with valid token data
      Map<String, Object> successResponse = new HashMap<>();
      successResponse.put("access_token", TOKEN);
      successResponse.put("token_type", TOKEN_TYPE);
      successResponse.put("refresh_token", REFRESH_TOKEN);
      successResponse.put("expires_in", EXPIRES_IN);

      // Error response for invalid requests
      Map<String, Object> errorResponse = new HashMap<>();
      errorResponse.put("error", "invalid_request");
      errorResponse.put("error_description", "Invalid client ID");

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
          // Success cases with different audience configurations
          new TestCase(
              "Default audience from token endpoint",
              null,
              null,
              TEST_TOKEN_ENDPOINT,
              200,
              successResponse,
              createMockHttpClient(expectedRequest, 200, successJson),
              null),
          new TestCase(
              "Custom audience provided",
              TEST_AUDIENCE,
              null,
              TEST_AUDIENCE,
              200,
              successResponse,
              createMockHttpClient(expectedRequest, 200, successJson),
              null),
          new TestCase(
              "Custom audience takes precedence over account ID",
              TEST_AUDIENCE,
              TEST_ACCOUNT_ID,
              TEST_AUDIENCE,
              200,
              successResponse,
              createMockHttpClient(expectedRequest, 200, successJson),
              null),
          new TestCase(
              "Account ID used as audience when no custom audience",
              null,
              TEST_ACCOUNT_ID,
              TEST_ACCOUNT_ID,
              200,
              successResponse,
              createMockHttpClient(expectedRequest, 200, successJson),
              null),
          // Error cases
          new TestCase(
              "Invalid request returns 400",
              null,
              null,
              TEST_TOKEN_ENDPOINT,
              400,
              errorJson,
              createMockHttpClient(expectedRequest, 400, errorJson),
              DatabricksException.class),
          new TestCase(
              "Network error during token exchange",
              null,
              null,
              TEST_TOKEN_ENDPOINT,
              0,
              null,
              createMockHttpClientWithError(expectedRequest),
              DatabricksException.class),
          new TestCase(
              "Invalid JSON response from server",
              null,
              null,
              TEST_TOKEN_ENDPOINT,
              200,
              "invalid json",
              createMockHttpClient(expectedRequest, 200, "invalid json"),
              DatabricksException.class));
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
  @ParameterizedTest(name = "testTokenSource: {arguments}")
  @MethodSource("provideTestCases")
  void testTokenSource(TestCase testCase) {
    try {
      // Create token source with test configuration
      OpenIDConnectEndpoints endpoints =
          new OpenIDConnectEndpoints(TEST_TOKEN_ENDPOINT, TEST_AUTHORIZATION_ENDPOINT);

      DatabricksOAuthTokenSource.Builder builder =
          new DatabricksOAuthTokenSource.Builder(
              TEST_CLIENT_ID, TEST_HOST, endpoints, mockIdTokenSource, testCase.mockHttpClient);

      builder.audience(testCase.audience).accountId(testCase.accountId);

      DatabricksOAuthTokenSource tokenSource = builder.build();

      if (testCase.expectedException != null) {
        assertThrows(testCase.expectedException, () -> tokenSource.getToken());
      } else {
        // Verify successful token exchange
        Token token = tokenSource.getToken();
        assertEquals(TOKEN, token.getAccessToken());
        assertEquals(TOKEN_TYPE, token.getTokenType());
        assertEquals(REFRESH_TOKEN, token.getRefreshToken());
        assertFalse(token.isExpired());

        // Verify correct audience was used
        verify(mockIdTokenSource).getIDToken(testCase.expectedAudience);
      }
    } catch (IOException e) {
      throw new RuntimeException("Test failed", e);
    }
  }

  /**
   * Test case data for parameter validation tests. Each case defines a specific validation
   * scenario.
   */
  private static class ValidationTestCase {
    final String name;
    final String clientId;
    final String host;
    final OpenIDConnectEndpoints endpoints;
    final IDTokenSource idTokenSource;
    final HttpClient httpClient;
    final String expectedFieldName;
    final boolean isNullTest;

    ValidationTestCase(
        String name,
        String clientId,
        String host,
        OpenIDConnectEndpoints endpoints,
        IDTokenSource idTokenSource,
        HttpClient httpClient,
        String expectedFieldName,
        boolean isNullTest) {
      this.name = name;
      this.clientId = clientId;
      this.host = host;
      this.endpoints = endpoints;
      this.idTokenSource = idTokenSource;
      this.httpClient = httpClient;
      this.expectedFieldName = expectedFieldName;
      this.isNullTest = isNullTest;
    }

    @Override
    public String toString() {
      return name;
    }
  }

  private static Stream<ValidationTestCase> provideValidationTestCases()
      throws MalformedURLException {
    OpenIDConnectEndpoints validEndpoints =
        new OpenIDConnectEndpoints(TEST_TOKEN_ENDPOINT, TEST_AUTHORIZATION_ENDPOINT);
    HttpClient validHttpClient = Mockito.mock(HttpClient.class);
    IDTokenSource validIdTokenSource = Mockito.mock(IDTokenSource.class);

    return Stream.of(
        // Client ID validation
        new ValidationTestCase(
            "Null client ID",
            null,
            TEST_HOST,
            validEndpoints,
            validIdTokenSource,
            validHttpClient,
            "ClientID",
            true),
        new ValidationTestCase(
            "Empty client ID",
            "",
            TEST_HOST,
            validEndpoints,
            validIdTokenSource,
            validHttpClient,
            "ClientID",
            false),
        // Host validation
        new ValidationTestCase(
            "Null host",
            TEST_CLIENT_ID,
            null,
            validEndpoints,
            validIdTokenSource,
            validHttpClient,
            "Host",
            true),
        new ValidationTestCase(
            "Empty host",
            TEST_CLIENT_ID,
            "",
            validEndpoints,
            validIdTokenSource,
            validHttpClient,
            "Host",
            false),
        // Endpoints validation
        new ValidationTestCase(
            "Null endpoints",
            TEST_CLIENT_ID,
            TEST_HOST,
            null,
            validIdTokenSource,
            validHttpClient,
            "Endpoints",
            true),
        // IDTokenSource validation
        new ValidationTestCase(
            "Null IDTokenSource",
            TEST_CLIENT_ID,
            TEST_HOST,
            validEndpoints,
            null,
            validHttpClient,
            "IDTokenSource",
            true),
        // HttpClient validation
        new ValidationTestCase(
            "Null HttpClient",
            TEST_CLIENT_ID,
            TEST_HOST,
            validEndpoints,
            validIdTokenSource,
            null,
            "HttpClient",
            true));
  }

  /**
   * Tests validation of required fields in the token source using parameterized test cases.
   * Verifies that null or empty values for required fields cause getToken() to throw
   * IllegalArgumentException with specific error messages.
   */
  @ParameterizedTest(name = "testParameterValidation: {0}")
  @MethodSource("provideValidationTestCases")
  void testParameterValidation(ValidationTestCase testCase) {
    DatabricksOAuthTokenSource tokenSource =
        new DatabricksOAuthTokenSource.Builder(
                testCase.clientId,
                testCase.host,
                testCase.endpoints,
                testCase.idTokenSource,
                testCase.httpClient)
            .build();

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> tokenSource.getToken());

    String expectedMessage =
        String.format(testCase.isNullTest ? ERROR_NULL : ERROR_EMPTY, testCase.expectedFieldName);
    assertEquals(expectedMessage, exception.getMessage());
  }
}
