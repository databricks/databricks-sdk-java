// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TokenAccessPolicy class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TokenAccessPolicy {
  /** access token time to live in minutes */
  @JsonProperty("access_token_ttl_in_minutes")
  private Long accessTokenTtlInMinutes;

  /** refresh token time to live in minutes */
  @JsonProperty("refresh_token_ttl_in_minutes")
  private Long refreshTokenTtlInMinutes;

  /**
   * <p>Setter for the field <code>accessTokenTtlInMinutes</code>.</p>
   *
   * @param accessTokenTtlInMinutes a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.oauth2.TokenAccessPolicy} object
   */
  public TokenAccessPolicy setAccessTokenTtlInMinutes(Long accessTokenTtlInMinutes) {
    this.accessTokenTtlInMinutes = accessTokenTtlInMinutes;
    return this;
  }

  /**
   * <p>Getter for the field <code>accessTokenTtlInMinutes</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getAccessTokenTtlInMinutes() {
    return accessTokenTtlInMinutes;
  }

  /**
   * <p>Setter for the field <code>refreshTokenTtlInMinutes</code>.</p>
   *
   * @param refreshTokenTtlInMinutes a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.oauth2.TokenAccessPolicy} object
   */
  public TokenAccessPolicy setRefreshTokenTtlInMinutes(Long refreshTokenTtlInMinutes) {
    this.refreshTokenTtlInMinutes = refreshTokenTtlInMinutes;
    return this;
  }

  /**
   * <p>Getter for the field <code>refreshTokenTtlInMinutes</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRefreshTokenTtlInMinutes() {
    return refreshTokenTtlInMinutes;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenAccessPolicy that = (TokenAccessPolicy) o;
    return Objects.equals(accessTokenTtlInMinutes, that.accessTokenTtlInMinutes)
        && Objects.equals(refreshTokenTtlInMinutes, that.refreshTokenTtlInMinutes);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(accessTokenTtlInMinutes, refreshTokenTtlInMinutes);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TokenAccessPolicy.class)
        .add("accessTokenTtlInMinutes", accessTokenTtlInMinutes)
        .add("refreshTokenTtlInMinutes", refreshTokenTtlInMinutes)
        .toString();
  }
}
