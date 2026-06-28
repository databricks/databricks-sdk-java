// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateAccountFederationPolicyRequest {
  /** */
  @JsonProperty("policy")
  private FederationPolicy policy;

  /**
   * The identifier for the federation policy. The identifier must contain only lowercase
   * alphanumeric characters, numbers, hyphens, and slashes. If unspecified, the id will be assigned
   * by Databricks.
   */
  @JsonIgnore
  @QueryParam("policy_id")
  private String policyId;

  public CreateAccountFederationPolicyRequest setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public CreateAccountFederationPolicyRequest setPolicyId(String policyId) {
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
    CreateAccountFederationPolicyRequest that = (CreateAccountFederationPolicyRequest) o;
    return Objects.equals(policy, that.policy) && Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAccountFederationPolicyRequest.class)
        .add("policy", policy)
        .add("policyId", policyId)
        .toString();
  }
}
