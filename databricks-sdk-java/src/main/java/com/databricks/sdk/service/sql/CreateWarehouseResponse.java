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
public class CreateWarehouseResponse {
  /**
   * Id for the SQL warehouse. This value is unique across all SQL warehouses.
   */
  @JsonProperty("id")
  private String id;
  
  public CreateWarehouseResponse setId(String id) {
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
    CreateWarehouseResponse that = (CreateWarehouseResponse) o;
    return Objects.equals(id, that.id)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWarehouseResponse.class)
      .add("id", id).toString();
  }
}
