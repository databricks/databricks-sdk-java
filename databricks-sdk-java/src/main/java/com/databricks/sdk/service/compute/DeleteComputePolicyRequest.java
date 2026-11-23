// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteComputePolicyRequest {
  /** The ID of the compute policy to delete. */
  @JsonIgnore private String computePolicyId;

  public DeleteComputePolicyRequest setComputePolicyId(String computePolicyId) {
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
    DeleteComputePolicyRequest that = (DeleteComputePolicyRequest) o;
    return Objects.equals(computePolicyId, that.computePolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computePolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteComputePolicyRequest.class)
        .add("computePolicyId", computePolicyId)
        .toString();
  }
}
