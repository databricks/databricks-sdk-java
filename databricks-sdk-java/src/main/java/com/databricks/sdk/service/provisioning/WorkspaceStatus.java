// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;

/**
 * The different statuses of a workspace. The following represents the current set of valid
 * transitions from status to status: NOT_PROVISIONED -&gt; PROVISIONING -&gt; CANCELLED
 * PROVISIONING -&gt; RUNNING -&gt; FAILED -&gt; CANCELLED (note that this transition is disallowed
 * in the MultiWorkspace Project) RUNNING -&gt; PROVISIONING -&gt; BANNED -&gt; CANCELLED FAILED
 * -&gt; PROVISIONING -&gt; CANCELLED BANNED -&gt; RUNNING -&gt; CANCELLED Note that a transition
 * from any state to itself is also valid. TODO(PLAT-5867): add a transition from CANCELLED to some
 * other value (e.g. RECOVERING)
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
