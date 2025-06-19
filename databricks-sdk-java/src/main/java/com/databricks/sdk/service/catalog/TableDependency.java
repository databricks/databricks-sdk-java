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

/** A table that is dependent on a SQL object. */
@Generated
@JsonSerialize(using = TableDependency.TableDependencySerializer.class)
@JsonDeserialize(using = TableDependency.TableDependencyDeserializer.class)
public class TableDependency {
  /**
   * Full name of the dependent table, in the form of
   * __catalog_name__.__schema_name__.__table_name__.
   */
  private String tableFullName;

  public TableDependency setTableFullName(String tableFullName) {
    this.tableFullName = tableFullName;
    return this;
  }

  public String getTableFullName() {
    return tableFullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableDependency that = (TableDependency) o;
    return Objects.equals(tableFullName, that.tableFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableFullName);
  }

  @Override
  public String toString() {
    return new ToStringer(TableDependency.class).add("tableFullName", tableFullName).toString();
  }

  TableDependencyPb toPb() {
    TableDependencyPb pb = new TableDependencyPb();
    pb.setTableFullName(tableFullName);

    return pb;
  }

  static TableDependency fromPb(TableDependencyPb pb) {
    TableDependency model = new TableDependency();
    model.setTableFullName(pb.getTableFullName());

    return model;
  }

  public static class TableDependencySerializer extends JsonSerializer<TableDependency> {
    @Override
    public void serialize(TableDependency value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TableDependencyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TableDependencyDeserializer extends JsonDeserializer<TableDependency> {
    @Override
    public TableDependency deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TableDependencyPb pb = mapper.readValue(p, TableDependencyPb.class);
      return TableDependency.fromPb(pb);
    }
  }
}
