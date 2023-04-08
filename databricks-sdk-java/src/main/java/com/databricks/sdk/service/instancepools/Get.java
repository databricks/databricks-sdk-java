// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get instance pool information */
public class Get {
  /** The canonical unique identifier for the instance pool. */
  @QueryParam("instance_pool_id")
  private String instancePoolId;

  public Get setInstancePoolId(String instancePoolId) {
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
    Get that = (Get) o;
    return Objects.equals(instancePoolId, that.instancePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancePoolId);
  }

  @Override
  public String toString() {
    return new ToStringer(Get.class).add("instancePoolId", instancePoolId).toString();
  }
}
