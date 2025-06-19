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
@JsonSerialize(using = GetExperimentByNameResponse.GetExperimentByNameResponseSerializer.class)
@JsonDeserialize(using = GetExperimentByNameResponse.GetExperimentByNameResponseDeserializer.class)
public class GetExperimentByNameResponse {
  /** Experiment details. */
  private Experiment experiment;

  public GetExperimentByNameResponse setExperiment(Experiment experiment) {
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
    GetExperimentByNameResponse that = (GetExperimentByNameResponse) o;
    return Objects.equals(experiment, that.experiment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experiment);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExperimentByNameResponse.class)
        .add("experiment", experiment)
        .toString();
  }

  GetExperimentByNameResponsePb toPb() {
    GetExperimentByNameResponsePb pb = new GetExperimentByNameResponsePb();
    pb.setExperiment(experiment);

    return pb;
  }

  static GetExperimentByNameResponse fromPb(GetExperimentByNameResponsePb pb) {
    GetExperimentByNameResponse model = new GetExperimentByNameResponse();
    model.setExperiment(pb.getExperiment());

    return model;
  }

  public static class GetExperimentByNameResponseSerializer
      extends JsonSerializer<GetExperimentByNameResponse> {
    @Override
    public void serialize(
        GetExperimentByNameResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetExperimentByNameResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetExperimentByNameResponseDeserializer
      extends JsonDeserializer<GetExperimentByNameResponse> {
    @Override
    public GetExperimentByNameResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetExperimentByNameResponsePb pb = mapper.readValue(p, GetExperimentByNameResponsePb.class);
      return GetExperimentByNameResponse.fromPb(pb);
    }
  }
}
