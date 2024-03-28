package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksError;

/** This interface is used to determine if a request should be retried. */
public interface RetryStrategy {
  /**
   * This method is used to determine if a request should be retried.
   *
   * @param databricksError The DatabricksError wrapped response/error object.
   * @return true if the request should be retried, false otherwise.
   */
  boolean isRetriable(DatabricksError databricksError);
}
