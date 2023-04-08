// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstancePoolStatus {
  /**
   * List of error messages for the failed pending instances. The pending_instance_errors follows
   * FIFO with maximum length of the min_idle of the pool. The pending_instance_errors is emptied
   * once the number of exiting available instances reaches the min_idle of the pool.
   */
  @JsonProperty("pending_instance_errors")
  private java.util.List<PendingInstanceError> pendingInstanceErrors;

  public InstancePoolStatus setPendingInstanceErrors(
      java.util.List<PendingInstanceError> pendingInstanceErrors) {
    this.pendingInstanceErrors = pendingInstanceErrors;
    return this;
  }

  public java.util.List<PendingInstanceError> getPendingInstanceErrors() {
    return pendingInstanceErrors;
  }
}
