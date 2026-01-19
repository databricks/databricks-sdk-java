package com.databricks.sdk.core;

import com.databricks.sdk.support.InternalApi;

/** Represents the type of Databricks client being used for API operations. */
@InternalApi
public enum ClientType {
  /** Traditional workspace client. */
  WORKSPACE,

  /** Traditional account client. */
  ACCOUNT,

  /** Workspace-scoped client on unified host. */
  WORKSPACE_ON_UNIFIED,

  /** Account-scoped client on unified host. */
  ACCOUNT_ON_UNIFIED
}
