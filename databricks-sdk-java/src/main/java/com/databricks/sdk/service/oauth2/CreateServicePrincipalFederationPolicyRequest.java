// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateServicePrincipalFederationPolicyRequest {
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

  /** The service principal id for the federation policy. */
  @JsonIgnore private Long servicePrincipalId;

  public CreateServicePrincipalFederationPolicyRequest setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public CreateServicePrincipalFederationPolicyRequest setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public CreateServicePrincipalFederationPolicyRequest setServicePrincipalId(
      Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateServicePrincipalFederationPolicyRequest that =
        (CreateServicePrincipalFederationPolicyRequest) o;
    return Objects.equals(policy, that.policy)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, policyId, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServicePrincipalFederationPolicyRequest.class)
        .add("policy", policy)
        .add("policyId", policyId)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }
}
