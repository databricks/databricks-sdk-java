// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Table {
  /**
   * The access modes supported for this table (e.g., "url", "dir"). Used for open sharing to
   * indicate how the table can be accessed.
   */
  @JsonProperty("access_modes")
  private Collection<String> accessModes;

  /** The comment of the table. */
  @JsonProperty("comment")
  private String comment;

  /** The id of the table. */
  @JsonProperty("id")
  private String id;

  /** Internal information for D2D sharing that should not be disclosed to external users. */
  @JsonProperty("internal_attributes")
  private TableInternalAttributes internalAttributes;

  /** The catalog and schema of the materialized table */
  @JsonProperty("materialization_namespace")
  private String materializationNamespace;

  /** The name of a materialized table. */
  @JsonProperty("materialized_table_name")
  private String materializedTableName;

  /** The name of the table. */
  @JsonProperty("name")
  private String name;

  /** The name of the schema that the table belongs to. */
  @JsonProperty("schema")
  private String schema;

  /** The name of the share that the table belongs to. */
  @JsonProperty("share")
  private String share;

  /** The id of the share that the table belongs to. */
  @JsonProperty("share_id")
  private String shareId;

  /** The cloud storage location of the table for open sharing. */
  @JsonProperty("storage_location")
  private String storageLocation;

  /** The Tags of the table. */
  @JsonProperty("tags")
  private Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags;

  public Table setAccessModes(Collection<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  public Collection<String> getAccessModes() {
    return accessModes;
  }

  public Table setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public Table setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Table setInternalAttributes(TableInternalAttributes internalAttributes) {
    this.internalAttributes = internalAttributes;
    return this;
  }

  public TableInternalAttributes getInternalAttributes() {
    return internalAttributes;
  }

  public Table setMaterializationNamespace(String materializationNamespace) {
    this.materializationNamespace = materializationNamespace;
    return this;
  }

  public String getMaterializationNamespace() {
    return materializationNamespace;
  }

  public Table setMaterializedTableName(String materializedTableName) {
    this.materializedTableName = materializedTableName;
    return this;
  }

  public String getMaterializedTableName() {
    return materializedTableName;
  }

  public Table setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Table setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public Table setShare(String share) {
    this.share = share;
    return this;
  }

  public String getShare() {
    return share;
  }

  public Table setShareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  public String getShareId() {
    return shareId;
  }

  public Table setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public Table setTags(Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<com.databricks.sdk.service.catalog.TagKeyValue> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Table that = (Table) o;
    return Objects.equals(accessModes, that.accessModes)
        && Objects.equals(comment, that.comment)
        && Objects.equals(id, that.id)
        && Objects.equals(internalAttributes, that.internalAttributes)
        && Objects.equals(materializationNamespace, that.materializationNamespace)
        && Objects.equals(materializedTableName, that.materializedTableName)
        && Objects.equals(name, that.name)
        && Objects.equals(schema, that.schema)
        && Objects.equals(share, that.share)
        && Objects.equals(shareId, that.shareId)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessModes,
        comment,
        id,
        internalAttributes,
        materializationNamespace,
        materializedTableName,
        name,
        schema,
        share,
        shareId,
        storageLocation,
        tags);
  }

  @Override
  public String toString() {
    return new ToStringer(Table.class)
        .add("accessModes", accessModes)
        .add("comment", comment)
        .add("id", id)
        .add("internalAttributes", internalAttributes)
        .add("materializationNamespace", materializationNamespace)
        .add("materializedTableName", materializedTableName)
        .add("name", name)
        .add("schema", schema)
        .add("share", share)
        .add("shareId", shareId)
        .add("storageLocation", storageLocation)
        .add("tags", tags)
        .toString();
  }
}
