// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateGroupRequest {
  /** The group to update. Its `name` identifies the group. */
  @JsonProperty("group")
  private Group group;

  /**
   * The resource name of the group, in one of these formats: - Account APIs:
   * `accounts/{account_id}/groups/{group_id}` - Workspace APIs: `groups/{group_id}`
   */
  @JsonIgnore private String name;

  /** The fields to update, separated by commas. You can update `group_name` and `external_id`. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateGroupRequest setGroup(Group group) {
    this.group = group;
    return this;
  }

  public Group getGroup() {
    return group;
  }

  public UpdateGroupRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateGroupRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateGroupRequest that = (UpdateGroupRequest) o;
    return Objects.equals(group, that.group)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateGroupRequest.class)
        .add("group", group)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
