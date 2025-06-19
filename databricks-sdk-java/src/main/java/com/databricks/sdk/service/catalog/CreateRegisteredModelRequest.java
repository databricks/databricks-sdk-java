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
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateRegisteredModelRequest.CreateRegisteredModelRequestSerializer.class)
@JsonDeserialize(
    using = CreateRegisteredModelRequest.CreateRegisteredModelRequestDeserializer.class)
public class CreateRegisteredModelRequest {
  /** The name of the catalog where the schema and the registered model reside */
  private String catalogName;

  /** The comment attached to the registered model */
  private String comment;

  /** The name of the registered model */
  private String name;

  /** The name of the schema where the registered model resides */
  private String schemaName;

  /** The storage location on the cloud under which model version data files are stored */
  private String storageLocation;

  public CreateRegisteredModelRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CreateRegisteredModelRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateRegisteredModelRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateRegisteredModelRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public CreateRegisteredModelRequest setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateRegisteredModelRequest that = (CreateRegisteredModelRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(storageLocation, that.storageLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, comment, name, schemaName, storageLocation);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRegisteredModelRequest.class)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("name", name)
        .add("schemaName", schemaName)
        .add("storageLocation", storageLocation)
        .toString();
  }

  CreateRegisteredModelRequestPb toPb() {
    CreateRegisteredModelRequestPb pb = new CreateRegisteredModelRequestPb();
    pb.setCatalogName(catalogName);
    pb.setComment(comment);
    pb.setName(name);
    pb.setSchemaName(schemaName);
    pb.setStorageLocation(storageLocation);

    return pb;
  }

  static CreateRegisteredModelRequest fromPb(CreateRegisteredModelRequestPb pb) {
    CreateRegisteredModelRequest model = new CreateRegisteredModelRequest();
    model.setCatalogName(pb.getCatalogName());
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setSchemaName(pb.getSchemaName());
    model.setStorageLocation(pb.getStorageLocation());

    return model;
  }

  public static class CreateRegisteredModelRequestSerializer
      extends JsonSerializer<CreateRegisteredModelRequest> {
    @Override
    public void serialize(
        CreateRegisteredModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateRegisteredModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateRegisteredModelRequestDeserializer
      extends JsonDeserializer<CreateRegisteredModelRequest> {
    @Override
    public CreateRegisteredModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateRegisteredModelRequestPb pb = mapper.readValue(p, CreateRegisteredModelRequestPb.class);
      return CreateRegisteredModelRequest.fromPb(pb);
    }
  }
}
