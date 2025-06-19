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
@JsonSerialize(using = SchemaSpec.SchemaSpecSerializer.class)
@JsonDeserialize(using = SchemaSpec.SchemaSpecDeserializer.class)
public class SchemaSpec {
  /** Required. Destination catalog to store tables. */
  private String destinationCatalog;

  /**
   * Required. Destination schema to store tables in. Tables with the same name as the source tables
   * are created in this destination schema. The pipeline fails If a table with the same name
   * already exists.
   */
  private String destinationSchema;

  /** The source catalog name. Might be optional depending on the type of source. */
  private String sourceCatalog;

  /** Required. Schema name in the source database. */
  private String sourceSchema;

  /**
   * Configuration settings to control the ingestion of tables. These settings are applied to all
   * tables in this schema and override the table_configuration defined in the
   * IngestionPipelineDefinition object.
   */
  private TableSpecificConfig tableConfiguration;

  public SchemaSpec setDestinationCatalog(String destinationCatalog) {
    this.destinationCatalog = destinationCatalog;
    return this;
  }

  public String getDestinationCatalog() {
    return destinationCatalog;
  }

  public SchemaSpec setDestinationSchema(String destinationSchema) {
    this.destinationSchema = destinationSchema;
    return this;
  }

  public String getDestinationSchema() {
    return destinationSchema;
  }

  public SchemaSpec setSourceCatalog(String sourceCatalog) {
    this.sourceCatalog = sourceCatalog;
    return this;
  }

  public String getSourceCatalog() {
    return sourceCatalog;
  }

  public SchemaSpec setSourceSchema(String sourceSchema) {
    this.sourceSchema = sourceSchema;
    return this;
  }

  public String getSourceSchema() {
    return sourceSchema;
  }

  public SchemaSpec setTableConfiguration(TableSpecificConfig tableConfiguration) {
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
    SchemaSpec that = (SchemaSpec) o;
    return Objects.equals(destinationCatalog, that.destinationCatalog)
        && Objects.equals(destinationSchema, that.destinationSchema)
        && Objects.equals(sourceCatalog, that.sourceCatalog)
        && Objects.equals(sourceSchema, that.sourceSchema)
        && Objects.equals(tableConfiguration, that.tableConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        destinationCatalog, destinationSchema, sourceCatalog, sourceSchema, tableConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(SchemaSpec.class)
        .add("destinationCatalog", destinationCatalog)
        .add("destinationSchema", destinationSchema)
        .add("sourceCatalog", sourceCatalog)
        .add("sourceSchema", sourceSchema)
        .add("tableConfiguration", tableConfiguration)
        .toString();
  }

  SchemaSpecPb toPb() {
    SchemaSpecPb pb = new SchemaSpecPb();
    pb.setDestinationCatalog(destinationCatalog);
    pb.setDestinationSchema(destinationSchema);
    pb.setSourceCatalog(sourceCatalog);
    pb.setSourceSchema(sourceSchema);
    pb.setTableConfiguration(tableConfiguration);

    return pb;
  }

  static SchemaSpec fromPb(SchemaSpecPb pb) {
    SchemaSpec model = new SchemaSpec();
    model.setDestinationCatalog(pb.getDestinationCatalog());
    model.setDestinationSchema(pb.getDestinationSchema());
    model.setSourceCatalog(pb.getSourceCatalog());
    model.setSourceSchema(pb.getSourceSchema());
    model.setTableConfiguration(pb.getTableConfiguration());

    return model;
  }

  public static class SchemaSpecSerializer extends JsonSerializer<SchemaSpec> {
    @Override
    public void serialize(SchemaSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SchemaSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SchemaSpecDeserializer extends JsonDeserializer<SchemaSpec> {
    @Override
    public SchemaSpec deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SchemaSpecPb pb = mapper.readValue(p, SchemaSpecPb.class);
      return SchemaSpec.fromPb(pb);
    }
  }
}
