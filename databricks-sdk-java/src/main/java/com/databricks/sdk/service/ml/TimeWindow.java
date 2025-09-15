// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TimeWindow {
  /** The duration of the time window. */
  @JsonProperty("duration")
  private String duration;

  /** The offset of the time window. */
  @JsonProperty("offset")
  private String offset;

  public TimeWindow setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  public String getDuration() {
    return duration;
  }

  public TimeWindow setOffset(String offset) {
    this.offset = offset;
    return this;
  }

  public String getOffset() {
    return offset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimeWindow that = (TimeWindow) o;
    return Objects.equals(duration, that.duration) && Objects.equals(offset, that.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, offset);
  }

  @Override
  public String toString() {
    return new ToStringer(TimeWindow.class)
        .add("duration", duration)
        .add("offset", offset)
        .toString();
  }
}
