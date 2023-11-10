// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A list of dependencies. */
@Generated
public class DependencyList {
  /** Array of dependencies. */
  @JsonProperty("dependencies")
  private Collection<Dependency> dependencies;

  public DependencyList setDependencies(Collection<Dependency> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<Dependency> getDependencies() {
    return dependencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DependencyList that = (DependencyList) o;
    return Objects.equals(dependencies, that.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(DependencyList.class).add("dependencies", dependencies).toString();
  }
}
