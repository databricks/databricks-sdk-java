// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Map;
import java.util.Objects;

/**
 * A compute policy resource. A workspace-scoped policy that allows one or more compute products,
 * each with product-specific constraints.
 */
@Generated
public class ComputePolicy {
  /**
   * The compute products allowed by this policy and their constraints. At least one product must be
   * set.
   */
  @JsonProperty("allowed_compute_products")
  private AllowedComputeProducts allowedComputeProducts;

  /**
   * Whether the calling user has manage permission on this compute policy. Manage includes use, so
   * can_use is also true whenever this is true.
   */
  @JsonProperty("can_manage")
  private Boolean canManage;

  /** Whether the calling user has use permission on this compute policy. */
  @JsonProperty("can_use")
  private Boolean canUse;

  /** The unique identifier of the compute policy (UUID). Server-assigned on create. */
  @JsonProperty("compute_policy_id")
  private String computePolicyId;

  /** The creation timestamp. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The display name of the compute policy. */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * Whether this is the workspace default policy for its single allowed compute product. Default
   * policies are system-provisioned and cannot be deleted or renamed.
   */
  @JsonProperty("is_default")
  private Boolean isDefault;

  /**
   * User-defined key/value tags on the compute policy, provided at creation and validated.
   * unified-tagging is the system of record for tag assignments.
   */
  @JsonProperty("tags")
  private Map<String, String> tags;

  public ComputePolicy setAllowedComputeProducts(AllowedComputeProducts allowedComputeProducts) {
    this.allowedComputeProducts = allowedComputeProducts;
    return this;
  }

  public AllowedComputeProducts getAllowedComputeProducts() {
    return allowedComputeProducts;
  }

  public ComputePolicy setCanManage(Boolean canManage) {
    this.canManage = canManage;
    return this;
  }

  public Boolean getCanManage() {
    return canManage;
  }

  public ComputePolicy setCanUse(Boolean canUse) {
    this.canUse = canUse;
    return this;
  }

  public Boolean getCanUse() {
    return canUse;
  }

  public ComputePolicy setComputePolicyId(String computePolicyId) {
    this.computePolicyId = computePolicyId;
    return this;
  }

  public String getComputePolicyId() {
    return computePolicyId;
  }

  public ComputePolicy setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public ComputePolicy setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ComputePolicy setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  public Boolean getIsDefault() {
    return isDefault;
  }

  public ComputePolicy setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Map<String, String> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComputePolicy that = (ComputePolicy) o;
    return Objects.equals(allowedComputeProducts, that.allowedComputeProducts)
        && Objects.equals(canManage, that.canManage)
        && Objects.equals(canUse, that.canUse)
        && Objects.equals(computePolicyId, that.computePolicyId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(isDefault, that.isDefault)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedComputeProducts,
        canManage,
        canUse,
        computePolicyId,
        createTime,
        displayName,
        isDefault,
        tags);
  }

  @Override
  public String toString() {
    return new ToStringer(ComputePolicy.class)
        .add("allowedComputeProducts", allowedComputeProducts)
        .add("canManage", canManage)
        .add("canUse", canUse)
        .add("computePolicyId", computePolicyId)
        .add("createTime", createTime)
        .add("displayName", displayName)
        .add("isDefault", isDefault)
        .add("tags", tags)
        .toString();
  }
}
