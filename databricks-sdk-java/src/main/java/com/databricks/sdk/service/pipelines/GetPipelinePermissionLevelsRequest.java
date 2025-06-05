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

/** Get pipeline permission levels */
@Generated
@JsonSerialize(
    using = GetPipelinePermissionLevelsRequest.GetPipelinePermissionLevelsRequestSerializer.class)
@JsonDeserialize(
    using = GetPipelinePermissionLevelsRequest.GetPipelinePermissionLevelsRequestDeserializer.class)
public class GetPipelinePermissionLevelsRequest {
  /** The pipeline for which to get or manage permissions. */
  private String pipelineId;

  public GetPipelinePermissionLevelsRequest setPipelineId(String pipelineId) {
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
    GetPipelinePermissionLevelsRequest that = (GetPipelinePermissionLevelsRequest) o;
    return Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPipelinePermissionLevelsRequest.class)
        .add("pipelineId", pipelineId)
        .toString();
  }

  GetPipelinePermissionLevelsRequestPb toPb() {
    GetPipelinePermissionLevelsRequestPb pb = new GetPipelinePermissionLevelsRequestPb();
    pb.setPipelineId(pipelineId);

    return pb;
  }

  static GetPipelinePermissionLevelsRequest fromPb(GetPipelinePermissionLevelsRequestPb pb) {
    GetPipelinePermissionLevelsRequest model = new GetPipelinePermissionLevelsRequest();
    model.setPipelineId(pb.getPipelineId());

    return model;
  }

  public static class GetPipelinePermissionLevelsRequestSerializer
      extends JsonSerializer<GetPipelinePermissionLevelsRequest> {
    @Override
    public void serialize(
        GetPipelinePermissionLevelsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPipelinePermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPipelinePermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetPipelinePermissionLevelsRequest> {
    @Override
    public GetPipelinePermissionLevelsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPipelinePermissionLevelsRequestPb pb =
          mapper.readValue(p, GetPipelinePermissionLevelsRequestPb.class);
      return GetPipelinePermissionLevelsRequest.fromPb(pb);
    }
  }
}
