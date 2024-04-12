// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The a environment entity used to preserve serverless environment side panel and jobs' environment
 * for non-notebook task. In this minimal environment spec, only pip dependencies are supported.
 * Next ID: 5
 */
@Generated
public class Environment {
  /**
   * * User-friendly name for the client version: “client”: “1” The version is a string, consisting
   * of the major client version
   */
  @JsonProperty("client")
  private String client;

  /**
   * List of pip dependencies, as supported by the version of pip in this environment. Each
   * dependency is a pip requirement file line
   * https://pip.pypa.io/en/stable/reference/requirements-file-format/ Allowed dependency could be
   * <requirement specifier>, <archive url/path>, <local project path>(WSFS or Volumes in
   * Databricks), <vcs project url> E.g. dependencies: ["foo==0.0.1", "-r
   * /Workspace/test/requirements.txt"]
   */
  @JsonProperty("dependencies")
  private Collection<String> dependencies;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Environment that = (Environment) o;
    return Objects.equals(client, that.client) && Objects.equals(dependencies, that.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, dependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(Environment.class)
        .add("client", client)
        .add("dependencies", dependencies)
        .toString();
  }
}
