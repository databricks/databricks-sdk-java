// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response message for ListDefaultWarehouseOverrides. */
@Generated
public class ListDefaultWarehouseOverridesResponse {
  /** The default warehouse overrides in the workspace. */
  @JsonProperty("default_warehouse_overrides")
  private Collection<DefaultWarehouseOverride> defaultWarehouseOverrides;

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDefaultWarehouseOverridesResponse setDefaultWarehouseOverrides(
      Collection<DefaultWarehouseOverride> defaultWarehouseOverrides) {
    this.defaultWarehouseOverrides = defaultWarehouseOverrides;
    return this;
  }

  public Collection<DefaultWarehouseOverride> getDefaultWarehouseOverrides() {
    return defaultWarehouseOverrides;
  }

  public ListDefaultWarehouseOverridesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDefaultWarehouseOverridesResponse that = (ListDefaultWarehouseOverridesResponse) o;
    return Objects.equals(defaultWarehouseOverrides, that.defaultWarehouseOverrides)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWarehouseOverrides, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDefaultWarehouseOverridesResponse.class)
        .add("defaultWarehouseOverrides", defaultWarehouseOverrides)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
