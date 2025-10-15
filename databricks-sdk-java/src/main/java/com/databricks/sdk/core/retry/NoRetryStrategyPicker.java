package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.http.Request;

/**
 * A RetryStrategyPicker that always returns a NoRetryStrategy, effectively disabling retries for
 * all requests regardless of their type or characteristics.
 */
public class NoRetryStrategyPicker implements RetryStrategyPicker {
  private static final NoRetryStrategy NO_RETRY_STRATEGY = new NoRetryStrategy();

  /**
   * Returns a NoRetryStrategy for any given request, effectively disabling retries.
   *
   * @param request The request for which the retry strategy is needed (ignored).
   * @return A NoRetryStrategy instance that will never retry any request.
   */
  @Override
  public RetryStrategy getRetryStrategy(Request request) {
    return NO_RETRY_STRATEGY;
  }
}
