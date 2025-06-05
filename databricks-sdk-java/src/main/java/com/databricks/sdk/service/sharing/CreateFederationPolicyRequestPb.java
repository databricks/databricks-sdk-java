// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create recipient federation policy */
@Generated
class CreateFederationPolicyRequestPb {
  @JsonProperty("policy")
  private FederationPolicy policy;

  @JsonIgnore private String recipientName;

  public CreateFederationPolicyRequestPb setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public CreateFederationPolicyRequestPb setRecipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  public String getRecipientName() {
    return recipientName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFederationPolicyRequestPb that = (CreateFederationPolicyRequestPb) o;
    return Objects.equals(policy, that.policy) && Objects.equals(recipientName, that.recipientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, recipientName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFederationPolicyRequestPb.class)
        .add("policy", policy)
        .add("recipientName", recipientName)
        .toString();
  }
}
