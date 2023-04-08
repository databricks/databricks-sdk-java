// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.gitcredentials;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCredentialsResponse {
  /** */
  @JsonProperty("credentials")
  private java.util.List<CredentialInfo> credentials;

  public GetCredentialsResponse setCredentials(java.util.List<CredentialInfo> credentials) {
    this.credentials = credentials;
    return this;
  }

  public java.util.List<CredentialInfo> getCredentials() {
    return credentials;
  }
}
