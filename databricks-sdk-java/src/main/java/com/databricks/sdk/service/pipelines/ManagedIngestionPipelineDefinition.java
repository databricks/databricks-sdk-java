// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ManagedIngestionPipelineDefinition {
  /**
   * Immutable. The Unity Catalog connection this ingestion pipeline uses to communicate with the
   * source. Specify either ingestion_gateway_id or connection_name.
   */
  @JsonProperty("connection_name")
  private String connectionName;

  /**
   * Immutable. Identifier for the ingestion gateway used by this ingestion pipeline to communicate
   * with the source. Specify either ingestion_gateway_id or connection_name.
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
   * Configuration settings to control the ingestion of tables. These settings are applied to all
   * tables in the pipeline.
   */
  @JsonProperty("table_configuration")
  private TableSpecificConfig tableConfiguration;

  public ManagedIngestionPipelineDefinition setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public ManagedIngestionPipelineDefinition setIngestionGatewayId(String ingestionGatewayId) {
    this.ingestionGatewayId = ingestionGatewayId;
    return this;
  }

  public String getIngestionGatewayId() {
    return ingestionGatewayId;
  }

  public ManagedIngestionPipelineDefinition setObjects(Collection<IngestionConfig> objects) {
    this.objects = objects;
    return this;
  }

  public Collection<IngestionConfig> getObjects() {
    return objects;
  }

  public ManagedIngestionPipelineDefinition setTableConfiguration(
      TableSpecificConfig tableConfiguration) {
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
    ManagedIngestionPipelineDefinition that = (ManagedIngestionPipelineDefinition) o;
    return Objects.equals(connectionName, that.connectionName)
        && Objects.equals(ingestionGatewayId, that.ingestionGatewayId)
        && Objects.equals(objects, that.objects)
        && Objects.equals(tableConfiguration, that.tableConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionName, ingestionGatewayId, objects, tableConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(ManagedIngestionPipelineDefinition.class)
        .add("connectionName", connectionName)
        .add("ingestionGatewayId", ingestionGatewayId)
        .add("objects", objects)
        .add("tableConfiguration", tableConfiguration)
        .toString();
  }
}
