// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteDefaultWarehouseOverrideRequest {
  /**
   * Required. The resource name of the default warehouse override to delete. Format:
   * default-warehouse-overrides/{default_warehouse_override_id} The default_warehouse_override_id
   * can be a numeric user ID or the literal string "me" for the current user.
   */
  @JsonIgnore private String name;

  public DeleteDefaultWarehouseOverrideRequest setName(String name) {
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
    DeleteDefaultWarehouseOverrideRequest that = (DeleteDefaultWarehouseOverrideRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDefaultWarehouseOverrideRequest.class).add("name", name).toString();
  }
}
