// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

@Generated
public class ComputeSpec {
  /** Idle duration after which the sandbox is automatically terminated. */
  @JsonProperty("inactivity_timeout")
  private Duration inactivityTimeout;

  public ComputeSpec setInactivityTimeout(Duration inactivityTimeout) {
    this.inactivityTimeout = inactivityTimeout;
    return this;
  }

  public Duration getInactivityTimeout() {
    return inactivityTimeout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComputeSpec that = (ComputeSpec) o;
    return Objects.equals(inactivityTimeout, that.inactivityTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inactivityTimeout);
  }

  @Override
  public String toString() {
    return new ToStringer(ComputeSpec.class).add("inactivityTimeout", inactivityTimeout).toString();
  }
}
