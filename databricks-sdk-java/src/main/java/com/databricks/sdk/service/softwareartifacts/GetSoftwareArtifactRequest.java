// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetSoftwareArtifactRequest {
  /**
   * Resource name of the artifact, of the form `software-artifacts/{catalog}.{schema}.{artifact}`.
   */
  @JsonIgnore private String name;

  public GetSoftwareArtifactRequest setName(String name) {
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
    GetSoftwareArtifactRequest that = (GetSoftwareArtifactRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSoftwareArtifactRequest.class).add("name", name).toString();
  }
}
