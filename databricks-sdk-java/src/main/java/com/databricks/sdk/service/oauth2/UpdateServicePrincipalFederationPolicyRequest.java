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
public class UpdateServicePrincipalFederationPolicyRequest {
  /** */
  @JsonProperty("policy")
  private FederationPolicy policy;

  /** The identifier for the federation policy. */
  @JsonIgnore private String policyId;

  /** The service principal id for the federation policy. */
  @JsonIgnore private Long servicePrincipalId;

  /**
   * The field mask specifies which fields of the policy to update. To specify multiple fields in
   * the field mask, use comma as the separator (no space). The special value '*' indicates that all
   * fields should be updated (full replacement). If unspecified, all fields that are set in the
   * policy provided in the update request will overwrite the corresponding fields in the existing
   * policy. Example value: 'description,oidc_policy.audiences'.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateServicePrincipalFederationPolicyRequest setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public UpdateServicePrincipalFederationPolicyRequest setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public UpdateServicePrincipalFederationPolicyRequest setServicePrincipalId(
      Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  public UpdateServicePrincipalFederationPolicyRequest setUpdateMask(String updateMask) {
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
    UpdateServicePrincipalFederationPolicyRequest that =
        (UpdateServicePrincipalFederationPolicyRequest) o;
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
    return new ToStringer(UpdateServicePrincipalFederationPolicyRequest.class)
        .add("policy", policy)
        .add("policyId", policyId)
        .add("servicePrincipalId", servicePrincipalId)
        .add("updateMask", updateMask)
        .toString();
  }
}
