package com.databricks.sdk.core.http;

import java.io.IOException;

public interface HttpClient {
  Response execute(Request in) throws IOException;
}
