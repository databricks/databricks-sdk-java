// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCredentialRequest {
  /** */
  @JsonProperty("aws_credentials")
  private CreateCredentialAwsCredentials awsCredentials;

  /** The human-readable name of the credential configuration object. */
  @JsonProperty("credentials_name")
  private String credentialsName;

  public CreateCredentialRequest setAwsCredentials(CreateCredentialAwsCredentials awsCredentials) {
    this.awsCredentials = awsCredentials;
    return this;
  }

  public CreateCredentialAwsCredentials getAwsCredentials() {
    return awsCredentials;
  }

  public CreateCredentialRequest setCredentialsName(String credentialsName) {
    this.credentialsName = credentialsName;
    return this;
  }

  public String getCredentialsName() {
    return credentialsName;
  }
}
