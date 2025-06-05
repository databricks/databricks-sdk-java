// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GenieResultMetadataPb {
  @JsonProperty("is_truncated")
  private Boolean isTruncated;

  @JsonProperty("row_count")
  private Long rowCount;

  public GenieResultMetadataPb setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public GenieResultMetadataPb setRowCount(Long rowCount) {
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
    GenieResultMetadataPb that = (GenieResultMetadataPb) o;
    return Objects.equals(isTruncated, that.isTruncated) && Objects.equals(rowCount, that.rowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTruncated, rowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieResultMetadataPb.class)
        .add("isTruncated", isTruncated)
        .add("rowCount", rowCount)
        .toString();
  }
}
