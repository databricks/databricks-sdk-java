// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Internal information for D2D sharing that should not be disclosed to external users. */
@Generated
public class TableInternalAttributes {
  /** Managed Delta Metadata location for foreign iceberg tables. */
  @JsonProperty("auxiliary_managed_location")
  private String auxiliaryManagedLocation;

  /**
   * Will be populated in the reconciliation response for VIEW and FOREIGN_TABLE, with the value of
   * the parent UC entity's storage_location, following the same logic as getManagedEntityPath in
   * CreateStagingTableHandler, which is used to store the materialized table for a shared
   * VIEW/FOREIGN_TABLE for D2O queries. The value will be used on the recipient side to be
   * whitelisted when SEG is enabled on the workspace of the recipient, to allow the recipient users
   * to query this shared VIEW/FOREIGN_TABLE.
   */
  @JsonProperty("parent_storage_location")
  private String parentStorageLocation;

  /** The cloud storage location of a shard table with DIRECTORY_BASED_TABLE type. */
  @JsonProperty("storage_location")
  private String storageLocation;

  /** The type of the shared table. */
  @JsonProperty("type")
  private TableInternalAttributesSharedTableType typeValue;

  /** The view definition of a shared view. DEPRECATED. */
  @JsonProperty("view_definition")
  private String viewDefinition;

  public TableInternalAttributes setAuxiliaryManagedLocation(String auxiliaryManagedLocation) {
    this.auxiliaryManagedLocation = auxiliaryManagedLocation;
    return this;
  }

  public String getAuxiliaryManagedLocation() {
    return auxiliaryManagedLocation;
  }

  public TableInternalAttributes setParentStorageLocation(String parentStorageLocation) {
    this.parentStorageLocation = parentStorageLocation;
    return this;
  }

  public String getParentStorageLocation() {
    return parentStorageLocation;
  }

  public TableInternalAttributes setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public TableInternalAttributes setType(TableInternalAttributesSharedTableType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public TableInternalAttributesSharedTableType getType() {
    return typeValue;
  }

  public TableInternalAttributes setViewDefinition(String viewDefinition) {
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
    TableInternalAttributes that = (TableInternalAttributes) o;
    return Objects.equals(auxiliaryManagedLocation, that.auxiliaryManagedLocation)
        && Objects.equals(parentStorageLocation, that.parentStorageLocation)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(viewDefinition, that.viewDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        auxiliaryManagedLocation,
        parentStorageLocation,
        storageLocation,
        typeValue,
        viewDefinition);
  }

  @Override
  public String toString() {
    return new ToStringer(TableInternalAttributes.class)
        .add("auxiliaryManagedLocation", auxiliaryManagedLocation)
        .add("parentStorageLocation", parentStorageLocation)
        .add("storageLocation", storageLocation)
        .add("typeValue", typeValue)
        .add("viewDefinition", viewDefinition)
        .toString();
  }
}
