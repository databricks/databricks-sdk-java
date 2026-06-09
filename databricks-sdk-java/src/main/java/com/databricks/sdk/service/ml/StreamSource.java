// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A Stream entity used as a data source for a feature. */
@Generated
public class StreamSource {
  /** The filter condition applied to the source data before aggregation. */
  @JsonProperty("filter_condition")
  private String filterCondition;

  /** Three-part full name of the Stream (catalog.schema.stream). */
  @JsonProperty("full_name")
  private String fullName;

  public StreamSource setFilterCondition(String filterCondition) {
    this.filterCondition = filterCondition;
    return this;
  }

  public String getFilterCondition() {
    return filterCondition;
  }

  public StreamSource setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StreamSource that = (StreamSource) o;
    return Objects.equals(filterCondition, that.filterCondition)
        && Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterCondition, fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(StreamSource.class)
        .add("filterCondition", filterCondition)
        .add("fullName", fullName)
        .toString();
  }
}
