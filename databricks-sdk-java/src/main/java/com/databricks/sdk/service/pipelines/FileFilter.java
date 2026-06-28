// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FileFilter {
  /**
   * Include files with modification times occurring after the specified time. Timestamp format:
   * YYYY-MM-DDTHH:mm:ss (e.g. 2020-06-01T13:00:00) Based on
   * https://spark.apache.org/docs/latest/sql-data-sources-generic-options.html#modification-time-path-filters
   */
  @JsonProperty("modified_after")
  private String modifiedAfter;

  /**
   * Include files with modification times occurring before the specified time. Timestamp format:
   * YYYY-MM-DDTHH:mm:ss (e.g. 2020-06-01T13:00:00) Based on
   * https://spark.apache.org/docs/latest/sql-data-sources-generic-options.html#modification-time-path-filters
   */
  @JsonProperty("modified_before")
  private String modifiedBefore;

  /**
   * Include files with file names matching the pattern Based on
   * https://spark.apache.org/docs/latest/sql-data-sources-generic-options.html#path-glob-filter
   */
  @JsonProperty("path_filter")
  private String pathFilter;

  public FileFilter setModifiedAfter(String modifiedAfter) {
    this.modifiedAfter = modifiedAfter;
    return this;
  }

  public String getModifiedAfter() {
    return modifiedAfter;
  }

  public FileFilter setModifiedBefore(String modifiedBefore) {
    this.modifiedBefore = modifiedBefore;
    return this;
  }

  public String getModifiedBefore() {
    return modifiedBefore;
  }

  public FileFilter setPathFilter(String pathFilter) {
    this.pathFilter = pathFilter;
    return this;
  }

  public String getPathFilter() {
    return pathFilter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileFilter that = (FileFilter) o;
    return Objects.equals(modifiedAfter, that.modifiedAfter)
        && Objects.equals(modifiedBefore, that.modifiedBefore)
        && Objects.equals(pathFilter, that.pathFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedAfter, modifiedBefore, pathFilter);
  }

  @Override
  public String toString() {
    return new ToStringer(FileFilter.class)
        .add("modifiedAfter", modifiedAfter)
        .add("modifiedBefore", modifiedBefore)
        .add("pathFilter", pathFilter)
        .toString();
  }
}
