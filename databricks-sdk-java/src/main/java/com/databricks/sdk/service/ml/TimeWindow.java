// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TimeWindow {
  /** */
  @JsonProperty("continuous")
  private ContinuousWindow continuous;

  /** */
  @JsonProperty("sliding")
  private SlidingWindow sliding;

  /** */
  @JsonProperty("tumbling")
  private TumblingWindow tumbling;

  public TimeWindow setContinuous(ContinuousWindow continuous) {
    this.continuous = continuous;
    return this;
  }

  public ContinuousWindow getContinuous() {
    return continuous;
  }

  public TimeWindow setSliding(SlidingWindow sliding) {
    this.sliding = sliding;
    return this;
  }

  public SlidingWindow getSliding() {
    return sliding;
  }

  public TimeWindow setTumbling(TumblingWindow tumbling) {
    this.tumbling = tumbling;
    return this;
  }

  public TumblingWindow getTumbling() {
    return tumbling;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimeWindow that = (TimeWindow) o;
    return Objects.equals(continuous, that.continuous)
        && Objects.equals(sliding, that.sliding)
        && Objects.equals(tumbling, that.tumbling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(continuous, sliding, tumbling);
  }

  @Override
  public String toString() {
    return new ToStringer(TimeWindow.class)
        .add("continuous", continuous)
        .add("sliding", sliding)
        .add("tumbling", tumbling)
        .toString();
  }
}
