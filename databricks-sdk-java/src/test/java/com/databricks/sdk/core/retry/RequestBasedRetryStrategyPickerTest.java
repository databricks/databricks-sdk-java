package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.http.Request;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RequestBasedRetryStrategyPickerTest {
  private static final String TEST_URL = "https://test.com";
  private static final DatabricksConfig CONFIG = new DatabricksConfig().setHost(TEST_URL);
  private static final RetryStrategyPicker RETRY_STRATEGY_PICKER =
      new RequestBasedRetryStrategyPicker(CONFIG.getHost());

  @Test
  public void testGetRetryStrategy() {
    Request request = new Request("GET", TEST_URL + "/api/2.0/sql/statements/1");
    RetryStrategy retryStrategy = RETRY_STRATEGY_PICKER.getRetryStrategy(request);
    Assertions.assertInstanceOf(IdempotentRequestRetryStrategy.class, retryStrategy);

    request = new Request("POST", TEST_URL + "/api/2.0/sql/sessions/");
    retryStrategy = RETRY_STRATEGY_PICKER.getRetryStrategy(request);
    Assertions.assertInstanceOf(IdempotentRequestRetryStrategy.class, retryStrategy);

    request = new Request("DELETE", TEST_URL + "/api/2.0/sql/statements/sessions/1");
    retryStrategy = RETRY_STRATEGY_PICKER.getRetryStrategy(request);
    Assertions.assertInstanceOf(IdempotentRequestRetryStrategy.class, retryStrategy);

    request = new Request("GET", TEST_URL + "/api/2.0/sql/statements/1/result/chunks/1");
    retryStrategy = RETRY_STRATEGY_PICKER.getRetryStrategy(request);
    Assertions.assertInstanceOf(IdempotentRequestRetryStrategy.class, retryStrategy);

    request = new Request("DELETE", TEST_URL + "/api/2.0/sql/sessions/1");
    retryStrategy = RETRY_STRATEGY_PICKER.getRetryStrategy(request);
    Assertions.assertInstanceOf(IdempotentRequestRetryStrategy.class, retryStrategy);

    request = new Request("POST", TEST_URL + "/api/2.0/sql/statements/1");
    retryStrategy = RETRY_STRATEGY_PICKER.getRetryStrategy(request);
    Assertions.assertInstanceOf(NonIdempotentRequestRetryStrategy.class, retryStrategy);
  }
}
