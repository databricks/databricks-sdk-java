// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateComputePolicyRequest {
  /**
   * The compute policy to update. `compute_policy.compute_policy_id` identifies which policy to
   * update; only the fields named in `update_mask` are applied.
   */
  @JsonProperty("compute_policy")
  private ComputePolicy computePolicy;

  /** The unique identifier of the compute policy (UUID). Server-assigned on create. */
  @JsonIgnore private String computePolicyId;

  /**
   * Fields to update, relative to `compute_policy`. Must contain at least one path; the supported
   * paths are `display_name` and `allowed_compute_products`. Supplied product arms replace their
   * constraints and omitted products remain unchanged. An empty arm clears that product's limits;
   * an absent or empty products object is invalid. Removing a product requires its delete API.
   * Nested masks and wildcards are unsupported. `display_name` cannot be cleared: if it is in the
   * mask it must be non-empty.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateComputePolicyRequest setComputePolicy(ComputePolicy computePolicy) {
    this.computePolicy = computePolicy;
    return this;
  }

  public ComputePolicy getComputePolicy() {
    return computePolicy;
  }

  public UpdateComputePolicyRequest setComputePolicyId(String computePolicyId) {
    this.computePolicyId = computePolicyId;
    return this;
  }

  public String getComputePolicyId() {
    return computePolicyId;
  }

  public UpdateComputePolicyRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateComputePolicyRequest that = (UpdateComputePolicyRequest) o;
    return Objects.equals(computePolicy, that.computePolicy)
        && Objects.equals(computePolicyId, that.computePolicyId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computePolicy, computePolicyId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateComputePolicyRequest.class)
        .add("computePolicy", computePolicy)
        .add("computePolicyId", computePolicyId)
        .add("updateMask", updateMask)
        .toString();
  }
}
