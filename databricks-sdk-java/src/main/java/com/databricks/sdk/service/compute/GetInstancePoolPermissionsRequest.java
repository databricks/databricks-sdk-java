// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get instance pool permissions */
@Generated
public class GetInstancePoolPermissionsRequest {
  /** The instance pool for which to get or manage permissions. */
  private String instancePoolId;

  public GetInstancePoolPermissionsRequest setInstancePoolId(String instancePoolId) {
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
    GetInstancePoolPermissionsRequest that = (GetInstancePoolPermissionsRequest) o;
    return Objects.equals(instancePoolId, that.instancePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancePoolId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetInstancePoolPermissionsRequest.class)
        .add("instancePoolId", instancePoolId)
        .toString();
  }
}
