// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetGroupProxyRequest {
  /** Required. Internal ID of the group in Databricks. */
  @JsonIgnore private String groupId;

  public GetGroupProxyRequest setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupId() {
    return groupId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetGroupProxyRequest that = (GetGroupProxyRequest) o;
    return Objects.equals(groupId, that.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetGroupProxyRequest.class).add("groupId", groupId).toString();
  }
}
