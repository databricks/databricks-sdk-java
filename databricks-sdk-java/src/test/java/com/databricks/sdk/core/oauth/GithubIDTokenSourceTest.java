package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class GithubIDTokenSourceTest {
  private static final String TEST_REQUEST_URL = "https://github.com/token";
  private static final String TEST_REQUEST_TOKEN = "test-request-token";
  private static final String TEST_ID_TOKEN = "test-id-token";
  private static final String TEST_AUDIENCE = "test-audience";

  private static HttpClient createHttpMock(
      String responseBody, int statusCode, IOException exception) throws IOException {
    HttpClient client = mock(HttpClient.class);
    if (exception != null) {
      when(client.execute(any(Request.class))).thenThrow(exception);
    } else {
      when(client.execute(any(Request.class))).thenReturn(makeResponse(responseBody, statusCode));
    }
    return client;
  }

  private static Stream<Arguments> provideAllTestScenarios() throws IOException {
    return Stream.of(
        // Successful token retrieval with audience
        Arguments.of(
            "Successful token retrieval with audience",
            TEST_REQUEST_URL,
            TEST_REQUEST_TOKEN,
            createHttpMock("{\"value\":\"" + TEST_ID_TOKEN + "\"}", 200, null),
            TEST_AUDIENCE,
            (java.util.function.Predicate<Request>)
                request ->
                    request.getMethod().equals("GET")
                        && request.getUrl().startsWith(TEST_REQUEST_URL)
                        && request.getUrl().contains("audience=" + TEST_AUDIENCE)
                        && request
                            .getHeaders()
                            .get("Authorization")
                            .equals("Bearer " + TEST_REQUEST_TOKEN),
            null),
        // Successful token retrieval without audience
        Arguments.of(
            "Successful token retrieval without audience",
            TEST_REQUEST_URL,
            TEST_REQUEST_TOKEN,
            createHttpMock("{\"value\":\"" + TEST_ID_TOKEN + "\"}", 200, null),
            "",
            (java.util.function.Predicate<Request>)
                request ->
                    request.getMethod().equals("GET")
                        && request.getUrl().equals(TEST_REQUEST_URL)
                        && request
                            .getHeaders()
                            .get("Authorization")
                            .equals("Bearer " + TEST_REQUEST_TOKEN),
            null),
        // Invalid constructor parameters
        Arguments.of(
            "Missing Request URL",
            null,
            TEST_REQUEST_TOKEN,
            createHttpMock("{\"value\":\"" + TEST_ID_TOKEN + "\"}", 200, null),
            TEST_AUDIENCE,
            null,
            DatabricksException.class),
        Arguments.of(
            "Missing Request Token",
            TEST_REQUEST_URL,
            null,
            createHttpMock("{\"value\":\"" + TEST_ID_TOKEN + "\"}", 200, null),
            TEST_AUDIENCE,
            null,
            DatabricksException.class),
        Arguments.of(
            "Null HttpClient",
            TEST_REQUEST_URL,
            TEST_REQUEST_TOKEN,
            null,
            TEST_AUDIENCE,
            null,
            DatabricksException.class),
        // HTTP error scenarios
        Arguments.of(
            "HTTP Client Error",
            TEST_REQUEST_URL,
            TEST_REQUEST_TOKEN,
            createHttpMock(null, 0, new IOException("Network error")),
            TEST_AUDIENCE,
            null,
            DatabricksException.class),
        Arguments.of(
            "Non-Success Status Code",
            TEST_REQUEST_URL,
            TEST_REQUEST_TOKEN,
            createHttpMock("{\"error\":\"Bad Request\"}", 400, null),
            TEST_AUDIENCE,
            null,
            DatabricksException.class),
        Arguments.of(
            "Invalid JSON Response",
            TEST_REQUEST_URL,
            TEST_REQUEST_TOKEN,
            createHttpMock("{invalid json}", 200, null),
            TEST_AUDIENCE,
            null,
            DatabricksException.class),
        Arguments.of(
            "Missing Token Value",
            TEST_REQUEST_URL,
            TEST_REQUEST_TOKEN,
            createHttpMock("{\"other\":\"field\"}", 200, null),
            TEST_AUDIENCE,
            null,
            DatabricksException.class),
        Arguments.of(
            "Empty Token Value",
            TEST_REQUEST_URL,
            TEST_REQUEST_TOKEN,
            createHttpMock("{\"value\":\"\"}", 200, null),
            TEST_AUDIENCE,
            null,
            DatabricksException.class));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideAllTestScenarios")
  void testAllScenarios(
      String testName,
      String requestUrl,
      String requestToken,
      HttpClient httpClient,
      String audience,
      java.util.function.Predicate<Request> requestValidator,
      Class<? extends Exception> expectedException)
      throws IOException {

    GithubIDTokenSource tokenSource = new GithubIDTokenSource(requestUrl, requestToken, httpClient);

    if (expectedException != null) {
      assertThrows(expectedException, () -> tokenSource.getIDToken(audience));
    } else {
      IDToken token = tokenSource.getIDToken(audience);
      assertNotNull(token);
      assertEquals(TEST_ID_TOKEN, token.getValue());
      verify(httpClient).execute(argThat(request -> requestValidator.test(request)));
    }
  }

  private static Response makeResponse(String body, int status) throws MalformedURLException {
    return new Response(body, status, "status", new URL("https://databricks.com/"));
  }
}
