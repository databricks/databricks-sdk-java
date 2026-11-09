// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request to resolve a software artifact version from its tag alias. */
@Generated
public class ResolveSoftwareArtifactVersionRequest {
  /** Image tag alias selecting the version. */
  @JsonProperty("alias")
  private String alias;

  /** Resource name of the software artifact containing the alias. */
  @JsonIgnore private String parent;

  public ResolveSoftwareArtifactVersionRequest setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public ResolveSoftwareArtifactVersionRequest setParent(String parent) {
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
    ResolveSoftwareArtifactVersionRequest that = (ResolveSoftwareArtifactVersionRequest) o;
    return Objects.equals(alias, that.alias) && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolveSoftwareArtifactVersionRequest.class)
        .add("alias", alias)
        .add("parent", parent)
        .toString();
  }
}
