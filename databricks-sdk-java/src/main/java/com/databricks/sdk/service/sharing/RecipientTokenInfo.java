// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RecipientTokenInfo {
  /**
   * Full activation URL to retrieve the access token. It will be empty if the token is already
   * retrieved.
   */
  @JsonProperty("activation_url")
  private String activationUrl;

  /** Time at which this recipient token was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of recipient token creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** Expiration timestamp of the token in epoch milliseconds. */
  @JsonProperty("expiration_time")
  private Long expirationTime;

  /** Unique ID of the recipient token. */
  @JsonProperty("id")
  private String id;

  /** Time at which this recipient token was updated, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of recipient token updater. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public RecipientTokenInfo setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  public String getActivationUrl() {
    return activationUrl;
  }

  public RecipientTokenInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public RecipientTokenInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public RecipientTokenInfo setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public RecipientTokenInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public RecipientTokenInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public RecipientTokenInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RecipientTokenInfo that = (RecipientTokenInfo) o;
    return Objects.equals(activationUrl, that.activationUrl)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(expirationTime, that.expirationTime)
        && Objects.equals(id, that.id)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activationUrl, createdAt, createdBy, expirationTime, id, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(RecipientTokenInfo.class)
        .add("activationUrl", activationUrl)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("expirationTime", expirationTime)
        .add("id", id)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
