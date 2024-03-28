package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.http.Request;

/** This interface is used to pick the appropriate retry strategy for a given request. */
public interface RetryStrategyPicker {
  /**
   * This method is used to get the retry strategy for a given request.
   *
   * @param request The request for which the retry strategy is needed.
   * @return The retry strategy for the given request.
   */
  RetryStrategy getRetryStrategy(Request request);
}
