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
  UNIFIED
}
