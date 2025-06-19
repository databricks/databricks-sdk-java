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
import java.util.Objects;

/** A function that is dependent on a SQL object. */
@Generated
@JsonSerialize(using = FunctionDependency.FunctionDependencySerializer.class)
@JsonDeserialize(using = FunctionDependency.FunctionDependencyDeserializer.class)
public class FunctionDependency {
  /**
   * Full name of the dependent function, in the form of
   * __catalog_name__.__schema_name__.__function_name__.
   */
  private String functionFullName;

  public FunctionDependency setFunctionFullName(String functionFullName) {
    this.functionFullName = functionFullName;
    return this;
  }

  public String getFunctionFullName() {
    return functionFullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FunctionDependency that = (FunctionDependency) o;
    return Objects.equals(functionFullName, that.functionFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionFullName);
  }

  @Override
  public String toString() {
    return new ToStringer(FunctionDependency.class)
        .add("functionFullName", functionFullName)
        .toString();
  }

  FunctionDependencyPb toPb() {
    FunctionDependencyPb pb = new FunctionDependencyPb();
    pb.setFunctionFullName(functionFullName);

    return pb;
  }

  static FunctionDependency fromPb(FunctionDependencyPb pb) {
    FunctionDependency model = new FunctionDependency();
    model.setFunctionFullName(pb.getFunctionFullName());

    return model;
  }

  public static class FunctionDependencySerializer extends JsonSerializer<FunctionDependency> {
    @Override
    public void serialize(FunctionDependency value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FunctionDependencyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FunctionDependencyDeserializer extends JsonDeserializer<FunctionDependency> {
    @Override
    public FunctionDependency deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FunctionDependencyPb pb = mapper.readValue(p, FunctionDependencyPb.class);
      return FunctionDependency.fromPb(pb);
    }
  }
}
