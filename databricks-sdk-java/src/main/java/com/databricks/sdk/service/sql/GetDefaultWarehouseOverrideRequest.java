// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetDefaultWarehouseOverrideRequest {
  /**
   * Required. The resource name of the default warehouse override to retrieve. Format:
   * default-warehouse-overrides/{default_warehouse_override_id} The default_warehouse_override_id
   * can be a numeric user ID or the literal string "me" for the current user.
   */
  @JsonIgnore private String name;

  public GetDefaultWarehouseOverrideRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetDefaultWarehouseOverrideRequest that = (GetDefaultWarehouseOverrideRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDefaultWarehouseOverrideRequest.class).add("name", name).toString();
  }
}
