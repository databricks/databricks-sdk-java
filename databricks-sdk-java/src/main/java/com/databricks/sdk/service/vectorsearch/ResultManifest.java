// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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

/** Metadata about the result set. */
@Generated
@JsonSerialize(using = ResultManifest.ResultManifestSerializer.class)
@JsonDeserialize(using = ResultManifest.ResultManifestDeserializer.class)
public class ResultManifest {
  /** Number of columns in the result set. */
  private Long columnCount;

  /** Information about each column in the result set. */
  private Collection<ColumnInfo> columns;

  public ResultManifest setColumnCount(Long columnCount) {
    this.columnCount = columnCount;
    return this;
  }

  public Long getColumnCount() {
    return columnCount;
  }

  public ResultManifest setColumns(Collection<ColumnInfo> columns) {
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
    ResultManifest that = (ResultManifest) o;
    return Objects.equals(columnCount, that.columnCount) && Objects.equals(columns, that.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnCount, columns);
  }

  @Override
  public String toString() {
    return new ToStringer(ResultManifest.class)
        .add("columnCount", columnCount)
        .add("columns", columns)
        .toString();
  }

  ResultManifestPb toPb() {
    ResultManifestPb pb = new ResultManifestPb();
    pb.setColumnCount(columnCount);
    pb.setColumns(columns);

    return pb;
  }

  static ResultManifest fromPb(ResultManifestPb pb) {
    ResultManifest model = new ResultManifest();
    model.setColumnCount(pb.getColumnCount());
    model.setColumns(pb.getColumns());

    return model;
  }

  public static class ResultManifestSerializer extends JsonSerializer<ResultManifest> {
    @Override
    public void serialize(ResultManifest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResultManifestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResultManifestDeserializer extends JsonDeserializer<ResultManifest> {
    @Override
    public ResultManifest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResultManifestPb pb = mapper.readValue(p, ResultManifestPb.class);
      return ResultManifest.fromPb(pb);
    }
  }
}
