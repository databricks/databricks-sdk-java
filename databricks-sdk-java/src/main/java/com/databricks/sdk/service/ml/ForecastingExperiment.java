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

/** Represents a forecasting experiment with its unique identifier, URL, and state. */
@Generated
@JsonSerialize(using = ForecastingExperiment.ForecastingExperimentSerializer.class)
@JsonDeserialize(using = ForecastingExperiment.ForecastingExperimentDeserializer.class)
public class ForecastingExperiment {
  /** The unique ID for the forecasting experiment. */
  private String experimentId;

  /** The URL to the forecasting experiment page. */
  private String experimentPageUrl;

  /** The current state of the forecasting experiment. */
  private ForecastingExperimentState state;

  public ForecastingExperiment setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public ForecastingExperiment setExperimentPageUrl(String experimentPageUrl) {
    this.experimentPageUrl = experimentPageUrl;
    return this;
  }

  public String getExperimentPageUrl() {
    return experimentPageUrl;
  }

  public ForecastingExperiment setState(ForecastingExperimentState state) {
    this.state = state;
    return this;
  }

  public ForecastingExperimentState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForecastingExperiment that = (ForecastingExperiment) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(experimentPageUrl, that.experimentPageUrl)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, experimentPageUrl, state);
  }

  @Override
  public String toString() {
    return new ToStringer(ForecastingExperiment.class)
        .add("experimentId", experimentId)
        .add("experimentPageUrl", experimentPageUrl)
        .add("state", state)
        .toString();
  }

  ForecastingExperimentPb toPb() {
    ForecastingExperimentPb pb = new ForecastingExperimentPb();
    pb.setExperimentId(experimentId);
    pb.setExperimentPageUrl(experimentPageUrl);
    pb.setState(state);

    return pb;
  }

  static ForecastingExperiment fromPb(ForecastingExperimentPb pb) {
    ForecastingExperiment model = new ForecastingExperiment();
    model.setExperimentId(pb.getExperimentId());
    model.setExperimentPageUrl(pb.getExperimentPageUrl());
    model.setState(pb.getState());

    return model;
  }

  public static class ForecastingExperimentSerializer
      extends JsonSerializer<ForecastingExperiment> {
    @Override
    public void serialize(
        ForecastingExperiment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ForecastingExperimentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ForecastingExperimentDeserializer
      extends JsonDeserializer<ForecastingExperiment> {
    @Override
    public ForecastingExperiment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ForecastingExperimentPb pb = mapper.readValue(p, ForecastingExperimentPb.class);
      return ForecastingExperiment.fromPb(pb);
    }
  }
}
