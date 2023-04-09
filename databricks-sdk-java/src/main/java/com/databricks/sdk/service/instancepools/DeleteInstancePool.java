// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class DeleteInstancePool {
  /** The instance pool to be terminated. */
  @JsonProperty("instance_pool_id")
  private String instancePoolId;

  public DeleteInstancePool setInstancePoolId(String instancePoolId) {
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
    DeleteInstancePool that = (DeleteInstancePool) o;
    return Objects.equals(instancePoolId, that.instancePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancePoolId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteInstancePool.class)
        .add("instancePoolId", instancePoolId)
        .toString();
  }
}
