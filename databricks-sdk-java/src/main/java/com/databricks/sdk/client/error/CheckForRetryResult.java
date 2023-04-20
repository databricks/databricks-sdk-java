package com.databricks.sdk.client.error;

/**
 * The result of checking whether {@code ApiClient} should retry a request.
 *
 * <p>If shouldRetry is true, the request failed and must be retried. If shouldRetry is false, then
 * the behavior depends on the value of error. If error is null, the request was successful and
 * should be parsed and returned to the user. If error is not null, the request has failed in an
 * unrecoverable way and this exception should be thrown, potentially wrapped in another exception.
 */
public class CheckForRetryResult {
  private boolean shouldRetry;
  private Throwable error;

  public CheckForRetryResult(boolean shouldRetry, Throwable error) {
    this.shouldRetry = shouldRetry;
    this.error = error;
  }

  public CheckForRetryResult(boolean shouldRetry) {
    this(shouldRetry, null);
  }

  public boolean shouldRetry() {
    return shouldRetry;
  }

  public Throwable getError() {
    return error;
  }
}
