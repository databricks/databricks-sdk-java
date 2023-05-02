// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateVolumeRequestContent {
  /** The name of the catalog where the schema and the volume are */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The comment attached to the volume */
  @JsonProperty("comment")
  private String comment;

  /** The name of the volume */
  @JsonProperty("name")
  private String name;

  /** The name of the schema where the volume is */
  @JsonProperty("schema_name")
  private String schemaName;

  /** The storage location on the cloud */
  @JsonProperty("storage_location")
  private String storageLocation;

  /** */
  @JsonProperty("volume_type")
  private VolumeType volumeType;

  public CreateVolumeRequestContent setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CreateVolumeRequestContent setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateVolumeRequestContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateVolumeRequestContent setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public CreateVolumeRequestContent setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public CreateVolumeRequestContent setVolumeType(VolumeType volumeType) {
    this.volumeType = volumeType;
    return this;
  }

  public VolumeType getVolumeType() {
    return volumeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateVolumeRequestContent that = (CreateVolumeRequestContent) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(volumeType, that.volumeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, comment, name, schemaName, storageLocation, volumeType);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVolumeRequestContent.class)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("name", name)
        .add("schemaName", schemaName)
        .add("storageLocation", storageLocation)
        .add("volumeType", volumeType)
        .toString();
  }
}
