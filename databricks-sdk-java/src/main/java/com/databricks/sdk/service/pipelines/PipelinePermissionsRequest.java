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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = PipelinePermissionsRequest.PipelinePermissionsRequestSerializer.class)
@JsonDeserialize(using = PipelinePermissionsRequest.PipelinePermissionsRequestDeserializer.class)
public class PipelinePermissionsRequest {
  /** */
  private Collection<PipelineAccessControlRequest> accessControlList;

  /** The pipeline for which to get or manage permissions. */
  private String pipelineId;

  public PipelinePermissionsRequest setAccessControlList(
      Collection<PipelineAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<PipelineAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public PipelinePermissionsRequest setPipelineId(String pipelineId) {
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
    PipelinePermissionsRequest that = (PipelinePermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelinePermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("pipelineId", pipelineId)
        .toString();
  }

  PipelinePermissionsRequestPb toPb() {
    PipelinePermissionsRequestPb pb = new PipelinePermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setPipelineId(pipelineId);

    return pb;
  }

  static PipelinePermissionsRequest fromPb(PipelinePermissionsRequestPb pb) {
    PipelinePermissionsRequest model = new PipelinePermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setPipelineId(pb.getPipelineId());

    return model;
  }

  public static class PipelinePermissionsRequestSerializer
      extends JsonSerializer<PipelinePermissionsRequest> {
    @Override
    public void serialize(
        PipelinePermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelinePermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelinePermissionsRequestDeserializer
      extends JsonDeserializer<PipelinePermissionsRequest> {
    @Override
    public PipelinePermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelinePermissionsRequestPb pb = mapper.readValue(p, PipelinePermissionsRequestPb.class);
      return PipelinePermissionsRequest.fromPb(pb);
    }
  }
}
