// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
