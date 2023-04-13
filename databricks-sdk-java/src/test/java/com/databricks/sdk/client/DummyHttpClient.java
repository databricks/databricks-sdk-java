package com.databricks.sdk.client;

import com.databricks.sdk.client.http.HttpClient;
import com.databricks.sdk.client.http.Request;
import com.databricks.sdk.client.http.Response;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/** TODO: refactor ApiClient to perform the serialization/deserialization of POJOs */
public class DummyHttpClient implements HttpClient {
  private Map<Request, Response> stub = new HashMap<>();

  public DummyHttpClient with(Request in, Response out) {
    stub.put(in, out);
    return this;
  }

  @Override
  public Response execute(Request in) throws IOException {
    Response response = stub.get(in);
    if (response == null) {
      throw new IllegalArgumentException("No mock for " + in);
    }
    return response;
  }
}
