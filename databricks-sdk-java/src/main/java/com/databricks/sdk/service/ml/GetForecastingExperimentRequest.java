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

/** Get a forecasting experiment */
@Generated
@JsonSerialize(
    using = GetForecastingExperimentRequest.GetForecastingExperimentRequestSerializer.class)
@JsonDeserialize(
    using = GetForecastingExperimentRequest.GetForecastingExperimentRequestDeserializer.class)
public class GetForecastingExperimentRequest {
  /** The unique ID of a forecasting experiment */
  private String experimentId;

  public GetForecastingExperimentRequest setExperimentId(String experimentId) {
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
    GetForecastingExperimentRequest that = (GetForecastingExperimentRequest) o;
    return Objects.equals(experimentId, that.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetForecastingExperimentRequest.class)
        .add("experimentId", experimentId)
        .toString();
  }

  GetForecastingExperimentRequestPb toPb() {
    GetForecastingExperimentRequestPb pb = new GetForecastingExperimentRequestPb();
    pb.setExperimentId(experimentId);

    return pb;
  }

  static GetForecastingExperimentRequest fromPb(GetForecastingExperimentRequestPb pb) {
    GetForecastingExperimentRequest model = new GetForecastingExperimentRequest();
    model.setExperimentId(pb.getExperimentId());

    return model;
  }

  public static class GetForecastingExperimentRequestSerializer
      extends JsonSerializer<GetForecastingExperimentRequest> {
    @Override
    public void serialize(
        GetForecastingExperimentRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetForecastingExperimentRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetForecastingExperimentRequestDeserializer
      extends JsonDeserializer<GetForecastingExperimentRequest> {
    @Override
    public GetForecastingExperimentRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetForecastingExperimentRequestPb pb =
          mapper.readValue(p, GetForecastingExperimentRequestPb.class);
      return GetForecastingExperimentRequest.fromPb(pb);
    }
  }
}
