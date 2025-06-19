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

/** Get an experiment */
@Generated
@JsonSerialize(using = GetExperimentRequest.GetExperimentRequestSerializer.class)
@JsonDeserialize(using = GetExperimentRequest.GetExperimentRequestDeserializer.class)
public class GetExperimentRequest {
  /** ID of the associated experiment. */
  private String experimentId;

  public GetExperimentRequest setExperimentId(String experimentId) {
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
    GetExperimentRequest that = (GetExperimentRequest) o;
    return Objects.equals(experimentId, that.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExperimentRequest.class).add("experimentId", experimentId).toString();
  }

  GetExperimentRequestPb toPb() {
    GetExperimentRequestPb pb = new GetExperimentRequestPb();
    pb.setExperimentId(experimentId);

    return pb;
  }

  static GetExperimentRequest fromPb(GetExperimentRequestPb pb) {
    GetExperimentRequest model = new GetExperimentRequest();
    model.setExperimentId(pb.getExperimentId());

    return model;
  }

  public static class GetExperimentRequestSerializer extends JsonSerializer<GetExperimentRequest> {
    @Override
    public void serialize(
        GetExperimentRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetExperimentRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetExperimentRequestDeserializer
      extends JsonDeserializer<GetExperimentRequest> {
    @Override
    public GetExperimentRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetExperimentRequestPb pb = mapper.readValue(p, GetExperimentRequestPb.class);
      return GetExperimentRequest.fromPb(pb);
    }
  }
}
