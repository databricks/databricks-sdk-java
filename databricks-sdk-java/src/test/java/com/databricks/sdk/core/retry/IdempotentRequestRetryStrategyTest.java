package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IdempotentRequestRetryStrategyTest {
  private static final RetryStrategy RETRY_STRATEGY = new IdempotentRequestRetryStrategy();

  @Test
  public void testIsRetriable() {
    DatabricksError databricksError =
        new DatabricksError("IO_ERROR", 523, new IllegalArgumentException());
    Assertions.assertFalse(RETRY_STRATEGY.isRetriable(databricksError));

    databricksError =
        new DatabricksError("TOO_MANY_REQUESTS", "Current request has to be retried", 429);
    Assertions.assertTrue(RETRY_STRATEGY.isRetriable(databricksError));

    databricksError = new DatabricksError("BAD_REQUEST", "Bad request", 400);
    Assertions.assertFalse(RETRY_STRATEGY.isRetriable(databricksError));

    databricksError = new DatabricksError("NOT_FOUND", "Not found", 404);
    Assertions.assertFalse(RETRY_STRATEGY.isRetriable(databricksError));
  }
}
