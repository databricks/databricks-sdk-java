// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SortSpec {
  /** Whether to sort in descending order. */
  @JsonProperty("descending")
  @QueryParam("descending")
  private Boolean descending;

  /** The filed to sort by */
  @JsonProperty("field")
  @QueryParam("field")
  private SortSpecField field;

  public SortSpec setDescending(Boolean descending) {
    this.descending = descending;
    return this;
  }

  public Boolean getDescending() {
    return descending;
  }

  public SortSpec setField(SortSpecField field) {
    this.field = field;
    return this;
  }

  public SortSpecField getField() {
    return field;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SortSpec that = (SortSpec) o;
    return Objects.equals(descending, that.descending) && Objects.equals(field, that.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descending, field);
  }

  @Override
  public String toString() {
    return new ToStringer(SortSpec.class)
        .add("descending", descending)
        .add("field", field)
        .toString();
  }
}
