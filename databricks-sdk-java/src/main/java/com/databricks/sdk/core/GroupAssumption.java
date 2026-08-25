package com.databricks.sdk.core;

import com.databricks.sdk.support.InternalApi;

/** Shared utilities for group assumption. */
@InternalApi
public final class GroupAssumption {
  private GroupAssumption() {}

  public static boolean isRequested(DatabricksConfig config) {
    return config.getGroupId() != null && !config.getGroupId().isEmpty();
  }

  /** Creates an actionable error for an explicitly configured unsupported authentication type. */
  public static DatabricksException unsupportedAuth(String authType) {
    String message =
        "auth type \"%s\" does not support group assumption. "
            + "Use Databricks OAuth or workload identity federation authentication";

    return new DatabricksException(String.format(message, authType));
  }
}
