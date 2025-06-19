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

/** Stop a pipeline */
@Generated
@JsonSerialize(using = StopRequest.StopRequestSerializer.class)
@JsonDeserialize(using = StopRequest.StopRequestDeserializer.class)
public class StopRequest {
  /** */
  private String pipelineId;

  public StopRequest setPipelineId(String pipelineId) {
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
    StopRequest that = (StopRequest) o;
    return Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(StopRequest.class).add("pipelineId", pipelineId).toString();
  }

  StopRequestPb toPb() {
    StopRequestPb pb = new StopRequestPb();
    pb.setPipelineId(pipelineId);

    return pb;
  }

  static StopRequest fromPb(StopRequestPb pb) {
    StopRequest model = new StopRequest();
    model.setPipelineId(pb.getPipelineId());

    return model;
  }

  public static class StopRequestSerializer extends JsonSerializer<StopRequest> {
    @Override
    public void serialize(StopRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StopRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StopRequestDeserializer extends JsonDeserializer<StopRequest> {
    @Override
    public StopRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StopRequestPb pb = mapper.readValue(p, StopRequestPb.class);
      return StopRequest.fromPb(pb);
    }
  }
}
