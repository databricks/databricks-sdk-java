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
  /** Scope key. Determines whether `principal` is required. */
  @JsonProperty("key")
  private RateLimitRateLimitKey key;

  /**
   * Principal this limit applies to: user email, group name, or service principal application ID.
   * Required unless `key` is `RATE_LIMIT_KEY_SERVICE`, `RATE_LIMIT_KEY_USER_DEFAULT`, or
   * `RATE_LIMIT_KEY_REQUEST_TAG` (which must not set a principal).
   */
  @JsonProperty("principal")
  private String principal;

  /** Renewal period. */
  @JsonProperty("renewal_period")
  private RateLimitRateLimitRenewalPeriod renewalPeriod;

  /**
   * Request tag key this limit applies to. Required when `key` is `RATE_LIMIT_KEY_REQUEST_TAG`,
   * forbidden otherwise.
   */
  @JsonProperty("request_tag_key")
  private String requestTagKey;

  /**
   * Request tag value this limit applies to. Only valid when `key` is `RATE_LIMIT_KEY_REQUEST_TAG`.
   * Leave unset to apply the limit to every value of `request_tag_key` (an any-value default); a
   * set value is a specific override for that value.
   */
  @JsonProperty("request_tag_value")
  private String requestTagValue;

  /** Max requests allowed within a renewal period. Leave unset for no request limit. */
  @JsonProperty("requests")
  private Long requests;

  /** Max tokens allowed within a renewal period. Leave unset for no token limit. */
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

  public RateLimit setRequestTagKey(String requestTagKey) {
    this.requestTagKey = requestTagKey;
    return this;
  }

  public String getRequestTagKey() {
    return requestTagKey;
  }

  public RateLimit setRequestTagValue(String requestTagValue) {
    this.requestTagValue = requestTagValue;
    return this;
  }

  public String getRequestTagValue() {
    return requestTagValue;
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
        && Objects.equals(requestTagKey, that.requestTagKey)
        && Objects.equals(requestTagValue, that.requestTagValue)
        && Objects.equals(requests, that.requests)
        && Objects.equals(tokens, that.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        key, principal, renewalPeriod, requestTagKey, requestTagValue, requests, tokens);
  }

  @Override
  public String toString() {
    return new ToStringer(RateLimit.class)
        .add("key", key)
        .add("principal", principal)
        .add("renewalPeriod", renewalPeriod)
        .add("requestTagKey", requestTagKey)
        .add("requestTagValue", requestTagValue)
        .add("requests", requests)
        .add("tokens", tokens)
        .toString();
  }
}
