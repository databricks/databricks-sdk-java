// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;

/**
 * The different statuses of a workspace. The following represents the current set of valid
 * transitions from status to status: NOT_PROVISIONED -> PROVISIONING -> CANCELLED PROVISIONING ->
 * RUNNING -> FAILED -> CANCELLED (note that this transition is disallowed in the MultiWorkspace
 * Project) RUNNING -> PROVISIONING -> BANNED -> CANCELLED FAILED -> PROVISIONING -> CANCELLED
 * BANNED -> RUNNING -> CANCELLED Note that a transition from any state to itself is also valid.
 * TODO(PLAT-5867): add a transition from CANCELLED to some other value (e.g. RECOVERING)
 */
@Generated
public enum WorkspaceStatus {
  BANNED,
  CANCELLING,
  FAILED,
  NOT_PROVISIONED,
  PROVISIONING,
  RUNNING,
}
