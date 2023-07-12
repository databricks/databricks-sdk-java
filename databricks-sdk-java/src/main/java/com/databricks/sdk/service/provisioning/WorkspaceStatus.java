// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;

/**
 * The status of the workspace. For workspace creation, usually it is set to `PROVISIONING`
 * initially. Continue to check the status until the status is `RUNNING`.
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
