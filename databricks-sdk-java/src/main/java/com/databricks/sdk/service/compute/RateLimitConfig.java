// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Rate-limit configuration for serverless compute workloads. */
@Generated
public class RateLimitConfig {
  /** */
  @JsonProperty("t_shirt_size")
  private TshirtSize tShirtSize;

  /**
   * Proto enum name of t_shirt_size (e.g. T_SHIRT_SIZE_SMALL). Output-only; derived on read so a
   * minting client that does not know a new enum value can still put the name on the cost-control
   * token.
   */
  @JsonProperty("t_shirt_size_name")
  private String tShirtSizeName;

  public RateLimitConfig setTShirtSize(TshirtSize tShirtSize) {
    this.tShirtSize = tShirtSize;
    return this;
  }

  public TshirtSize getTShirtSize() {
    return tShirtSize;
  }

  public RateLimitConfig setTShirtSizeName(String tShirtSizeName) {
    this.tShirtSizeName = tShirtSizeName;
    return this;
  }

  public String getTShirtSizeName() {
    return tShirtSizeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RateLimitConfig that = (RateLimitConfig) o;
    return Objects.equals(tShirtSize, that.tShirtSize)
        && Objects.equals(tShirtSizeName, that.tShirtSizeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tShirtSize, tShirtSizeName);
  }

  @Override
  public String toString() {
    return new ToStringer(RateLimitConfig.class)
        .add("tShirtSize", tShirtSize)
        .add("tShirtSizeName", tShirtSizeName)
        .toString();
  }
}
