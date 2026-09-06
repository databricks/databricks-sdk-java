// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;

/**
 * Lifecycle state of a Sandbox resource. STOPPING is the transient state while the sandbox is being
 * stopped -- by a Stop request or inactivity auto-termination -- and settles to STOPPED once the
 * operation completes.
 */
@Generated
public enum SandboxState {
  SANDBOX_STATE_PENDING,
  SANDBOX_STATE_RUNNING,
  SANDBOX_STATE_STOPPED,
  SANDBOX_STATE_STOPPING,
}
