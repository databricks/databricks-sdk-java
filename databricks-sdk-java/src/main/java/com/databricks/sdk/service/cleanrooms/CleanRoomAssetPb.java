// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Metadata of the clean room asset */
@Generated
class CleanRoomAssetPb {
  @JsonProperty("added_at")
  private Long addedAt;

  @JsonProperty("asset_type")
  private CleanRoomAssetAssetType assetType;

  @JsonProperty("foreign_table")
  private CleanRoomAssetForeignTable foreignTable;

  @JsonProperty("foreign_table_local_details")
  private CleanRoomAssetForeignTableLocalDetails foreignTableLocalDetails;

  @JsonProperty("name")
  private String name;

  @JsonProperty("notebook")
  private CleanRoomAssetNotebook notebook;

  @JsonProperty("owner_collaborator_alias")
  private String ownerCollaboratorAlias;

  @JsonProperty("status")
  private CleanRoomAssetStatusEnum status;

  @JsonProperty("table")
  private CleanRoomAssetTable table;

  @JsonProperty("table_local_details")
  private CleanRoomAssetTableLocalDetails tableLocalDetails;

  @JsonProperty("view")
  private CleanRoomAssetView view;

  @JsonProperty("view_local_details")
  private CleanRoomAssetViewLocalDetails viewLocalDetails;

  @JsonProperty("volume_local_details")
  private CleanRoomAssetVolumeLocalDetails volumeLocalDetails;

  public CleanRoomAssetPb setAddedAt(Long addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  public Long getAddedAt() {
    return addedAt;
  }

  public CleanRoomAssetPb setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public CleanRoomAssetPb setForeignTable(CleanRoomAssetForeignTable foreignTable) {
    this.foreignTable = foreignTable;
    return this;
  }

  public CleanRoomAssetForeignTable getForeignTable() {
    return foreignTable;
  }

  public CleanRoomAssetPb setForeignTableLocalDetails(
      CleanRoomAssetForeignTableLocalDetails foreignTableLocalDetails) {
    this.foreignTableLocalDetails = foreignTableLocalDetails;
    return this;
  }

  public CleanRoomAssetForeignTableLocalDetails getForeignTableLocalDetails() {
    return foreignTableLocalDetails;
  }

  public CleanRoomAssetPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CleanRoomAssetPb setNotebook(CleanRoomAssetNotebook notebook) {
    this.notebook = notebook;
    return this;
  }

  public CleanRoomAssetNotebook getNotebook() {
    return notebook;
  }

  public CleanRoomAssetPb setOwnerCollaboratorAlias(String ownerCollaboratorAlias) {
    this.ownerCollaboratorAlias = ownerCollaboratorAlias;
    return this;
  }

  public String getOwnerCollaboratorAlias() {
    return ownerCollaboratorAlias;
  }

  public CleanRoomAssetPb setStatus(CleanRoomAssetStatusEnum status) {
    this.status = status;
    return this;
  }

  public CleanRoomAssetStatusEnum getStatus() {
    return status;
  }

  public CleanRoomAssetPb setTable(CleanRoomAssetTable table) {
    this.table = table;
    return this;
  }

  public CleanRoomAssetTable getTable() {
    return table;
  }

  public CleanRoomAssetPb setTableLocalDetails(CleanRoomAssetTableLocalDetails tableLocalDetails) {
    this.tableLocalDetails = tableLocalDetails;
    return this;
  }

  public CleanRoomAssetTableLocalDetails getTableLocalDetails() {
    return tableLocalDetails;
  }

  public CleanRoomAssetPb setView(CleanRoomAssetView view) {
    this.view = view;
    return this;
  }

  public CleanRoomAssetView getView() {
    return view;
  }

  public CleanRoomAssetPb setViewLocalDetails(CleanRoomAssetViewLocalDetails viewLocalDetails) {
    this.viewLocalDetails = viewLocalDetails;
    return this;
  }

  public CleanRoomAssetViewLocalDetails getViewLocalDetails() {
    return viewLocalDetails;
  }

  public CleanRoomAssetPb setVolumeLocalDetails(
      CleanRoomAssetVolumeLocalDetails volumeLocalDetails) {
    this.volumeLocalDetails = volumeLocalDetails;
    return this;
  }

  public CleanRoomAssetVolumeLocalDetails getVolumeLocalDetails() {
    return volumeLocalDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetPb that = (CleanRoomAssetPb) o;
    return Objects.equals(addedAt, that.addedAt)
        && Objects.equals(assetType, that.assetType)
        && Objects.equals(foreignTable, that.foreignTable)
        && Objects.equals(foreignTableLocalDetails, that.foreignTableLocalDetails)
        && Objects.equals(name, that.name)
        && Objects.equals(notebook, that.notebook)
        && Objects.equals(ownerCollaboratorAlias, that.ownerCollaboratorAlias)
        && Objects.equals(status, that.status)
        && Objects.equals(table, that.table)
        && Objects.equals(tableLocalDetails, that.tableLocalDetails)
        && Objects.equals(view, that.view)
        && Objects.equals(viewLocalDetails, that.viewLocalDetails)
        && Objects.equals(volumeLocalDetails, that.volumeLocalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        addedAt,
        assetType,
        foreignTable,
        foreignTableLocalDetails,
        name,
        notebook,
        ownerCollaboratorAlias,
        status,
        table,
        tableLocalDetails,
        view,
        viewLocalDetails,
        volumeLocalDetails);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetPb.class)
        .add("addedAt", addedAt)
        .add("assetType", assetType)
        .add("foreignTable", foreignTable)
        .add("foreignTableLocalDetails", foreignTableLocalDetails)
        .add("name", name)
        .add("notebook", notebook)
        .add("ownerCollaboratorAlias", ownerCollaboratorAlias)
        .add("status", status)
        .add("table", table)
        .add("tableLocalDetails", tableLocalDetails)
        .add("view", view)
        .add("viewLocalDetails", viewLocalDetails)
        .add("volumeLocalDetails", volumeLocalDetails)
        .toString();
  }
}
