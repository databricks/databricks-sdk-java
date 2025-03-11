// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateServicePrincipalSecretResponse {
  /** UTC time when the secret was created */
  @JsonProperty("create_time")
  private String createTime;

  /**
   * UTC time when the secret will expire. If the field is not present, the secret does not expire.
   */
  @JsonProperty("expire_time")
  private String expireTime;

  /** ID of the secret */
  @JsonProperty("id")
  private String id;

  /** Secret Value */
  @JsonProperty("secret")
  private String secret;

  /** Secret Hash */
  @JsonProperty("secret_hash")
  private String secretHash;

  /** Status of the secret */
  @JsonProperty("status")
  private String status;

  /** UTC time when the secret was updated */
  @JsonProperty("update_time")
  private String updateTime;

  public CreateServicePrincipalSecretResponse setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public CreateServicePrincipalSecretResponse setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public String getExpireTime() {
    return expireTime;
  }

  public CreateServicePrincipalSecretResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CreateServicePrincipalSecretResponse setSecret(String secret) {
    this.secret = secret;
    return this;
  }

  public String getSecret() {
    return secret;
  }

  public CreateServicePrincipalSecretResponse setSecretHash(String secretHash) {
    this.secretHash = secretHash;
    return this;
  }

  public String getSecretHash() {
    return secretHash;
  }

  public CreateServicePrincipalSecretResponse setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public CreateServicePrincipalSecretResponse setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateServicePrincipalSecretResponse that = (CreateServicePrincipalSecretResponse) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(expireTime, that.expireTime)
        && Objects.equals(id, that.id)
        && Objects.equals(secret, that.secret)
        && Objects.equals(secretHash, that.secretHash)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, expireTime, id, secret, secretHash, status, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServicePrincipalSecretResponse.class)
        .add("createTime", createTime)
        .add("expireTime", expireTime)
        .add("id", id)
        .add("secret", secret)
        .add("secretHash", secretHash)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }
}
