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

/** Get a pipeline update */
@Generated
@JsonSerialize(using = GetUpdateRequest.GetUpdateRequestSerializer.class)
@JsonDeserialize(using = GetUpdateRequest.GetUpdateRequestDeserializer.class)
public class GetUpdateRequest {
  /** The ID of the pipeline. */
  private String pipelineId;

  /** The ID of the update. */
  private String updateId;

  public GetUpdateRequest setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public GetUpdateRequest setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  public String getUpdateId() {
    return updateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetUpdateRequest that = (GetUpdateRequest) o;
    return Objects.equals(pipelineId, that.pipelineId) && Objects.equals(updateId, that.updateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineId, updateId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetUpdateRequest.class)
        .add("pipelineId", pipelineId)
        .add("updateId", updateId)
        .toString();
  }

  GetUpdateRequestPb toPb() {
    GetUpdateRequestPb pb = new GetUpdateRequestPb();
    pb.setPipelineId(pipelineId);
    pb.setUpdateId(updateId);

    return pb;
  }

  static GetUpdateRequest fromPb(GetUpdateRequestPb pb) {
    GetUpdateRequest model = new GetUpdateRequest();
    model.setPipelineId(pb.getPipelineId());
    model.setUpdateId(pb.getUpdateId());

    return model;
  }

  public static class GetUpdateRequestSerializer extends JsonSerializer<GetUpdateRequest> {
    @Override
    public void serialize(GetUpdateRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetUpdateRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetUpdateRequestDeserializer extends JsonDeserializer<GetUpdateRequest> {
    @Override
    public GetUpdateRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetUpdateRequestPb pb = mapper.readValue(p, GetUpdateRequestPb.class);
      return GetUpdateRequest.fromPb(pb);
    }
  }
}
