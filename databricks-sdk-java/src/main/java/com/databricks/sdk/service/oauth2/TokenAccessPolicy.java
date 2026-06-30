// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TokenAccessPolicy {
  /**
   * Absolute OAuth session TTL in minutes. Effective only when the single-use refresh token feature
   * is enabled. This is the absolute TTL of all refresh tokens issued in one OAuth session. When a
   * new refresh token is issued during refresh token rotation, it will inherit the same absolute
   * TTL as the old refresh token. In other words, this represents the maximum amount of time a user
   * can stay logged in without re-authenticating.
   */
  @JsonProperty("absolute_session_lifetime_in_minutes")
  private Long absoluteSessionLifetimeInMinutes;

  /** access token time to live in minutes */
  @JsonProperty("access_token_ttl_in_minutes")
  private Long accessTokenTtlInMinutes;

  /**
   * Whether to enable single-use refresh tokens (refresh token rotation). If this feature is
   * enabled, upon successfully getting a new access token using a refresh token, Databricks will
   * issue a new refresh token along with the access token in the response and invalidate the old
   * refresh token. The client should use the new refresh token to get access tokens in future
   * requests.
   */
  @JsonProperty("enable_single_use_refresh_tokens")
  private Boolean enableSingleUseRefreshTokens;

  /**
   * Refresh token time to live in minutes. When single-use refresh tokens are enabled, this
   * represents the TTL of an individual refresh token. If the refresh token is used before it
   * expires, a new one is issued with a renewed individual TTL.
   */
  @JsonProperty("refresh_token_ttl_in_minutes")
  private Long refreshTokenTtlInMinutes;

  public TokenAccessPolicy setAbsoluteSessionLifetimeInMinutes(
      Long absoluteSessionLifetimeInMinutes) {
    this.absoluteSessionLifetimeInMinutes = absoluteSessionLifetimeInMinutes;
    return this;
  }

  public Long getAbsoluteSessionLifetimeInMinutes() {
    return absoluteSessionLifetimeInMinutes;
  }

  public TokenAccessPolicy setAccessTokenTtlInMinutes(Long accessTokenTtlInMinutes) {
    this.accessTokenTtlInMinutes = accessTokenTtlInMinutes;
    return this;
  }

  public Long getAccessTokenTtlInMinutes() {
    return accessTokenTtlInMinutes;
  }

  public TokenAccessPolicy setEnableSingleUseRefreshTokens(Boolean enableSingleUseRefreshTokens) {
    this.enableSingleUseRefreshTokens = enableSingleUseRefreshTokens;
    return this;
  }

  public Boolean getEnableSingleUseRefreshTokens() {
    return enableSingleUseRefreshTokens;
  }

  public TokenAccessPolicy setRefreshTokenTtlInMinutes(Long refreshTokenTtlInMinutes) {
    this.refreshTokenTtlInMinutes = refreshTokenTtlInMinutes;
    return this;
  }

  public Long getRefreshTokenTtlInMinutes() {
    return refreshTokenTtlInMinutes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenAccessPolicy that = (TokenAccessPolicy) o;
    return Objects.equals(absoluteSessionLifetimeInMinutes, that.absoluteSessionLifetimeInMinutes)
        && Objects.equals(accessTokenTtlInMinutes, that.accessTokenTtlInMinutes)
        && Objects.equals(enableSingleUseRefreshTokens, that.enableSingleUseRefreshTokens)
        && Objects.equals(refreshTokenTtlInMinutes, that.refreshTokenTtlInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        absoluteSessionLifetimeInMinutes,
        accessTokenTtlInMinutes,
        enableSingleUseRefreshTokens,
        refreshTokenTtlInMinutes);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenAccessPolicy.class)
        .add("absoluteSessionLifetimeInMinutes", absoluteSessionLifetimeInMinutes)
        .add("accessTokenTtlInMinutes", accessTokenTtlInMinutes)
        .add("enableSingleUseRefreshTokens", enableSingleUseRefreshTokens)
        .add("refreshTokenTtlInMinutes", refreshTokenTtlInMinutes)
        .toString();
  }
}
