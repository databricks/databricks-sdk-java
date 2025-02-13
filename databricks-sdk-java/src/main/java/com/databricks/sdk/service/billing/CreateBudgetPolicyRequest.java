// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A request to create a BudgetPolicy. */
@Generated
public class CreateBudgetPolicyRequest {
  /** A list of tags defined by the customer. At most 40 entries are allowed per policy. */
  @JsonProperty("custom_tags")
  private Collection<com.databricks.sdk.service.compute.CustomPolicyTag> customTags;

  /**
   * The name of the policy. - Must be unique among active policies. - Can contain only characters
   * of 0-9, a-z, A-Z, -, =, ., :, /, @, _, +, whitespace.
   */
  @JsonProperty("policy_name")
  private String policyName;

  /**
   * A unique identifier for this request. Restricted to 36 ASCII characters. A random UUID is
   * recommended. This request is only idempotent if a `request_id` is provided.
   */
  @JsonProperty("request_id")
  private String requestId;

  public CreateBudgetPolicyRequest setCustomTags(
      Collection<com.databricks.sdk.service.compute.CustomPolicyTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<com.databricks.sdk.service.compute.CustomPolicyTag> getCustomTags() {
    return customTags;
  }

  public CreateBudgetPolicyRequest setPolicyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  public String getPolicyName() {
    return policyName;
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
    return Objects.equals(customTags, that.customTags)
        && Objects.equals(policyName, that.policyName)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTags, policyName, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetPolicyRequest.class)
        .add("customTags", customTags)
        .add("policyName", policyName)
        .add("requestId", requestId)
        .toString();
  }
}
