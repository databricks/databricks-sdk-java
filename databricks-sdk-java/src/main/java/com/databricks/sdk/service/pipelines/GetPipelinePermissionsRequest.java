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

/** Get pipeline permissions */
@Generated
@JsonSerialize(using = GetPipelinePermissionsRequest.GetPipelinePermissionsRequestSerializer.class)
@JsonDeserialize(
    using = GetPipelinePermissionsRequest.GetPipelinePermissionsRequestDeserializer.class)
public class GetPipelinePermissionsRequest {
  /** The pipeline for which to get or manage permissions. */
  private String pipelineId;

  public GetPipelinePermissionsRequest setPipelineId(String pipelineId) {
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
    GetPipelinePermissionsRequest that = (GetPipelinePermissionsRequest) o;
    return Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPipelinePermissionsRequest.class)
        .add("pipelineId", pipelineId)
        .toString();
  }

  GetPipelinePermissionsRequestPb toPb() {
    GetPipelinePermissionsRequestPb pb = new GetPipelinePermissionsRequestPb();
    pb.setPipelineId(pipelineId);

    return pb;
  }

  static GetPipelinePermissionsRequest fromPb(GetPipelinePermissionsRequestPb pb) {
    GetPipelinePermissionsRequest model = new GetPipelinePermissionsRequest();
    model.setPipelineId(pb.getPipelineId());

    return model;
  }

  public static class GetPipelinePermissionsRequestSerializer
      extends JsonSerializer<GetPipelinePermissionsRequest> {
    @Override
    public void serialize(
        GetPipelinePermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPipelinePermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPipelinePermissionsRequestDeserializer
      extends JsonDeserializer<GetPipelinePermissionsRequest> {
    @Override
    public GetPipelinePermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPipelinePermissionsRequestPb pb =
          mapper.readValue(p, GetPipelinePermissionsRequestPb.class);
      return GetPipelinePermissionsRequest.fromPb(pb);
    }
  }
}
