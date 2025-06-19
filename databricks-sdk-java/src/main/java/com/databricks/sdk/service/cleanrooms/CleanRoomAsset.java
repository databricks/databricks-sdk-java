// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

/** Metadata of the clean room asset */
@Generated
@JsonSerialize(using = CleanRoomAsset.CleanRoomAssetSerializer.class)
@JsonDeserialize(using = CleanRoomAsset.CleanRoomAssetDeserializer.class)
public class CleanRoomAsset {
  /** When the asset is added to the clean room, in epoch milliseconds. */
  private Long addedAt;

  /** The type of the asset. */
  private CleanRoomAssetAssetType assetType;

  /**
   * Foreign table details available to all collaborators of the clean room. Present if and only if
   * **asset_type** is **FOREIGN_TABLE**
   */
  private CleanRoomAssetForeignTable foreignTable;

  /**
   * Local details for a foreign that are only available to its owner. Present if and only if
   * **asset_type** is **FOREIGN_TABLE**
   */
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
  private String name;

  /**
   * Notebook details available to all collaborators of the clean room. Present if and only if
   * **asset_type** is **NOTEBOOK_FILE**
   */
  private CleanRoomAssetNotebook notebook;

  /** The alias of the collaborator who owns this asset */
  private String ownerCollaboratorAlias;

  /** Status of the asset */
  private CleanRoomAssetStatusEnum status;

  /**
   * Table details available to all collaborators of the clean room. Present if and only if
   * **asset_type** is **TABLE**
   */
  private CleanRoomAssetTable table;

  /**
   * Local details for a table that are only available to its owner. Present if and only if
   * **asset_type** is **TABLE**
   */
  private CleanRoomAssetTableLocalDetails tableLocalDetails;

  /**
   * View details available to all collaborators of the clean room. Present if and only if
   * **asset_type** is **VIEW**
   */
  private CleanRoomAssetView view;

  /**
   * Local details for a view that are only available to its owner. Present if and only if
   * **asset_type** is **VIEW**
   */
  private CleanRoomAssetViewLocalDetails viewLocalDetails;

  /**
   * Local details for a volume that are only available to its owner. Present if and only if
   * **asset_type** is **VOLUME**
   */
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
    return new ToStringer(CleanRoomAsset.class)
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

  CleanRoomAssetPb toPb() {
    CleanRoomAssetPb pb = new CleanRoomAssetPb();
    pb.setAddedAt(addedAt);
    pb.setAssetType(assetType);
    pb.setForeignTable(foreignTable);
    pb.setForeignTableLocalDetails(foreignTableLocalDetails);
    pb.setName(name);
    pb.setNotebook(notebook);
    pb.setOwnerCollaboratorAlias(ownerCollaboratorAlias);
    pb.setStatus(status);
    pb.setTable(table);
    pb.setTableLocalDetails(tableLocalDetails);
    pb.setView(view);
    pb.setViewLocalDetails(viewLocalDetails);
    pb.setVolumeLocalDetails(volumeLocalDetails);

    return pb;
  }

  static CleanRoomAsset fromPb(CleanRoomAssetPb pb) {
    CleanRoomAsset model = new CleanRoomAsset();
    model.setAddedAt(pb.getAddedAt());
    model.setAssetType(pb.getAssetType());
    model.setForeignTable(pb.getForeignTable());
    model.setForeignTableLocalDetails(pb.getForeignTableLocalDetails());
    model.setName(pb.getName());
    model.setNotebook(pb.getNotebook());
    model.setOwnerCollaboratorAlias(pb.getOwnerCollaboratorAlias());
    model.setStatus(pb.getStatus());
    model.setTable(pb.getTable());
    model.setTableLocalDetails(pb.getTableLocalDetails());
    model.setView(pb.getView());
    model.setViewLocalDetails(pb.getViewLocalDetails());
    model.setVolumeLocalDetails(pb.getVolumeLocalDetails());

    return model;
  }

  public static class CleanRoomAssetSerializer extends JsonSerializer<CleanRoomAsset> {
    @Override
    public void serialize(CleanRoomAsset value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomAssetPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomAssetDeserializer extends JsonDeserializer<CleanRoomAsset> {
    @Override
    public CleanRoomAsset deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomAssetPb pb = mapper.readValue(p, CleanRoomAssetPb.class);
      return CleanRoomAsset.fromPb(pb);
    }
  }
}
