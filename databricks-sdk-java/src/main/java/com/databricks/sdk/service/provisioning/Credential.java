// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Credential class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>accountId</code>.</p>
   *
   * @param accountId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Credential} object
   */
  public Credential setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>Getter for the field <code>accountId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * <p>Setter for the field <code>awsCredentials</code>.</p>
   *
   * @param awsCredentials a {@link com.databricks.sdk.service.provisioning.AwsCredentials} object
   * @return a {@link com.databricks.sdk.service.provisioning.Credential} object
   */
  public Credential setAwsCredentials(AwsCredentials awsCredentials) {
    this.awsCredentials = awsCredentials;
    return this;
  }

  /**
   * <p>Getter for the field <code>awsCredentials</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.AwsCredentials} object
   */
  public AwsCredentials getAwsCredentials() {
    return awsCredentials;
  }

  /**
   * <p>Setter for the field <code>creationTime</code>.</p>
   *
   * @param creationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.provisioning.Credential} object
   */
  public Credential setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * <p>Setter for the field <code>credentialsId</code>.</p>
   *
   * @param credentialsId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Credential} object
   */
  public Credential setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentialsId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCredentialsId() {
    return credentialsId;
  }

  /**
   * <p>Setter for the field <code>credentialsName</code>.</p>
   *
   * @param credentialsName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Credential} object
   */
  public Credential setCredentialsName(String credentialsName) {
    this.credentialsName = credentialsName;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentialsName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCredentialsName() {
    return credentialsName;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, awsCredentials, creationTime, credentialsId, credentialsName);
  }

  /** {@inheritDoc} */
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
