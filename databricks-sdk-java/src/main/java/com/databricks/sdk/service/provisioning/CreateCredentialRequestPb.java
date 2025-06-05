// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateCredentialRequestPb {
  @JsonProperty("aws_credentials")
  private CreateCredentialAwsCredentials awsCredentials;

  @JsonProperty("credentials_name")
  private String credentialsName;

  public CreateCredentialRequestPb setAwsCredentials(
      CreateCredentialAwsCredentials awsCredentials) {
    this.awsCredentials = awsCredentials;
    return this;
  }

  public CreateCredentialAwsCredentials getAwsCredentials() {
    return awsCredentials;
  }

  public CreateCredentialRequestPb setCredentialsName(String credentialsName) {
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
    CreateCredentialRequestPb that = (CreateCredentialRequestPb) o;
    return Objects.equals(awsCredentials, that.awsCredentials)
        && Objects.equals(credentialsName, that.credentialsName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsCredentials, credentialsName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialRequestPb.class)
        .add("awsCredentials", awsCredentials)
        .add("credentialsName", credentialsName)
        .toString();
  }
}
