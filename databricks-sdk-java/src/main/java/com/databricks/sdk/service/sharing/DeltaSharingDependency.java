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

/** Represents a UC dependency. */
@Generated
@JsonSerialize(using = DeltaSharingDependency.DeltaSharingDependencySerializer.class)
@JsonDeserialize(using = DeltaSharingDependency.DeltaSharingDependencyDeserializer.class)
public class DeltaSharingDependency {
  /** A Function in UC as a dependency. */
  private DeltaSharingFunctionDependency function;

  /** A Table in UC as a dependency. */
  private DeltaSharingTableDependency table;

  public DeltaSharingDependency setFunction(DeltaSharingFunctionDependency function) {
    this.function = function;
    return this;
  }

  public DeltaSharingFunctionDependency getFunction() {
    return function;
  }

  public DeltaSharingDependency setTable(DeltaSharingTableDependency table) {
    this.table = table;
    return this;
  }

  public DeltaSharingTableDependency getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaSharingDependency that = (DeltaSharingDependency) o;
    return Objects.equals(function, that.function) && Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, table);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSharingDependency.class)
        .add("function", function)
        .add("table", table)
        .toString();
  }

  DeltaSharingDependencyPb toPb() {
    DeltaSharingDependencyPb pb = new DeltaSharingDependencyPb();
    pb.setFunction(function);
    pb.setTable(table);

    return pb;
  }

  static DeltaSharingDependency fromPb(DeltaSharingDependencyPb pb) {
    DeltaSharingDependency model = new DeltaSharingDependency();
    model.setFunction(pb.getFunction());
    model.setTable(pb.getTable());

    return model;
  }

  public static class DeltaSharingDependencySerializer
      extends JsonSerializer<DeltaSharingDependency> {
    @Override
    public void serialize(
        DeltaSharingDependency value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeltaSharingDependencyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeltaSharingDependencyDeserializer
      extends JsonDeserializer<DeltaSharingDependency> {
    @Override
    public DeltaSharingDependency deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeltaSharingDependencyPb pb = mapper.readValue(p, DeltaSharingDependencyPb.class);
      return DeltaSharingDependency.fromPb(pb);
    }
  }
}
