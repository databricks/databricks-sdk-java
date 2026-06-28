// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListWarehousesResponse {
  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** A list of warehouses and their configurations. */
  @JsonProperty("warehouses")
  private Collection<EndpointInfo> warehouses;

  public ListWarehousesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

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
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(warehouses, that.warehouses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, warehouses);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWarehousesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("warehouses", warehouses)
        .toString();
  }
}
