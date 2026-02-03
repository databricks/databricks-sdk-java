// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
public class Environment {
  /**
   * The `base_environment` key refers to an `env.yaml` file that specifies an environment version
   * and a collection of dependencies required for the environment setup. This `env.yaml` file may
   * itself include a `base_environment` reference pointing to another `env_1.yaml` file. However,
   * when used as a base environment, `env_1.yaml` (or further nested references) will not be
   * processed or included in the final environment, meaning that the resolution of
   * `base_environment` references is not recursive.
   */
  @JsonProperty("base_environment")
  private String baseEnvironment;

  /** Use `environment_version` instead. */
  @JsonProperty("client")
  private String client;

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
   * Required. Environment version used by the environment. Each version comes with a specific
   * Python version and a set of Python packages. The version is a string, consisting of an integer.
   */
  @JsonProperty("environment_version")
  private String environmentVersion;

  /**
   * List of java dependencies. Each dependency is a string representing a java library path. For
   * example: `/Volumes/path/to/test.jar`.
   */
  @JsonProperty("java_dependencies")
  private Collection<String> javaDependencies;

  public Environment setBaseEnvironment(String baseEnvironment) {
    this.baseEnvironment = baseEnvironment;
    return this;
  }

  public String getBaseEnvironment() {
    return baseEnvironment;
  }

  public Environment setClient(String client) {
    this.client = client;
    return this;
  }

  public String getClient() {
    return client;
  }

  public Environment setDependencies(Collection<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<String> getDependencies() {
    return dependencies;
  }

  public Environment setEnvironmentVersion(String environmentVersion) {
    this.environmentVersion = environmentVersion;
    return this;
  }

  public String getEnvironmentVersion() {
    return environmentVersion;
  }

  public Environment setJavaDependencies(Collection<String> javaDependencies) {
    this.javaDependencies = javaDependencies;
    return this;
  }

  public Collection<String> getJavaDependencies() {
    return javaDependencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Environment that = (Environment) o;
    return Objects.equals(baseEnvironment, that.baseEnvironment)
        && Objects.equals(client, that.client)
        && Objects.equals(dependencies, that.dependencies)
        && Objects.equals(environmentVersion, that.environmentVersion)
        && Objects.equals(javaDependencies, that.javaDependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        baseEnvironment, client, dependencies, environmentVersion, javaDependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(Environment.class)
        .add("baseEnvironment", baseEnvironment)
        .add("client", client)
        .add("dependencies", dependencies)
        .add("environmentVersion", environmentVersion)
        .add("javaDependencies", javaDependencies)
        .toString();
  }
}
