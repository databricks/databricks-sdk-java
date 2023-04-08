// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PendingInstanceError {
  /** */
  @JsonProperty("instance_id")
  private String instanceId;

  /** */
  @JsonProperty("message")
  private String message;

  public PendingInstanceError setInstanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  public String getInstanceId() {
    return instanceId;
  }

  public PendingInstanceError setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }
}
