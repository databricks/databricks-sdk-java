// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update a budget policy */
@Generated
class UpdateBudgetPolicyRequestPb {
  @JsonIgnore
  @QueryParam("limit_config")
  private LimitConfig limitConfig;

  @JsonProperty("policy")
  private BudgetPolicy policy;

  @JsonIgnore private String policyId;

  public UpdateBudgetPolicyRequestPb setLimitConfig(LimitConfig limitConfig) {
    this.limitConfig = limitConfig;
    return this;
  }

  public LimitConfig getLimitConfig() {
    return limitConfig;
  }

  public UpdateBudgetPolicyRequestPb setPolicy(BudgetPolicy policy) {
    this.policy = policy;
    return this;
  }

  public BudgetPolicy getPolicy() {
    return policy;
  }

  public UpdateBudgetPolicyRequestPb setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateBudgetPolicyRequestPb that = (UpdateBudgetPolicyRequestPb) o;
    return Objects.equals(limitConfig, that.limitConfig)
        && Objects.equals(policy, that.policy)
        && Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitConfig, policy, policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateBudgetPolicyRequestPb.class)
        .add("limitConfig", limitConfig)
        .add("policy", policy)
        .add("policyId", policyId)
        .toString();
  }
}
