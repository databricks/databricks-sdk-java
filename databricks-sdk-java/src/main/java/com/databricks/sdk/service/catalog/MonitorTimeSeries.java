// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Time series analysis configuration. */
@Generated
public class MonitorTimeSeries {
  /**
   * Granularities for aggregating data into time windows based on their timestamp. Currently the
   * following static granularities are supported: {``\"5 minutes\"``, ``\"30 minutes\"``, ``\"1
   * hour\"``, ``\"1 day\"``, ``\"\u003cn\u003e week(s)\"``, ``\"1 month\"``, ``\"1 year\"``}.
   */
  @JsonProperty("granularities")
  private Collection<String> granularities;

  /** Column for the timestamp. */
  @JsonProperty("timestamp_col")
  private String timestampCol;

  public MonitorTimeSeries setGranularities(Collection<String> granularities) {
    this.granularities = granularities;
    return this;
  }

  public Collection<String> getGranularities() {
    return granularities;
  }

  public MonitorTimeSeries setTimestampCol(String timestampCol) {
    this.timestampCol = timestampCol;
    return this;
  }

  public String getTimestampCol() {
    return timestampCol;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorTimeSeries that = (MonitorTimeSeries) o;
    return Objects.equals(granularities, that.granularities)
        && Objects.equals(timestampCol, that.timestampCol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularities, timestampCol);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorTimeSeries.class)
        .add("granularities", granularities)
        .add("timestampCol", timestampCol)
        .toString();
  }
}
