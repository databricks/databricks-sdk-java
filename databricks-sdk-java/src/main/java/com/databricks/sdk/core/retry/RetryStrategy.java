package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.http.Response;

public interface RetryStrategy {
  boolean isRetriable(Response response, Exception e);

  DatabricksError getError();
}
