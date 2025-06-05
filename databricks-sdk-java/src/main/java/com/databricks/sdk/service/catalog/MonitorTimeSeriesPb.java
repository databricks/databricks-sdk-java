// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class MonitorTimeSeriesPb {
  @JsonProperty("granularities")
  private Collection<String> granularities;

  @JsonProperty("timestamp_col")
  private String timestampCol;

  public MonitorTimeSeriesPb setGranularities(Collection<String> granularities) {
    this.granularities = granularities;
    return this;
  }

  public Collection<String> getGranularities() {
    return granularities;
  }

  public MonitorTimeSeriesPb setTimestampCol(String timestampCol) {
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
    MonitorTimeSeriesPb that = (MonitorTimeSeriesPb) o;
    return Objects.equals(granularities, that.granularities)
        && Objects.equals(timestampCol, that.timestampCol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularities, timestampCol);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorTimeSeriesPb.class)
        .add("granularities", granularities)
        .add("timestampCol", timestampCol)
        .toString();
  }
}
