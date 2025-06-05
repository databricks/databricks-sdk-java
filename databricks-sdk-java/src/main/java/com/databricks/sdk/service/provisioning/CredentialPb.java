// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CredentialPb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("aws_credentials")
  private AwsCredentials awsCredentials;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("credentials_id")
  private String credentialsId;

  @JsonProperty("credentials_name")
  private String credentialsName;

  public CredentialPb setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public CredentialPb setAwsCredentials(AwsCredentials awsCredentials) {
    this.awsCredentials = awsCredentials;
    return this;
  }

  public AwsCredentials getAwsCredentials() {
    return awsCredentials;
  }

  public CredentialPb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public CredentialPb setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public CredentialPb setCredentialsName(String credentialsName) {
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
    CredentialPb that = (CredentialPb) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(awsCredentials, that.awsCredentials)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(credentialsName, that.credentialsName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, awsCredentials, creationTime, credentialsId, credentialsName);
  }

  @Override
  public String toString() {
    return new ToStringer(CredentialPb.class)
        .add("accountId", accountId)
        .add("awsCredentials", awsCredentials)
        .add("creationTime", creationTime)
        .add("credentialsId", credentialsId)
        .add("credentialsName", credentialsName)
        .toString();
  }
}
