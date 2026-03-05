// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Table {
  /** The comment of the table. */
  @JsonProperty("comment")
  private String comment;

  /** The id of the table. */
  @JsonProperty("id")
  private String id;

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

  /** The Tags of the table. */
  @JsonProperty("tags")
  private Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags;

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
    return Objects.equals(comment, that.comment)
        && Objects.equals(id, that.id)
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
    return new ToStringer(Table.class)
        .add("comment", comment)
        .add("id", id)
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
