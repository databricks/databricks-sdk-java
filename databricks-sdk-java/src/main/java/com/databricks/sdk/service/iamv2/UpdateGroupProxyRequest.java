// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateGroupProxyRequest {
  /** Required. Group to be updated in <Databricks> */
  @JsonProperty("group")
  private Group group;

  /** Required. Internal ID of the group in Databricks. */
  @JsonIgnore private String groupId;

  /** Optional. The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateGroupProxyRequest setGroup(Group group) {
    this.group = group;
    return this;
  }

  public Group getGroup() {
    return group;
  }

  public UpdateGroupProxyRequest setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupId() {
    return groupId;
  }

  public UpdateGroupProxyRequest setUpdateMask(String updateMask) {
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
    UpdateGroupProxyRequest that = (UpdateGroupProxyRequest) o;
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
    return new ToStringer(UpdateGroupProxyRequest.class)
        .add("group", group)
        .add("groupId", groupId)
        .add("updateMask", updateMask)
        .toString();
  }
}
