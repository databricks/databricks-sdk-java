// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieResultMetadata {
  /** Indicates whether the result set is truncated. */
  @JsonProperty("is_truncated")
  private Boolean isTruncated;

  /** The number of rows in the result set. */
  @JsonProperty("row_count")
  private Long rowCount;

  public GenieResultMetadata setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public GenieResultMetadata setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieResultMetadata that = (GenieResultMetadata) o;
    return Objects.equals(isTruncated, that.isTruncated) && Objects.equals(rowCount, that.rowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTruncated, rowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieResultMetadata.class)
        .add("isTruncated", isTruncated)
        .add("rowCount", rowCount)
        .toString();
  }
}
