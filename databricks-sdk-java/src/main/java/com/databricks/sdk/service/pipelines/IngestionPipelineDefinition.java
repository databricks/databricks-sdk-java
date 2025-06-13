// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class IngestionPipelineDefinition {
  /**
   * Immutable. The Unity Catalog connection that this ingestion pipeline uses to communicate with
   * the source. This is used with connectors for applications like Salesforce, Workday, and so on.
   */
  @JsonProperty("connection_name")
  private String connectionName;

  /**
   * Immutable. Identifier for the gateway that is used by this ingestion pipeline to communicate
   * with the source database. This is used with connectors to databases like SQL Server.
   */
  @JsonProperty("ingestion_gateway_id")
  private String ingestionGatewayId;

  /**
   * Required. Settings specifying tables to replicate and the destination for the replicated
   * tables.
   */
  @JsonProperty("objects")
  private Collection<IngestionConfig> objects;

  /**
   * The type of the foreign source. The source type will be inferred from the source connection or
   * ingestion gateway. This field is output only and will be ignored if provided.
   */
  @JsonProperty("source_type")
  private IngestionSourceType sourceType;

  /**
   * Configuration settings to control the ingestion of tables. These settings are applied to all
   * tables in the pipeline.
   */
  @JsonProperty("table_configuration")
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
}
