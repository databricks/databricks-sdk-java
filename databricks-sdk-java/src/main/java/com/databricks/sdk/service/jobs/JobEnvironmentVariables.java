// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A named environment-variable entry, defined once at the job level and referenced by key from one
 * or more tasks. Entries live on `JobSettings.environment_variables`, and tasks select one via
 * `TaskSettings.environment_variables_key`.
 */
@Generated
public class JobEnvironmentVariables {
  /**
   * Identifier for this entry. Must be unique within `JobSettings.environment_variables`. Tasks
   * reference it from `TaskSettings.environment_variables_key`.
   */
  @JsonProperty("environment_variables_key")
  private String environmentVariablesKey;

  /** The environment variable specification. */
  @JsonProperty("spec")
  private JobEnvironmentVariablesSpec spec;

  public JobEnvironmentVariables setEnvironmentVariablesKey(String environmentVariablesKey) {
    this.environmentVariablesKey = environmentVariablesKey;
    return this;
  }

  public String getEnvironmentVariablesKey() {
    return environmentVariablesKey;
  }

  public JobEnvironmentVariables setSpec(JobEnvironmentVariablesSpec spec) {
    this.spec = spec;
    return this;
  }

  public JobEnvironmentVariablesSpec getSpec() {
    return spec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobEnvironmentVariables that = (JobEnvironmentVariables) o;
    return Objects.equals(environmentVariablesKey, that.environmentVariablesKey)
        && Objects.equals(spec, that.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentVariablesKey, spec);
  }

  @Override
  public String toString() {
    return new ToStringer(JobEnvironmentVariables.class)
        .add("environmentVariablesKey", environmentVariablesKey)
        .add("spec", spec)
        .toString();
  }
}
