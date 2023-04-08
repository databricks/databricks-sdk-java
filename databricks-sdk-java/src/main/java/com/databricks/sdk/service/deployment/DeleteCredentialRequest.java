// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

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
}
