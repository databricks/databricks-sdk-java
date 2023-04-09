// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Credential {
  /** The Databricks account ID that hosts the credential. */
  @JsonProperty("account_id")
  private String accountId;

  /** */
  @JsonProperty("aws_credentials")
  private AwsCredentials awsCredentials;

  /** Time in epoch milliseconds when the credential was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** Databricks credential configuration ID. */
  @JsonProperty("credentials_id")
  private String credentialsId;

  /** The human-readable name of the credential configuration object. */
  @JsonProperty("credentials_name")
  private String credentialsName;

  public Credential setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public Credential setAwsCredentials(AwsCredentials awsCredentials) {
    this.awsCredentials = awsCredentials;
    return this;
  }

  public AwsCredentials getAwsCredentials() {
    return awsCredentials;
  }

  public Credential setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public Credential setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public Credential setCredentialsName(String credentialsName) {
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
    Credential that = (Credential) o;
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
    return new ToStringer(Credential.class)
        .add("accountId", accountId)
        .add("awsCredentials", awsCredentials)
        .add("creationTime", creationTime)
        .add("credentialsId", credentialsId)
        .add("credentialsName", credentialsName)
        .toString();
  }
}
