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

@Generated
@JsonSerialize(using = CreatePipelineResponse.CreatePipelineResponseSerializer.class)
@JsonDeserialize(using = CreatePipelineResponse.CreatePipelineResponseDeserializer.class)
public class CreatePipelineResponse {
  /** Only returned when dry_run is true. */
  private PipelineSpec effectiveSettings;

  /** The unique identifier for the newly created pipeline. Only returned when dry_run is false. */
  private String pipelineId;

  public CreatePipelineResponse setEffectiveSettings(PipelineSpec effectiveSettings) {
    this.effectiveSettings = effectiveSettings;
    return this;
  }

  public PipelineSpec getEffectiveSettings() {
    return effectiveSettings;
  }

  public CreatePipelineResponse setPipelineId(String pipelineId) {
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
    CreatePipelineResponse that = (CreatePipelineResponse) o;
    return Objects.equals(effectiveSettings, that.effectiveSettings)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveSettings, pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePipelineResponse.class)
        .add("effectiveSettings", effectiveSettings)
        .add("pipelineId", pipelineId)
        .toString();
  }

  CreatePipelineResponsePb toPb() {
    CreatePipelineResponsePb pb = new CreatePipelineResponsePb();
    pb.setEffectiveSettings(effectiveSettings);
    pb.setPipelineId(pipelineId);

    return pb;
  }

  static CreatePipelineResponse fromPb(CreatePipelineResponsePb pb) {
    CreatePipelineResponse model = new CreatePipelineResponse();
    model.setEffectiveSettings(pb.getEffectiveSettings());
    model.setPipelineId(pb.getPipelineId());

    return model;
  }

  public static class CreatePipelineResponseSerializer
      extends JsonSerializer<CreatePipelineResponse> {
    @Override
    public void serialize(
        CreatePipelineResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreatePipelineResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreatePipelineResponseDeserializer
      extends JsonDeserializer<CreatePipelineResponse> {
    @Override
    public CreatePipelineResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreatePipelineResponsePb pb = mapper.readValue(p, CreatePipelineResponsePb.class);
      return CreatePipelineResponse.fromPb(pb);
    }
  }
}
