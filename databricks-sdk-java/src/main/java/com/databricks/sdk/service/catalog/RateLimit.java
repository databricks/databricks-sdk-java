// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A rate limit applied to service requests. Leave `requests` or `tokens` unset to impose no limit
 * on that dimension; set a value to cap that dimension within the renewal period.
 */
@Generated
public class RateLimit {
  /**
   * Scope of the rate limit. Depending on this value, the limit applies to a principal, the service
   * as a whole, or each user by default.
   */
  @JsonProperty("key")
  private RateLimitRateLimitKey key;

  /**
   * Principal this limit applies to: user email, group name, or service principal application ID.
   * Required when `key` applies to a user, group, or service principal; otherwise it must be unset.
   */
  @JsonProperty("principal")
  private String principal;

  /** Renewal period. */
  @JsonProperty("renewal_period")
  private RateLimitRateLimitRenewalPeriod renewalPeriod;

  /**
   * Maximum requests allowed in one renewal period. Leave unset for no request limit. Set to `0` to
   * deny all requests.
   */
  @JsonProperty("requests")
  private Long requests;

  /**
   * Maximum tokens allowed in one renewal period. Leave unset for no token limit. Set to `0` to
   * deny all requests.
   */
  @JsonProperty("tokens")
  private Long tokens;

  public RateLimit setKey(RateLimitRateLimitKey key) {
    this.key = key;
    return this;
  }

  public RateLimitRateLimitKey getKey() {
    return key;
  }

  public RateLimit setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public RateLimit setRenewalPeriod(RateLimitRateLimitRenewalPeriod renewalPeriod) {
    this.renewalPeriod = renewalPeriod;
    return this;
  }

  public RateLimitRateLimitRenewalPeriod getRenewalPeriod() {
    return renewalPeriod;
  }

  public RateLimit setRequests(Long requests) {
    this.requests = requests;
    return this;
  }

  public Long getRequests() {
    return requests;
  }

  public RateLimit setTokens(Long tokens) {
    this.tokens = tokens;
    return this;
  }

  public Long getTokens() {
    return tokens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RateLimit that = (RateLimit) o;
    return Objects.equals(key, that.key)
        && Objects.equals(principal, that.principal)
        && Objects.equals(renewalPeriod, that.renewalPeriod)
        && Objects.equals(requests, that.requests)
        && Objects.equals(tokens, that.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, principal, renewalPeriod, requests, tokens);
  }

  @Override
  public String toString() {
    return new ToStringer(RateLimit.class)
        .add("key", key)
        .add("principal", principal)
        .add("renewalPeriod", renewalPeriod)
        .add("requests", requests)
        .add("tokens", tokens)
        .toString();
  }
}
