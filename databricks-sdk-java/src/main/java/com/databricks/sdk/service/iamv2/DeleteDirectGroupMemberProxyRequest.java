// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteDirectGroupMemberProxyRequest {
  /** Required. Internal ID of the group in Databricks. */
  @JsonIgnore private Long groupId;

  /** Required. Internal ID of the principal to be unassigned from the group. */
  @JsonIgnore private Long principalId;

  public DeleteDirectGroupMemberProxyRequest setGroupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public Long getGroupId() {
    return groupId;
  }

  public DeleteDirectGroupMemberProxyRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDirectGroupMemberProxyRequest that = (DeleteDirectGroupMemberProxyRequest) o;
    return Objects.equals(groupId, that.groupId) && Objects.equals(principalId, that.principalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, principalId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDirectGroupMemberProxyRequest.class)
        .add("groupId", groupId)
        .add("principalId", principalId)
        .toString();
  }
}
