// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDirectGroupMemberProxyRequest {
  /** Required. The group membership to create. */
  @JsonProperty("direct_group_member")
  private DirectGroupMember directGroupMember;

  /** Required. Internal ID of the group in Databricks. */
  @JsonIgnore private Long groupId;

  public CreateDirectGroupMemberProxyRequest setDirectGroupMember(
      DirectGroupMember directGroupMember) {
    this.directGroupMember = directGroupMember;
    return this;
  }

  public DirectGroupMember getDirectGroupMember() {
    return directGroupMember;
  }

  public CreateDirectGroupMemberProxyRequest setGroupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public Long getGroupId() {
    return groupId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDirectGroupMemberProxyRequest that = (CreateDirectGroupMemberProxyRequest) o;
    return Objects.equals(directGroupMember, that.directGroupMember)
        && Objects.equals(groupId, that.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directGroupMember, groupId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDirectGroupMemberProxyRequest.class)
        .add("directGroupMember", directGroupMember)
        .add("groupId", groupId)
        .toString();
  }
}
