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

/**
 * A dependency of a SQL object. Either the __table__ field or the __function__ field must be
 * defined.
 */
@Generated
@JsonSerialize(using = Dependency.DependencySerializer.class)
@JsonDeserialize(using = Dependency.DependencyDeserializer.class)
public class Dependency {
  /** A function that is dependent on a SQL object. */
  private FunctionDependency function;

  /** A table that is dependent on a SQL object. */
  private TableDependency table;

  public Dependency setFunction(FunctionDependency function) {
    this.function = function;
    return this;
  }

  public FunctionDependency getFunction() {
    return function;
  }

  public Dependency setTable(TableDependency table) {
    this.table = table;
    return this;
  }

  public TableDependency getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dependency that = (Dependency) o;
    return Objects.equals(function, that.function) && Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, table);
  }

  @Override
  public String toString() {
    return new ToStringer(Dependency.class)
        .add("function", function)
        .add("table", table)
        .toString();
  }

  DependencyPb toPb() {
    DependencyPb pb = new DependencyPb();
    pb.setFunction(function);
    pb.setTable(table);

    return pb;
  }

  static Dependency fromPb(DependencyPb pb) {
    Dependency model = new Dependency();
    model.setFunction(pb.getFunction());
    model.setTable(pb.getTable());

    return model;
  }

  public static class DependencySerializer extends JsonSerializer<Dependency> {
    @Override
    public void serialize(Dependency value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DependencyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DependencyDeserializer extends JsonDeserializer<Dependency> {
    @Override
    public Dependency deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DependencyPb pb = mapper.readValue(p, DependencyPb.class);
      return Dependency.fromPb(pb);
    }
  }
}
