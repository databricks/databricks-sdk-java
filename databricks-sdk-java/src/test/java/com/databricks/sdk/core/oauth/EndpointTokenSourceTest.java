package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EndpointTokenSourceTest {
  private static final String TEST_AUTH_DETAILS = "{\"aud\":\"test-audience\"}";
  private static final String TEST_CP_TOKEN = "cp-access-token";
  private static final String TEST_DP_TOKEN = "dp-access-token";
  private static final String TEST_TOKEN_TYPE = "Bearer";
  private static final String TEST_REFRESH_TOKEN = "refresh-token";
  private static final int TEST_EXPIRES_IN = 3600;
  private static final String TEST_HOST = "https://test.databricks.com";

  private static Stream<Arguments> provideEndpointTokenScenarios() throws Exception {
    String successJson =
        "{"
            + "\"access_token\":\""
            + TEST_DP_TOKEN
            + "\","
            + "\"token_type\":\""
            + TEST_TOKEN_TYPE
            + "\","
            + "\"expires_in\":"
            + TEST_EXPIRES_IN
            + ","
            + "\"refresh_token\":\""
            + TEST_REFRESH_TOKEN
            + "\"}";

    String errorJson =
        "{"
            + "\"error\":\"invalid_client\","
            + "\"error_description\":\"Client authentication failed\"}";

    String malformedJson = "{not valid json}";

    // Mock DatabricksOAuthTokenSource for control plane token
    Token cpToken = new Token(TEST_CP_TOKEN, TEST_TOKEN_TYPE, LocalDateTime.now().plusMinutes(10));
    DatabricksOAuthTokenSource mockCpTokenSource = mock(DatabricksOAuthTokenSource.class);
    when(mockCpTokenSource.getToken()).thenReturn(cpToken);

    // Mock HttpClient for success
    HttpClient mockSuccessClient = mock(HttpClient.class);
    when(mockSuccessClient.execute(any()))
        .thenReturn(new Response(successJson, 200, "OK", new URL("https://test.databricks.com/")));

    // Mock HttpClient for error response
    HttpClient mockErrorClient = mock(HttpClient.class);
    when(mockErrorClient.execute(any()))
        .thenReturn(
            new Response(errorJson, 400, "Bad Request", new URL("https://test.databricks.com/")));

    // Mock HttpClient for malformed JSON
    HttpClient mockMalformedClient = mock(HttpClient.class);
    when(mockMalformedClient.execute(any()))
        .thenReturn(
            new Response(malformedJson, 200, "OK", new URL("https://test.databricks.com/")));

    // Mock HttpClient for IOException
    HttpClient mockIOExceptionClient = mock(HttpClient.class);
    when(mockIOExceptionClient.execute(any())).thenThrow(new IOException("Network error"));

    return Stream.of(
        Arguments.of(
            "Success response",
            mockCpTokenSource,
            TEST_AUTH_DETAILS,
            mockSuccessClient,
            TEST_HOST,
            null, // No exception expected
            TEST_DP_TOKEN,
            TEST_TOKEN_TYPE,
            TEST_REFRESH_TOKEN,
            TEST_EXPIRES_IN),
        Arguments.of(
            "OAuth error response",
            mockCpTokenSource,
            TEST_AUTH_DETAILS,
            mockErrorClient,
            TEST_HOST,
            DatabricksException.class,
            null,
            null,
            null,
            0),
        Arguments.of(
            "Malformed JSON response",
            mockCpTokenSource,
            TEST_AUTH_DETAILS,
            mockMalformedClient,
            TEST_HOST,
            DatabricksException.class,
            null,
            null,
            null,
            0),
        Arguments.of(
            "IOException from HttpClient",
            mockCpTokenSource,
            TEST_AUTH_DETAILS,
            mockIOExceptionClient,
            TEST_HOST,
            DatabricksException.class,
            null,
            null,
            null,
            0),
        Arguments.of(
            "Null cpTokenSource",
            null,
            TEST_AUTH_DETAILS,
            mockSuccessClient,
            TEST_HOST,
            NullPointerException.class,
            null,
            null,
            null,
            0),
        Arguments.of(
            "Null authDetails",
            mockCpTokenSource,
            null,
            mockSuccessClient,
            TEST_HOST,
            NullPointerException.class,
            null,
            null,
            null,
            0),
        Arguments.of(
            "Empty authDetails",
            mockCpTokenSource,
            "",
            mockSuccessClient,
            TEST_HOST,
            IllegalArgumentException.class,
            null,
            null,
            null,
            0),
        Arguments.of(
            "Null httpClient",
            mockCpTokenSource,
            TEST_AUTH_DETAILS,
            null,
            TEST_HOST,
            NullPointerException.class,
            null,
            null,
            null,
            0),
        Arguments.of(
            "Null host",
            mockCpTokenSource,
            TEST_AUTH_DETAILS,
            mockSuccessClient,
            null,
            NullPointerException.class,
            null,
            null,
            null,
            0),
        Arguments.of(
            "Empty host",
            mockCpTokenSource,
            TEST_AUTH_DETAILS,
            mockSuccessClient,
            "",
            IllegalArgumentException.class,
            null,
            null,
            null,
            0));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideEndpointTokenScenarios")
  void testEndpointTokenSource(
      String testName,
      DatabricksOAuthTokenSource cpTokenSource,
      String authDetails,
      HttpClient httpClient,
      String host,
      Class<? extends Exception> expectedException,
      String expectedAccessToken,
      String expectedTokenType,
      String expectedRefreshToken,
      int expectedExpiresIn) {
    if (expectedException != null) {
      assertThrows(
          expectedException,
          () -> {
            EndpointTokenSource source =
                new EndpointTokenSource(cpTokenSource, authDetails, httpClient, host);
            source.getToken();
          });
    } else {
      EndpointTokenSource source =
          new EndpointTokenSource(cpTokenSource, authDetails, httpClient, host);
      Token token = source.getToken();
      assertNotNull(token);
      assertEquals(expectedAccessToken, token.getAccessToken());
      assertEquals(expectedTokenType, token.getTokenType());
      assertEquals(expectedRefreshToken, token.getRefreshToken());
    }
  }
}
