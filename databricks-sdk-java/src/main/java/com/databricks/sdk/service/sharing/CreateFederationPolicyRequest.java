// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateFederationPolicyRequest {
  /** */
  @JsonProperty("policy")
  private FederationPolicy policy;

  /**
   * Name of the recipient. This is the name of the recipient for which the policy is being created.
   */
  @JsonIgnore private String recipientName;

  public CreateFederationPolicyRequest setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public CreateFederationPolicyRequest setRecipientName(String recipientName) {
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
    CreateFederationPolicyRequest that = (CreateFederationPolicyRequest) o;
    return Objects.equals(policy, that.policy) && Objects.equals(recipientName, that.recipientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, recipientName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFederationPolicyRequest.class)
        .add("policy", policy)
        .add("recipientName", recipientName)
        .toString();
  }
}
