// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Contains the BudgetPolicy details. */
@Generated
class BudgetPolicyPb {
  @JsonProperty("binding_workspace_ids")
  private Collection<Long> bindingWorkspaceIds;

  @JsonProperty("custom_tags")
  private Collection<com.databricks.sdk.service.compute.CustomPolicyTag> customTags;

  @JsonProperty("policy_id")
  private String policyId;

  @JsonProperty("policy_name")
  private String policyName;

  public BudgetPolicyPb setBindingWorkspaceIds(Collection<Long> bindingWorkspaceIds) {
    this.bindingWorkspaceIds = bindingWorkspaceIds;
    return this;
  }

  public Collection<Long> getBindingWorkspaceIds() {
    return bindingWorkspaceIds;
  }

  public BudgetPolicyPb setCustomTags(
      Collection<com.databricks.sdk.service.compute.CustomPolicyTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<com.databricks.sdk.service.compute.CustomPolicyTag> getCustomTags() {
    return customTags;
  }

  public BudgetPolicyPb setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public BudgetPolicyPb setPolicyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  public String getPolicyName() {
    return policyName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetPolicyPb that = (BudgetPolicyPb) o;
    return Objects.equals(bindingWorkspaceIds, that.bindingWorkspaceIds)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(policyName, that.policyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingWorkspaceIds, customTags, policyId, policyName);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetPolicyPb.class)
        .add("bindingWorkspaceIds", bindingWorkspaceIds)
        .add("customTags", customTags)
        .add("policyId", policyId)
        .add("policyName", policyName)
        .toString();
  }
}
