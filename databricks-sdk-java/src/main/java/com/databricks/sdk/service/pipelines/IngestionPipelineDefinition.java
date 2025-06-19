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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = IngestionPipelineDefinition.IngestionPipelineDefinitionSerializer.class)
@JsonDeserialize(using = IngestionPipelineDefinition.IngestionPipelineDefinitionDeserializer.class)
public class IngestionPipelineDefinition {
  /**
   * Immutable. The Unity Catalog connection that this ingestion pipeline uses to communicate with
   * the source. This is used with connectors for applications like Salesforce, Workday, and so on.
   */
  private String connectionName;

  /**
   * Immutable. Identifier for the gateway that is used by this ingestion pipeline to communicate
   * with the source database. This is used with connectors to databases like SQL Server.
   */
  private String ingestionGatewayId;

  /**
   * Required. Settings specifying tables to replicate and the destination for the replicated
   * tables.
   */
  private Collection<IngestionConfig> objects;

  /**
   * The type of the foreign source. The source type will be inferred from the source connection or
   * ingestion gateway. This field is output only and will be ignored if provided.
   */
  private IngestionSourceType sourceType;

  /**
   * Configuration settings to control the ingestion of tables. These settings are applied to all
   * tables in the pipeline.
   */
  private TableSpecificConfig tableConfiguration;

  public IngestionPipelineDefinition setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public IngestionPipelineDefinition setIngestionGatewayId(String ingestionGatewayId) {
    this.ingestionGatewayId = ingestionGatewayId;
    return this;
  }

  public String getIngestionGatewayId() {
    return ingestionGatewayId;
  }

  public IngestionPipelineDefinition setObjects(Collection<IngestionConfig> objects) {
    this.objects = objects;
    return this;
  }

  public Collection<IngestionConfig> getObjects() {
    return objects;
  }

  public IngestionPipelineDefinition setSourceType(IngestionSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  public IngestionSourceType getSourceType() {
    return sourceType;
  }

  public IngestionPipelineDefinition setTableConfiguration(TableSpecificConfig tableConfiguration) {
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
    IngestionPipelineDefinition that = (IngestionPipelineDefinition) o;
    return Objects.equals(connectionName, that.connectionName)
        && Objects.equals(ingestionGatewayId, that.ingestionGatewayId)
        && Objects.equals(objects, that.objects)
        && Objects.equals(sourceType, that.sourceType)
        && Objects.equals(tableConfiguration, that.tableConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        connectionName, ingestionGatewayId, objects, sourceType, tableConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionPipelineDefinition.class)
        .add("connectionName", connectionName)
        .add("ingestionGatewayId", ingestionGatewayId)
        .add("objects", objects)
        .add("sourceType", sourceType)
        .add("tableConfiguration", tableConfiguration)
        .toString();
  }

  IngestionPipelineDefinitionPb toPb() {
    IngestionPipelineDefinitionPb pb = new IngestionPipelineDefinitionPb();
    pb.setConnectionName(connectionName);
    pb.setIngestionGatewayId(ingestionGatewayId);
    pb.setObjects(objects);
    pb.setSourceType(sourceType);
    pb.setTableConfiguration(tableConfiguration);

    return pb;
  }

  static IngestionPipelineDefinition fromPb(IngestionPipelineDefinitionPb pb) {
    IngestionPipelineDefinition model = new IngestionPipelineDefinition();
    model.setConnectionName(pb.getConnectionName());
    model.setIngestionGatewayId(pb.getIngestionGatewayId());
    model.setObjects(pb.getObjects());
    model.setSourceType(pb.getSourceType());
    model.setTableConfiguration(pb.getTableConfiguration());

    return model;
  }

  public static class IngestionPipelineDefinitionSerializer
      extends JsonSerializer<IngestionPipelineDefinition> {
    @Override
    public void serialize(
        IngestionPipelineDefinition value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      IngestionPipelineDefinitionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class IngestionPipelineDefinitionDeserializer
      extends JsonDeserializer<IngestionPipelineDefinition> {
    @Override
    public IngestionPipelineDefinition deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      IngestionPipelineDefinitionPb pb = mapper.readValue(p, IngestionPipelineDefinitionPb.class);
      return IngestionPipelineDefinition.fromPb(pb);
    }
  }
}
