// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class JobEnvironment {
  /** The key of an environment. It has to be unique within a job. */
  @JsonProperty("environment_key")
  private String environmentKey;

  /**
   * The a environment entity used to preserve serverless environment side panel and jobs'
   * environment for non-notebook task. In this minimal environment spec, only pip dependencies are
   * supported. Next ID: 5
   */
  @JsonProperty("spec")
  private com.databricks.sdk.service.compute.Environment spec;

  public JobEnvironment setEnvironmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
    return this;
  }

  public String getEnvironmentKey() {
    return environmentKey;
  }

  public JobEnvironment setSpec(com.databricks.sdk.service.compute.Environment spec) {
    this.spec = spec;
    return this;
  }

  public com.databricks.sdk.service.compute.Environment getSpec() {
    return spec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobEnvironment that = (JobEnvironment) o;
    return Objects.equals(environmentKey, that.environmentKey) && Objects.equals(spec, that.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentKey, spec);
  }

  @Override
  public String toString() {
    return new ToStringer(JobEnvironment.class)
        .add("environmentKey", environmentKey)
        .add("spec", spec)
        .toString();
  }
}
