package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksError;

/**
 * This class implements a retry strategy that never retries any requests. All requests are
 * considered non-retriable regardless of the error type or status code.
 */
public class NoRetryStrategy implements RetryStrategy {

  @Override
  public boolean isRetriable(DatabricksError databricksError) {
    return false;
  }
}
