// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The environment entity used to preserve serverless environment side panel, jobs' environment for
 * non-notebook task, and DLT's environment for classic and serverless pipelines. In this minimal
 * environment spec, only pip dependencies are supported.
 */
@Generated
public class PipelinesEnvironment {
  /**
   * List of pip dependencies, as supported by the version of pip in this environment. Each
   * dependency is a pip requirement file line
   * https://pip.pypa.io/en/stable/reference/requirements-file-format/ Allowed dependency could be
   * <requirement specifier>, <archive url/path>, <local project path>(WSFS or Volumes in
   * Databricks), <vcs project url>
   */
  @JsonProperty("dependencies")
  private Collection<String> dependencies;

  public PipelinesEnvironment setDependencies(Collection<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<String> getDependencies() {
    return dependencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelinesEnvironment that = (PipelinesEnvironment) o;
    return Objects.equals(dependencies, that.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelinesEnvironment.class).add("dependencies", dependencies).toString();
  }
}
