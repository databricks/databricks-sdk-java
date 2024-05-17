package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.error.ApiErrorBody;
import com.databricks.sdk.core.error.ErrorDetail;
import com.databricks.sdk.core.error.PrivateLinkInfo;
import com.databricks.sdk.core.error.PrivateLinkValidationError;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.FakeTimer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.time.*;
import java.util.*;
import org.apache.http.impl.EnglishReasonPhraseCatalog;
import org.junit.jupiter.api.Test;

public class ApiClientTest {
  private final ObjectMapper mapper = new ObjectMapper();

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
      ApiClient client, Request request, Class<? extends T> clazz, T expectedResponse) {
    T response;
    if (request.getMethod().equals(Request.GET)) {
      response = client.GET(request.getUri().getPath(), clazz, Collections.emptyMap());
    } else if (request.getMethod().equals(Request.POST)) {
      response = client.POST(request.getUri().getPath(), request, clazz, Collections.emptyMap());
    } else {
      throw new IllegalArgumentException("Unsupported method: " + request.getMethod());
    }
    assertEquals(response, expectedResponse);
  }

  private <T> void runApiClientTest(
      Request request,
      List<ResponseProvider> responses,
      Class<? extends T> clazz,
      T expectedResponse) {
    ApiClient client = getApiClient(request, responses);
    runApiClientTest(client, request, clazz, expectedResponse);
  }

  private void runFailingApiClientTest(
      Request request, List<ResponseProvider> responses, Class<?> clazz, String expectedMessage) {
    DatabricksException exception =
        runFailingApiClientTest(request, responses, clazz, DatabricksException.class);
    assertEquals(exception.getMessage(), expectedMessage);
  }

  private <T extends Throwable> T runFailingApiClientTest(
      Request request, List<ResponseProvider> responses, Class<?> clazz, Class<T> exceptionClass) {
    ApiClient client = getApiClient(request, responses);
    if (request.getMethod().equals(Request.GET)) {
      return assertThrows(
          exceptionClass,
          () -> client.GET(request.getUri().getPath(), clazz, Collections.emptyMap()));
    } else if (request.getMethod().equals(Request.POST)) {
      return assertThrows(
          exceptionClass,
          () -> client.POST(request.getUri().getPath(), request, clazz, Collections.emptyMap()));
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
  void happyPath() {
    Request req = getBasicRequest();
    runApiClientTest(
        req,
        Collections.singletonList(getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value"));
  }

  @Test
  void unknownKey() {
    Request req = getBasicRequest();
    runApiClientTest(
        req,
        Collections.singletonList(getSuccessResponseExtraKeys(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value"));
  }

  @Test
  void retry429() {
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
  void failAfterTooManyRetries() {
    Request req = getBasicRequest();
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
  }

  @Test
  void checkExponentialBackoffForRetry() {
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
  void failIdempotentRequestAfterTooManyRetries() throws JsonProcessingException {
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
  void retryDatabricksApi12RetriableError() throws JsonProcessingException {
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
    ErrorDetail errorDetails =
        new ErrorDetail("type.googleapis.com/google.rpc.ErrorInfo", "reason", "domain", metadata);
    ErrorDetail unrelatedDetails =
        new ErrorDetail("unrelated", "wrong", "wrongDomain", new HashMap<>());

    DatabricksError error =
        runFailingApiClientTest(
            req,
            Arrays.asList(
                getTransientError(
                    req,
                    401,
                    new ApiErrorBody(
                        "ERROR",
                        null,
                        null,
                        null,
                        null,
                        null,
                        Arrays.asList(errorDetails, unrelatedDetails))),
                getSuccessResponse(req)),
            MyEndpointResponse.class,
            DatabricksError.class);
    List<ErrorDetail> responseErrors = error.getErrorInfo();
    assertEquals(responseErrors.size(), 1);
    ErrorDetail responseError = responseErrors.get(0);
    assertEquals(errorDetails.getType(), responseError.getType());
    assertEquals(errorDetails.getReason(), responseError.getReason());
    assertEquals(errorDetails.getMetadata(), responseError.getMetadata());
    assertEquals(errorDetails.getDomain(), responseError.getDomain());
  }

  @Test
  void retryDatabricksRetriableError() throws JsonProcessingException {
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
  void retryUnknownHostException() {
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
  void populateHostFromCredentialProvider() {
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
    URL url = new URL("https://databricks.com/login.html?error=private-link-validation-error:123456");
    Response response = new Response(req, url, 200, "OK", Collections.emptyMap(), (String) "Garbage HTML");
    ApiClient client = getApiClient(req, Collections.singletonList(new SuccessfulResponse(response)));
    PrivateLinkValidationError e =
        assertThrows(PrivateLinkValidationError.class, () -> client.GET(req.getUri().getPath(), MyEndpointResponse.class, Collections.emptyMap()));
    assertTrue(e.getMessage().contains("AWS PrivateLink"));
  }
}
