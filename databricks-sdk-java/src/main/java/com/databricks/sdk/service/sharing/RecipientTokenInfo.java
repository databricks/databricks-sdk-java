// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RecipientTokenInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RecipientTokenInfo {
  /**
   * Full activation URL to retrieve the access token. It will be empty if the token is already
   * retrieved.
   */
  @JsonProperty("activation_url")
  private String activationUrl;

  /** Time at which this recipient Token was created, in epoch milliseconds. */
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

  /** Time at which this recipient Token was updated, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of recipient Token updater. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /**
   * <p>Setter for the field <code>activationUrl</code>.</p>
   *
   * @param activationUrl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientTokenInfo} object
   */
  public RecipientTokenInfo setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  /**
   * <p>Getter for the field <code>activationUrl</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getActivationUrl() {
    return activationUrl;
  }

  /**
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientTokenInfo} object
   */
  public RecipientTokenInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * <p>Setter for the field <code>createdBy</code>.</p>
   *
   * @param createdBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientTokenInfo} object
   */
  public RecipientTokenInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * <p>Setter for the field <code>expirationTime</code>.</p>
   *
   * @param expirationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientTokenInfo} object
   */
  public RecipientTokenInfo setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>expirationTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getExpirationTime() {
    return expirationTime;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientTokenInfo} object
   */
  public RecipientTokenInfo setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientTokenInfo} object
   */
  public RecipientTokenInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUpdatedAt() {
    return updatedAt;
  }

  /**
   * <p>Setter for the field <code>updatedBy</code>.</p>
   *
   * @param updatedBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientTokenInfo} object
   */
  public RecipientTokenInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        activationUrl, createdAt, createdBy, expirationTime, id, updatedAt, updatedBy);
  }

  /** {@inheritDoc} */
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
