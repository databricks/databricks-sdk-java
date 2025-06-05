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
@JsonSerialize(
    using = CreateForecastingExperimentResponse.CreateForecastingExperimentResponseSerializer.class)
@JsonDeserialize(
    using =
        CreateForecastingExperimentResponse.CreateForecastingExperimentResponseDeserializer.class)
public class CreateForecastingExperimentResponse {
  /** The unique ID of the created forecasting experiment */
  private String experimentId;

  public CreateForecastingExperimentResponse setExperimentId(String experimentId) {
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
    CreateForecastingExperimentResponse that = (CreateForecastingExperimentResponse) o;
    return Objects.equals(experimentId, that.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateForecastingExperimentResponse.class)
        .add("experimentId", experimentId)
        .toString();
  }

  CreateForecastingExperimentResponsePb toPb() {
    CreateForecastingExperimentResponsePb pb = new CreateForecastingExperimentResponsePb();
    pb.setExperimentId(experimentId);

    return pb;
  }

  static CreateForecastingExperimentResponse fromPb(CreateForecastingExperimentResponsePb pb) {
    CreateForecastingExperimentResponse model = new CreateForecastingExperimentResponse();
    model.setExperimentId(pb.getExperimentId());

    return model;
  }

  public static class CreateForecastingExperimentResponseSerializer
      extends JsonSerializer<CreateForecastingExperimentResponse> {
    @Override
    public void serialize(
        CreateForecastingExperimentResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateForecastingExperimentResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateForecastingExperimentResponseDeserializer
      extends JsonDeserializer<CreateForecastingExperimentResponse> {
    @Override
    public CreateForecastingExperimentResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateForecastingExperimentResponsePb pb =
          mapper.readValue(p, CreateForecastingExperimentResponsePb.class);
      return CreateForecastingExperimentResponse.fromPb(pb);
    }
  }
}
