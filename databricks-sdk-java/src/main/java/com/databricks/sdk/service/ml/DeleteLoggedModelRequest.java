// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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

/** Delete a logged model */
@Generated
@JsonSerialize(using = DeleteLoggedModelRequest.DeleteLoggedModelRequestSerializer.class)
@JsonDeserialize(using = DeleteLoggedModelRequest.DeleteLoggedModelRequestDeserializer.class)
public class DeleteLoggedModelRequest {
  /** The ID of the logged model to delete. */
  private String modelId;

  public DeleteLoggedModelRequest setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteLoggedModelRequest that = (DeleteLoggedModelRequest) o;
    return Objects.equals(modelId, that.modelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteLoggedModelRequest.class).add("modelId", modelId).toString();
  }

  DeleteLoggedModelRequestPb toPb() {
    DeleteLoggedModelRequestPb pb = new DeleteLoggedModelRequestPb();
    pb.setModelId(modelId);

    return pb;
  }

  static DeleteLoggedModelRequest fromPb(DeleteLoggedModelRequestPb pb) {
    DeleteLoggedModelRequest model = new DeleteLoggedModelRequest();
    model.setModelId(pb.getModelId());

    return model;
  }

  public static class DeleteLoggedModelRequestSerializer
      extends JsonSerializer<DeleteLoggedModelRequest> {
    @Override
    public void serialize(
        DeleteLoggedModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteLoggedModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteLoggedModelRequestDeserializer
      extends JsonDeserializer<DeleteLoggedModelRequest> {
    @Override
    public DeleteLoggedModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteLoggedModelRequestPb pb = mapper.readValue(p, DeleteLoggedModelRequestPb.class);
      return DeleteLoggedModelRequest.fromPb(pb);
    }
  }
}
