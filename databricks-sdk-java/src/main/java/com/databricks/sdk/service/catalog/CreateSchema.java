// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateSchema.CreateSchemaSerializer.class)
@JsonDeserialize(using = CreateSchema.CreateSchemaDeserializer.class)
public class CreateSchema {
  /** Name of parent catalog. */
  private String catalogName;

  /** User-provided free-form text description. */
  private String comment;

  /** Name of schema, relative to parent catalog. */
  private String name;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> properties;

  /** Storage root URL for managed tables within schema. */
  private String storageRoot;

  public CreateSchema setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CreateSchema setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateSchema setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateSchema setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CreateSchema setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSchema that = (CreateSchema) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(properties, that.properties)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, comment, name, properties, storageRoot);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSchema.class)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("name", name)
        .add("properties", properties)
        .add("storageRoot", storageRoot)
        .toString();
  }

  CreateSchemaPb toPb() {
    CreateSchemaPb pb = new CreateSchemaPb();
    pb.setCatalogName(catalogName);
    pb.setComment(comment);
    pb.setName(name);
    pb.setProperties(properties);
    pb.setStorageRoot(storageRoot);

    return pb;
  }

  static CreateSchema fromPb(CreateSchemaPb pb) {
    CreateSchema model = new CreateSchema();
    model.setCatalogName(pb.getCatalogName());
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setProperties(pb.getProperties());
    model.setStorageRoot(pb.getStorageRoot());

    return model;
  }

  public static class CreateSchemaSerializer extends JsonSerializer<CreateSchema> {
    @Override
    public void serialize(CreateSchema value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateSchemaPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateSchemaDeserializer extends JsonDeserializer<CreateSchema> {
    @Override
    public CreateSchema deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateSchemaPb pb = mapper.readValue(p, CreateSchemaPb.class);
      return CreateSchema.fromPb(pb);
    }
  }
}
