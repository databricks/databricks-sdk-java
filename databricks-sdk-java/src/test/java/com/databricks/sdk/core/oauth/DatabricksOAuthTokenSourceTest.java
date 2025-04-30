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
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.ArgumentCaptor;
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
    final boolean expectError; // Whether this case should result in an error
    final int statusCode; // HTTP status code for the response
    final String responseBody; // Response body from the token endpoint

    TestCase(
        String name,
        String audience,
        String accountId,
        String expectedAudience,
        boolean expectError,
        int statusCode,
        String responseBody) {
      this.name = name;
      this.audience = audience;
      this.accountId = accountId;
      this.expectedAudience = expectedAudience;
      this.expectError = expectError;
      this.statusCode = statusCode;
      this.responseBody = responseBody;
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
    String successJson;
    String errorJson;
    try {
      successJson = mapper.writeValueAsString(successResponse);
      errorJson = mapper.writeValueAsString(errorResponse);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return Stream.of(
        // Success cases with different audience configurations
        new TestCase(
            "Default audience from token endpoint",
            null,
            null,
            TEST_TOKEN_ENDPOINT,
            false,
            200,
            successJson),
        new TestCase(
            "Custom audience provided",
            TEST_AUDIENCE,
            null,
            TEST_AUDIENCE,
            false,
            200,
            successJson),
        new TestCase(
            "Custom audience takes precedence over account ID",
            TEST_AUDIENCE,
            TEST_ACCOUNT_ID,
            TEST_AUDIENCE,
            false,
            200,
            successJson),
        new TestCase(
            "Account ID used as audience when no custom audience",
            null,
            TEST_ACCOUNT_ID,
            TEST_ACCOUNT_ID,
            false,
            200,
            successJson),
        // Error cases
        new TestCase(
            "Invalid request returns 400", null, null, TEST_TOKEN_ENDPOINT, true, 400, errorJson),
        new TestCase(
            "Network error during token exchange", null, null, TEST_TOKEN_ENDPOINT, true, 0, null),
        new TestCase(
            "Invalid JSON response from server",
            null,
            null,
            TEST_TOKEN_ENDPOINT,
            true,
            200,
            "invalid json"));
  }

  /**
   * Tests OAuth token exchange with various configurations and error scenarios. Verifies correct
   * audience selection, token exchange, and error handling.
   */
  @ParameterizedTest(name = "testTokenSource: {arguments}")
  @MethodSource("provideTestCases")
  void testTokenSource(TestCase testCase) throws IOException {
    // Mock HTTP client with test case specific behavior
    HttpClient mockHttpClient = Mockito.mock(HttpClient.class);
    if (testCase.expectError) {
      if (testCase.statusCode == 0) {
        when(mockHttpClient.execute(any())).thenThrow(new IOException("Network error"));
      } else {
        when(mockHttpClient.execute(any()))
            .thenReturn(
                new Response(
                    testCase.responseBody, testCase.statusCode, "Bad Request", new URL(TEST_HOST)));
      }
    } else {
      when(mockHttpClient.execute(any()))
          .thenReturn(new Response(testCase.responseBody, new URL(TEST_HOST)));
    }

    // Create token source with test configuration
    OpenIDConnectEndpoints endpoints =
        new OpenIDConnectEndpoints(TEST_TOKEN_ENDPOINT, TEST_AUTHORIZATION_ENDPOINT);

    DatabricksOAuthTokenSource.Builder builder =
        new DatabricksOAuthTokenSource.Builder(
            TEST_CLIENT_ID, TEST_HOST, endpoints, mockIdTokenSource, mockHttpClient);

    if (testCase.audience != null) {
      builder.audience(testCase.audience);
    }
    if (testCase.accountId != null) {
      builder.accountId(testCase.accountId);
    }

    DatabricksOAuthTokenSource tokenSource = builder.build();

    if (testCase.expectError) {
      if (testCase.statusCode == 400) {
        assertThrows(IllegalArgumentException.class, () -> tokenSource.getToken());
      } else {
        assertThrows(DatabricksException.class, () -> tokenSource.getToken());
      }
    } else {
      // Verify successful token exchange
      Token token = tokenSource.getToken();
      assertEquals(TOKEN, token.getAccessToken());
      assertEquals(TOKEN_TYPE, token.getTokenType());
      assertEquals(REFRESH_TOKEN, token.getRefreshToken());
      assertFalse(token.isExpired());

      // Verify correct audience was used
      verify(mockIdTokenSource).getIDToken(testCase.expectedAudience);

      // Verify token exchange request
      ArgumentCaptor<FormRequest> requestCaptor = ArgumentCaptor.forClass(FormRequest.class);
      verify(mockHttpClient).execute(requestCaptor.capture());

      FormRequest capturedRequest = requestCaptor.getValue();
      assertEquals(TEST_TOKEN_ENDPOINT, capturedRequest.getUrl());

      // Verify request parameters
      String body = capturedRequest.getBodyString();
      assertTrue(body.contains("client_id=" + TEST_CLIENT_ID));
      assertTrue(body.contains("subject_token=" + TEST_ID_TOKEN));
      assertTrue(
          body.contains("subject_token_type=urn%3Aietf%3Aparams%3Aoauth%3Atoken-type%3Ajwt"));
      assertTrue(
          body.contains("grant_type=urn%3Aietf%3Aparams%3Aoauth%3Agrant-type%3Atoken-exchange"));
      assertTrue(body.contains("scope=all-apis"));
    }
  }

  /**
   * Tests validation of required fields in the token source builder. Verifies that null or empty
   * values for required fields throw IllegalArgumentException.
   */
  @Test
  void testConstructorValidation() {
    // Test null client ID
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new DatabricksOAuthTokenSource.Builder(
                  null,
                  TEST_HOST,
                  new OpenIDConnectEndpoints(TEST_TOKEN_ENDPOINT, TEST_AUTHORIZATION_ENDPOINT),
                  mockIdTokenSource,
                  Mockito.mock(HttpClient.class))
              .build();
        });

    // Test empty client ID
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new DatabricksOAuthTokenSource.Builder(
                  "",
                  TEST_HOST,
                  new OpenIDConnectEndpoints(TEST_TOKEN_ENDPOINT, TEST_AUTHORIZATION_ENDPOINT),
                  mockIdTokenSource,
                  Mockito.mock(HttpClient.class))
              .build();
        });

    // Test null host
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new DatabricksOAuthTokenSource.Builder(
                  TEST_CLIENT_ID,
                  null,
                  new OpenIDConnectEndpoints(TEST_TOKEN_ENDPOINT, TEST_AUTHORIZATION_ENDPOINT),
                  mockIdTokenSource,
                  Mockito.mock(HttpClient.class))
              .build();
        });

    // Test empty host
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new DatabricksOAuthTokenSource.Builder(
                  TEST_CLIENT_ID,
                  "",
                  new OpenIDConnectEndpoints(TEST_TOKEN_ENDPOINT, TEST_AUTHORIZATION_ENDPOINT),
                  mockIdTokenSource,
                  Mockito.mock(HttpClient.class))
              .build();
        });

    // Test null endpoints
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new DatabricksOAuthTokenSource.Builder(
                  TEST_CLIENT_ID,
                  TEST_HOST,
                  null,
                  mockIdTokenSource,
                  Mockito.mock(HttpClient.class))
              .build();
        });

    // Test null IDTokenSource
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new DatabricksOAuthTokenSource.Builder(
                  TEST_CLIENT_ID,
                  TEST_HOST,
                  new OpenIDConnectEndpoints(TEST_TOKEN_ENDPOINT, TEST_AUTHORIZATION_ENDPOINT),
                  null,
                  Mockito.mock(HttpClient.class))
              .build();
        });

    // Test null HttpClient
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new DatabricksOAuthTokenSource.Builder(
                  TEST_CLIENT_ID,
                  TEST_HOST,
                  new OpenIDConnectEndpoints(TEST_TOKEN_ENDPOINT, TEST_AUTHORIZATION_ENDPOINT),
                  mockIdTokenSource,
                  null)
              .build();
        });
  }
}
