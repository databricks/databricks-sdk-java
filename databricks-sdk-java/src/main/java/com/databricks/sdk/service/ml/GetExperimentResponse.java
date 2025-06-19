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
@JsonSerialize(using = GetExperimentResponse.GetExperimentResponseSerializer.class)
@JsonDeserialize(using = GetExperimentResponse.GetExperimentResponseDeserializer.class)
public class GetExperimentResponse {
  /** Experiment details. */
  private Experiment experiment;

  public GetExperimentResponse setExperiment(Experiment experiment) {
    this.experiment = experiment;
    return this;
  }

  public Experiment getExperiment() {
    return experiment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetExperimentResponse that = (GetExperimentResponse) o;
    return Objects.equals(experiment, that.experiment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experiment);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExperimentResponse.class).add("experiment", experiment).toString();
  }

  GetExperimentResponsePb toPb() {
    GetExperimentResponsePb pb = new GetExperimentResponsePb();
    pb.setExperiment(experiment);

    return pb;
  }

  static GetExperimentResponse fromPb(GetExperimentResponsePb pb) {
    GetExperimentResponse model = new GetExperimentResponse();
    model.setExperiment(pb.getExperiment());

    return model;
  }

  public static class GetExperimentResponseSerializer
      extends JsonSerializer<GetExperimentResponse> {
    @Override
    public void serialize(
        GetExperimentResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetExperimentResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetExperimentResponseDeserializer
      extends JsonDeserializer<GetExperimentResponse> {
    @Override
    public GetExperimentResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetExperimentResponsePb pb = mapper.readValue(p, GetExperimentResponsePb.class);
      return GetExperimentResponse.fromPb(pb);
    }
  }
}
