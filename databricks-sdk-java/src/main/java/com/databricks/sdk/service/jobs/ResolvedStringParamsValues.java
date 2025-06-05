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
import java.util.Objects;

@Generated
@JsonSerialize(using = ResolvedStringParamsValues.ResolvedStringParamsValuesSerializer.class)
@JsonDeserialize(using = ResolvedStringParamsValues.ResolvedStringParamsValuesDeserializer.class)
public class ResolvedStringParamsValues {
  /** */
  private Collection<String> parameters;

  public ResolvedStringParamsValues setParameters(Collection<String> parameters) {
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
    ResolvedStringParamsValues that = (ResolvedStringParamsValues) o;
    return Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedStringParamsValues.class)
        .add("parameters", parameters)
        .toString();
  }

  ResolvedStringParamsValuesPb toPb() {
    ResolvedStringParamsValuesPb pb = new ResolvedStringParamsValuesPb();
    pb.setParameters(parameters);

    return pb;
  }

  static ResolvedStringParamsValues fromPb(ResolvedStringParamsValuesPb pb) {
    ResolvedStringParamsValues model = new ResolvedStringParamsValues();
    model.setParameters(pb.getParameters());

    return model;
  }

  public static class ResolvedStringParamsValuesSerializer
      extends JsonSerializer<ResolvedStringParamsValues> {
    @Override
    public void serialize(
        ResolvedStringParamsValues value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResolvedStringParamsValuesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResolvedStringParamsValuesDeserializer
      extends JsonDeserializer<ResolvedStringParamsValues> {
    @Override
    public ResolvedStringParamsValues deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResolvedStringParamsValuesPb pb = mapper.readValue(p, ResolvedStringParamsValuesPb.class);
      return ResolvedStringParamsValues.fromPb(pb);
    }
  }
}
