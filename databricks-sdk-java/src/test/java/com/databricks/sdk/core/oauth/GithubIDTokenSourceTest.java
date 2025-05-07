package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GithubIDTokenSourceTest {
  private static final String TEST_REQUEST_URL = "https://github.com/token";
  private static final String TEST_REQUEST_TOKEN = "test-request-token";
  private static final String TEST_ID_TOKEN = "test-id-token";
  private static final String TEST_AUDIENCE = "test-audience";

  @Mock private static HttpClient mockHttpClient;

  private GithubIDTokenSource tokenSource;
  private ObjectMapper mapper;

  @BeforeEach
  void setUp() throws IOException {
    MockitoAnnotations.openMocks(this);
    mapper = new ObjectMapper();
    tokenSource = new GithubIDTokenSource(TEST_REQUEST_URL, TEST_REQUEST_TOKEN, mockHttpClient);
  }

  @Test
  void testSuccessfulTokenRetrieval() throws IOException {
    // Prepare mock response
    ObjectNode responseJson = mapper.createObjectNode();
    responseJson.put("value", TEST_ID_TOKEN);
    Response mockResponse = makeResponse(responseJson.toString(), 200);
    when(mockHttpClient.execute(any(Request.class))).thenReturn(mockResponse);

    // Test token retrieval
    IDToken token = tokenSource.getIDToken(TEST_AUDIENCE);

    assertNotNull(token);
    assertEquals(TEST_ID_TOKEN, token.getValue());

    // Verify the request was made with correct parameters
    verify(mockHttpClient)
        .execute(
            argThat(
                request -> {
                  return request.getMethod().equals("GET")
                      && request.getUrl().startsWith(TEST_REQUEST_URL)
                      && request.getUrl().contains("audience=" + TEST_AUDIENCE)
                      && request
                          .getHeaders()
                          .get("Authorization")
                          .equals("Bearer " + TEST_REQUEST_TOKEN);
                }));
  }

  @Test
  void testSuccessfulTokenRetrievalWithoutAudience() throws IOException {
    // Prepare mock response
    ObjectNode responseJson = mapper.createObjectNode();
    responseJson.put("value", TEST_ID_TOKEN);
    Response mockResponse = makeResponse(responseJson.toString(), 200);
    when(mockHttpClient.execute(any(Request.class))).thenReturn(mockResponse);

    // Test token retrieval without audience
    IDToken token = tokenSource.getIDToken("");

    assertNotNull(token);
    assertEquals(TEST_ID_TOKEN, token.getValue());

    // Verify the request was made with correct parameters
    verify(mockHttpClient)
        .execute(
            argThat(
                request -> {
                  return request.getMethod().equals("GET")
                      && request.getUrl().equals(TEST_REQUEST_URL)
                      && request
                          .getHeaders()
                          .get("Authorization")
                          .equals("Bearer " + TEST_REQUEST_TOKEN);
                }));
  }

  private static Stream<Arguments> provideInvalidConstructorParameters() {
    return Stream.of(
        Arguments.of("Missing Request URL", null, TEST_REQUEST_TOKEN, mockHttpClient),
        Arguments.of("Missing Request Token", TEST_REQUEST_URL, null, mockHttpClient),
        Arguments.of("Null HttpClient", TEST_REQUEST_URL, TEST_REQUEST_TOKEN, null));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideInvalidConstructorParameters")
  void testInvalidConstructorParameters(
      String testName, String requestUrl, String requestToken, HttpClient httpClient) {
    GithubIDTokenSource invalidSource =
        new GithubIDTokenSource(requestUrl, requestToken, httpClient);
    assertThrows(DatabricksException.class, () -> invalidSource.getIDToken(TEST_AUDIENCE));
  }

  private static Stream<Arguments> provideHttpErrorScenarios() throws IOException {
    HttpClient httpClientError = mock(HttpClient.class);
    when(httpClientError.execute(any(Request.class))).thenThrow(new IOException("Network error"));

    HttpClient nonSuccessClient = mock(HttpClient.class);
    when(nonSuccessClient.execute(any(Request.class)))
        .thenReturn(makeResponse("Error response", 400));

    HttpClient invalidJsonClient = mock(HttpClient.class);
    when(invalidJsonClient.execute(any(Request.class)))
        .thenReturn(makeResponse("Invalid json", 200));

    HttpClient missingTokenClient = mock(HttpClient.class);
    when(missingTokenClient.execute(any(Request.class))).thenReturn(makeResponse("{}", 200));

    HttpClient emptyTokenClient = mock(HttpClient.class);
    when(emptyTokenClient.execute(any(Request.class)))
        .thenReturn(makeResponse("{\"value\":\"\"}", 200));

    return Stream.of(
        Arguments.of("HTTP Client Error", httpClientError),
        Arguments.of("Non-Success Status Code", nonSuccessClient),
        Arguments.of("Invalid JSON Response", invalidJsonClient),
        Arguments.of("Missing Token Value", missingTokenClient),
        Arguments.of("Empty Token Value", emptyTokenClient));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideHttpErrorScenarios")
  void testHttpErrorScenarios(String testName, HttpClient httpClient) {
    GithubIDTokenSource source =
        new GithubIDTokenSource(TEST_REQUEST_URL, TEST_REQUEST_TOKEN, httpClient);
    assertThrows(DatabricksException.class, () -> source.getIDToken(TEST_AUDIENCE));
  }

  private static Response makeResponse(String body, int status) throws MalformedURLException {
    return new Response(body, status, "status", new URL("https://databricks.com/"));
  }
}
