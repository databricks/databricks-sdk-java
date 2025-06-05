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
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = ResolvedPythonWheelTaskValues.ResolvedPythonWheelTaskValuesSerializer.class)
@JsonDeserialize(
    using = ResolvedPythonWheelTaskValues.ResolvedPythonWheelTaskValuesDeserializer.class)
public class ResolvedPythonWheelTaskValues {
  /** */
  private Map<String, String> namedParameters;

  /** */
  private Collection<String> parameters;

  public ResolvedPythonWheelTaskValues setNamedParameters(Map<String, String> namedParameters) {
    this.namedParameters = namedParameters;
    return this;
  }

  public Map<String, String> getNamedParameters() {
    return namedParameters;
  }

  public ResolvedPythonWheelTaskValues setParameters(Collection<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<String> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedPythonWheelTaskValues that = (ResolvedPythonWheelTaskValues) o;
    return Objects.equals(namedParameters, that.namedParameters)
        && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namedParameters, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedPythonWheelTaskValues.class)
        .add("namedParameters", namedParameters)
        .add("parameters", parameters)
        .toString();
  }

  ResolvedPythonWheelTaskValuesPb toPb() {
    ResolvedPythonWheelTaskValuesPb pb = new ResolvedPythonWheelTaskValuesPb();
    pb.setNamedParameters(namedParameters);
    pb.setParameters(parameters);

    return pb;
  }

  static ResolvedPythonWheelTaskValues fromPb(ResolvedPythonWheelTaskValuesPb pb) {
    ResolvedPythonWheelTaskValues model = new ResolvedPythonWheelTaskValues();
    model.setNamedParameters(pb.getNamedParameters());
    model.setParameters(pb.getParameters());

    return model;
  }

  public static class ResolvedPythonWheelTaskValuesSerializer
      extends JsonSerializer<ResolvedPythonWheelTaskValues> {
    @Override
    public void serialize(
        ResolvedPythonWheelTaskValues value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResolvedPythonWheelTaskValuesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResolvedPythonWheelTaskValuesDeserializer
      extends JsonDeserializer<ResolvedPythonWheelTaskValues> {
    @Override
    public ResolvedPythonWheelTaskValues deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResolvedPythonWheelTaskValuesPb pb =
          mapper.readValue(p, ResolvedPythonWheelTaskValuesPb.class);
      return ResolvedPythonWheelTaskValues.fromPb(pb);
    }
  }
}
