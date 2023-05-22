// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SecretInfo {
  /** UTC time when the secret was created */
  @JsonProperty("create_time")
  private String createTime;

  /** ID of the secret */
  @JsonProperty("id")
  private String id;

  /** Secret Hash */
  @JsonProperty("secret_hash")
  private String secretHash;

  /** Status of the secret */
  @JsonProperty("status")
  private String status;

  /** UTC time when the secret was updated */
  @JsonProperty("update_time")
  private String updateTime;

  public SecretInfo setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public SecretInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public SecretInfo setSecretHash(String secretHash) {
    this.secretHash = secretHash;
    return this;
  }

  public String getSecretHash() {
    return secretHash;
  }

  public SecretInfo setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public SecretInfo setUpdateTime(String updateTime) {
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
    SecretInfo that = (SecretInfo) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(id, that.id)
        && Objects.equals(secretHash, that.secretHash)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, id, secretHash, status, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(SecretInfo.class)
        .add("createTime", createTime)
        .add("id", id)
        .add("secretHash", secretHash)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }
}
