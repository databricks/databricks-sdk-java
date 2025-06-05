// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Represents a list of dependencies. */
@Generated
class DeltaSharingDependencyListPb {
  @JsonProperty("dependencies")
  private Collection<DeltaSharingDependency> dependencies;

  public DeltaSharingDependencyListPb setDependencies(
      Collection<DeltaSharingDependency> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<DeltaSharingDependency> getDependencies() {
    return dependencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaSharingDependencyListPb that = (DeltaSharingDependencyListPb) o;
    return Objects.equals(dependencies, that.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSharingDependencyListPb.class)
        .add("dependencies", dependencies)
        .toString();
  }
}
