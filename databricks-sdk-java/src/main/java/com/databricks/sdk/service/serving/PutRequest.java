// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Update the rate limits of a serving endpoint */
@Generated
public class PutRequest {
  /**
   * The name of the serving endpoint whose rate limits are being updated. This field is required.
   */
  private String name;

  /** The list of endpoint rate limits. */
  @JsonProperty("rate_limits")
  private Collection<RateLimit> rateLimits;

  public PutRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PutRequest setRateLimits(Collection<RateLimit> rateLimits) {
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
    PutRequest that = (PutRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(rateLimits, that.rateLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rateLimits);
  }

  @Override
  public String toString() {
    return new ToStringer(PutRequest.class)
        .add("name", name)
        .add("rateLimits", rateLimits)
        .toString();
  }
}
