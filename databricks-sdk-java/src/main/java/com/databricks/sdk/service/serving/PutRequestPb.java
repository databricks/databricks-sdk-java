// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PutRequestPb {
  @JsonIgnore private String name;

  @JsonProperty("rate_limits")
  private Collection<RateLimit> rateLimits;

  public PutRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PutRequestPb setRateLimits(Collection<RateLimit> rateLimits) {
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
    PutRequestPb that = (PutRequestPb) o;
    return Objects.equals(name, that.name) && Objects.equals(rateLimits, that.rateLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rateLimits);
  }

  @Override
  public String toString() {
    return new ToStringer(PutRequestPb.class)
        .add("name", name)
        .add("rateLimits", rateLimits)
        .toString();
  }
}
