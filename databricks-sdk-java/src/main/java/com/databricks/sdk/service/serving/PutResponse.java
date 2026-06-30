// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PutResponse {
  /** The list of endpoint rate limits. */
  @JsonProperty("rate_limits")
  private Collection<RateLimit> rateLimits;

  public PutResponse setRateLimits(Collection<RateLimit> rateLimits) {
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
    PutResponse that = (PutResponse) o;
    return Objects.equals(rateLimits, that.rateLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateLimits);
  }

  @Override
  public String toString() {
    return new ToStringer(PutResponse.class).add("rateLimits", rateLimits).toString();
  }
}
