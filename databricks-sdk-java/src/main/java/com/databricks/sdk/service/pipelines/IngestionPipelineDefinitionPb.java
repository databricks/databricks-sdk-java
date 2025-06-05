// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class IngestionPipelineDefinitionPb {
  @JsonProperty("connection_name")
  private String connectionName;

  @JsonProperty("ingestion_gateway_id")
  private String ingestionGatewayId;

  @JsonProperty("objects")
  private Collection<IngestionConfig> objects;

  @JsonProperty("source_type")
  private IngestionSourceType sourceType;

  @JsonProperty("table_configuration")
  private TableSpecificConfig tableConfiguration;

  public IngestionPipelineDefinitionPb setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public IngestionPipelineDefinitionPb setIngestionGatewayId(String ingestionGatewayId) {
    this.ingestionGatewayId = ingestionGatewayId;
    return this;
  }

  public String getIngestionGatewayId() {
    return ingestionGatewayId;
  }

  public IngestionPipelineDefinitionPb setObjects(Collection<IngestionConfig> objects) {
    this.objects = objects;
    return this;
  }

  public Collection<IngestionConfig> getObjects() {
    return objects;
  }

  public IngestionPipelineDefinitionPb setSourceType(IngestionSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  public IngestionSourceType getSourceType() {
    return sourceType;
  }

  public IngestionPipelineDefinitionPb setTableConfiguration(
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
    IngestionPipelineDefinitionPb that = (IngestionPipelineDefinitionPb) o;
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
    return new ToStringer(IngestionPipelineDefinitionPb.class)
        .add("connectionName", connectionName)
        .add("ingestionGatewayId", ingestionGatewayId)
        .add("objects", objects)
        .add("sourceType", sourceType)
        .add("tableConfiguration", tableConfiguration)
        .toString();
  }
}
