// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateFederationPolicyRequest {
  /** Name of the policy. This is the name of the current name of the policy. */
  @JsonIgnore private String name;

  /** */
  @JsonProperty("policy")
  private FederationPolicy policy;

  /**
   * Name of the recipient. This is the name of the recipient for which the policy is being updated.
   */
  @JsonIgnore private String recipientName;

  /**
   * The field mask specifies which fields of the policy to update. To specify multiple fields in
   * the field mask, use comma as the separator (no space). The special value '*' indicates that all
   * fields should be updated (full replacement). If unspecified, all fields that are set in the
   * policy provided in the update request will overwrite the corresponding fields in the existing
   * policy. Example value: 'comment,oidc_policy.audiences'.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateFederationPolicyRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateFederationPolicyRequest setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public UpdateFederationPolicyRequest setRecipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  public String getRecipientName() {
    return recipientName;
  }

  public UpdateFederationPolicyRequest setUpdateMask(String updateMask) {
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
    UpdateFederationPolicyRequest that = (UpdateFederationPolicyRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(policy, that.policy)
        && Objects.equals(recipientName, that.recipientName)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, policy, recipientName, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateFederationPolicyRequest.class)
        .add("name", name)
        .add("policy", policy)
        .add("recipientName", recipientName)
        .add("updateMask", updateMask)
        .toString();
  }
}
