// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** GCP long-lived credential. Databricks-created Google Cloud Storage service account. */
@Generated
public class DatabricksGcpServiceAccount {
  /** The Databricks internal ID that represents this managed identity. */
  @JsonProperty("credential_id")
  private String credentialId;

  /** The email of the service account. */
  @JsonProperty("email")
  private String email;

  /** The ID that represents the private key for this Service Account */
  @JsonProperty("private_key_id")
  private String privateKeyId;

  public DatabricksGcpServiceAccount setCredentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public String getCredentialId() {
    return credentialId;
  }

  public DatabricksGcpServiceAccount setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public DatabricksGcpServiceAccount setPrivateKeyId(String privateKeyId) {
    this.privateKeyId = privateKeyId;
    return this;
  }

  public String getPrivateKeyId() {
    return privateKeyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabricksGcpServiceAccount that = (DatabricksGcpServiceAccount) o;
    return Objects.equals(credentialId, that.credentialId)
        && Objects.equals(email, that.email)
        && Objects.equals(privateKeyId, that.privateKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId, email, privateKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabricksGcpServiceAccount.class)
        .add("credentialId", credentialId)
        .add("email", email)
        .add("privateKeyId", privateKeyId)
        .toString();
  }
}
