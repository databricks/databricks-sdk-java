// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PatchEndpointBudgetPolicyResponse {
  /** */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** The budget policy applied to the AI Search endpoint. */
  @JsonProperty("effective_budget_policy_id")
  private String effectiveBudgetPolicyId;

  public PatchEndpointBudgetPolicyResponse setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public PatchEndpointBudgetPolicyResponse setEffectiveBudgetPolicyId(
      String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PatchEndpointBudgetPolicyResponse that = (PatchEndpointBudgetPolicyResponse) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetPolicyId, effectiveBudgetPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchEndpointBudgetPolicyResponse.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .toString();
  }
}
