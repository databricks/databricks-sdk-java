// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Metadata of the clean room asset */
@Generated
public class CleanRoomAsset {
  /** When the asset is added to the clean room, in epoch milliseconds. */
  @JsonProperty("added_at")
  private Long addedAt;

  /** The type of the asset. */
  @JsonProperty("asset_type")
  private CleanRoomAssetAssetType assetType;

  /**
   * The name of the clean room this asset belongs to. This field is required for create operations
   * and populated by the server for responses.
   */
  @JsonProperty("clean_room_name")
  private String cleanRoomName;

  /**
   * Foreign table details available to all collaborators of the clean room. Present if and only if
   * **asset_type** is **FOREIGN_TABLE**
   */
  @JsonProperty("foreign_table")
  private CleanRoomAssetForeignTable foreignTable;

  /**
   * Local details for a foreign that are only available to its owner. Present if and only if
   * **asset_type** is **FOREIGN_TABLE**
   */
  @JsonProperty("foreign_table_local_details")
  private CleanRoomAssetForeignTableLocalDetails foreignTableLocalDetails;

  /**
   * A fully qualified name that uniquely identifies the asset within the clean room. This is also
   * the name displayed in the clean room UI.
   *
   * <p>For UC securable assets (tables, volumes, etc.), the format is
   * *shared_catalog*.*shared_schema*.*asset_name*
   *
   * <p>For notebooks, the name is the notebook file name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Notebook details available to all collaborators of the clean room. Present if and only if
   * **asset_type** is **NOTEBOOK_FILE**
   */
  @JsonProperty("notebook")
  private CleanRoomAssetNotebook notebook;

  /** The alias of the collaborator who owns this asset */
  @JsonProperty("owner_collaborator_alias")
  private String ownerCollaboratorAlias;

  /** Status of the asset */
  @JsonProperty("status")
  private CleanRoomAssetStatusEnum status;

  /**
   * Table details available to all collaborators of the clean room. Present if and only if
   * **asset_type** is **TABLE**
   */
  @JsonProperty("table")
  private CleanRoomAssetTable table;

  /**
   * Local details for a table that are only available to its owner. Present if and only if
   * **asset_type** is **TABLE**
   */
  @JsonProperty("table_local_details")
  private CleanRoomAssetTableLocalDetails tableLocalDetails;

  /**
   * View details available to all collaborators of the clean room. Present if and only if
   * **asset_type** is **VIEW**
   */
  @JsonProperty("view")
  private CleanRoomAssetView view;

  /**
   * Local details for a view that are only available to its owner. Present if and only if
   * **asset_type** is **VIEW**
   */
  @JsonProperty("view_local_details")
  private CleanRoomAssetViewLocalDetails viewLocalDetails;

  /**
   * Local details for a volume that are only available to its owner. Present if and only if
   * **asset_type** is **VOLUME**
   */
  @JsonProperty("volume_local_details")
  private CleanRoomAssetVolumeLocalDetails volumeLocalDetails;

  public CleanRoomAsset setAddedAt(Long addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  public Long getAddedAt() {
    return addedAt;
  }

  public CleanRoomAsset setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public CleanRoomAsset setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public CleanRoomAsset setForeignTable(CleanRoomAssetForeignTable foreignTable) {
    this.foreignTable = foreignTable;
    return this;
  }

  public CleanRoomAssetForeignTable getForeignTable() {
    return foreignTable;
  }

  public CleanRoomAsset setForeignTableLocalDetails(
      CleanRoomAssetForeignTableLocalDetails foreignTableLocalDetails) {
    this.foreignTableLocalDetails = foreignTableLocalDetails;
    return this;
  }

  public CleanRoomAssetForeignTableLocalDetails getForeignTableLocalDetails() {
    return foreignTableLocalDetails;
  }

  public CleanRoomAsset setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CleanRoomAsset setNotebook(CleanRoomAssetNotebook notebook) {
    this.notebook = notebook;
    return this;
  }

  public CleanRoomAssetNotebook getNotebook() {
    return notebook;
  }

  public CleanRoomAsset setOwnerCollaboratorAlias(String ownerCollaboratorAlias) {
    this.ownerCollaboratorAlias = ownerCollaboratorAlias;
    return this;
  }

  public String getOwnerCollaboratorAlias() {
    return ownerCollaboratorAlias;
  }

  public CleanRoomAsset setStatus(CleanRoomAssetStatusEnum status) {
    this.status = status;
    return this;
  }

  public CleanRoomAssetStatusEnum getStatus() {
    return status;
  }

  public CleanRoomAsset setTable(CleanRoomAssetTable table) {
    this.table = table;
    return this;
  }

  public CleanRoomAssetTable getTable() {
    return table;
  }

  public CleanRoomAsset setTableLocalDetails(CleanRoomAssetTableLocalDetails tableLocalDetails) {
    this.tableLocalDetails = tableLocalDetails;
    return this;
  }

  public CleanRoomAssetTableLocalDetails getTableLocalDetails() {
    return tableLocalDetails;
  }

  public CleanRoomAsset setView(CleanRoomAssetView view) {
    this.view = view;
    return this;
  }

  public CleanRoomAssetView getView() {
    return view;
  }

  public CleanRoomAsset setViewLocalDetails(CleanRoomAssetViewLocalDetails viewLocalDetails) {
    this.viewLocalDetails = viewLocalDetails;
    return this;
  }

  public CleanRoomAssetViewLocalDetails getViewLocalDetails() {
    return viewLocalDetails;
  }

  public CleanRoomAsset setVolumeLocalDetails(CleanRoomAssetVolumeLocalDetails volumeLocalDetails) {
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
    CleanRoomAsset that = (CleanRoomAsset) o;
    return Objects.equals(addedAt, that.addedAt)
        && Objects.equals(assetType, that.assetType)
        && Objects.equals(cleanRoomName, that.cleanRoomName)
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
        cleanRoomName,
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
    return new ToStringer(CleanRoomAsset.class)
        .add("addedAt", addedAt)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
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
