// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The response to resolving a group. */
@Generated
public class ResolveGroupResponse {
  /** The resolved group. */
  @JsonProperty("group")
  private Group group;

  public ResolveGroupResponse setGroup(Group group) {
    this.group = group;
    return this;
  }

  public Group getGroup() {
    return group;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolveGroupResponse that = (ResolveGroupResponse) o;
    return Objects.equals(group, that.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolveGroupResponse.class).add("group", group).toString();
  }
}
