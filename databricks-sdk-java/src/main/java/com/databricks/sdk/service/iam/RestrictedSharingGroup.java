// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A RestrictedSharingGroup is a workspace group whose members cannot grant or revoke permissions on
 * workspace assets while they have assumed the group or one of its child groups. Users acting as
 * themselves are not affected.
 */
@Generated
public class RestrictedSharingGroup {
  /** The display name of the restricted workspace group. */
  @JsonProperty("group_display_name")
  private String groupDisplayName;

  /**
   * The resource name of the restricted sharing group. Format:
   * `restricted-sharing-groups/{restricted_sharing_group_id}` Example:
   * `restricted-sharing-groups/123`
   */
  @JsonProperty("name")
  private String name;

  /**
   * The id of the restricted workspace group: the numeric id of an existing and non-system
   * workspace group.
   */
  @JsonProperty("restricted_sharing_group_id")
  private String restrictedSharingGroupId;

  public RestrictedSharingGroup setGroupDisplayName(String groupDisplayName) {
    this.groupDisplayName = groupDisplayName;
    return this;
  }

  public String getGroupDisplayName() {
    return groupDisplayName;
  }

  public RestrictedSharingGroup setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RestrictedSharingGroup setRestrictedSharingGroupId(String restrictedSharingGroupId) {
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
    RestrictedSharingGroup that = (RestrictedSharingGroup) o;
    return Objects.equals(groupDisplayName, that.groupDisplayName)
        && Objects.equals(name, that.name)
        && Objects.equals(restrictedSharingGroupId, that.restrictedSharingGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupDisplayName, name, restrictedSharingGroupId);
  }

  @Override
  public String toString() {
    return new ToStringer(RestrictedSharingGroup.class)
        .add("groupDisplayName", groupDisplayName)
        .add("name", name)
        .add("restrictedSharingGroupId", restrictedSharingGroupId)
        .toString();
  }
}
