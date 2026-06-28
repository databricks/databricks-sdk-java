// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * AWS temporary credentials for API authentication. Read more at
 * https://docs.aws.amazon.com/STS/latest/APIReference/API_Credentials.html.
 */
@Generated
public class AwsCredentials {
  /** The access key ID that identifies the temporary credentials. */
  @JsonProperty("access_key_id")
  private String accessKeyId;

  /**
   * The Amazon Resource Name (ARN) of the S3 access point for temporary credentials related the
   * external location.
   */
  @JsonProperty("access_point")
  private String accessPoint;

  /** The secret access key that can be used to sign AWS API requests. */
  @JsonProperty("secret_access_key")
  private String secretAccessKey;

  /** The token that users must pass to AWS API to use the temporary credentials. */
  @JsonProperty("session_token")
  private String sessionToken;

  public AwsCredentials setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  public String getAccessKeyId() {
    return accessKeyId;
  }

  public AwsCredentials setAccessPoint(String accessPoint) {
    this.accessPoint = accessPoint;
    return this;
  }

  public String getAccessPoint() {
    return accessPoint;
  }

  public AwsCredentials setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public AwsCredentials setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

  public String getSessionToken() {
    return sessionToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsCredentials that = (AwsCredentials) o;
    return Objects.equals(accessKeyId, that.accessKeyId)
        && Objects.equals(accessPoint, that.accessPoint)
        && Objects.equals(secretAccessKey, that.secretAccessKey)
        && Objects.equals(sessionToken, that.sessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, accessPoint, secretAccessKey, sessionToken);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsCredentials.class)
        .add("accessKeyId", accessKeyId)
        .add("accessPoint", accessPoint)
        .add("secretAccessKey", secretAccessKey)
        .add("sessionToken", sessionToken)
        .toString();
  }
}
