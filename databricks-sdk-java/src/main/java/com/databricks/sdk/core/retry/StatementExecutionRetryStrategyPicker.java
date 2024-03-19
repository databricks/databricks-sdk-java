package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.http.Request;

import java.util.Arrays;
import java.util.List;

public class StatementExecutionRetryStrategyPicker implements RetryStrategyPicker {
    private static final List<Request> NON_IDEMPOTENT_REQUESTS = Arrays.asList(
            new Request("POST", "/api/2.0/sql/statements/")
    );

    @Override
    public RetryStrategy getRetryStrategy(Request request) {
        if (isNonIdempotentRequest(request)) {
            return new NonIdempotentRequestRetryStrategy();
        } else {
            return new IdempotentRequestRetryStrategy();
        }
    }

    private boolean isNonIdempotentRequest(Request request) {
        for (Request nonIdempotentRequest : NON_IDEMPOTENT_REQUESTS) {
            if (nonIdempotentRequest.getMethod().equals(request.getMethod()) &&
                    nonIdempotentRequest.getUrl().equals(request.getUrl())) {
                return true;
            }
        }
        return false;
    }
}
