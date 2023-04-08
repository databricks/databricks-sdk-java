// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListInstancePools {
  /** */
  @JsonProperty("instance_pools")
  private java.util.List<InstancePoolAndStats> instancePools;

  public ListInstancePools setInstancePools(java.util.List<InstancePoolAndStats> instancePools) {
    this.instancePools = instancePools;
    return this;
  }

  public java.util.List<InstancePoolAndStats> getInstancePools() {
    return instancePools;
  }
}
