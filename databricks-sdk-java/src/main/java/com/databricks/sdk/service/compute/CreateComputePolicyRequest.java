// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateComputePolicyRequest {
  /** The compute policy to create. */
  @JsonProperty("compute_policy")
  private ComputePolicy computePolicy;

  public CreateComputePolicyRequest setComputePolicy(ComputePolicy computePolicy) {
    this.computePolicy = computePolicy;
    return this;
  }

  public ComputePolicy getComputePolicy() {
    return computePolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateComputePolicyRequest that = (CreateComputePolicyRequest) o;
    return Objects.equals(computePolicy, that.computePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computePolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateComputePolicyRequest.class)
        .add("computePolicy", computePolicy)
        .toString();
  }
}
