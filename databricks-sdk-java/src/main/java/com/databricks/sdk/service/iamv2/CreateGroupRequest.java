// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateGroupRequest {
  /** Required. Group to be created in Databricks */
  @JsonProperty("group")
  private Group group;

  /**
   * The parent resource name of the account in which to create the group. Format:
   * accounts/{account_id}
   */
  @JsonIgnore private String parent;

  public CreateGroupRequest setGroup(Group group) {
    this.group = group;
    return this;
  }

  public Group getGroup() {
    return group;
  }

  public CreateGroupRequest setParent(String parent) {
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
    CreateGroupRequest that = (CreateGroupRequest) o;
    return Objects.equals(group, that.group) && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateGroupRequest.class)
        .add("group", group)
        .add("parent", parent)
        .toString();
  }
}
