// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PatchEndpointBudgetPolicyRequestPb {
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  @JsonIgnore private String endpointName;

  public PatchEndpointBudgetPolicyRequestPb setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public PatchEndpointBudgetPolicyRequestPb setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PatchEndpointBudgetPolicyRequestPb that = (PatchEndpointBudgetPolicyRequestPb) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(endpointName, that.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetPolicyId, endpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchEndpointBudgetPolicyRequestPb.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("endpointName", endpointName)
        .toString();
  }
}
