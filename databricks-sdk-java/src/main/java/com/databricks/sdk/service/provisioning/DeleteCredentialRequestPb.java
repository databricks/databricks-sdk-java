// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete credential configuration */
@Generated
class DeleteCredentialRequestPb {
  @JsonIgnore private String credentialsId;

  public DeleteCredentialRequestPb setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteCredentialRequestPb that = (DeleteCredentialRequestPb) o;
    return Objects.equals(credentialsId, that.credentialsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialsId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCredentialRequestPb.class)
        .add("credentialsId", credentialsId)
        .toString();
  }
}
