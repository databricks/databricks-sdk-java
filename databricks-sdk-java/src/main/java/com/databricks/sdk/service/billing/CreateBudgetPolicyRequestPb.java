// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A request to create a BudgetPolicy. */
@Generated
class CreateBudgetPolicyRequestPb {
  @JsonProperty("policy")
  private BudgetPolicy policy;

  @JsonProperty("request_id")
  private String requestId;

  public CreateBudgetPolicyRequestPb setPolicy(BudgetPolicy policy) {
    this.policy = policy;
    return this;
  }

  public BudgetPolicy getPolicy() {
    return policy;
  }

  public CreateBudgetPolicyRequestPb setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateBudgetPolicyRequestPb that = (CreateBudgetPolicyRequestPb) o;
    return Objects.equals(policy, that.policy) && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetPolicyRequestPb.class)
        .add("policy", policy)
        .add("requestId", requestId)
        .toString();
  }
}
