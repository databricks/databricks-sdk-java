package com.databricks.sdk.core.http;

/** Interface for modifying a request */
public interface RequestModifier {
  /**
   * Apply modifications to the request
   *
   * @param request The request to modify
   * @return The modified request
   */
  Request modify(Request request);
}
