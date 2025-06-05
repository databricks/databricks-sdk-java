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

@Generated
@JsonSerialize(using = CreateExperimentResponse.CreateExperimentResponseSerializer.class)
@JsonDeserialize(using = CreateExperimentResponse.CreateExperimentResponseDeserializer.class)
public class CreateExperimentResponse {
  /** Unique identifier for the experiment. */
  private String experimentId;

  public CreateExperimentResponse setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateExperimentResponse that = (CreateExperimentResponse) o;
    return Objects.equals(experimentId, that.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExperimentResponse.class)
        .add("experimentId", experimentId)
        .toString();
  }

  CreateExperimentResponsePb toPb() {
    CreateExperimentResponsePb pb = new CreateExperimentResponsePb();
    pb.setExperimentId(experimentId);

    return pb;
  }

  static CreateExperimentResponse fromPb(CreateExperimentResponsePb pb) {
    CreateExperimentResponse model = new CreateExperimentResponse();
    model.setExperimentId(pb.getExperimentId());

    return model;
  }

  public static class CreateExperimentResponseSerializer
      extends JsonSerializer<CreateExperimentResponse> {
    @Override
    public void serialize(
        CreateExperimentResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateExperimentResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateExperimentResponseDeserializer
      extends JsonDeserializer<CreateExperimentResponse> {
    @Override
    public CreateExperimentResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateExperimentResponsePb pb = mapper.readValue(p, CreateExperimentResponsePb.class);
      return CreateExperimentResponse.fromPb(pb);
    }
  }
}
