// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CloudflareApiToken {
  /** The Cloudflare access key id of the token. */
  @JsonProperty("access_key_id")
  private String accessKeyId;

  /** The account id associated with the API token. */
  @JsonProperty("account_id")
  private String accountId;

  /** The secret access token generated for the access key id */
  @JsonProperty("secret_access_key")
  private String secretAccessKey;

  public CloudflareApiToken setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  public String getAccessKeyId() {
    return accessKeyId;
  }

  public CloudflareApiToken setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public CloudflareApiToken setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloudflareApiToken that = (CloudflareApiToken) o;
    return Objects.equals(accessKeyId, that.accessKeyId)
        && Objects.equals(accountId, that.accountId)
        && Objects.equals(secretAccessKey, that.secretAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, accountId, secretAccessKey);
  }

  @Override
  public String toString() {
    return new ToStringer(CloudflareApiToken.class)
        .add("accessKeyId", accessKeyId)
        .add("accountId", accountId)
        .add("secretAccessKey", secretAccessKey)
        .toString();
  }
}
