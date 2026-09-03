// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;

/**
 * Lifecycle state of a Sandbox resource. STOPPING is the transient state surfaced while a teardown
 * (Stop, DeleteSandbox, auto-terminate, provisioning failure) is in flight but the sandbox row
 * still exists; the row settles to STOPPED once the workflow finishes.
 */
@Generated
public enum SandboxState {
  SANDBOX_STATE_PENDING,
  SANDBOX_STATE_RUNNING,
  SANDBOX_STATE_STOPPED,
  SANDBOX_STATE_STOPPING,
}
