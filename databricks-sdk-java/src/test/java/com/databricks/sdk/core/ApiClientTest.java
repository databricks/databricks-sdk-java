package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.error.ApiErrorBody;
import com.databricks.sdk.core.error.PrivateLinkValidationError;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.core.error.details.ErrorInfo;
import com.databricks.sdk.core.error.platform.TemporarilyUnavailable;
import com.databricks.sdk.core.error.platform.TooManyRequests;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.FakeTimer;
import com.databricks.sdk.core.utils.SerDeUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.time.*;
import java.util.*;
import org.apache.http.impl.EnglishReasonPhraseCatalog;
import org.junit.jupiter.api.Test;

public class ApiClientTest {
  private final ObjectMapper mapper = SerDeUtils.createMapper();

  static class MyEndpointResponse {
    @JsonProperty("key")
    String key;

    public MyEndpointResponse setKey(String key) {
      this.key = key;
      return this;
    }

    @Override
    public String toString() {
      return "MyEndpointResponse{key='" + key + "'}";
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      MyEndpointResponse that = (MyEndpointResponse) o;
      return Objects.equals(key, that.key);
    }
  }

  private ApiClient getApiClient(
      DatabricksConfig config, Request request, List<ResponseProvider> responses) {
    DummyHttpClient hc = new DummyHttpClient();
    for (ResponseProvider response : responses) {
      hc.with(request, response);
    }
    return new ApiClient(config.setHttpClient(hc), new FakeTimer());
  }

  private ApiClient getApiClient(Request request, List<ResponseProvider> responses) {
    String host = request.getUri().getScheme() + "://" + request.getUri().getHost();
    DatabricksConfig config =
        new DatabricksConfig().setHost(host).setCredentialsProvider(new DummyCredentialsProvider());
    return getApiClient(config, request, responses);
  }

  private <T> void runApiClientTest(
      ApiClient client, Request request, Class<? extends T> clazz, T expectedResponse)
      throws IOException {
    T response;
    if (request.getMethod().equals(Request.GET)) {
      response = client.execute(new Request("GET", request.getUri().getPath()), clazz);
    } else if (request.getMethod().equals(Request.POST)) {
      response =
          client.execute(
              new Request("POST", request.getUri().getPath(), client.serialize(request)), clazz);
    } else {
      throw new IllegalArgumentException("Unsupported method: " + request.getMethod());
    }
    assertEquals(response, expectedResponse);
  }

  private <T> void runApiClientTest(
      Request request,
      List<ResponseProvider> responses,
      Class<? extends T> clazz,
      T expectedResponse)
      throws IOException {
    ApiClient client = getApiClient(request, responses);
    runApiClientTest(client, request, clazz, expectedResponse);
  }

  @CanIgnoreReturnValue
  private DatabricksException runFailingApiClientTest(
      Request request, List<ResponseProvider> responses, Class<?> clazz, String expectedMessage)
      throws IOException {
    DatabricksException exception =
        runFailingApiClientTest(request, responses, clazz, DatabricksException.class);
    assertEquals(exception.getMessage(), expectedMessage);
    return exception;
  }

  private <T extends Throwable> T runFailingApiClientTest(
      Request request, List<ResponseProvider> responses, Class<?> clazz, Class<T> exceptionClass) {
    ApiClient client = getApiClient(request, responses);
    if (request.getMethod().equals(Request.GET)) {
      return assertThrows(
          exceptionClass,
          () -> client.execute(new Request("GET", request.getUri().getPath()), clazz));
    } else if (request.getMethod().equals(Request.POST)) {
      return assertThrows(
          exceptionClass,
          () ->
              client.execute(
                  new Request("POST", request.getUri().getPath(), client.serialize(request)),
                  clazz));
    } else {
      throw new IllegalArgumentException("Unsupported method: " + request.getMethod());
    }
  }

  private Request getBasicRequest() {
    return new Request("GET", "http://my.host/api/my/endpoint");
  }

  private Request getExampleNonIdempotentRequest() {
    return new Request("POST", "http://my.host/api/2.0/sql/statements/");
  }

  private Request getExampleIdempotentRequest() {
    return new Request("GET", "http://my.host/api/2.0/sql/sessions/");
  }

  private SuccessfulResponse getSuccessResponse(Request req) {
    return new SuccessfulResponse(
        new Response(req, 200, "OK", Collections.emptyMap(), "{\"key\":\"value\"}"));
  }

  private SuccessfulResponse getSuccessResponseExtraKeys(Request req) {
    return new SuccessfulResponse(
        new Response(req, 200, "OK", Collections.emptyMap(), "{\"key\":\"value\", \"foo\": 1}"));
  }

  private SuccessfulResponse getTooManyRequestsResponse(Request req) {
    return new SuccessfulResponse(
        new Response(req, 429, "Too Many Requests", Collections.emptyMap(), (String) null));
  }

  private SuccessfulResponse getTooManyRequestsResponseWithRetryAfterHeader(Request req) {
    return new SuccessfulResponse(
        new Response(
            req,
            429,
            "Too Many Requests",
            Collections.singletonMap("retry-after", Collections.singletonList("1")),
            (String) null));
  }

  private SuccessfulResponse getTooManyRequestsResponseWithRetryAfterDateHeader(Request req) {
    ZoneOffset gmtOffset = ZoneId.of("GMT").getRules().getOffset(Instant.now());
    ZonedDateTime now = ZonedDateTime.now(gmtOffset);
    String retryAfterTime =
        now.plusSeconds(5).format(java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME);
    return new SuccessfulResponse(
        new Response(
            req,
            429,
            "Too Many Requests",
            Collections.singletonMap("retry-after", Collections.singletonList(retryAfterTime)),
            (String) null));
  }

  private SuccessfulResponse getTransientError(Request req, int statusCode, ApiErrorBody body)
      throws JsonProcessingException {
    return getTransientError(req, statusCode, mapper.writeValueAsString(body));
  }

  private SuccessfulResponse getTransientError(Request req, int statusCode, String body) {
    return new SuccessfulResponse(
        new Response(
            req,
            statusCode,
            EnglishReasonPhraseCatalog.INSTANCE.getReason(statusCode, Locale.ENGLISH),
            Collections.emptyMap(),
            body));
  }

  @Test
  void happyPath() throws IOException {
    Request req = getBasicRequest();
    runApiClientTest(
        req,
        Collections.singletonList(getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value"));
  }

  @Test
  void unknownKey() throws IOException {
    Request req = getBasicRequest();
    runApiClientTest(
        req,
        Collections.singletonList(getSuccessResponseExtraKeys(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value"));
  }

  @Test
  void retry429() throws IOException {
    Request req = getBasicRequest();
    runApiClientTest(
        req,
        Arrays.asList(
            getTooManyRequestsResponseWithRetryAfterHeader(req),
            getTooManyRequestsResponse(req),
            getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value"));
  }

  @Test
  void failAfterTooManyRetries() throws IOException {
    Request req = getBasicRequest();
    DatabricksException exception =
        runFailingApiClientTest(
            req,
            Arrays.asList(
                getTooManyRequestsResponseWithRetryAfterDateHeader(req),
                getTooManyRequestsResponse(req),
                getTooManyRequestsResponse(req),
                getTooManyRequestsResponse(req),
                getSuccessResponse(req)),
            MyEndpointResponse.class,
            "Request GET /api/my/endpoint failed after 4 retries");
    assertInstanceOf(DatabricksError.class, exception.getCause());
    DatabricksError cause = (DatabricksError) exception.getCause();
    assertInstanceOf(TooManyRequests.class, cause);
  }

  @Test
  void checkExponentialBackoffForRetry() throws IOException {
    Request req = getBasicRequest();
    ApiClient client =
        getApiClient(req, Collections.singletonList(getTooManyRequestsResponse(req)));
    for (int attemptNumber = 1; attemptNumber < 5; attemptNumber++) {
      long backoff = client.getBackoffMillis(null, attemptNumber);
      int expectedBackoff = Math.min(60000, 1000 * (1 << (attemptNumber - 1)));
      assertTrue(backoff >= expectedBackoff);
      assertTrue(backoff <= expectedBackoff + 750L);
    }
  }

  @Test
  void failIdempotentRequestAfterTooManyRetries() throws IOException {
    Request req = getExampleIdempotentRequest();

    runFailingApiClientTest(
        req,
        Arrays.asList(
            getTooManyRequestsResponse(req),
            getTransientError(
                req,
                400,
                new ApiErrorBody(
                    "ERROR",
                    null,
                    null,
                    null,
                    null,
                    "Workspace 123 does not have any associated worker environments",
                    null)),
            getTooManyRequestsResponse(req),
            getTooManyRequestsResponse(req),
            getSuccessResponse(req)),
        MyEndpointResponse.class,
        "Request GET /api/2.0/sql/sessions/ failed after 4 retries");
  }

  @Test
  void testEmptyBody() throws IOException {
    MyEndpointResponse response = new MyEndpointResponse();
    Request request = getBasicRequest();
    Response rawResponse = new Response(request, 200, "OK", Collections.emptyMap(), "");
    ApiClient client =
        getApiClient(request, Collections.singletonList(new SuccessfulResponse(rawResponse)));

    client.deserialize(rawResponse, response);
  }

  @Test
  void retryDatabricksApi12RetriableError() throws IOException {
    Request req = getBasicRequest();

    runApiClientTest(
        req,
        Arrays.asList(
            getTooManyRequestsResponse(req),
            getTransientError(
                req,
                400,
                new ApiErrorBody(
                    "ERROR",
                    null,
                    null,
                    null,
                    null,
                    "Workspace 123 does not have any associated worker environments",
                    null)),
            getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value"));
  }

  @Test
  void errorDetails() throws JsonProcessingException {
    Request req = getExampleNonIdempotentRequest();

    Map<String, String> metadata = new HashMap<>();
    metadata.put("etag", "value");

    // Create ErrorDetails object instead of List<ErrorDetail>
    ErrorDetails errorDetails =
        ErrorDetails.builder()
            .setErrorInfo(
                ErrorInfo.builder()
                    .setReason("reason")
                    .setDomain("domain")
                    .setMetadata(metadata)
                    .build())
            .setUnknownDetails(
                Arrays.asList(
                    mapper
                        .createObjectNode()
                        .put("@type", "unrelated")
                        .put("reason", "wrong")
                        .put("domain", "wrongDomain")))
            .build();

    DatabricksError error =
        runFailingApiClientTest(
            req,
            Arrays.asList(
                getTransientError(
                    req,
                    401,
                    new ApiErrorBody("ERROR", null, null, null, null, null, errorDetails)),
                getSuccessResponse(req)),
            MyEndpointResponse.class,
            DatabricksError.class);

    assertEquals(errorDetails, error.getErrorDetails());
  }

  @Test
  void retryDatabricksRetriableError() throws IOException {
    Request req = getBasicRequest();

    runApiClientTest(
        req,
        Arrays.asList(
            getTooManyRequestsResponse(req),
            getTransientError(
                req,
                400,
                new ApiErrorBody(
                    "ERROR",
                    "Workspace 123 does not have any associated worker environments",
                    null,
                    null,
                    null,
                    null,
                    null)),
            getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value"));
  }

  @Test
  void retryUnknownHostException() throws IOException {
    Request req = getBasicRequest();

    runApiClientTest(
        req,
        Arrays.asList(
            new Failure(new UnknownHostException("Connect timed out")), getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value"));
  }

  class HostPopulatingCredentialsProvider implements CredentialsProvider {
    private final String host;
    private final CredentialsProvider parent;

    public HostPopulatingCredentialsProvider(String host) {
      this.host = host;
      this.parent = new DummyCredentialsProvider();
    }

    @Override
    public String authType() {
      return parent.authType();
    }

    @Override
    public HeaderFactory configure(DatabricksConfig config) {
      config.setHost(this.host);
      return parent.configure(config);
    }
  }

  @Test
  void verifyNoRetryWhenRetriesDisabled() throws IOException {
    Request req = getBasicRequest();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("http://my.host")
            .setDisableRetries(true)
            .setCredentialsProvider(new DummyCredentialsProvider());
    ApiClient client =
        getApiClient(
            config, req, Arrays.asList(getTooManyRequestsResponse(req), getSuccessResponse(req)));

    DatabricksError exception =
        assertThrows(
            DatabricksError.class,
            () ->
                client.execute(
                    new Request("GET", req.getUri().getPath()), MyEndpointResponse.class));

    assertInstanceOf(TooManyRequests.class, exception);
    assertEquals(429, exception.getStatusCode());
  }

  @Test
  void verifyRetriesWorkWhenEnabled() throws IOException {
    Request req = getBasicRequest();
    // Verify that the client retries by default.
    runApiClientTest(
        req,
        Arrays.asList(getTooManyRequestsResponse(req), getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value")); // should succeed after retry
  }

  @Test
  void populateHostFromCredentialProvider() throws IOException {
    Request req = getBasicRequest();
    DatabricksConfig config =
        new DatabricksConfig()
            .setCredentialsProvider(new HostPopulatingCredentialsProvider("http://my.host"));
    ApiClient client =
        getApiClient(config, req, Collections.singletonList(getSuccessResponse(req)));
    runApiClientTest(
        client, req, MyEndpointResponse.class, new MyEndpointResponse().setKey("value"));
  }

  @Test
  void testGetBackoffFromRetryAfterHeader() {
    Request req = getBasicRequest();
    Response response = getTooManyRequestsResponseWithRetryAfterHeader(req).getResponse();
    assertEquals(Optional.of(1000L), ApiClient.getBackoffFromRetryAfterHeader(response));

    response = getTooManyRequestsResponse(req).getResponse();
    assertEquals(Optional.empty(), ApiClient.getBackoffFromRetryAfterHeader(response));
  }

  @Test
  void privateLinkRedirectBecomesPrivateLinkValidationError() throws MalformedURLException {
    Request req = getBasicRequest();
    URL url =
        new URL("https://databricks.com/login.html?error=private-link-validation-error:123456");
    Response response =
        new Response(req, url, 200, "OK", Collections.emptyMap(), (String) "Garbage HTML");
    ApiClient client =
        getApiClient(req, Collections.singletonList(new SuccessfulResponse(response)));
    PrivateLinkValidationError e =
        assertThrows(
            PrivateLinkValidationError.class,
            () ->
                client.execute(
                    new Request("GET", req.getUri().getPath()), MyEndpointResponse.class));
    assertTrue(e.getMessage().contains("AWS PrivateLink"));
  }

  /**
   * A fake HttpClient that reads the request body to EOF on every call, mirroring how the real
   * CommonsHttpClient drains the entity onto the wire. It records the number of body bytes actually
   * transmitted per attempt, so tests can assert what a retry would (or would not) send. The status
   * code returned for each attempt is supplied up front.
   */
  private static class BodyReadingHttpClient implements HttpClient {
    private final Deque<Integer> statusCodes;
    final List<Integer> bytesReadPerAttempt = new ArrayList<>();

    BodyReadingHttpClient(Integer... statusCodesInOrder) {
      this.statusCodes = new ArrayDeque<>(Arrays.asList(statusCodesInOrder));
    }

    @Override
    public Response execute(Request in) throws IOException {
      // The SDK issues a best-effort GET /.well-known/databricks-config host-metadata pre-flight
      // through this same client before the request under test. Ignore it: return a benign 404
      // (the SDK falls back to user config) without recording it or consuming a status code.
      if (in.getUrl().contains("/.well-known/")) {
        return new Response(in, 404, "Not Found", Collections.emptyMap());
      }
      int total = 0;
      if (in.isBodyStreaming() && in.getBodyStream() != null) {
        InputStream is = in.getBodyStream();
        byte[] buf = new byte[4096];
        int r;
        while ((r = is.read(buf)) != -1) {
          total += r;
        }
      } else if (in.isBodyString() && in.getBodyString() != null) {
        total = in.getBodyString().getBytes(StandardCharsets.UTF_8).length;
      }
      bytesReadPerAttempt.add(total);
      int status = statusCodes.isEmpty() ? 204 : statusCodes.removeFirst();
      String reason = EnglishReasonPhraseCatalog.INSTANCE.getReason(status, Locale.ENGLISH);
      return new Response(in, status, reason, Collections.emptyMap());
    }
  }

  private ApiClient apiClientWith(HttpClient httpClient) {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("http://my.host")
            .setCredentialsProvider(new DummyCredentialsProvider())
            .setHttpClient(httpClient);
    return new ApiClient(config, new FakeTimer());
  }

  @Test
  void doesNotRetryStreamingBodyAfterResponse() throws IOException {
    // Regression test for the streaming-upload retry bug: a streaming request body (e.g.
    // Files.upload) is backed by a single-use InputStream that the first attempt consumes as it is
    // sent. If the SDK retried after a 503, it would re-send the now-exhausted stream as a 0-byte
    // body, silently uploading an empty file. Using a transport that actually reads the body (like
    // the real CommonsHttpClient) and would return 204 on a retry, we assert on the bytes actually
    // transmitted per attempt: without the fix this records [13, 0] (an empty retry that "succeeds"
    // with 204); with the fix the upload is attempted exactly once and the original 503 is thrown.
    byte[] contents = "file-contents".getBytes(StandardCharsets.UTF_8);
    // Second status (204) is what a buggy empty-body retry would receive; the fix means it is never
    // reached, but supplying it lets this test capture the empty retry as a byte count if it were.
    BodyReadingHttpClient hc = new BodyReadingHttpClient(503, 204);
    ApiClient client = apiClientWith(hc);

    InputStream body = new ByteArrayInputStream(contents);
    DatabricksError thrown = null;
    try {
      client.execute(new Request("PUT", "/api/2.0/fs/files/Volumes/c/s/v/f", body), Void.class);
    } catch (DatabricksError e) {
      thrown = e;
    }

    // The upload must be attempted exactly once: retrying is unsafe once the body has been sent.
    // Without the guard this is [13, 0] (the empty-body retry) — the message points right at it.
    assertEquals(
        1,
        hc.bytesReadPerAttempt.size(),
        "streaming upload must not be retried after the body was sent; the retry would send an empty"
            + " body. Bytes sent per attempt: "
            + hc.bytesReadPerAttempt);
    // That single attempt transmitted the full body ...
    assertEquals(contents.length, hc.bytesReadPerAttempt.get(0));
    // ... and the stream is now exhausted, which is exactly why a resend would upload 0 bytes.
    assertEquals(-1, body.read(), "stream is single-use and should be fully consumed");
    // The original transient error is surfaced to the caller (who can retry with a fresh stream)
    // rather than being masked by a bogus 204 success.
    assertNotNull(thrown, "the original 503 must be surfaced to the caller");
    assertInstanceOf(TemporarilyUnavailable.class, thrown);
    assertEquals(503, thrown.getStatusCode());
  }

  @Test
  void retriesNonStreamingBodyOn503AndResendsFullBody() throws IOException {
    // Complement to doesNotRetryStreamingBodyAfterResponse: a string-bodied request is repeatable,
    // so the same 503 must still be retried, and crucially the retry must re-send the full body
    // (a fresh entity is built per attempt). This confirms the streaming guard is scoped narrowly
    // and does not regress ordinary requests.
    String jsonBody = "{\"key\":\"value\"}";
    BodyReadingHttpClient hc = new BodyReadingHttpClient(503, 200);
    ApiClient client = apiClientWith(hc);

    client.execute(
        new Request("POST", "/api/2.0/sql/statements/", jsonBody), MyEndpointResponse.class);

    // Two attempts were made: the 503 was retried ...
    assertEquals(2, hc.bytesReadPerAttempt.size());
    // ... and both attempts sent the full body (the string body is re-sendable, unlike a stream).
    int expected = jsonBody.getBytes(StandardCharsets.UTF_8).length;
    assertEquals(expected, hc.bytesReadPerAttempt.get(0));
    assertEquals(expected, hc.bytesReadPerAttempt.get(1));
  }

  @Test
  void testDefaultWorkspaceIdReturnsNullWhenNotSet() {
    Request req = getBasicRequest();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("http://my.host")
            .setCredentialsProvider(new DummyCredentialsProvider());
    ApiClient client =
        getApiClient(config, req, Collections.singletonList(getSuccessResponse(req)));
    assertNull(client.workspaceId());
  }

  @Test
  void testDefaultWorkspaceIdReturnsValueFromConfig() {
    String expectedWorkspaceId = "test-workspace-123";
    Request req = getBasicRequest();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("http://my.host")
            .setWorkspaceId(expectedWorkspaceId)
            .setCredentialsProvider(new DummyCredentialsProvider());
    ApiClient client =
        getApiClient(config, req, Collections.singletonList(getSuccessResponse(req)));
    assertEquals(expectedWorkspaceId, client.workspaceId());
  }
}
