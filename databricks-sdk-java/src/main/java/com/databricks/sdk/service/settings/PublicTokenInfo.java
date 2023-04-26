// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PublicTokenInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PublicTokenInfo {
  /** Comment the token was created with, if applicable. */
  @JsonProperty("comment")
  private String comment;

  /** Server time (in epoch milliseconds) when the token was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** Server time (in epoch milliseconds) when the token will expire, or -1 if not applicable. */
  @JsonProperty("expiry_time")
  private Long expiryTime;

  /** The ID of this token. */
  @JsonProperty("token_id")
  private String tokenId;

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.PublicTokenInfo} object
   */
  public PublicTokenInfo setComment(String comment) {
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
   * <p>Setter for the field <code>creationTime</code>.</p>
   *
   * @param creationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.PublicTokenInfo} object
   */
  public PublicTokenInfo setCreationTime(Long creationTime) {
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
   * @return a {@link com.databricks.sdk.service.settings.PublicTokenInfo} object
   */
  public PublicTokenInfo setExpiryTime(Long expiryTime) {
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
   * <p>Setter for the field <code>tokenId</code>.</p>
   *
   * @param tokenId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.PublicTokenInfo} object
   */
  public PublicTokenInfo setTokenId(String tokenId) {
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
    PublicTokenInfo that = (PublicTokenInfo) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(expiryTime, that.expiryTime)
        && Objects.equals(tokenId, that.tokenId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(comment, creationTime, expiryTime, tokenId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PublicTokenInfo.class)
        .add("comment", comment)
        .add("creationTime", creationTime)
        .add("expiryTime", expiryTime)
        .add("tokenId", tokenId)
        .toString();
  }
}
