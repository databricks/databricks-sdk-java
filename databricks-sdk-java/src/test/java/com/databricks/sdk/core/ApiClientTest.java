package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.databricks.sdk.core.error.ApiErrorBody;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.FakeTimer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.SocketTimeoutException;
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

  private ApiClient getApiClient(Request request, List<ResponseProvider> responses) {
    DummyHttpClient hc = new DummyHttpClient();
    for (ResponseProvider response : responses) {
      hc.with(request, response);
    }
    String host = request.getUri().getScheme() + "://" + request.getUri().getHost();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHttpClient(hc)
            .setHost(host)
            .setCredentialsProvider(new DummyCredentialsProvider());
    return new ApiClient(config, new FakeTimer());
  }

  private <T> void runApiClientTest(
      Request request,
      List<ResponseProvider> responses,
      Class<? extends T> clazz,
      T expectedResponse) {
    ApiClient client = getApiClient(request, responses);
    T response = client.GET(request.getUri().getPath(), clazz);
    assertEquals(response, expectedResponse);
  }

  private void runFailingApiClientTest(
      Request request, List<ResponseProvider> responses, Class<?> clazz, String expectedMessage) {
    ApiClient client = getApiClient(request, responses);
    DatabricksException exception =
        assertThrows(
            DatabricksException.class, () -> client.GET(request.getUri().getPath(), clazz));
    assertEquals(exception.getMessage(), expectedMessage);
  }

  private Request getBasicRequest() {
    return new Request("GET", "http://my.host/api/my/endpoint");
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
            getTooManyRequestsResponse(req),
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
            getTooManyRequestsResponse(req),
            getTooManyRequestsResponse(req),
            getTooManyRequestsResponse(req),
            getSuccessResponse(req)),
        MyEndpointResponse.class,
        "Request GET /api/my/endpoint failed after 3 retries");
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
                    "Workspace 123 does not have any associated worker environments")),
            getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value"));
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
                    null)),
            getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value"));
  }

  @Test
  void retrySocketTimeoutException() {
    Request req = getBasicRequest();

    runApiClientTest(
        req,
        Arrays.asList(
            new Failure(new SocketTimeoutException("Connect timed out")), getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse().setKey("value"));
  }
}
