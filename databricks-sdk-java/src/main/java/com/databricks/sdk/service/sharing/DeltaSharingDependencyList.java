// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Represents a list of dependencies. */
@Generated
public class DeltaSharingDependencyList {
  /** An array of Dependency. */
  @JsonProperty("dependencies")
  private Collection<DeltaSharingDependency> dependencies;

  public DeltaSharingDependencyList setDependencies(
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
    DeltaSharingDependencyList that = (DeltaSharingDependencyList) o;
    return Objects.equals(dependencies, that.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSharingDependencyList.class)
        .add("dependencies", dependencies)
        .toString();
  }
}
