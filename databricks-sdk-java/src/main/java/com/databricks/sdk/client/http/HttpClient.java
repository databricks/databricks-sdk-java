package com.databricks.sdk.client.http;

import java.io.IOException;

public interface HttpClient {
  Response execute(Request in) throws IOException;
}
