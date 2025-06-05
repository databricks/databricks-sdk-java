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

/** Get an experiment by name */
@Generated
@JsonSerialize(using = GetByNameRequest.GetByNameRequestSerializer.class)
@JsonDeserialize(using = GetByNameRequest.GetByNameRequestDeserializer.class)
public class GetByNameRequest {
  /** Name of the associated experiment. */
  private String experimentName;

  public GetByNameRequest setExperimentName(String experimentName) {
    this.experimentName = experimentName;
    return this;
  }

  public String getExperimentName() {
    return experimentName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetByNameRequest that = (GetByNameRequest) o;
    return Objects.equals(experimentName, that.experimentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetByNameRequest.class).add("experimentName", experimentName).toString();
  }

  GetByNameRequestPb toPb() {
    GetByNameRequestPb pb = new GetByNameRequestPb();
    pb.setExperimentName(experimentName);

    return pb;
  }

  static GetByNameRequest fromPb(GetByNameRequestPb pb) {
    GetByNameRequest model = new GetByNameRequest();
    model.setExperimentName(pb.getExperimentName());

    return model;
  }

  public static class GetByNameRequestSerializer extends JsonSerializer<GetByNameRequest> {
    @Override
    public void serialize(GetByNameRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetByNameRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetByNameRequestDeserializer extends JsonDeserializer<GetByNameRequest> {
    @Override
    public GetByNameRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetByNameRequestPb pb = mapper.readValue(p, GetByNameRequestPb.class);
      return GetByNameRequest.fromPb(pb);
    }
  }
}
