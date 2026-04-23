// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The environment entity used to preserve serverless environment side panel, jobs' environment for
 * non-notebook task, and SDP's environment for classic and serverless pipelines. In this minimal
 * environment spec, only pip and java dependencies are supported.
 */
@Generated
public class Environment {
  /**
   * The base environment this environment is built on top of. A base environment defines the
   * environment version and a list of dependencies for serverless compute. The value can be a file
   * path to a custom `env.yaml` file (e.g., `/Workspace/path/to/env.yaml`). Support for a
   * Databricks-provided base environment ID (e.g., `workspace-base-environments/databricks_ai_v4`)
   * and workspace base environment ID (e.g.,
   * `workspace-base-environments/dbe_b849b66e-b31a-4cb5-b161-1f2b10877fb7`) is in Beta. Either
   * `environment_version` or `base_environment` can be provided. For more information, see
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
   * Either `environment_version` or `base_environment` needs to be provided. Environment version
   * used by the environment. Each version comes with a specific Python version and a set of Python
   * packages. The version is a string, consisting of an integer.
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
