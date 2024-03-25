package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksError;
import java.net.ConnectException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonIdempotentRequestRetryStrategyTest {
  private static final RetryStrategy RETRY_STRATEGY = new NonIdempotentRequestRetryStrategy();

  @Test
  public void testIsRetriable() {
    DatabricksError databricksError =
        new DatabricksError("IO_ERROR", 523, new IllegalArgumentException());
    Assertions.assertFalse(RETRY_STRATEGY.isRetriable(databricksError));

    databricksError = new DatabricksError("IO_ERROR", 523, new ConnectException());
    Assertions.assertTrue(RETRY_STRATEGY.isRetriable(databricksError));

    databricksError =
        new DatabricksError("TOO_MANY_REQUESTS", "Current request has to be retried", 429);
    Assertions.assertTrue(RETRY_STRATEGY.isRetriable(databricksError));

    databricksError = new DatabricksError("BAD_REQUEST", "Bad request", 400);
    Assertions.assertFalse(RETRY_STRATEGY.isRetriable(databricksError));

    databricksError = new DatabricksError("NOT_FOUND", "Not found", 404);
    Assertions.assertFalse(RETRY_STRATEGY.isRetriable(databricksError));

    databricksError = new DatabricksError("SERVICE_UNAVAILABLE", "Service Unavailable", 503);
    Assertions.assertTrue(RETRY_STRATEGY.isRetriable(databricksError));

    databricksError =
        new DatabricksError("TRANSIENT_ERROR", "There is no worker environment with id");
    Assertions.assertTrue(RETRY_STRATEGY.isRetriable(databricksError));
  }
}
