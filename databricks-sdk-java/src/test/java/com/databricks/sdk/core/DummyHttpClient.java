package com.databricks.sdk.core;

import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.util.*;

/** TODO: refactor ApiClient to perform the serialization/deserialization of POJOs */
public class DummyHttpClient implements HttpClient {

  private Map<Request, List<ResponseProvider>> stub = new HashMap<>();

  public DummyHttpClient with(Request in, ResponseProvider responseProvider) {
    List<ResponseProvider> responses = stub.get(in);
    if (responses == null) {
      responses = new LinkedList<>();
    }
    responses.add(responseProvider);
    stub.put(in, responses);
    return this;
  }

  public DummyHttpClient with(Request in, Response out) {
    return with(in, new SuccessfulResponse(out));
  }

  public DummyHttpClient with(Request in, IOException exception) {
    return with(in, new Failure(exception));
  }

  @Override
  public Response execute(Request in) throws IOException {
    List<ResponseProvider> responses = stub.get(in);
    if (responses == null || responses.isEmpty()) {
      throw new IllegalArgumentException("No mock for " + in);
    }
    return responses.remove(0).getResponse();
  }
}
