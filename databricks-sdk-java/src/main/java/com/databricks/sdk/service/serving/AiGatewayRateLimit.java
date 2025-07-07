// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AiGatewayRateLimit {
  /** Used to specify how many calls are allowed for a key within the renewal_period. */
  @JsonProperty("calls")
  private Long calls;

  /**
   * Key field for a rate limit. Currently, 'user', 'user_group, 'service_principal', and 'endpoint'
   * are supported, with 'endpoint' being the default if not specified.
   */
  @JsonProperty("key")
  private AiGatewayRateLimitKey key;

  /**
   * Principal field for a user, user group, or service principal to apply rate limiting to. Accepts
   * a user email, group name, or service principal application ID.
   */
  @JsonProperty("principal")
  private String principal;

  /** Renewal period field for a rate limit. Currently, only 'minute' is supported. */
  @JsonProperty("renewal_period")
  private AiGatewayRateLimitRenewalPeriod renewalPeriod;

  public AiGatewayRateLimit setCalls(Long calls) {
    this.calls = calls;
    return this;
  }

  public Long getCalls() {
    return calls;
  }

  public AiGatewayRateLimit setKey(AiGatewayRateLimitKey key) {
    this.key = key;
    return this;
  }

  public AiGatewayRateLimitKey getKey() {
    return key;
  }

  public AiGatewayRateLimit setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public AiGatewayRateLimit setRenewalPeriod(AiGatewayRateLimitRenewalPeriod renewalPeriod) {
    this.renewalPeriod = renewalPeriod;
    return this;
  }

  public AiGatewayRateLimitRenewalPeriod getRenewalPeriod() {
    return renewalPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiGatewayRateLimit that = (AiGatewayRateLimit) o;
    return Objects.equals(calls, that.calls)
        && Objects.equals(key, that.key)
        && Objects.equals(principal, that.principal)
        && Objects.equals(renewalPeriod, that.renewalPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calls, key, principal, renewalPeriod);
  }

  @Override
  public String toString() {
    return new ToStringer(AiGatewayRateLimit.class)
        .add("calls", calls)
        .add("key", key)
        .add("principal", principal)
        .add("renewalPeriod", renewalPeriod)
        .toString();
  }
}
