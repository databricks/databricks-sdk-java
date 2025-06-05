// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListWarehousesResponsePb {
  @JsonProperty("warehouses")
  private Collection<EndpointInfo> warehouses;

  public ListWarehousesResponsePb setWarehouses(Collection<EndpointInfo> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  public Collection<EndpointInfo> getWarehouses() {
    return warehouses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWarehousesResponsePb that = (ListWarehousesResponsePb) o;
    return Objects.equals(warehouses, that.warehouses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouses);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWarehousesResponsePb.class).add("warehouses", warehouses).toString();
  }
}
