// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateRestrictedSharingGroupRequest {
  /**
   * The restricted sharing group to create. It has no client-set fields; the group is identified by
   * restricted_sharing_group_id.
   */
  @JsonProperty("restricted_sharing_group")
  private RestrictedSharingGroup restrictedSharingGroup;

  /**
   * The id of the workspace group to restrict: the numeric id of an existing and non-system
   * workspace group.
   */
  @JsonIgnore
  @QueryParam("restricted_sharing_group_id")
  private String restrictedSharingGroupId;

  public CreateRestrictedSharingGroupRequest setRestrictedSharingGroup(
      RestrictedSharingGroup restrictedSharingGroup) {
    this.restrictedSharingGroup = restrictedSharingGroup;
    return this;
  }

  public RestrictedSharingGroup getRestrictedSharingGroup() {
    return restrictedSharingGroup;
  }

  public CreateRestrictedSharingGroupRequest setRestrictedSharingGroupId(
      String restrictedSharingGroupId) {
    this.restrictedSharingGroupId = restrictedSharingGroupId;
    return this;
  }

  public String getRestrictedSharingGroupId() {
    return restrictedSharingGroupId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateRestrictedSharingGroupRequest that = (CreateRestrictedSharingGroupRequest) o;
    return Objects.equals(restrictedSharingGroup, that.restrictedSharingGroup)
        && Objects.equals(restrictedSharingGroupId, that.restrictedSharingGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrictedSharingGroup, restrictedSharingGroupId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRestrictedSharingGroupRequest.class)
        .add("restrictedSharingGroup", restrictedSharingGroup)
        .add("restrictedSharingGroupId", restrictedSharingGroupId)
        .toString();
  }
}
