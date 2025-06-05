// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class JobEnvironmentPb {
  @JsonProperty("environment_key")
  private String environmentKey;

  @JsonProperty("spec")
  private com.databricks.sdk.service.compute.Environment spec;

  public JobEnvironmentPb setEnvironmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
    return this;
  }

  public String getEnvironmentKey() {
    return environmentKey;
  }

  public JobEnvironmentPb setSpec(com.databricks.sdk.service.compute.Environment spec) {
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
    JobEnvironmentPb that = (JobEnvironmentPb) o;
    return Objects.equals(environmentKey, that.environmentKey) && Objects.equals(spec, that.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentKey, spec);
  }

  @Override
  public String toString() {
    return new ToStringer(JobEnvironmentPb.class)
        .add("environmentKey", environmentKey)
        .add("spec", spec)
        .toString();
  }
}
