// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCredentialRequest that = (CreateCredentialRequest) o;
    return Objects.equals(awsCredentials, that.awsCredentials)
        && Objects.equals(credentialsName, that.credentialsName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsCredentials, credentialsName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialRequest.class)
        .add("awsCredentials", awsCredentials)
        .add("credentialsName", credentialsName)
        .toString();
  }
}
