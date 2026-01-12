package com.databricks.sdk.core;

import com.databricks.sdk.support.InternalApi;

/**
 * Represents the type of Databricks host being used.
 *
 * <p>This determines which APIs are available and how authentication should be handled:
 *
 * <ul>
 *   <li>WORKSPACE: Traditional workspace host (e.g., adb-*.azuredatabricks.net)
 *   <li>ACCOUNTS: Traditional account host (e.g., accounts.cloud.databricks.com)
 *   <li>UNIFIED: Unified host supporting both workspace and account operations
 * </ul>
 */
@InternalApi
public enum HostType {
  /** Traditional workspace host - supports workspace-level APIs only */
  WORKSPACE,

  /** Traditional accounts host - supports account-level APIs only */
  ACCOUNTS,

  /** Unified host - supports both workspace and account APIs based on context */
  UNIFIED
}
