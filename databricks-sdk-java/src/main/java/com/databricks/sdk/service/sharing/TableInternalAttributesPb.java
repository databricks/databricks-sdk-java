// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Internal information for D2D sharing that should not be disclosed to external users. */
@Generated
class TableInternalAttributesPb {
  @JsonProperty("parent_storage_location")
  private String parentStorageLocation;

  @JsonProperty("storage_location")
  private String storageLocation;

  @JsonProperty("type")
  private TableInternalAttributesSharedTableType typeValue;

  @JsonProperty("view_definition")
  private String viewDefinition;

  public TableInternalAttributesPb setParentStorageLocation(String parentStorageLocation) {
    this.parentStorageLocation = parentStorageLocation;
    return this;
  }

  public String getParentStorageLocation() {
    return parentStorageLocation;
  }

  public TableInternalAttributesPb setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public TableInternalAttributesPb setType(TableInternalAttributesSharedTableType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public TableInternalAttributesSharedTableType getType() {
    return typeValue;
  }

  public TableInternalAttributesPb setViewDefinition(String viewDefinition) {
    this.viewDefinition = viewDefinition;
    return this;
  }

  public String getViewDefinition() {
    return viewDefinition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableInternalAttributesPb that = (TableInternalAttributesPb) o;
    return Objects.equals(parentStorageLocation, that.parentStorageLocation)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(viewDefinition, that.viewDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentStorageLocation, storageLocation, typeValue, viewDefinition);
  }

  @Override
  public String toString() {
    return new ToStringer(TableInternalAttributesPb.class)
        .add("parentStorageLocation", parentStorageLocation)
        .add("storageLocation", storageLocation)
        .add("typeValue", typeValue)
        .add("viewDefinition", viewDefinition)
        .toString();
  }
}
