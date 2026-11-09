// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDirectGroupMemberRequest {
  /** The member to add. Set its `principal_id`. */
  @JsonProperty("direct_group_member")
  private DirectGroupMember directGroupMember;

  /**
   * The resource name of the group to add the member to, in the format
   * `accounts/{account_id}/groups/{group_id}`.
   */
  @JsonIgnore private String parent;

  public CreateDirectGroupMemberRequest setDirectGroupMember(DirectGroupMember directGroupMember) {
    this.directGroupMember = directGroupMember;
    return this;
  }

  public DirectGroupMember getDirectGroupMember() {
    return directGroupMember;
  }

  public CreateDirectGroupMemberRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDirectGroupMemberRequest that = (CreateDirectGroupMemberRequest) o;
    return Objects.equals(directGroupMember, that.directGroupMember)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directGroupMember, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDirectGroupMemberRequest.class)
        .add("directGroupMember", directGroupMember)
        .add("parent", parent)
        .toString();
  }
}
