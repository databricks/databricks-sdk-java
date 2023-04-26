// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateVolumeRequestContent class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>catalogName</code>.</p>
   *
   * @param catalogName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateVolumeRequestContent} object
   */
  public CreateVolumeRequestContent setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalogName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateVolumeRequestContent} object
   */
  public CreateVolumeRequestContent setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateVolumeRequestContent} object
   */
  public CreateVolumeRequestContent setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>schemaName</code>.</p>
   *
   * @param schemaName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateVolumeRequestContent} object
   */
  public CreateVolumeRequestContent setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * <p>Getter for the field <code>schemaName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSchemaName() {
    return schemaName;
  }

  /**
   * <p>Setter for the field <code>storageLocation</code>.</p>
   *
   * @param storageLocation a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateVolumeRequestContent} object
   */
  public CreateVolumeRequestContent setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageLocation</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageLocation() {
    return storageLocation;
  }

  /**
   * <p>Setter for the field <code>volumeType</code>.</p>
   *
   * @param volumeType a {@link com.databricks.sdk.service.catalog.VolumeType} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateVolumeRequestContent} object
   */
  public CreateVolumeRequestContent setVolumeType(VolumeType volumeType) {
    this.volumeType = volumeType;
    return this;
  }

  /**
   * <p>Getter for the field <code>volumeType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.VolumeType} object
   */
  public VolumeType getVolumeType() {
    return volumeType;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(catalogName, comment, name, schemaName, storageLocation, volumeType);
  }

  /** {@inheritDoc} */
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
