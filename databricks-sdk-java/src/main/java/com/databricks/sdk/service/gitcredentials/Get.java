// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.gitcredentials;

/** Get a credential entry */
public class Get {
  /** The ID for the corresponding credential to access. */
  private Long credentialId;

  public Get setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }
}
