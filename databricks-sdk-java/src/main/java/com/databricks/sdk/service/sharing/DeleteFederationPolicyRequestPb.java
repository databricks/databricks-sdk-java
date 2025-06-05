// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete recipient federation policy */
@Generated
class DeleteFederationPolicyRequestPb {
  @JsonIgnore private String name;

  @JsonIgnore private String recipientName;

  public DeleteFederationPolicyRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteFederationPolicyRequestPb setRecipientName(String recipientName) {
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
    DeleteFederationPolicyRequestPb that = (DeleteFederationPolicyRequestPb) o;
    return Objects.equals(name, that.name) && Objects.equals(recipientName, that.recipientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, recipientName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteFederationPolicyRequestPb.class)
        .add("name", name)
        .add("recipientName", recipientName)
        .toString();
  }
}
