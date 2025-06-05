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
class AwsCredentialsPb {
  @JsonProperty("access_key_id")
  private String accessKeyId;

  @JsonProperty("access_point")
  private String accessPoint;

  @JsonProperty("secret_access_key")
  private String secretAccessKey;

  @JsonProperty("session_token")
  private String sessionToken;

  public AwsCredentialsPb setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  public String getAccessKeyId() {
    return accessKeyId;
  }

  public AwsCredentialsPb setAccessPoint(String accessPoint) {
    this.accessPoint = accessPoint;
    return this;
  }

  public String getAccessPoint() {
    return accessPoint;
  }

  public AwsCredentialsPb setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public AwsCredentialsPb setSessionToken(String sessionToken) {
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
    AwsCredentialsPb that = (AwsCredentialsPb) o;
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
    return new ToStringer(AwsCredentialsPb.class)
        .add("accessKeyId", accessKeyId)
        .add("accessPoint", accessPoint)
        .add("secretAccessKey", secretAccessKey)
        .add("sessionToken", sessionToken)
        .toString();
  }
}
