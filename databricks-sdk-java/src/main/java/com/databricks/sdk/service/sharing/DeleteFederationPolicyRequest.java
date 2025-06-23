// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteFederationPolicyRequest {
  /** Name of the policy. This is the name of the policy to be deleted. */
  @JsonIgnore private String name;

  /**
   * Name of the recipient. This is the name of the recipient for which the policy is being deleted.
   */
  @JsonIgnore private String recipientName;

  public DeleteFederationPolicyRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteFederationPolicyRequest setRecipientName(String recipientName) {
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
    DeleteFederationPolicyRequest that = (DeleteFederationPolicyRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(recipientName, that.recipientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, recipientName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteFederationPolicyRequest.class)
        .add("name", name)
        .add("recipientName", recipientName)
        .toString();
  }
}
