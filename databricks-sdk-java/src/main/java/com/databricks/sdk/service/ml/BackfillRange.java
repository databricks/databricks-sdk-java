// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A time range for a backfill. */
@Generated
public class BackfillRange {
  /** End of the backfill range, exclusive. If unset, defaults to the current time. */
  @JsonProperty("end_time")
  private Timestamp endTime;

  /**
   * Start of the backfill range, inclusive. If unset, defaults to the earliest source timestamp of
   * the feature.
   */
  @JsonProperty("start_time")
  private Timestamp startTime;

  public BackfillRange setEndTime(Timestamp endTime) {
    this.endTime = endTime;
    return this;
  }

  public Timestamp getEndTime() {
    return endTime;
  }

  public BackfillRange setStartTime(Timestamp startTime) {
    this.startTime = startTime;
    return this;
  }

  public Timestamp getStartTime() {
    return startTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BackfillRange that = (BackfillRange) o;
    return Objects.equals(endTime, that.endTime) && Objects.equals(startTime, that.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, startTime);
  }

  @Override
  public String toString() {
    return new ToStringer(BackfillRange.class)
        .add("endTime", endTime)
        .add("startTime", startTime)
        .toString();
  }
}
