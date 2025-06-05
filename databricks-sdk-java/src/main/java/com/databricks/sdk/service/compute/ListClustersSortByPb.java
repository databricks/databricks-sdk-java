// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ListClustersSortByPb {
  @JsonProperty("direction")
  @QueryParam("direction")
  private ListClustersSortByDirection direction;

  @JsonProperty("field")
  @QueryParam("field")
  private ListClustersSortByField field;

  public ListClustersSortByPb setDirection(ListClustersSortByDirection direction) {
    this.direction = direction;
    return this;
  }

  public ListClustersSortByDirection getDirection() {
    return direction;
  }

  public ListClustersSortByPb setField(ListClustersSortByField field) {
    this.field = field;
    return this;
  }

  public ListClustersSortByField getField() {
    return field;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersSortByPb that = (ListClustersSortByPb) o;
    return Objects.equals(direction, that.direction) && Objects.equals(field, that.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, field);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClustersSortByPb.class)
        .add("direction", direction)
        .add("field", field)
        .toString();
  }
}
