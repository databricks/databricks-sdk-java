// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EnvironmentSettings {
  /** */
  @JsonProperty("environment_version")
  private String environmentVersion;

  /** */
  @JsonProperty("java_dependencies")
  private Collection<String> javaDependencies;

  public EnvironmentSettings setEnvironmentVersion(String environmentVersion) {
    this.environmentVersion = environmentVersion;
    return this;
  }

  public String getEnvironmentVersion() {
    return environmentVersion;
  }

  public EnvironmentSettings setJavaDependencies(Collection<String> javaDependencies) {
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
    EnvironmentSettings that = (EnvironmentSettings) o;
    return Objects.equals(environmentVersion, that.environmentVersion)
        && Objects.equals(javaDependencies, that.javaDependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentVersion, javaDependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(EnvironmentSettings.class)
        .add("environmentVersion", environmentVersion)
        .add("javaDependencies", javaDependencies)
        .toString();
  }
}
