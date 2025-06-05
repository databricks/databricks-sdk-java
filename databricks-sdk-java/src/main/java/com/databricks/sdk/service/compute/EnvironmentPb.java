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
class EnvironmentPb {
  @JsonProperty("client")
  private String client;

  @JsonProperty("dependencies")
  private Collection<String> dependencies;

  @JsonProperty("environment_version")
  private String environmentVersion;

  @JsonProperty("jar_dependencies")
  private Collection<String> jarDependencies;

  public EnvironmentPb setClient(String client) {
    this.client = client;
    return this;
  }

  public String getClient() {
    return client;
  }

  public EnvironmentPb setDependencies(Collection<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<String> getDependencies() {
    return dependencies;
  }

  public EnvironmentPb setEnvironmentVersion(String environmentVersion) {
    this.environmentVersion = environmentVersion;
    return this;
  }

  public String getEnvironmentVersion() {
    return environmentVersion;
  }

  public EnvironmentPb setJarDependencies(Collection<String> jarDependencies) {
    this.jarDependencies = jarDependencies;
    return this;
  }

  public Collection<String> getJarDependencies() {
    return jarDependencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnvironmentPb that = (EnvironmentPb) o;
    return Objects.equals(client, that.client)
        && Objects.equals(dependencies, that.dependencies)
        && Objects.equals(environmentVersion, that.environmentVersion)
        && Objects.equals(jarDependencies, that.jarDependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, dependencies, environmentVersion, jarDependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(EnvironmentPb.class)
        .add("client", client)
        .add("dependencies", dependencies)
        .add("environmentVersion", environmentVersion)
        .add("jarDependencies", jarDependencies)
        .toString();
  }
}
