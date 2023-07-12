// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ListWarehousesResponse {
  /**
   * A list of warehouses and their configurations.
   */
  @JsonProperty("warehouses")
  private Collection<EndpointInfo> warehouses;
  
  public ListWarehousesResponse setWarehouses(Collection<EndpointInfo> warehouses) {
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
    ListWarehousesResponse that = (ListWarehousesResponse) o;
    return Objects.equals(warehouses, that.warehouses)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouses);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWarehousesResponse.class)
      .add("warehouses", warehouses).toString();
  }
}
