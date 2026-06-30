// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * R2 temporary credentials for API authentication. Read more at
 * https://developers.cloudflare.com/r2/api/s3/tokens/.
 */
@Generated
public class R2Credentials {
  /** The access key ID that identifies the temporary credentials. */
  @JsonProperty("access_key_id")
  private String accessKeyId;

  /** The secret access key associated with the access key. */
  @JsonProperty("secret_access_key")
  private String secretAccessKey;

  /** The generated JWT that users must pass to use the temporary credentials. */
  @JsonProperty("session_token")
  private String sessionToken;

  public R2Credentials setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  public String getAccessKeyId() {
    return accessKeyId;
  }

  public R2Credentials setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public R2Credentials setSessionToken(String sessionToken) {
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
    R2Credentials that = (R2Credentials) o;
    return Objects.equals(accessKeyId, that.accessKeyId)
        && Objects.equals(secretAccessKey, that.secretAccessKey)
        && Objects.equals(sessionToken, that.sessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, secretAccessKey, sessionToken);
  }

  @Override
  public String toString() {
    return new ToStringer(R2Credentials.class)
        .add("accessKeyId", accessKeyId)
        .add("secretAccessKey", secretAccessKey)
        .add("sessionToken", sessionToken)
        .toString();
  }
}
