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

@Generated
@JsonSerialize(
    using =
        CreateCleanRoomOutputCatalogResponse.CreateCleanRoomOutputCatalogResponseSerializer.class)
@JsonDeserialize(
    using =
        CreateCleanRoomOutputCatalogResponse.CreateCleanRoomOutputCatalogResponseDeserializer.class)
public class CreateCleanRoomOutputCatalogResponse {
  /** */
  private CleanRoomOutputCatalog outputCatalog;

  public CreateCleanRoomOutputCatalogResponse setOutputCatalog(
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
    CreateCleanRoomOutputCatalogResponse that = (CreateCleanRoomOutputCatalogResponse) o;
    return Objects.equals(outputCatalog, that.outputCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputCatalog);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoomOutputCatalogResponse.class)
        .add("outputCatalog", outputCatalog)
        .toString();
  }

  CreateCleanRoomOutputCatalogResponsePb toPb() {
    CreateCleanRoomOutputCatalogResponsePb pb = new CreateCleanRoomOutputCatalogResponsePb();
    pb.setOutputCatalog(outputCatalog);

    return pb;
  }

  static CreateCleanRoomOutputCatalogResponse fromPb(CreateCleanRoomOutputCatalogResponsePb pb) {
    CreateCleanRoomOutputCatalogResponse model = new CreateCleanRoomOutputCatalogResponse();
    model.setOutputCatalog(pb.getOutputCatalog());

    return model;
  }

  public static class CreateCleanRoomOutputCatalogResponseSerializer
      extends JsonSerializer<CreateCleanRoomOutputCatalogResponse> {
    @Override
    public void serialize(
        CreateCleanRoomOutputCatalogResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCleanRoomOutputCatalogResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCleanRoomOutputCatalogResponseDeserializer
      extends JsonDeserializer<CreateCleanRoomOutputCatalogResponse> {
    @Override
    public CreateCleanRoomOutputCatalogResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCleanRoomOutputCatalogResponsePb pb =
          mapper.readValue(p, CreateCleanRoomOutputCatalogResponsePb.class);
      return CreateCleanRoomOutputCatalogResponse.fromPb(pb);
    }
  }
}
