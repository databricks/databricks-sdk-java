package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.http.Request;

public interface RetryStrategyPicker {
    RetryStrategy getRetryStrategy(Request request);
}
