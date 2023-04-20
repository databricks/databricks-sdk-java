package com.databricks.sdk.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.client.http.Request;
import com.databricks.sdk.client.http.Response;
import com.databricks.sdk.client.utils.FakeTimer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.junit.jupiter.api.Test;

public class ApiClientTest {
  static class MyEndpointResponse {
    String key;

    MyEndpointResponse(@JsonProperty("key") String key) {
      this.key = key;
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

  private <T> void runApiClientTest(
      Request request, List<Response> responses, Class<? extends T> clazz, T expectedResponse) {
    DummyHttpClient hc = new DummyHttpClient();
    for (Response response : responses) {
      hc.with(request, response);
    }
    String host = request.getUri().getScheme() + "://" + request.getUri().getHost();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHttpClient(hc)
            .setHost(host)
            .setCredentialsProvider(new DummyCredentialsProvider())
            .setTimer(new FakeTimer());
    ApiClient client = new ApiClient(config);

    T response = client.GET(request.getUri().getPath(), clazz);

    assertEquals(response, expectedResponse);
  }

  private Request getBasicRequest() {
    return new Request("GET", "http://my.host/api/my/endpoint");
  }

  private Response getSuccessResponse(Request req) {
    return new Response(req, 200, "OK", Collections.emptyMap(), "{\"key\":\"value\"}");
  }

  @Test
  void happyPath() {
    Request req = getBasicRequest();
    runApiClientTest(
        req,
        Collections.singletonList(getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse("value"));
  }

  @Test
  void retry429() {
    Request req = getBasicRequest();
    runApiClientTest(
        req,
        Arrays.asList(
            new Response(req, 429, "Too Many Requests", Collections.emptyMap(), null),
            new Response(req, 429, "Too Many Requests", Collections.emptyMap(), null),
            getSuccessResponse(req)),
        MyEndpointResponse.class,
        new MyEndpointResponse("value"));
  }
}
