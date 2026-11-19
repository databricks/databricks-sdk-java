// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteSoftwareArtifactVersionRequest {
  /**
   * Resource name of the version, of the form
   * `software-artifacts/{catalog}.{schema}.{artifact}/versions/{version}`, where `{version}` is the
   * version's content digest, for example `sha256:<hex>`.
   */
  @JsonIgnore private String name;

  public DeleteSoftwareArtifactVersionRequest setName(String name) {
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
    DeleteSoftwareArtifactVersionRequest that = (DeleteSoftwareArtifactVersionRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSoftwareArtifactVersionRequest.class).add("name", name).toString();
  }
}
