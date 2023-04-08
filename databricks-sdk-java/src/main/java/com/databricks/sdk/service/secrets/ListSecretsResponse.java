// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListSecretsResponse {
  /** Metadata information of all secrets contained within the given scope. */
  @JsonProperty("secrets")
  private java.util.List<SecretMetadata> secrets;

  public ListSecretsResponse setSecrets(java.util.List<SecretMetadata> secrets) {
    this.secrets = secrets;
    return this;
  }

  public java.util.List<SecretMetadata> getSecrets() {
    return secrets;
  }
}
