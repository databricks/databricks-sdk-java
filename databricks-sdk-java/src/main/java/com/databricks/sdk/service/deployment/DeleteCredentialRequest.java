// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Delete credential configuration */
public class DeleteCredentialRequest {
  /** Databricks Account API credential configuration ID */
  private String credentialsId;

  public DeleteCredentialRequest setCredentialsId(String credentialsId) {
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
    DeleteCredentialRequest that = (DeleteCredentialRequest) o;
    return Objects.equals(credentialsId, that.credentialsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialsId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCredentialRequest.class)
        .add("credentialsId", credentialsId)
        .toString();
  }
}
