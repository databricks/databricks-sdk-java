// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RateLimitPb {
  @JsonProperty("calls")
  private Long calls;

  @JsonProperty("key")
  private RateLimitKey key;

  @JsonProperty("renewal_period")
  private RateLimitRenewalPeriod renewalPeriod;

  public RateLimitPb setCalls(Long calls) {
    this.calls = calls;
    return this;
  }

  public Long getCalls() {
    return calls;
  }

  public RateLimitPb setKey(RateLimitKey key) {
    this.key = key;
    return this;
  }

  public RateLimitKey getKey() {
    return key;
  }

  public RateLimitPb setRenewalPeriod(RateLimitRenewalPeriod renewalPeriod) {
    this.renewalPeriod = renewalPeriod;
    return this;
  }

  public RateLimitRenewalPeriod getRenewalPeriod() {
    return renewalPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RateLimitPb that = (RateLimitPb) o;
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
    return new ToStringer(RateLimitPb.class)
        .add("calls", calls)
        .add("key", key)
        .add("renewalPeriod", renewalPeriod)
        .toString();
  }
}
