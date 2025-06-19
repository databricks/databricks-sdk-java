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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = ResolvedParamPairValues.ResolvedParamPairValuesSerializer.class)
@JsonDeserialize(using = ResolvedParamPairValues.ResolvedParamPairValuesDeserializer.class)
public class ResolvedParamPairValues {
  /** */
  private Map<String, String> parameters;

  public ResolvedParamPairValues setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedParamPairValues that = (ResolvedParamPairValues) o;
    return Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedParamPairValues.class).add("parameters", parameters).toString();
  }

  ResolvedParamPairValuesPb toPb() {
    ResolvedParamPairValuesPb pb = new ResolvedParamPairValuesPb();
    pb.setParameters(parameters);

    return pb;
  }

  static ResolvedParamPairValues fromPb(ResolvedParamPairValuesPb pb) {
    ResolvedParamPairValues model = new ResolvedParamPairValues();
    model.setParameters(pb.getParameters());

    return model;
  }

  public static class ResolvedParamPairValuesSerializer
      extends JsonSerializer<ResolvedParamPairValues> {
    @Override
    public void serialize(
        ResolvedParamPairValues value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResolvedParamPairValuesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResolvedParamPairValuesDeserializer
      extends JsonDeserializer<ResolvedParamPairValues> {
    @Override
    public ResolvedParamPairValues deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResolvedParamPairValuesPb pb = mapper.readValue(p, ResolvedParamPairValuesPb.class);
      return ResolvedParamPairValues.fromPb(pb);
    }
  }
}
