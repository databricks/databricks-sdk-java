// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.service.compute.ComputeSpec;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class JobCompute {
  /**
   * A unique name for the compute requirement. This field is required and must be unique within the
   * job. `JobTaskSettings` may refer to this field to determine the compute requirements for the
   * task execution.
   */
  @JsonProperty("compute_key")
  private String computeKey;

  /** */
  @JsonProperty("spec")
  private ComputeSpec spec;

  public JobCompute setComputeKey(String computeKey) {
    this.computeKey = computeKey;
    return this;
  }

  public String getComputeKey() {
    return computeKey;
  }

  public JobCompute setSpec(ComputeSpec spec) {
    this.spec = spec;
    return this;
  }

  public ComputeSpec getSpec() {
    return spec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobCompute that = (JobCompute) o;
    return Objects.equals(computeKey, that.computeKey) && Objects.equals(spec, that.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeKey, spec);
  }

  @Override
  public String toString() {
    return new ToStringer(JobCompute.class)
        .add("computeKey", computeKey)
        .add("spec", spec)
        .toString();
  }
}
