// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A request to create a BudgetPolicy. */
@Generated
public class CreateBudgetPolicyRequest {
  /**
   * The policy to create. `policy_id` needs to be empty as it will be generated `policy_name` must
   * be provided, custom_tags may need to be provided depending on the cloud provider. All other
   * fields are optional.
   */
  @JsonProperty("policy")
  private BudgetPolicy policy;

  /**
   * A unique identifier for this request. Restricted to 36 ASCII characters. A random UUID is
   * recommended. This request is only idempotent if a `request_id` is provided.
   */
  @JsonProperty("request_id")
  private String requestId;

  public CreateBudgetPolicyRequest setPolicy(BudgetPolicy policy) {
    this.policy = policy;
    return this;
  }

  public BudgetPolicy getPolicy() {
    return policy;
  }

  public CreateBudgetPolicyRequest setRequestId(String requestId) {
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
    CreateBudgetPolicyRequest that = (CreateBudgetPolicyRequest) o;
    return Objects.equals(policy, that.policy) && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetPolicyRequest.class)
        .add("policy", policy)
        .add("requestId", requestId)
        .toString();
  }
}
