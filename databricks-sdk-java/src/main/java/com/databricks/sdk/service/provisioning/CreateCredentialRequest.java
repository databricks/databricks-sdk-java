// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateCredentialRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateCredentialRequest {
  /** */
  @JsonProperty("aws_credentials")
  private CreateCredentialAwsCredentials awsCredentials;

  /** The human-readable name of the credential configuration object. */
  @JsonProperty("credentials_name")
  private String credentialsName;

  /**
   * <p>Setter for the field <code>awsCredentials</code>.</p>
   *
   * @param awsCredentials a {@link com.databricks.sdk.service.provisioning.CreateCredentialAwsCredentials} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateCredentialRequest} object
   */
  public CreateCredentialRequest setAwsCredentials(CreateCredentialAwsCredentials awsCredentials) {
    this.awsCredentials = awsCredentials;
    return this;
  }

  /**
   * <p>Getter for the field <code>awsCredentials</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.CreateCredentialAwsCredentials} object
   */
  public CreateCredentialAwsCredentials getAwsCredentials() {
    return awsCredentials;
  }

  /**
   * <p>Setter for the field <code>credentialsName</code>.</p>
   *
   * @param credentialsName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateCredentialRequest} object
   */
  public CreateCredentialRequest setCredentialsName(String credentialsName) {
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
    CreateCredentialRequest that = (CreateCredentialRequest) o;
    return Objects.equals(awsCredentials, that.awsCredentials)
        && Objects.equals(credentialsName, that.credentialsName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(awsCredentials, credentialsName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateCredentialRequest.class)
        .add("awsCredentials", awsCredentials)
        .add("credentialsName", credentialsName)
        .toString();
  }
}
