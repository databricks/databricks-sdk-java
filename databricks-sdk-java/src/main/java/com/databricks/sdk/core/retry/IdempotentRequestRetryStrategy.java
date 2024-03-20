package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.http.Response;

public class IdempotentRequestRetryStrategy implements RetryStrategy {
  @Override
  public boolean isRetriable(Response response, Exception e) {
    // TODO: Not all errors are retriable, we can skip retrying in certain cases
    return true;
  }

  @Override
  public DatabricksError getError() {
    return null;
  }
}
