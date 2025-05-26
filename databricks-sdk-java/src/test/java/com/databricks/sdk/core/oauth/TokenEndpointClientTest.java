package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.FormRequest;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TokenEndpointClientTest {
  private static final String TOKEN_ENDPOINT_URL = "https://test.databricks.com/oauth/token";
  private static final Map<String, String> PARAMS = new HashMap<>();

  private static Stream<Arguments> provideTokenScenarios() throws Exception {
    // Success response JSON
    String successJson =
        "{"
            + "\"access_token\":\"test-access-token\","
            + "\"token_type\":\"Bearer\","
            + "\"expires_in\":3600,"
            + "\"refresh_token\":\"test-refresh-token\"}";
    // Error response JSON
    String errorJson =
        "{"
            + "\"error\":\"invalid_client\","
            + "\"error_description\":\"Client authentication failed\"}";
    // Malformed JSON
    String malformedJson = "{not valid json}";

    // Mock HttpClient for success
    HttpClient mockSuccessClient = mock(HttpClient.class);
    when(mockSuccessClient.execute(any(FormRequest.class)))
        .thenReturn(new Response(successJson, 200, "OK", new URL("https://test.databricks.com/")));

    // Mock HttpClient for error response
    HttpClient mockErrorClient = mock(HttpClient.class);
    when(mockErrorClient.execute(any(FormRequest.class)))
        .thenReturn(
            new Response(errorJson, 400, "Bad Request", new URL("https://test.databricks.com/")));

    // Mock HttpClient for malformed JSON
    HttpClient mockMalformedClient = mock(HttpClient.class);
    when(mockMalformedClient.execute(any(FormRequest.class)))
        .thenReturn(
            new Response(malformedJson, 200, "OK", new URL("https://test.databricks.com/")));

    // Mock HttpClient for IOException
    HttpClient mockIOExceptionClient = mock(HttpClient.class);
    when(mockIOExceptionClient.execute(any(FormRequest.class)))
        .thenThrow(new IOException("Network error"));

    return Stream.of(
        Arguments.of(
            "Success response",
            mockSuccessClient,
            TOKEN_ENDPOINT_URL,
            PARAMS,
            null, // No exception expected
            "test-access-token",
            "Bearer",
            3600,
            "test-refresh-token"),
        Arguments.of(
            "OAuth error response",
            mockErrorClient,
            TOKEN_ENDPOINT_URL,
            PARAMS,
            DatabricksException.class,
            null,
            null,
            0,
            null),
        Arguments.of(
            "Malformed JSON response",
            mockMalformedClient,
            TOKEN_ENDPOINT_URL,
            PARAMS,
            DatabricksException.class,
            null,
            null,
            0,
            null),
        Arguments.of(
            "IOException from HttpClient",
            mockIOExceptionClient,
            TOKEN_ENDPOINT_URL,
            PARAMS,
            DatabricksException.class,
            null,
            null,
            0,
            null),
        Arguments.of(
            "Null HttpClient",
            null,
            TOKEN_ENDPOINT_URL,
            PARAMS,
            NullPointerException.class,
            null,
            null,
            0,
            null),
        Arguments.of(
            "Null tokenEndpointUrl",
            mockSuccessClient,
            null,
            PARAMS,
            NullPointerException.class,
            null,
            null,
            0,
            null),
        Arguments.of(
            "Empty tokenEndpointUrl",
            mockSuccessClient,
            "",
            PARAMS,
            IllegalArgumentException.class,
            null,
            null,
            0,
            null),
        Arguments.of(
            "Null params",
            mockSuccessClient,
            TOKEN_ENDPOINT_URL,
            null,
            NullPointerException.class,
            null,
            null,
            0,
            null));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideTokenScenarios")
  void testRequestToken(
      String testName,
      HttpClient httpClient,
      String tokenEndpointUrl,
      Map<String, String> params,
      Class<? extends Exception> expectedException,
      String expectedAccessToken,
      String expectedTokenType,
      int expectedExpiresIn,
      String expectedRefreshToken) {
    if (expectedException != null) {
      assertThrows(
          expectedException,
          () -> TokenEndpointClient.requestToken(httpClient, tokenEndpointUrl, params));
    } else {
      OAuthResponse response =
          TokenEndpointClient.requestToken(httpClient, tokenEndpointUrl, params);
      assertNotNull(response);
      assertEquals(expectedAccessToken, response.getAccessToken());
      assertEquals(expectedTokenType, response.getTokenType());
      assertEquals(expectedExpiresIn, response.getExpiresIn());
      assertEquals(expectedRefreshToken, response.getRefreshToken());
    }
  }
}
