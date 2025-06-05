// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class IngestionGatewayPipelineDefinitionPb {
  @JsonProperty("connection_id")
  private String connectionId;

  @JsonProperty("connection_name")
  private String connectionName;

  @JsonProperty("gateway_storage_catalog")
  private String gatewayStorageCatalog;

  @JsonProperty("gateway_storage_name")
  private String gatewayStorageName;

  @JsonProperty("gateway_storage_schema")
  private String gatewayStorageSchema;

  public IngestionGatewayPipelineDefinitionPb setConnectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  public String getConnectionId() {
    return connectionId;
  }

  public IngestionGatewayPipelineDefinitionPb setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public IngestionGatewayPipelineDefinitionPb setGatewayStorageCatalog(
      String gatewayStorageCatalog) {
    this.gatewayStorageCatalog = gatewayStorageCatalog;
    return this;
  }

  public String getGatewayStorageCatalog() {
    return gatewayStorageCatalog;
  }

  public IngestionGatewayPipelineDefinitionPb setGatewayStorageName(String gatewayStorageName) {
    this.gatewayStorageName = gatewayStorageName;
    return this;
  }

  public String getGatewayStorageName() {
    return gatewayStorageName;
  }

  public IngestionGatewayPipelineDefinitionPb setGatewayStorageSchema(String gatewayStorageSchema) {
    this.gatewayStorageSchema = gatewayStorageSchema;
    return this;
  }

  public String getGatewayStorageSchema() {
    return gatewayStorageSchema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IngestionGatewayPipelineDefinitionPb that = (IngestionGatewayPipelineDefinitionPb) o;
    return Objects.equals(connectionId, that.connectionId)
        && Objects.equals(connectionName, that.connectionName)
        && Objects.equals(gatewayStorageCatalog, that.gatewayStorageCatalog)
        && Objects.equals(gatewayStorageName, that.gatewayStorageName)
        && Objects.equals(gatewayStorageSchema, that.gatewayStorageSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        connectionId,
        connectionName,
        gatewayStorageCatalog,
        gatewayStorageName,
        gatewayStorageSchema);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionGatewayPipelineDefinitionPb.class)
        .add("connectionId", connectionId)
        .add("connectionName", connectionName)
        .add("gatewayStorageCatalog", gatewayStorageCatalog)
        .add("gatewayStorageName", gatewayStorageName)
        .add("gatewayStorageSchema", gatewayStorageSchema)
        .toString();
  }
}
