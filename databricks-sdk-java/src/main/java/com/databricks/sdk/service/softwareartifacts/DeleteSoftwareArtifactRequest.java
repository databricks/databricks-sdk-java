// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteSoftwareArtifactRequest {
  /**
   * Force deletion even if the software artifact has versions, deleting them with it. Default is
   * false.
   */
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  /**
   * Resource name of the software artifact, of the form
   * `software-artifacts/{catalog}.{schema}.{artifact}`.
   */
  @JsonIgnore private String name;

  public DeleteSoftwareArtifactRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteSoftwareArtifactRequest setName(String name) {
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
    DeleteSoftwareArtifactRequest that = (DeleteSoftwareArtifactRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSoftwareArtifactRequest.class)
        .add("force", force)
        .add("name", name)
        .toString();
  }
}
