// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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

/** Delete a pipeline */
@Generated
@JsonSerialize(using = DeletePipelineRequest.DeletePipelineRequestSerializer.class)
@JsonDeserialize(using = DeletePipelineRequest.DeletePipelineRequestDeserializer.class)
public class DeletePipelineRequest {
  /** */
  private String pipelineId;

  public DeletePipelineRequest setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeletePipelineRequest that = (DeletePipelineRequest) o;
    return Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePipelineRequest.class).add("pipelineId", pipelineId).toString();
  }

  DeletePipelineRequestPb toPb() {
    DeletePipelineRequestPb pb = new DeletePipelineRequestPb();
    pb.setPipelineId(pipelineId);

    return pb;
  }

  static DeletePipelineRequest fromPb(DeletePipelineRequestPb pb) {
    DeletePipelineRequest model = new DeletePipelineRequest();
    model.setPipelineId(pb.getPipelineId());

    return model;
  }

  public static class DeletePipelineRequestSerializer
      extends JsonSerializer<DeletePipelineRequest> {
    @Override
    public void serialize(
        DeletePipelineRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeletePipelineRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeletePipelineRequestDeserializer
      extends JsonDeserializer<DeletePipelineRequest> {
    @Override
    public DeletePipelineRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeletePipelineRequestPb pb = mapper.readValue(p, DeletePipelineRequestPb.class);
      return DeletePipelineRequest.fromPb(pb);
    }
  }
}
