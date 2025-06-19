// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = PipelineTask.PipelineTaskSerializer.class)
@JsonDeserialize(using = PipelineTask.PipelineTaskDeserializer.class)
public class PipelineTask {
  /** If true, triggers a full refresh on the delta live table. */
  private Boolean fullRefresh;

  /** The full name of the pipeline task to execute. */
  private String pipelineId;

  public PipelineTask setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  public PipelineTask setPipelineId(String pipelineId) {
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
    PipelineTask that = (PipelineTask) o;
    return Objects.equals(fullRefresh, that.fullRefresh)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullRefresh, pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineTask.class)
        .add("fullRefresh", fullRefresh)
        .add("pipelineId", pipelineId)
        .toString();
  }

  PipelineTaskPb toPb() {
    PipelineTaskPb pb = new PipelineTaskPb();
    pb.setFullRefresh(fullRefresh);
    pb.setPipelineId(pipelineId);

    return pb;
  }

  static PipelineTask fromPb(PipelineTaskPb pb) {
    PipelineTask model = new PipelineTask();
    model.setFullRefresh(pb.getFullRefresh());
    model.setPipelineId(pb.getPipelineId());

    return model;
  }

  public static class PipelineTaskSerializer extends JsonSerializer<PipelineTask> {
    @Override
    public void serialize(PipelineTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelineTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelineTaskDeserializer extends JsonDeserializer<PipelineTask> {
    @Override
    public PipelineTask deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelineTaskPb pb = mapper.readValue(p, PipelineTaskPb.class);
      return PipelineTask.fromPb(pb);
    }
  }
}
