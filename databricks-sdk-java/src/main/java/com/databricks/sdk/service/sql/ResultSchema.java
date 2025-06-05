// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** The schema is an ordered list of column descriptions. */
@Generated
@JsonSerialize(using = ResultSchema.ResultSchemaSerializer.class)
@JsonDeserialize(using = ResultSchema.ResultSchemaDeserializer.class)
public class ResultSchema {
  /** */
  private Long columnCount;

  /** */
  private Collection<ColumnInfo> columns;

  public ResultSchema setColumnCount(Long columnCount) {
    this.columnCount = columnCount;
    return this;
  }

  public Long getColumnCount() {
    return columnCount;
  }

  public ResultSchema setColumns(Collection<ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<ColumnInfo> getColumns() {
    return columns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResultSchema that = (ResultSchema) o;
    return Objects.equals(columnCount, that.columnCount) && Objects.equals(columns, that.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnCount, columns);
  }

  @Override
  public String toString() {
    return new ToStringer(ResultSchema.class)
        .add("columnCount", columnCount)
        .add("columns", columns)
        .toString();
  }

  ResultSchemaPb toPb() {
    ResultSchemaPb pb = new ResultSchemaPb();
    pb.setColumnCount(columnCount);
    pb.setColumns(columns);

    return pb;
  }

  static ResultSchema fromPb(ResultSchemaPb pb) {
    ResultSchema model = new ResultSchema();
    model.setColumnCount(pb.getColumnCount());
    model.setColumns(pb.getColumns());

    return model;
  }

  public static class ResultSchemaSerializer extends JsonSerializer<ResultSchema> {
    @Override
    public void serialize(ResultSchema value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResultSchemaPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResultSchemaDeserializer extends JsonDeserializer<ResultSchema> {
    @Override
    public ResultSchema deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResultSchemaPb pb = mapper.readValue(p, ResultSchemaPb.class);
      return ResultSchema.fromPb(pb);
    }
  }
}
