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

/** Create an output catalog */
@Generated
@JsonSerialize(
    using = CreateCleanRoomOutputCatalogRequest.CreateCleanRoomOutputCatalogRequestSerializer.class)
@JsonDeserialize(
    using =
        CreateCleanRoomOutputCatalogRequest.CreateCleanRoomOutputCatalogRequestDeserializer.class)
public class CreateCleanRoomOutputCatalogRequest {
  /** Name of the clean room. */
  private String cleanRoomName;

  /** */
  private CleanRoomOutputCatalog outputCatalog;

  public CreateCleanRoomOutputCatalogRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public CreateCleanRoomOutputCatalogRequest setOutputCatalog(
      CleanRoomOutputCatalog outputCatalog) {
    this.outputCatalog = outputCatalog;
    return this;
  }

  public CleanRoomOutputCatalog getOutputCatalog() {
    return outputCatalog;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCleanRoomOutputCatalogRequest that = (CreateCleanRoomOutputCatalogRequest) o;
    return Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(outputCatalog, that.outputCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomName, outputCatalog);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoomOutputCatalogRequest.class)
        .add("cleanRoomName", cleanRoomName)
        .add("outputCatalog", outputCatalog)
        .toString();
  }

  CreateCleanRoomOutputCatalogRequestPb toPb() {
    CreateCleanRoomOutputCatalogRequestPb pb = new CreateCleanRoomOutputCatalogRequestPb();
    pb.setCleanRoomName(cleanRoomName);
    pb.setOutputCatalog(outputCatalog);

    return pb;
  }

  static CreateCleanRoomOutputCatalogRequest fromPb(CreateCleanRoomOutputCatalogRequestPb pb) {
    CreateCleanRoomOutputCatalogRequest model = new CreateCleanRoomOutputCatalogRequest();
    model.setCleanRoomName(pb.getCleanRoomName());
    model.setOutputCatalog(pb.getOutputCatalog());

    return model;
  }

  public static class CreateCleanRoomOutputCatalogRequestSerializer
      extends JsonSerializer<CreateCleanRoomOutputCatalogRequest> {
    @Override
    public void serialize(
        CreateCleanRoomOutputCatalogRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCleanRoomOutputCatalogRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCleanRoomOutputCatalogRequestDeserializer
      extends JsonDeserializer<CreateCleanRoomOutputCatalogRequest> {
    @Override
    public CreateCleanRoomOutputCatalogRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCleanRoomOutputCatalogRequestPb pb =
          mapper.readValue(p, CreateCleanRoomOutputCatalogRequestPb.class);
      return CreateCleanRoomOutputCatalogRequest.fromPb(pb);
    }
  }
}
