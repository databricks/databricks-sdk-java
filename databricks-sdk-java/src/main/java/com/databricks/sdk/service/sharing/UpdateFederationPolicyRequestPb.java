// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update recipient federation policy */
@Generated
class UpdateFederationPolicyRequestPb {
  @JsonIgnore private String name;

  @JsonProperty("policy")
  private FederationPolicy policy;

  @JsonIgnore private String recipientName;

  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateFederationPolicyRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateFederationPolicyRequestPb setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public UpdateFederationPolicyRequestPb setRecipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  public String getRecipientName() {
    return recipientName;
  }

  public UpdateFederationPolicyRequestPb setUpdateMask(String updateMask) {
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
    UpdateFederationPolicyRequestPb that = (UpdateFederationPolicyRequestPb) o;
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
    return new ToStringer(UpdateFederationPolicyRequestPb.class)
        .add("name", name)
        .add("policy", policy)
        .add("recipientName", recipientName)
        .add("updateMask", updateMask)
        .toString();
  }
}
