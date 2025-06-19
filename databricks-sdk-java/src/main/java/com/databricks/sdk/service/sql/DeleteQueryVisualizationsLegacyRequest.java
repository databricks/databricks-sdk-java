// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** Remove visualization */
@Generated
@JsonSerialize(
    using =
        DeleteQueryVisualizationsLegacyRequest.DeleteQueryVisualizationsLegacyRequestSerializer
            .class)
@JsonDeserialize(
    using =
        DeleteQueryVisualizationsLegacyRequest.DeleteQueryVisualizationsLegacyRequestDeserializer
            .class)
public class DeleteQueryVisualizationsLegacyRequest {
  /** Widget ID returned by :method:queryvizualisations/create */
  private String id;

  public DeleteQueryVisualizationsLegacyRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteQueryVisualizationsLegacyRequest that = (DeleteQueryVisualizationsLegacyRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteQueryVisualizationsLegacyRequest.class).add("id", id).toString();
  }

  DeleteQueryVisualizationsLegacyRequestPb toPb() {
    DeleteQueryVisualizationsLegacyRequestPb pb = new DeleteQueryVisualizationsLegacyRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteQueryVisualizationsLegacyRequest fromPb(
      DeleteQueryVisualizationsLegacyRequestPb pb) {
    DeleteQueryVisualizationsLegacyRequest model = new DeleteQueryVisualizationsLegacyRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteQueryVisualizationsLegacyRequestSerializer
      extends JsonSerializer<DeleteQueryVisualizationsLegacyRequest> {
    @Override
    public void serialize(
        DeleteQueryVisualizationsLegacyRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      DeleteQueryVisualizationsLegacyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteQueryVisualizationsLegacyRequestDeserializer
      extends JsonDeserializer<DeleteQueryVisualizationsLegacyRequest> {
    @Override
    public DeleteQueryVisualizationsLegacyRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteQueryVisualizationsLegacyRequestPb pb =
          mapper.readValue(p, DeleteQueryVisualizationsLegacyRequestPb.class);
      return DeleteQueryVisualizationsLegacyRequest.fromPb(pb);
    }
  }
}
