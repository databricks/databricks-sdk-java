// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TokenAccessPolicy {
  /** access token time to live in minutes */
  @JsonProperty("access_token_ttl_in_minutes")
  private Long accessTokenTtlInMinutes;

  /** refresh token time to live in minutes */
  @JsonProperty("refresh_token_ttl_in_minutes")
  private Long refreshTokenTtlInMinutes;

  public TokenAccessPolicy setAccessTokenTtlInMinutes(Long accessTokenTtlInMinutes) {
    this.accessTokenTtlInMinutes = accessTokenTtlInMinutes;
    return this;
  }

  public Long getAccessTokenTtlInMinutes() {
    return accessTokenTtlInMinutes;
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
    return Objects.equals(accessTokenTtlInMinutes, that.accessTokenTtlInMinutes)
        && Objects.equals(refreshTokenTtlInMinutes, that.refreshTokenTtlInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenTtlInMinutes, refreshTokenTtlInMinutes);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenAccessPolicy.class)
        .add("accessTokenTtlInMinutes", accessTokenTtlInMinutes)
        .add("refreshTokenTtlInMinutes", refreshTokenTtlInMinutes)
        .toString();
  }
}
