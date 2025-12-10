package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.InternalApi;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * A RetryStrategyPicker that selects a retry strategy based on whether the request is idempotent or
 * not.
 */
@InternalApi
public class RequestBasedRetryStrategyPicker implements RetryStrategyPicker {
  private static final List<Request> IDEMPOTENT_REQUESTS =
      Arrays.asList(
          // Create a new session v1.0
          new Request("POST", "/api/2.0/sql/statements/sessions/"),
          // Create a new session v2.0
          new Request("POST", "/api/2.0/sql/sessions/"),
          // Delete an existing session v1.0
          new Request("DELETE", "/api/2.0/sql/statements/sessions/.*"),
          // Delete an existing session v2.0
          new Request("DELETE", "/api/2.0/sql/sessions/.*"),
          // Get status of a statement
          new Request("GET", "/api/2.0/sql/statements/.*"),
          // Close a statement
          new Request("DELETE", "/api/2.0/sql/statements/.*"),
          // Fetch a chunk of a statement result
          new Request("GET", "/api/2.0/sql/statements/.*/result/chunks/.*"));

  private final List<Map.Entry<String, Pattern>> idempotentRequestsPattern;
  private static final NonIdempotentRequestRetryStrategy NON_IDEMPOTENT_RETRY_STRATEGY =
      new NonIdempotentRequestRetryStrategy();
  private static final IdempotentRequestRetryStrategy IDEMPOTENT_RETRY_STRATEGY =
      new IdempotentRequestRetryStrategy();

  public RequestBasedRetryStrategyPicker(String host) {
    this.idempotentRequestsPattern =
        IDEMPOTENT_REQUESTS.stream()
            .map(
                request ->
                    new AbstractMap.SimpleEntry<>(
                        request.getMethod(),
                        Pattern.compile(host + request.getUrl(), Pattern.CASE_INSENSITIVE)))
            .collect(Collectors.toList());
  }

  /**
   * This function gets the retry strategy for a given request based on whether the request is
   * idempotent or not.
   *
   * @param request to get the retry strategy for
   * @return the retry strategy for the given request
   */
  @Override
  public RetryStrategy getRetryStrategy(Request request) {
    if (isIdempotentRequest(request)) {
      return IDEMPOTENT_RETRY_STRATEGY;
    } else {
      return NON_IDEMPOTENT_RETRY_STRATEGY;
    }
  }

  /**
   * This function checks if a given request is idempotent.
   *
   * @param request to check if it is idempotent
   * @return true if the request is idempotent, false otherwise
   */
  private boolean isIdempotentRequest(Request request) {
    for (Map.Entry<String, Pattern> idempotentRequest : idempotentRequestsPattern) {
      if (idempotentRequest.getKey().equals(request.getMethod())
          && idempotentRequest.getValue().matcher(request.getUrl()).find()) {
        return true;
      }
    }
    return false;
  }
}
