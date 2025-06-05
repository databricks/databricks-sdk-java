// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create account federation policy */
@Generated
class CreateAccountFederationPolicyRequestPb {
  @JsonProperty("policy")
  private FederationPolicy policy;

  @JsonIgnore
  @QueryParam("policy_id")
  private String policyId;

  public CreateAccountFederationPolicyRequestPb setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public CreateAccountFederationPolicyRequestPb setPolicyId(String policyId) {
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
    CreateAccountFederationPolicyRequestPb that = (CreateAccountFederationPolicyRequestPb) o;
    return Objects.equals(policy, that.policy) && Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAccountFederationPolicyRequestPb.class)
        .add("policy", policy)
        .add("policyId", policyId)
        .toString();
  }
}
