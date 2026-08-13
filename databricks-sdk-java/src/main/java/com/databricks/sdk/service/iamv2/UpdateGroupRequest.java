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
  /** Required. Group to be updated in <Databricks> */
  @JsonProperty("group")
  private Group group;

  /** Required. Internal ID of the group in Databricks. */
  @JsonIgnore private String groupId;

  /** Optional. The list of fields to update. */
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

  public UpdateGroupRequest setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupId() {
    return groupId;
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
        && Objects.equals(groupId, that.groupId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, groupId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateGroupRequest.class)
        .add("group", group)
        .add("groupId", groupId)
        .add("updateMask", updateMask)
        .toString();
  }
}
