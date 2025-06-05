// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/** A Function in UC as a dependency. */
@Generated
@JsonSerialize(
    using = DeltaSharingFunctionDependency.DeltaSharingFunctionDependencySerializer.class)
@JsonDeserialize(
    using = DeltaSharingFunctionDependency.DeltaSharingFunctionDependencyDeserializer.class)
public class DeltaSharingFunctionDependency {
  /** */
  private String functionName;

  /** */
  private String schemaName;

  public DeltaSharingFunctionDependency setFunctionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  public String getFunctionName() {
    return functionName;
  }

  public DeltaSharingFunctionDependency setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaSharingFunctionDependency that = (DeltaSharingFunctionDependency) o;
    return Objects.equals(functionName, that.functionName)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionName, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSharingFunctionDependency.class)
        .add("functionName", functionName)
        .add("schemaName", schemaName)
        .toString();
  }

  DeltaSharingFunctionDependencyPb toPb() {
    DeltaSharingFunctionDependencyPb pb = new DeltaSharingFunctionDependencyPb();
    pb.setFunctionName(functionName);
    pb.setSchemaName(schemaName);

    return pb;
  }

  static DeltaSharingFunctionDependency fromPb(DeltaSharingFunctionDependencyPb pb) {
    DeltaSharingFunctionDependency model = new DeltaSharingFunctionDependency();
    model.setFunctionName(pb.getFunctionName());
    model.setSchemaName(pb.getSchemaName());

    return model;
  }

  public static class DeltaSharingFunctionDependencySerializer
      extends JsonSerializer<DeltaSharingFunctionDependency> {
    @Override
    public void serialize(
        DeltaSharingFunctionDependency value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeltaSharingFunctionDependencyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeltaSharingFunctionDependencyDeserializer
      extends JsonDeserializer<DeltaSharingFunctionDependency> {
    @Override
    public DeltaSharingFunctionDependency deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeltaSharingFunctionDependencyPb pb =
          mapper.readValue(p, DeltaSharingFunctionDependencyPb.class);
      return DeltaSharingFunctionDependency.fromPb(pb);
    }
  }
}
