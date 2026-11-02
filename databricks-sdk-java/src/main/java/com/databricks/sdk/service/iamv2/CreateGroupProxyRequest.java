// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateGroupProxyRequest {
  /** Required. Group to be created in Databricks */
  @JsonProperty("group")
  private Group group;

  /**
   * The resource name of the account to create the group in, `accounts/{account_id}`. Optional:
   * defaults to the account of the calling workspace, and any other account is rejected.
   */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  public CreateGroupProxyRequest setGroup(Group group) {
    this.group = group;
    return this;
  }

  public Group getGroup() {
    return group;
  }

  public CreateGroupProxyRequest setParent(String parent) {
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
    CreateGroupProxyRequest that = (CreateGroupProxyRequest) o;
    return Objects.equals(group, that.group) && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateGroupProxyRequest.class)
        .add("group", group)
        .add("parent", parent)
        .toString();
  }
}
