// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetComputePolicyRequest {
  /** The ID of the compute policy to retrieve. */
  @JsonIgnore private String computePolicyId;

  public GetComputePolicyRequest setComputePolicyId(String computePolicyId) {
    this.computePolicyId = computePolicyId;
    return this;
  }

  public String getComputePolicyId() {
    return computePolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetComputePolicyRequest that = (GetComputePolicyRequest) o;
    return Objects.equals(computePolicyId, that.computePolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computePolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetComputePolicyRequest.class)
        .add("computePolicyId", computePolicyId)
        .toString();
  }
}
