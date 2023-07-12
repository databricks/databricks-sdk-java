// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Get instance pool information
 */
@Generated
public class GetInstancePoolRequest {
  /**
   * The canonical unique identifier for the instance pool.
   */
  @QueryParam("instance_pool_id")
  private String instancePoolId;
  
  public GetInstancePoolRequest setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetInstancePoolRequest that = (GetInstancePoolRequest) o;
    return Objects.equals(instancePoolId, that.instancePoolId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancePoolId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetInstancePoolRequest.class)
      .add("instancePoolId", instancePoolId).toString();
  }
}
