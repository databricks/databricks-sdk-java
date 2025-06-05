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
@JsonSerialize(using = TableRowFilter.TableRowFilterSerializer.class)
@JsonDeserialize(using = TableRowFilter.TableRowFilterDeserializer.class)
public class TableRowFilter {
  /** The full name of the row filter SQL UDF. */
  private String functionName;

  /**
   * The list of table columns to be passed as input to the row filter function. The column types
   * should match the types of the filter function arguments.
   */
  private Collection<String> inputColumnNames;

  public TableRowFilter setFunctionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  public String getFunctionName() {
    return functionName;
  }

  public TableRowFilter setInputColumnNames(Collection<String> inputColumnNames) {
    this.inputColumnNames = inputColumnNames;
    return this;
  }

  public Collection<String> getInputColumnNames() {
    return inputColumnNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableRowFilter that = (TableRowFilter) o;
    return Objects.equals(functionName, that.functionName)
        && Objects.equals(inputColumnNames, that.inputColumnNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionName, inputColumnNames);
  }

  @Override
  public String toString() {
    return new ToStringer(TableRowFilter.class)
        .add("functionName", functionName)
        .add("inputColumnNames", inputColumnNames)
        .toString();
  }

  TableRowFilterPb toPb() {
    TableRowFilterPb pb = new TableRowFilterPb();
    pb.setFunctionName(functionName);
    pb.setInputColumnNames(inputColumnNames);

    return pb;
  }

  static TableRowFilter fromPb(TableRowFilterPb pb) {
    TableRowFilter model = new TableRowFilter();
    model.setFunctionName(pb.getFunctionName());
    model.setInputColumnNames(pb.getInputColumnNames());

    return model;
  }

  public static class TableRowFilterSerializer extends JsonSerializer<TableRowFilter> {
    @Override
    public void serialize(TableRowFilter value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TableRowFilterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TableRowFilterDeserializer extends JsonDeserializer<TableRowFilter> {
    @Override
    public TableRowFilter deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TableRowFilterPb pb = mapper.readValue(p, TableRowFilterPb.class);
      return TableRowFilter.fromPb(pb);
    }
  }
}
