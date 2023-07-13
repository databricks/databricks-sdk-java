// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomCatalogUpdate {
  /** The name of the catalog to update assets. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The updates to the assets in the catalog. */
  @JsonProperty("updates")
  private SharedDataObjectUpdate updates;

  public CleanRoomCatalogUpdate setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CleanRoomCatalogUpdate setUpdates(SharedDataObjectUpdate updates) {
    this.updates = updates;
    return this;
  }

  public SharedDataObjectUpdate getUpdates() {
    return updates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomCatalogUpdate that = (CleanRoomCatalogUpdate) o;
    return Objects.equals(catalogName, that.catalogName) && Objects.equals(updates, that.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, updates);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomCatalogUpdate.class)
        .add("catalogName", catalogName)
        .add("updates", updates)
        .toString();
  }
}
