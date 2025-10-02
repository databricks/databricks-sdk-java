// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Time series analysis configuration. */
@Generated
public class TimeSeriesConfig {
  /**
   * List of granularities to use when aggregating data into time windows based on their timestamp.
   */
  @JsonProperty("granularities")
  private Collection<AggregationGranularity> granularities;

  /** Column for the timestamp. */
  @JsonProperty("timestamp_column")
  private String timestampColumn;

  public TimeSeriesConfig setGranularities(Collection<AggregationGranularity> granularities) {
    this.granularities = granularities;
    return this;
  }

  public Collection<AggregationGranularity> getGranularities() {
    return granularities;
  }

  public TimeSeriesConfig setTimestampColumn(String timestampColumn) {
    this.timestampColumn = timestampColumn;
    return this;
  }

  public String getTimestampColumn() {
    return timestampColumn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimeSeriesConfig that = (TimeSeriesConfig) o;
    return Objects.equals(granularities, that.granularities)
        && Objects.equals(timestampColumn, that.timestampColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularities, timestampColumn);
  }

  @Override
  public String toString() {
    return new ToStringer(TimeSeriesConfig.class)
        .add("granularities", granularities)
        .add("timestampColumn", timestampColumn)
        .toString();
  }
}
