// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateFailoverGroupRequest {
  /**
   * The failover group with updated fields. The name field identifies the resource and is populated
   * from the URL path.
   */
  @JsonProperty("failover_group")
  private FailoverGroup failoverGroup;

  /**
   * Fully qualified resource name in the format
   * accounts/{account_id}/failover-groups/{failover_group_id}.
   */
  @JsonIgnore private String name;

  /** Comma-separated list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateFailoverGroupRequest setFailoverGroup(FailoverGroup failoverGroup) {
    this.failoverGroup = failoverGroup;
    return this;
  }

  public FailoverGroup getFailoverGroup() {
    return failoverGroup;
  }

  public UpdateFailoverGroupRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateFailoverGroupRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateFailoverGroupRequest that = (UpdateFailoverGroupRequest) o;
    return Objects.equals(failoverGroup, that.failoverGroup)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failoverGroup, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateFailoverGroupRequest.class)
        .add("failoverGroup", failoverGroup)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
