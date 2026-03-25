// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.environments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetDefaultWorkspaceBaseEnvironmentRequest {
  /**
   * A static resource name of the default workspace base environment. Format:
   * default-workspace-base-environment
   */
  @JsonIgnore private String name;

  public GetDefaultWorkspaceBaseEnvironmentRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetDefaultWorkspaceBaseEnvironmentRequest that = (GetDefaultWorkspaceBaseEnvironmentRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDefaultWorkspaceBaseEnvironmentRequest.class)
        .add("name", name)
        .toString();
  }
}
