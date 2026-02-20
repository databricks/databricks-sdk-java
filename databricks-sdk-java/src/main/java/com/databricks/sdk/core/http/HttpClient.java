package com.databricks.sdk.core.http;

import com.databricks.sdk.support.InternalApi;
import java.io.IOException;

@InternalApi
public interface HttpClient {
  Response execute(Request in) throws IOException;
}
