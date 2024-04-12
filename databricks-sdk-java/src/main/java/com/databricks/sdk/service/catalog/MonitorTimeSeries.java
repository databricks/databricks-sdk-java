// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class MonitorTimeSeries {
  /**
   * Granularities for aggregating data into time windows based on their timestamp. Currently the
   * following static granularities are supported: {``"5 minutes"``, ``"30 minutes"``, ``"1 hour"``,
   * ``"1 day"``, ``"<n> week(s)"``, ``"1 month"``, ``"1 year"``}.
   */
  @JsonProperty("granularities")
  private Collection<String> granularities;

  /**
   * Column that contains the timestamps of requests. The column must be one of the following: - A
   * ``TimestampType`` column - A column whose values can be converted to timestamps through the
   * pyspark ``to_timestamp`` [function].
   *
   * <p>[function]:
   * https://spark.apache.org/docs/latest/api/python/reference/pyspark.sql/api/pyspark.sql.functions.to_timestamp.html
   */
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
