// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListingSetting {
  /** filters are joined with `or` conjunction. */
  @JsonProperty("filters")
  private Collection<VisibilityFilter> filters;

  /** */
  @JsonProperty("visibility")
  private Visibility visibility;

  public ListingSetting setFilters(Collection<VisibilityFilter> filters) {
    this.filters = filters;
    return this;
  }

  public Collection<VisibilityFilter> getFilters() {
    return filters;
  }

  public ListingSetting setVisibility(Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

  public Visibility getVisibility() {
    return visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListingSetting that = (ListingSetting) o;
    return Objects.equals(filters, that.filters) && Objects.equals(visibility, that.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, visibility);
  }

  @Override
  public String toString() {
    return new ToStringer(ListingSetting.class)
        .add("filters", filters)
        .add("visibility", visibility)
        .toString();
  }
}
