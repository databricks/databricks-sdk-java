// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateInstancePoolResponse {
  /** The ID of the created instance pool. */
  @JsonProperty("instance_pool_id")
  private String instancePoolId;

  public CreateInstancePoolResponse setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }
}
