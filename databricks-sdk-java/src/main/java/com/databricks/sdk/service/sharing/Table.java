// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = Table.TableSerializer.class)
@JsonDeserialize(using = Table.TableDeserializer.class)
public class Table {
  /** The comment of the table. */
  private String comment;

  /** The id of the table. */
  private String id;

  /** Internal information for D2D sharing that should not be disclosed to external users. */
  private TableInternalAttributes internalAttributes;

  /** The catalog and schema of the materialized table */
  private String materializationNamespace;

  /** The name of a materialized table. */
  private String materializedTableName;

  /** The name of the table. */
  private String name;

  /** The name of the schema that the table belongs to. */
  private String schema;

  /** The name of the share that the table belongs to. */
  private String share;

  /** The id of the share that the table belongs to. */
  private String shareId;

  /** The Tags of the table. */
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
    return new ToStringer(Table.class)
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

  TablePb toPb() {
    TablePb pb = new TablePb();
    pb.setComment(comment);
    pb.setId(id);
    pb.setInternalAttributes(internalAttributes);
    pb.setMaterializationNamespace(materializationNamespace);
    pb.setMaterializedTableName(materializedTableName);
    pb.setName(name);
    pb.setSchema(schema);
    pb.setShare(share);
    pb.setShareId(shareId);
    pb.setTags(tags);

    return pb;
  }

  static Table fromPb(TablePb pb) {
    Table model = new Table();
    model.setComment(pb.getComment());
    model.setId(pb.getId());
    model.setInternalAttributes(pb.getInternalAttributes());
    model.setMaterializationNamespace(pb.getMaterializationNamespace());
    model.setMaterializedTableName(pb.getMaterializedTableName());
    model.setName(pb.getName());
    model.setSchema(pb.getSchema());
    model.setShare(pb.getShare());
    model.setShareId(pb.getShareId());
    model.setTags(pb.getTags());

    return model;
  }

  public static class TableSerializer extends JsonSerializer<Table> {
    @Override
    public void serialize(Table value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TablePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TableDeserializer extends JsonDeserializer<Table> {
    @Override
    public Table deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TablePb pb = mapper.readValue(p, TablePb.class);
      return Table.fromPb(pb);
    }
  }
}
