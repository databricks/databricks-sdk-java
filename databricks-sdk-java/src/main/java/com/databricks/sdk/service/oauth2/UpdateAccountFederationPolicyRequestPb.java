// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update account federation policy */
@Generated
class UpdateAccountFederationPolicyRequestPb {
  @JsonProperty("policy")
  private FederationPolicy policy;

  @JsonIgnore private String policyId;

  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateAccountFederationPolicyRequestPb setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public UpdateAccountFederationPolicyRequestPb setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public UpdateAccountFederationPolicyRequestPb setUpdateMask(String updateMask) {
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
    UpdateAccountFederationPolicyRequestPb that = (UpdateAccountFederationPolicyRequestPb) o;
    return Objects.equals(policy, that.policy)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, policyId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAccountFederationPolicyRequestPb.class)
        .add("policy", policy)
        .add("policyId", policyId)
        .add("updateMask", updateMask)
        .toString();
  }
}
