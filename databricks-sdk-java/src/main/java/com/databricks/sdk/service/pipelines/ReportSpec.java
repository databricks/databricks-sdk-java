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
@JsonSerialize(using = ReportSpec.ReportSpecSerializer.class)
@JsonDeserialize(using = ReportSpec.ReportSpecDeserializer.class)
public class ReportSpec {
  /** Required. Destination catalog to store table. */
  private String destinationCatalog;

  /** Required. Destination schema to store table. */
  private String destinationSchema;

  /**
   * Required. Destination table name. The pipeline fails if a table with that name already exists.
   */
  private String destinationTable;

  /** Required. Report URL in the source system. */
  private String sourceUrl;

  /**
   * Configuration settings to control the ingestion of tables. These settings override the
   * table_configuration defined in the IngestionPipelineDefinition object.
   */
  private TableSpecificConfig tableConfiguration;

  public ReportSpec setDestinationCatalog(String destinationCatalog) {
    this.destinationCatalog = destinationCatalog;
    return this;
  }

  public String getDestinationCatalog() {
    return destinationCatalog;
  }

  public ReportSpec setDestinationSchema(String destinationSchema) {
    this.destinationSchema = destinationSchema;
    return this;
  }

  public String getDestinationSchema() {
    return destinationSchema;
  }

  public ReportSpec setDestinationTable(String destinationTable) {
    this.destinationTable = destinationTable;
    return this;
  }

  public String getDestinationTable() {
    return destinationTable;
  }

  public ReportSpec setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  public String getSourceUrl() {
    return sourceUrl;
  }

  public ReportSpec setTableConfiguration(TableSpecificConfig tableConfiguration) {
    this.tableConfiguration = tableConfiguration;
    return this;
  }

  public TableSpecificConfig getTableConfiguration() {
    return tableConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReportSpec that = (ReportSpec) o;
    return Objects.equals(destinationCatalog, that.destinationCatalog)
        && Objects.equals(destinationSchema, that.destinationSchema)
        && Objects.equals(destinationTable, that.destinationTable)
        && Objects.equals(sourceUrl, that.sourceUrl)
        && Objects.equals(tableConfiguration, that.tableConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        destinationCatalog, destinationSchema, destinationTable, sourceUrl, tableConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(ReportSpec.class)
        .add("destinationCatalog", destinationCatalog)
        .add("destinationSchema", destinationSchema)
        .add("destinationTable", destinationTable)
        .add("sourceUrl", sourceUrl)
        .add("tableConfiguration", tableConfiguration)
        .toString();
  }

  ReportSpecPb toPb() {
    ReportSpecPb pb = new ReportSpecPb();
    pb.setDestinationCatalog(destinationCatalog);
    pb.setDestinationSchema(destinationSchema);
    pb.setDestinationTable(destinationTable);
    pb.setSourceUrl(sourceUrl);
    pb.setTableConfiguration(tableConfiguration);

    return pb;
  }

  static ReportSpec fromPb(ReportSpecPb pb) {
    ReportSpec model = new ReportSpec();
    model.setDestinationCatalog(pb.getDestinationCatalog());
    model.setDestinationSchema(pb.getDestinationSchema());
    model.setDestinationTable(pb.getDestinationTable());
    model.setSourceUrl(pb.getSourceUrl());
    model.setTableConfiguration(pb.getTableConfiguration());

    return model;
  }

  public static class ReportSpecSerializer extends JsonSerializer<ReportSpec> {
    @Override
    public void serialize(ReportSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ReportSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ReportSpecDeserializer extends JsonDeserializer<ReportSpec> {
    @Override
    public ReportSpec deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ReportSpecPb pb = mapper.readValue(p, ReportSpecPb.class);
      return ReportSpec.fromPb(pb);
    }
  }
}
