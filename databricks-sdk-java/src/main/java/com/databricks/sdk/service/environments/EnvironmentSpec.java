// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.environments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Environment specification for a WorkspaceBaseEnvironment. Contains the environment version and
 * dependencies configuration.
 */
@Generated
public class EnvironmentSpec {
  /**
   * List of pip dependencies, as supported by the version of pip in this environment. Each
   * dependency is a valid pip requirements file line per
   * https://pip.pypa.io/en/stable/reference/requirements-file-format/. Allowed dependencies include
   * a requirement specifier, an archive URL, a local project path (such as WSFS or UC Volumes in
   * Databricks), or a VCS project URL.
   */
  @JsonProperty("dependencies")
  private Collection<String> dependencies;

  /**
   * Environment version used by the environment. Each version comes with a specific Python version
   * and a set of Python packages. The version is a string, consisting of an integer.
   */
  @JsonProperty("environment_version")
  private String environmentVersion;

  public EnvironmentSpec setDependencies(Collection<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<String> getDependencies() {
    return dependencies;
  }

  public EnvironmentSpec setEnvironmentVersion(String environmentVersion) {
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
    EnvironmentSpec that = (EnvironmentSpec) o;
    return Objects.equals(dependencies, that.dependencies)
        && Objects.equals(environmentVersion, that.environmentVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies, environmentVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(EnvironmentSpec.class)
        .add("dependencies", dependencies)
        .add("environmentVersion", environmentVersion)
        .toString();
  }
}
