// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListWarehousesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListWarehousesResponse {
  /** A list of warehouses and their configurations. */
  @JsonProperty("warehouses")
  private Collection<EndpointInfo> warehouses;

  /**
   * <p>Setter for the field <code>warehouses</code>.</p>
   *
   * @param warehouses a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.ListWarehousesResponse} object
   */
  public ListWarehousesResponse setWarehouses(Collection<EndpointInfo> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  /**
   * <p>Getter for the field <code>warehouses</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<EndpointInfo> getWarehouses() {
    return warehouses;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWarehousesResponse that = (ListWarehousesResponse) o;
    return Objects.equals(warehouses, that.warehouses);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(warehouses);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListWarehousesResponse.class).add("warehouses", warehouses).toString();
  }
}
