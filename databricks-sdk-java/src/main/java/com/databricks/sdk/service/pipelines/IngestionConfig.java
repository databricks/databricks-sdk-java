// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = IngestionConfig.IngestionConfigSerializer.class)
@JsonDeserialize(using = IngestionConfig.IngestionConfigDeserializer.class)
public class IngestionConfig {
  /** Select a specific source report. */
  private ReportSpec report;

  /** Select all tables from a specific source schema. */
  private SchemaSpec schema;

  /** Select a specific source table. */
  private TableSpec table;

  public IngestionConfig setReport(ReportSpec report) {
    this.report = report;
    return this;
  }

  public ReportSpec getReport() {
    return report;
  }

  public IngestionConfig setSchema(SchemaSpec schema) {
    this.schema = schema;
    return this;
  }

  public SchemaSpec getSchema() {
    return schema;
  }

  public IngestionConfig setTable(TableSpec table) {
    this.table = table;
    return this;
  }

  public TableSpec getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IngestionConfig that = (IngestionConfig) o;
    return Objects.equals(report, that.report)
        && Objects.equals(schema, that.schema)
        && Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report, schema, table);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionConfig.class)
        .add("report", report)
        .add("schema", schema)
        .add("table", table)
        .toString();
  }

  IngestionConfigPb toPb() {
    IngestionConfigPb pb = new IngestionConfigPb();
    pb.setReport(report);
    pb.setSchema(schema);
    pb.setTable(table);

    return pb;
  }

  static IngestionConfig fromPb(IngestionConfigPb pb) {
    IngestionConfig model = new IngestionConfig();
    model.setReport(pb.getReport());
    model.setSchema(pb.getSchema());
    model.setTable(pb.getTable());

    return model;
  }

  public static class IngestionConfigSerializer extends JsonSerializer<IngestionConfig> {
    @Override
    public void serialize(IngestionConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      IngestionConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class IngestionConfigDeserializer extends JsonDeserializer<IngestionConfig> {
    @Override
    public IngestionConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      IngestionConfigPb pb = mapper.readValue(p, IngestionConfigPb.class);
      return IngestionConfig.fromPb(pb);
    }
  }
}
