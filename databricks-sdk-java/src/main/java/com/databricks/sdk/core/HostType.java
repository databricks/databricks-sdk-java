package com.databricks.sdk.core;

import com.databricks.sdk.support.InternalApi;

/** Represents the type of Databricks host being used. */
@InternalApi
public enum HostType {
  /** Traditional workspace host. */
  WORKSPACE,

  /** Traditional accounts host. */
  ACCOUNTS,

  /** Unified host supporting both workspace and account operations. */
  UNIFIED;

  /**
   * Converts an API-level host type string (e.g. "workspace", "account", "unified") to the
   * corresponding enum value. Returns {@code null} for unknown or empty values.
   */
  public static HostType fromApiValue(String value) {
    if (value == null || value.isEmpty()) {
      return null;
    }
    switch (value.toLowerCase()) {
      case "workspace":
        return WORKSPACE;
      case "account":
        return ACCOUNTS;
      case "unified":
        return UNIFIED;
      default:
        return null;
    }
  }
}
