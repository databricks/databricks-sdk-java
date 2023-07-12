// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Get warehouse info
 */
@Generated
public class GetWarehouseRequest {
  /**
   * Required. Id of the SQL warehouse.
   */
  
  private String id;
  
  public GetWarehouseRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetWarehouseRequest that = (GetWarehouseRequest) o;
    return Objects.equals(id, that.id)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWarehouseRequest.class)
      .add("id", id).toString();
  }
}
