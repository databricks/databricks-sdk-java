// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AiGatewayRateLimitPb {
  @JsonProperty("calls")
  private Long calls;

  @JsonProperty("key")
  private AiGatewayRateLimitKey key;

  @JsonProperty("renewal_period")
  private AiGatewayRateLimitRenewalPeriod renewalPeriod;

  public AiGatewayRateLimitPb setCalls(Long calls) {
    this.calls = calls;
    return this;
  }

  public Long getCalls() {
    return calls;
  }

  public AiGatewayRateLimitPb setKey(AiGatewayRateLimitKey key) {
    this.key = key;
    return this;
  }

  public AiGatewayRateLimitKey getKey() {
    return key;
  }

  public AiGatewayRateLimitPb setRenewalPeriod(AiGatewayRateLimitRenewalPeriod renewalPeriod) {
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
    AiGatewayRateLimitPb that = (AiGatewayRateLimitPb) o;
    return Objects.equals(calls, that.calls)
        && Objects.equals(key, that.key)
        && Objects.equals(renewalPeriod, that.renewalPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calls, key, renewalPeriod);
  }

  @Override
  public String toString() {
    return new ToStringer(AiGatewayRateLimitPb.class)
        .add("calls", calls)
        .add("key", key)
        .add("renewalPeriod", renewalPeriod)
        .toString();
  }
}
