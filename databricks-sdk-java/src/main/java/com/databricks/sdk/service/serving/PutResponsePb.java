// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PutResponsePb {
  @JsonProperty("rate_limits")
  private Collection<RateLimit> rateLimits;

  public PutResponsePb setRateLimits(Collection<RateLimit> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public Collection<RateLimit> getRateLimits() {
    return rateLimits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PutResponsePb that = (PutResponsePb) o;
    return Objects.equals(rateLimits, that.rateLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateLimits);
  }

  @Override
  public String toString() {
    return new ToStringer(PutResponsePb.class).add("rateLimits", rateLimits).toString();
  }
}
