package com.databricks.sdk.core;

import java.util.HashMap;
import java.util.Map;

/**
 * HeaderFactory wrapper that adds X-Databricks-Org-Id header for unified host workspace operations.
 */
class UnifiedHostHeaderFactory implements HeaderFactory {
  private final HeaderFactory delegate;
  private final String workspaceId;

  /**
   * Creates a new unified host header factory.
   *
   * @param delegate The underlying header factory (e.g., OAuth, PAT)
   * @param workspaceId The workspace ID to inject in the X-Databricks-Org-Id header
   */
  public UnifiedHostHeaderFactory(HeaderFactory delegate, String workspaceId) {
    if (delegate == null) {
      throw new IllegalArgumentException("delegate cannot be null");
    }
    if (workspaceId == null || workspaceId.isEmpty()) {
      throw new IllegalArgumentException("workspaceId cannot be null or empty");
    }
    this.delegate = delegate;
    this.workspaceId = workspaceId;
  }

  @Override
  public Map<String, String> headers() {
    Map<String, String> headers = new HashMap<>(delegate.headers());
    headers.put("X-Databricks-Org-Id", workspaceId);
    return headers;
  }
}
