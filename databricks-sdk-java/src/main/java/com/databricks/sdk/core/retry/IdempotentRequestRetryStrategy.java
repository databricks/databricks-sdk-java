package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.http.Response;

public class IdempotentRequestRetryStrategy implements RetryStrategy {
    @Override
    public boolean isRetriable(Response response, Exception e) {
        return true;
    }

    @Override
    public DatabricksError getError() {
        return null;
    }
}
