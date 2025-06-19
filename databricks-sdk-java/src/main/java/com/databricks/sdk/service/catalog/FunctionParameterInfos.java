// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = FunctionParameterInfos.FunctionParameterInfosSerializer.class)
@JsonDeserialize(using = FunctionParameterInfos.FunctionParameterInfosDeserializer.class)
public class FunctionParameterInfos {
  /** The array of __FunctionParameterInfo__ definitions of the function's parameters. */
  private Collection<FunctionParameterInfo> parameters;

  public FunctionParameterInfos setParameters(Collection<FunctionParameterInfo> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<FunctionParameterInfo> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FunctionParameterInfos that = (FunctionParameterInfos) o;
    return Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(FunctionParameterInfos.class).add("parameters", parameters).toString();
  }

  FunctionParameterInfosPb toPb() {
    FunctionParameterInfosPb pb = new FunctionParameterInfosPb();
    pb.setParameters(parameters);

    return pb;
  }

  static FunctionParameterInfos fromPb(FunctionParameterInfosPb pb) {
    FunctionParameterInfos model = new FunctionParameterInfos();
    model.setParameters(pb.getParameters());

    return model;
  }

  public static class FunctionParameterInfosSerializer
      extends JsonSerializer<FunctionParameterInfos> {
    @Override
    public void serialize(
        FunctionParameterInfos value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FunctionParameterInfosPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FunctionParameterInfosDeserializer
      extends JsonDeserializer<FunctionParameterInfos> {
    @Override
    public FunctionParameterInfos deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FunctionParameterInfosPb pb = mapper.readValue(p, FunctionParameterInfosPb.class);
      return FunctionParameterInfos.fromPb(pb);
    }
  }
}
