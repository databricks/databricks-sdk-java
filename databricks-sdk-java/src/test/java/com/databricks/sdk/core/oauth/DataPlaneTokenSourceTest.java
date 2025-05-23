package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DataPlaneTokenSourceTest {
  private static final String TEST_ENDPOINT_1 = "https://endpoint1.databricks.com/";
  private static final String TEST_ENDPOINT_2 = "https://endpoint2.databricks.com/";
  private static final String TEST_AUTH_DETAILS_1 = "{\"aud\":\"aud1\"}";
  private static final String TEST_AUTH_DETAILS_2 = "{\"aud\":\"aud2\"}";
  private static final String TEST_CP_TOKEN = "cp-access-token";
  private static final String TEST_TOKEN_TYPE = "Bearer";
  private static final String TEST_REFRESH_TOKEN = "refresh-token";
  private static final int TEST_EXPIRES_IN = 3600;

  private static Stream<Arguments> provideDataPlaneTokenScenarios() throws Exception {
    // Mock DatabricksOAuthTokenSource for control plane token
    Token cpToken =
        new Token(TEST_CP_TOKEN, TEST_TOKEN_TYPE, null, LocalDateTime.now().plusSeconds(600));
    DatabricksOAuthTokenSource mockCpTokenSource = mock(DatabricksOAuthTokenSource.class);
    when(mockCpTokenSource.getToken()).thenReturn(cpToken);

    // --- Mock HttpClient for different scenarios ---
    // Success JSON for endpoint1/auth1
    String successJson1 =
        "{"
            + "\"access_token\":\"dp-access-token1\","
            + "\"token_type\":\"Bearer\","
            + "\"refresh_token\":\"refresh-token\","
            + "\"expires_in\":3600"
            + "}";
    HttpClient mockSuccessClient1 = mock(HttpClient.class);
    when(mockSuccessClient1.execute(any()))
        .thenReturn(new Response(successJson1, 200, "OK", new URL(TEST_ENDPOINT_1)));

    // Success JSON for endpoint2/auth2
    String successJson2 =
        "{"
            + "\"access_token\":\"dp-access-token2\","
            + "\"token_type\":\"Bearer\","
            + "\"refresh_token\":\"refresh-token\","
            + "\"expires_in\":3600"
            + "}";
    HttpClient mockSuccessClient2 = mock(HttpClient.class);
    when(mockSuccessClient2.execute(any()))
        .thenReturn(new Response(successJson2, 200, "OK", new URL(TEST_ENDPOINT_2)));

    // Error response JSON
    String errorJson =
        "{" + "\"error\":\"invalid_request\"," + "\"error_description\":\"Bad request\"" + "}";
    HttpClient mockErrorClient = mock(HttpClient.class);
    when(mockErrorClient.execute(any()))
        .thenReturn(new Response(errorJson, 400, "Bad Request", new URL(TEST_ENDPOINT_1)));

    // IOException scenario
    HttpClient mockIOExceptionClient = mock(HttpClient.class);
    when(mockIOExceptionClient.execute(any())).thenThrow(new IOException("Network error"));

    // For null cpTokenSource
    DatabricksOAuthTokenSource nullCpTokenSource = null;

    // For null httpClient
    HttpClient nullHttpClient = null;

    // For null/empty endpoint or authDetails
    return Stream.of(
        Arguments.of(
            "Success: endpoint1/auth1",
            TEST_ENDPOINT_1,
            TEST_AUTH_DETAILS_1,
            mockSuccessClient1,
            mockCpTokenSource,
            new Token(
                "dp-access-token1",
                TEST_TOKEN_TYPE,
                TEST_REFRESH_TOKEN,
                LocalDateTime.now().plusSeconds(TEST_EXPIRES_IN)),
            null // No exception
            ),
        Arguments.of(
            "Success: endpoint2/auth2 (different cache key)",
            TEST_ENDPOINT_2,
            TEST_AUTH_DETAILS_2,
            mockSuccessClient2,
            mockCpTokenSource,
            new Token(
                "dp-access-token2",
                TEST_TOKEN_TYPE,
                TEST_REFRESH_TOKEN,
                LocalDateTime.now().plusSeconds(TEST_EXPIRES_IN)),
            null),
        Arguments.of(
            "Error response from endpoint",
            TEST_ENDPOINT_1,
            TEST_AUTH_DETAILS_1,
            mockErrorClient,
            mockCpTokenSource,
            null,
            com.databricks.sdk.core.DatabricksException.class),
        Arguments.of(
            "IOException from HttpClient",
            TEST_ENDPOINT_1,
            TEST_AUTH_DETAILS_1,
            mockIOExceptionClient,
            mockCpTokenSource,
            null,
            com.databricks.sdk.core.DatabricksException.class),
        Arguments.of(
            "Null cpTokenSource",
            TEST_ENDPOINT_1,
            TEST_AUTH_DETAILS_1,
            mockSuccessClient1,
            nullCpTokenSource,
            null,
            NullPointerException.class),
        Arguments.of(
            "Null httpClient",
            TEST_ENDPOINT_1,
            TEST_AUTH_DETAILS_1,
            nullHttpClient,
            mockCpTokenSource,
            null,
            NullPointerException.class),
        Arguments.of(
            "Null endpoint",
            null,
            TEST_AUTH_DETAILS_1,
            mockSuccessClient1,
            mockCpTokenSource,
            null,
            NullPointerException.class),
        Arguments.of(
            "Null authDetails",
            TEST_ENDPOINT_1,
            null,
            mockSuccessClient1,
            mockCpTokenSource,
            null,
            NullPointerException.class));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideDataPlaneTokenScenarios")
  void testDataPlaneTokenSource(
      String testName,
      String endpoint,
      String authDetails,
      HttpClient httpClient,
      DatabricksOAuthTokenSource cpTokenSource,
      Token expectedToken,
      Class<? extends Exception> expectedException) {
    if (expectedException != null) {
      assertThrows(
          expectedException,
          () -> {
            DataPlaneTokenSource source = new DataPlaneTokenSource(httpClient, cpTokenSource);
            source.getToken(endpoint, authDetails);
          });
    } else {
      DataPlaneTokenSource source = new DataPlaneTokenSource(httpClient, cpTokenSource);
      Token token = source.getToken(endpoint, authDetails);
      assertNotNull(token);
      assertEquals(expectedToken.getAccessToken(), token.getAccessToken());
      assertEquals(expectedToken.getTokenType(), token.getTokenType());
      assertEquals(expectedToken.getRefreshToken(), token.getRefreshToken());
      assertTrue(token.isValid());
    }
  }
}
