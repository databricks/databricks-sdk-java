package com.databricks.sdk.client.http;

import com.databricks.sdk.support.DeveloperApi;
import java.io.IOException;

@DeveloperApi
public interface HttpClient {
  Response execute(Request in) throws IOException;
}
