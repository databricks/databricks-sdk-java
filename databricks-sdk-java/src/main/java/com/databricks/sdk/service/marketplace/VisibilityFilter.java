// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class VisibilityFilter {
  /** */
  @JsonProperty("filterType")
  private FilterType filterType;

  /** */
  @JsonProperty("filterValue")
  private String filterValue;

  public VisibilityFilter setFilterType(FilterType filterType) {
    this.filterType = filterType;
    return this;
  }

  public FilterType getFilterType() {
    return filterType;
  }

  public VisibilityFilter setFilterValue(String filterValue) {
    this.filterValue = filterValue;
    return this;
  }

  public String getFilterValue() {
    return filterValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VisibilityFilter that = (VisibilityFilter) o;
    return Objects.equals(filterType, that.filterType)
        && Objects.equals(filterValue, that.filterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterType, filterValue);
  }

  @Override
  public String toString() {
    return new ToStringer(VisibilityFilter.class)
        .add("filterType", filterType)
        .add("filterValue", filterValue)
        .toString();
  }
}
