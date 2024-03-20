package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.http.Request;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RequestBasedRetryStrategyPicker implements RetryStrategyPicker {
  private static final List<Request> NON_IDEMPOTENT_REQUESTS =
      Arrays.asList(new Request("POST", "/api/2.0/sql/statements/"));

  private final List<Request> nonIdempotentRequestsWithUrl;
  DatabricksConfig config;

  public RequestBasedRetryStrategyPicker(DatabricksConfig config) {
    this.config = config;
    this.nonIdempotentRequestsWithUrl =
        NON_IDEMPOTENT_REQUESTS.stream()
            .map(request -> new Request(request.getMethod(), config.getHost() + request.getUrl()))
            .collect(Collectors.toList());
  }

  @Override
  public RetryStrategy getRetryStrategy(Request request) {
    if (isNonIdempotentRequest(request)) {
      return new NonIdempotentRequestRetryStrategy();
    } else {
      return new IdempotentRequestRetryStrategy();
    }
  }

  private boolean isNonIdempotentRequest(Request request) {
    for (Request nonIdempotentRequest : nonIdempotentRequestsWithUrl) {
      if (nonIdempotentRequest.getMethod().equals(request.getMethod())
          && nonIdempotentRequest.getUrl().equals(request.getUrl())) {
        return true;
      }
    }
    return false;
  }
}
