// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

/**
 * A window that spans the entire lifetime of a data source, accumulating from the source's start
 * rather than over a bounded duration. All fields are optional; an empty message denotes the
 * continuous, fully-accurate variant.
 */
@Generated
public class LifetimeWindow {
  /**
   * The slide duration for the discrete (offline) variant: the value updates only at these
   * boundaries. Must be positive when set. When absent, the window is continuous (the value is as
   * fresh as the pipeline delivers).
   */
  @JsonProperty("slide_duration")
  private Duration slideDuration;

  public LifetimeWindow setSlideDuration(Duration slideDuration) {
    this.slideDuration = slideDuration;
    return this;
  }

  public Duration getSlideDuration() {
    return slideDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LifetimeWindow that = (LifetimeWindow) o;
    return Objects.equals(slideDuration, that.slideDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slideDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(LifetimeWindow.class).add("slideDuration", slideDuration).toString();
  }
}
