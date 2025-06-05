// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CleanRoomOutputCatalogPb {
  @JsonProperty("catalog_name")
  private String catalogName;

  @JsonProperty("status")
  private CleanRoomOutputCatalogOutputCatalogStatus status;

  public CleanRoomOutputCatalogPb setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CleanRoomOutputCatalogPb setStatus(CleanRoomOutputCatalogOutputCatalogStatus status) {
    this.status = status;
    return this;
  }

  public CleanRoomOutputCatalogOutputCatalogStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomOutputCatalogPb that = (CleanRoomOutputCatalogPb) o;
    return Objects.equals(catalogName, that.catalogName) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, status);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomOutputCatalogPb.class)
        .add("catalogName", catalogName)
        .add("status", status)
        .toString();
  }
}
