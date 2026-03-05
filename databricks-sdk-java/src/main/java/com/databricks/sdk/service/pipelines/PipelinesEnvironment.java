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

  /**
   * The environment version of the serverless Python environment used to execute customer Python
   * code. Each environment version includes a specific Python version and a curated set of
   * pre-installed libraries with defined versions, providing a stable and reproducible execution
   * environment.
   *
   * <p>Databricks supports a three-year lifecycle for each environment version. For available
   * versions and their included packages, see
   * https://docs.databricks.com/aws/en/release-notes/serverless/environment-version/
   *
   * <p>The value should be a string representing the environment version number, for example:
   * `"4"`.
   */
  @JsonProperty("environment_version")
  private String environmentVersion;

  public PipelinesEnvironment setDependencies(Collection<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<String> getDependencies() {
    return dependencies;
  }

  public PipelinesEnvironment setEnvironmentVersion(String environmentVersion) {
    this.environmentVersion = environmentVersion;
    return this;
  }

  public String getEnvironmentVersion() {
    return environmentVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelinesEnvironment that = (PipelinesEnvironment) o;
    return Objects.equals(dependencies, that.dependencies)
        && Objects.equals(environmentVersion, that.environmentVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies, environmentVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelinesEnvironment.class)
        .add("dependencies", dependencies)
        .add("environmentVersion", environmentVersion)
        .toString();
  }
}
