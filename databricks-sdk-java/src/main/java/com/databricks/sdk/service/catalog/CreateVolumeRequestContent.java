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
@JsonSerialize(using = CreateVolumeRequestContent.CreateVolumeRequestContentSerializer.class)
@JsonDeserialize(using = CreateVolumeRequestContent.CreateVolumeRequestContentDeserializer.class)
public class CreateVolumeRequestContent {
  /** The name of the catalog where the schema and the volume are */
  private String catalogName;

  /** The comment attached to the volume */
  private String comment;

  /** The name of the volume */
  private String name;

  /** The name of the schema where the volume is */
  private String schemaName;

  /** The storage location on the cloud */
  private String storageLocation;

  /**
   * The type of the volume. An external volume is located in the specified external location. A
   * managed volume is located in the default location which is specified by the parent schema, or
   * the parent catalog, or the Metastore. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/aws/en/volumes/managed-vs-external
   */
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

  CreateVolumeRequestContentPb toPb() {
    CreateVolumeRequestContentPb pb = new CreateVolumeRequestContentPb();
    pb.setCatalogName(catalogName);
    pb.setComment(comment);
    pb.setName(name);
    pb.setSchemaName(schemaName);
    pb.setStorageLocation(storageLocation);
    pb.setVolumeType(volumeType);

    return pb;
  }

  static CreateVolumeRequestContent fromPb(CreateVolumeRequestContentPb pb) {
    CreateVolumeRequestContent model = new CreateVolumeRequestContent();
    model.setCatalogName(pb.getCatalogName());
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setSchemaName(pb.getSchemaName());
    model.setStorageLocation(pb.getStorageLocation());
    model.setVolumeType(pb.getVolumeType());

    return model;
  }

  public static class CreateVolumeRequestContentSerializer
      extends JsonSerializer<CreateVolumeRequestContent> {
    @Override
    public void serialize(
        CreateVolumeRequestContent value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateVolumeRequestContentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateVolumeRequestContentDeserializer
      extends JsonDeserializer<CreateVolumeRequestContent> {
    @Override
    public CreateVolumeRequestContent deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateVolumeRequestContentPb pb = mapper.readValue(p, CreateVolumeRequestContentPb.class);
      return CreateVolumeRequestContent.fromPb(pb);
    }
  }
}
