package com.databricks.sdk.core;

import com.databricks.sdk.support.InternalApi;

/** Shared validation and error handling for group assumption. */
@InternalApi
public final class GroupAssumption {
  private GroupAssumption() {}

  public static boolean isRequested(DatabricksConfig config) {
    return config.getGroupId() != null && !config.getGroupId().isEmpty();
  }

  /** Rejects an applicable authentication strategy that cannot assume a group. */
  public static void rejectUnsupportedAuth(DatabricksConfig config, String authType) {
    if (!isRequested(config)) {
      return;
    }

    String message =
        "auth type \"%s\" does not support group assumption. "
            + "Use Databricks OAuth or workload identity federation authentication";

    throw new UnsupportedGroupAuthException(String.format(message, authType));
  }
}
