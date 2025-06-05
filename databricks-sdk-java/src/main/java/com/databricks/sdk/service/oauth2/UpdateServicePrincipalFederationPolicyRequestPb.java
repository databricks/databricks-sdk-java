// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update service principal federation policy */
@Generated
class UpdateServicePrincipalFederationPolicyRequestPb {
  @JsonProperty("policy")
  private FederationPolicy policy;

  @JsonIgnore private String policyId;

  @JsonIgnore private Long servicePrincipalId;

  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateServicePrincipalFederationPolicyRequestPb setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public UpdateServicePrincipalFederationPolicyRequestPb setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public UpdateServicePrincipalFederationPolicyRequestPb setServicePrincipalId(
      Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  public UpdateServicePrincipalFederationPolicyRequestPb setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateServicePrincipalFederationPolicyRequestPb that =
        (UpdateServicePrincipalFederationPolicyRequestPb) o;
    return Objects.equals(policy, that.policy)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, policyId, servicePrincipalId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateServicePrincipalFederationPolicyRequestPb.class)
        .add("policy", policy)
        .add("policyId", policyId)
        .add("servicePrincipalId", servicePrincipalId)
        .add("updateMask", updateMask)
        .toString();
  }
}
