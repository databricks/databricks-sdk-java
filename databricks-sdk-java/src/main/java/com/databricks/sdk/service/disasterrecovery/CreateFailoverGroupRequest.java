// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateFailoverGroupRequest {
  /** The failover group to create. */
  @JsonProperty("failover_group")
  private FailoverGroup failoverGroup;

  /**
   * Client-provided identifier for the failover group. Used to construct the resource name as
   * {parent}/failover-groups/{failover_group_id}.
   */
  @JsonIgnore
  @QueryParam("failover_group_id")
  private String failoverGroupId;

  /** The parent resource. Format: accounts/{account_id}. */
  @JsonIgnore private String parent;

  /** When true, validates the request without creating the failover group. */
  @JsonIgnore
  @QueryParam("validate_only")
  private Boolean validateOnly;

  public CreateFailoverGroupRequest setFailoverGroup(FailoverGroup failoverGroup) {
    this.failoverGroup = failoverGroup;
    return this;
  }

  public FailoverGroup getFailoverGroup() {
    return failoverGroup;
  }

  public CreateFailoverGroupRequest setFailoverGroupId(String failoverGroupId) {
    this.failoverGroupId = failoverGroupId;
    return this;
  }

  public String getFailoverGroupId() {
    return failoverGroupId;
  }

  public CreateFailoverGroupRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateFailoverGroupRequest setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  public Boolean getValidateOnly() {
    return validateOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFailoverGroupRequest that = (CreateFailoverGroupRequest) o;
    return Objects.equals(failoverGroup, that.failoverGroup)
        && Objects.equals(failoverGroupId, that.failoverGroupId)
        && Objects.equals(parent, that.parent)
        && Objects.equals(validateOnly, that.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failoverGroup, failoverGroupId, parent, validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFailoverGroupRequest.class)
        .add("failoverGroup", failoverGroup)
        .add("failoverGroupId", failoverGroupId)
        .add("parent", parent)
        .add("validateOnly", validateOnly)
        .toString();
  }
}
