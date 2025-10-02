// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TokenAccessPolicy {
  /** absolute OAuth session TTL in minutes when single-use refresh tokens are enabled */
  @JsonProperty("absolute_session_lifetime_in_minutes")
  private Long absoluteSessionLifetimeInMinutes;

  /** access token time to live in minutes */
  @JsonProperty("access_token_ttl_in_minutes")
  private Long accessTokenTtlInMinutes;

  /** whether to enable single-use refresh tokens */
  @JsonProperty("enable_single_use_refresh_tokens")
  private Boolean enableSingleUseRefreshTokens;

  /** refresh token time to live in minutes */
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
