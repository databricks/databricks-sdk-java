// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TokenInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TokenInfo {
  /** Comment that describes the purpose of the token, specified by the token creator. */
  @JsonProperty("comment")
  private String comment;

  /** User ID of the user that created the token. */
  @JsonProperty("created_by_id")
  private Long createdById;

  /** Username of the user that created the token. */
  @JsonProperty("created_by_username")
  private String createdByUsername;

  /** Timestamp when the token was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** Timestamp when the token expires. */
  @JsonProperty("expiry_time")
  private Long expiryTime;

  /** User ID of the user that owns the token. */
  @JsonProperty("owner_id")
  private Long ownerId;

  /** ID of the token. */
  @JsonProperty("token_id")
  private String tokenId;

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.TokenInfo} object
   */
  public TokenInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>createdById</code>.</p>
   *
   * @param createdById a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.TokenInfo} object
   */
  public TokenInfo setCreatedById(Long createdById) {
    this.createdById = createdById;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdById</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreatedById() {
    return createdById;
  }

  /**
   * <p>Setter for the field <code>createdByUsername</code>.</p>
   *
   * @param createdByUsername a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.TokenInfo} object
   */
  public TokenInfo setCreatedByUsername(String createdByUsername) {
    this.createdByUsername = createdByUsername;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdByUsername</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatedByUsername() {
    return createdByUsername;
  }

  /**
   * <p>Setter for the field <code>creationTime</code>.</p>
   *
   * @param creationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.TokenInfo} object
   */
  public TokenInfo setCreationTime(Long creationTime) {
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
   * <p>Setter for the field <code>expiryTime</code>.</p>
   *
   * @param expiryTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.TokenInfo} object
   */
  public TokenInfo setExpiryTime(Long expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>expiryTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getExpiryTime() {
    return expiryTime;
  }

  /**
   * <p>Setter for the field <code>ownerId</code>.</p>
   *
   * @param ownerId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.TokenInfo} object
   */
  public TokenInfo setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * <p>Getter for the field <code>ownerId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getOwnerId() {
    return ownerId;
  }

  /**
   * <p>Setter for the field <code>tokenId</code>.</p>
   *
   * @param tokenId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.TokenInfo} object
   */
  public TokenInfo setTokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  /**
   * <p>Getter for the field <code>tokenId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTokenId() {
    return tokenId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenInfo that = (TokenInfo) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createdById, that.createdById)
        && Objects.equals(createdByUsername, that.createdByUsername)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(expiryTime, that.expiryTime)
        && Objects.equals(ownerId, that.ownerId)
        && Objects.equals(tokenId, that.tokenId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        comment, createdById, createdByUsername, creationTime, expiryTime, ownerId, tokenId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TokenInfo.class)
        .add("comment", comment)
        .add("createdById", createdById)
        .add("createdByUsername", createdByUsername)
        .add("creationTime", creationTime)
        .add("expiryTime", expiryTime)
        .add("ownerId", ownerId)
        .add("tokenId", tokenId)
        .toString();
  }
}
