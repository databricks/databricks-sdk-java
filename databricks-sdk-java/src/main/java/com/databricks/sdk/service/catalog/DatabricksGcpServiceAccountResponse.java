// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** GCP long-lived credential. Databricks-created Google Cloud Storage service account. */
@Generated
public class DatabricksGcpServiceAccountResponse {
  /** The Databricks internal ID that represents this managed identity. */
  @JsonProperty("credential_id")
  private String credentialId;

  /** The email of the service account. */
  @JsonProperty("email")
  private String email;

  public DatabricksGcpServiceAccountResponse setCredentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public String getCredentialId() {
    return credentialId;
  }

  public DatabricksGcpServiceAccountResponse setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabricksGcpServiceAccountResponse that = (DatabricksGcpServiceAccountResponse) o;
    return Objects.equals(credentialId, that.credentialId) && Objects.equals(email, that.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId, email);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabricksGcpServiceAccountResponse.class)
        .add("credentialId", credentialId)
        .add("email", email)
        .toString();
  }
}
