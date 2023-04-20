package com.databricks.sdk.client;

import com.databricks.sdk.client.http.HttpClient;
import com.databricks.sdk.client.http.Request;
import com.databricks.sdk.client.http.Response;
import java.util.*;

/** TODO: refactor ApiClient to perform the serialization/deserialization of POJOs */
public class DummyHttpClient implements HttpClient {
  private Map<Request, List<Response>> stub = new HashMap<>();

  public DummyHttpClient with(Request in, Response out) {
    List<Response> responses = stub.get(in);
    if (responses == null) {
      responses = new LinkedList<>();
    }
    responses.add(out);
    stub.put(in, responses);
    return this;
  }

  @Override
  public Response execute(Request in) {
    List<Response> responses = stub.get(in);
    if (responses == null || responses.isEmpty()) {
      throw new IllegalArgumentException("No mock for " + in);
    }
    return responses.remove(0);
  }
}
