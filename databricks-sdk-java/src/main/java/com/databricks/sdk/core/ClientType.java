package com.databricks.sdk.core;

import com.databricks.sdk.support.InternalApi;

/**
 * Represents the type of Databricks client being used for API operations.
 *
 * <p>This is determined by the combination of host type and workspace ID presence:
 *
 * <ul>
 *   <li>WORKSPACE: Can call workspace-level APIs
 *   <li>ACCOUNT: Can call account-level APIs
 *   <li>WORKSPACE_ON_UNIFIED: Workspace operations on a unified host (requires workspace ID)
 *   <li>ACCOUNT_ON_UNIFIED: Account operations on a unified host
 * </ul>
 */
@InternalApi
public enum ClientType {
  /** Traditional workspace client */
  WORKSPACE,

  /** Traditional account client */
  ACCOUNT,

  /** Workspace-scoped client on unified host (requires X-Databricks-Org-Id header) */
  WORKSPACE_ON_UNIFIED,

  /** Account-scoped client on unified host */
  ACCOUNT_ON_UNIFIED
}
