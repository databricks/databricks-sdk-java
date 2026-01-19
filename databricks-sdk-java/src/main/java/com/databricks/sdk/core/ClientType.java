package com.databricks.sdk.core;

import com.databricks.sdk.support.InternalApi;

/** Represents the type of Databricks client being used for API operations. */
@InternalApi
public enum ClientType {
  /** Workspace client (traditional or unified host with workspaceId). */
  WORKSPACE,

  /** Account client (traditional or unified host without workspaceId). */
  ACCOUNT
}
