// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SandboxSpec {
  /** Compute configuration (size, inactivity timeout) requested for the sandbox. */
  @JsonProperty("compute")
  private ComputeSpec compute;

  /** The execution environment to use for the sandbox. */
  @JsonProperty("environment")
  private EnvironmentSpec environment;

  public SandboxSpec setCompute(ComputeSpec compute) {
    this.compute = compute;
    return this;
  }

  public ComputeSpec getCompute() {
    return compute;
  }

  public SandboxSpec setEnvironment(EnvironmentSpec environment) {
    this.environment = environment;
    return this;
  }

  public EnvironmentSpec getEnvironment() {
    return environment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SandboxSpec that = (SandboxSpec) o;
    return Objects.equals(compute, that.compute) && Objects.equals(environment, that.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, environment);
  }

  @Override
  public String toString() {
    return new ToStringer(SandboxSpec.class)
        .add("compute", compute)
        .add("environment", environment)
        .toString();
  }
}
