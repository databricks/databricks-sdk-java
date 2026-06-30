// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDefaultWarehouseOverrideRequest {
  /** Required. The default warehouse override to create. */
  @JsonProperty("default_warehouse_override")
  private DefaultWarehouseOverride defaultWarehouseOverride;

  /**
   * Required. The ID to use for the override, which will become the final component of the
   * override's resource name. Can be a numeric user ID or the literal string "me" for the current
   * user.
   */
  @JsonIgnore
  @QueryParam("default_warehouse_override_id")
  private String defaultWarehouseOverrideId;

  public CreateDefaultWarehouseOverrideRequest setDefaultWarehouseOverride(
      DefaultWarehouseOverride defaultWarehouseOverride) {
    this.defaultWarehouseOverride = defaultWarehouseOverride;
    return this;
  }

  public DefaultWarehouseOverride getDefaultWarehouseOverride() {
    return defaultWarehouseOverride;
  }

  public CreateDefaultWarehouseOverrideRequest setDefaultWarehouseOverrideId(
      String defaultWarehouseOverrideId) {
    this.defaultWarehouseOverrideId = defaultWarehouseOverrideId;
    return this;
  }

  public String getDefaultWarehouseOverrideId() {
    return defaultWarehouseOverrideId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDefaultWarehouseOverrideRequest that = (CreateDefaultWarehouseOverrideRequest) o;
    return Objects.equals(defaultWarehouseOverride, that.defaultWarehouseOverride)
        && Objects.equals(defaultWarehouseOverrideId, that.defaultWarehouseOverrideId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWarehouseOverride, defaultWarehouseOverrideId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDefaultWarehouseOverrideRequest.class)
        .add("defaultWarehouseOverride", defaultWarehouseOverride)
        .add("defaultWarehouseOverrideId", defaultWarehouseOverrideId)
        .toString();
  }
}
