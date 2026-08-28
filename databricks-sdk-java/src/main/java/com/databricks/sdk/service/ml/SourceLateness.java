// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

/** Configures when event-time data from this source is considered complete for a Feature. */
@Generated
public class SourceLateness {
  /**
   * Non-negative time to wait after a window ends before treating its source data as complete.
   * Training shifts the eligible evaluation time backwards by this duration so it does not join
   * data that would still have been settling online. Materialization waits for the duration to
   * elapse before publishing the window. If unset, source data is considered settled immediately.
   */
  @JsonProperty("settling_delay")
  private Duration settlingDelay;

  public SourceLateness setSettlingDelay(Duration settlingDelay) {
    this.settlingDelay = settlingDelay;
    return this;
  }

  public Duration getSettlingDelay() {
    return settlingDelay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SourceLateness that = (SourceLateness) o;
    return Objects.equals(settlingDelay, that.settlingDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlingDelay);
  }

  @Override
  public String toString() {
    return new ToStringer(SourceLateness.class).add("settlingDelay", settlingDelay).toString();
  }
}
