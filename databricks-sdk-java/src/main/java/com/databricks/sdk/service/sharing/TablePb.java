// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class TablePb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("id")
  private String id;

  @JsonProperty("internal_attributes")
  private TableInternalAttributes internalAttributes;

  @JsonProperty("materialization_namespace")
  private String materializationNamespace;

  @JsonProperty("materialized_table_name")
  private String materializedTableName;

  @JsonProperty("name")
  private String name;

  @JsonProperty("schema")
  private String schema;

  @JsonProperty("share")
  private String share;

  @JsonProperty("share_id")
  private String shareId;

  @JsonProperty("tags")
  private Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags;

  public TablePb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public TablePb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public TablePb setInternalAttributes(TableInternalAttributes internalAttributes) {
    this.internalAttributes = internalAttributes;
    return this;
  }

  public TableInternalAttributes getInternalAttributes() {
    return internalAttributes;
  }

  public TablePb setMaterializationNamespace(String materializationNamespace) {
    this.materializationNamespace = materializationNamespace;
    return this;
  }

  public String getMaterializationNamespace() {
    return materializationNamespace;
  }

  public TablePb setMaterializedTableName(String materializedTableName) {
    this.materializedTableName = materializedTableName;
    return this;
  }

  public String getMaterializedTableName() {
    return materializedTableName;
  }

  public TablePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public TablePb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public TablePb setShare(String share) {
    this.share = share;
    return this;
  }

  public String getShare() {
    return share;
  }

  public TablePb setShareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  public String getShareId() {
    return shareId;
  }

  public TablePb setTags(Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags) {
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
    TablePb that = (TablePb) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(id, that.id)
        && Objects.equals(internalAttributes, that.internalAttributes)
        && Objects.equals(materializationNamespace, that.materializationNamespace)
        && Objects.equals(materializedTableName, that.materializedTableName)
        && Objects.equals(name, that.name)
        && Objects.equals(schema, that.schema)
        && Objects.equals(share, that.share)
        && Objects.equals(shareId, that.shareId)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        id,
        internalAttributes,
        materializationNamespace,
        materializedTableName,
        name,
        schema,
        share,
        shareId,
        tags);
  }

  @Override
  public String toString() {
    return new ToStringer(TablePb.class)
        .add("comment", comment)
        .add("id", id)
        .add("internalAttributes", internalAttributes)
        .add("materializationNamespace", materializationNamespace)
        .add("materializedTableName", materializedTableName)
        .add("name", name)
        .add("schema", schema)
        .add("share", share)
        .add("shareId", shareId)
        .add("tags", tags)
        .toString();
  }
}
