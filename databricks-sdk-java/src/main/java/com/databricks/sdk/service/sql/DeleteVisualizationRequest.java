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

/** Remove a visualization */
@Generated
@JsonSerialize(using = DeleteVisualizationRequest.DeleteVisualizationRequestSerializer.class)
@JsonDeserialize(using = DeleteVisualizationRequest.DeleteVisualizationRequestDeserializer.class)
public class DeleteVisualizationRequest {
  /** */
  private String id;

  public DeleteVisualizationRequest setId(String id) {
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
    DeleteVisualizationRequest that = (DeleteVisualizationRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteVisualizationRequest.class).add("id", id).toString();
  }

  DeleteVisualizationRequestPb toPb() {
    DeleteVisualizationRequestPb pb = new DeleteVisualizationRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteVisualizationRequest fromPb(DeleteVisualizationRequestPb pb) {
    DeleteVisualizationRequest model = new DeleteVisualizationRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteVisualizationRequestSerializer
      extends JsonSerializer<DeleteVisualizationRequest> {
    @Override
    public void serialize(
        DeleteVisualizationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteVisualizationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteVisualizationRequestDeserializer
      extends JsonDeserializer<DeleteVisualizationRequest> {
    @Override
    public DeleteVisualizationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteVisualizationRequestPb pb = mapper.readValue(p, DeleteVisualizationRequestPb.class);
      return DeleteVisualizationRequest.fromPb(pb);
    }
  }
}
