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

@Generated
@JsonSerialize(using = TableSummary.TableSummarySerializer.class)
@JsonDeserialize(using = TableSummary.TableSummaryDeserializer.class)
public class TableSummary {
  /** The full name of the table. */
  private String fullName;

  /** */
  private TableType tableType;

  public TableSummary setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public TableSummary setTableType(TableType tableType) {
    this.tableType = tableType;
    return this;
  }

  public TableType getTableType() {
    return tableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableSummary that = (TableSummary) o;
    return Objects.equals(fullName, that.fullName) && Objects.equals(tableType, that.tableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, tableType);
  }

  @Override
  public String toString() {
    return new ToStringer(TableSummary.class)
        .add("fullName", fullName)
        .add("tableType", tableType)
        .toString();
  }

  TableSummaryPb toPb() {
    TableSummaryPb pb = new TableSummaryPb();
    pb.setFullName(fullName);
    pb.setTableType(tableType);

    return pb;
  }

  static TableSummary fromPb(TableSummaryPb pb) {
    TableSummary model = new TableSummary();
    model.setFullName(pb.getFullName());
    model.setTableType(pb.getTableType());

    return model;
  }

  public static class TableSummarySerializer extends JsonSerializer<TableSummary> {
    @Override
    public void serialize(TableSummary value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TableSummaryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TableSummaryDeserializer extends JsonDeserializer<TableSummary> {
    @Override
    public TableSummary deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TableSummaryPb pb = mapper.readValue(p, TableSummaryPb.class);
      return TableSummary.fromPb(pb);
    }
  }
}
