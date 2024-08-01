// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class IngestionGatewayPipelineDefinition {
  /**
   * Immutable. The Unity Catalog connection this gateway pipeline uses to communicate with the
   * source.
   */
  @JsonProperty("connection_id")
  private String connectionId;

  /** Required, Immutable. The name of the catalog for the gateway pipeline's storage location. */
  @JsonProperty("gateway_storage_catalog")
  private String gatewayStorageCatalog;

  /**
   * Optional. The Unity Catalog-compatible name for the gateway storage location. This is the
   * destination to use for the data that is extracted by the gateway. Delta Live Tables system will
   * automatically create the storage location under the catalog and schema.
   */
  @JsonProperty("gateway_storage_name")
  private String gatewayStorageName;

  /** Required, Immutable. The name of the schema for the gateway pipelines's storage location. */
  @JsonProperty("gateway_storage_schema")
  private String gatewayStorageSchema;

  public IngestionGatewayPipelineDefinition setConnectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  public String getConnectionId() {
    return connectionId;
  }

  public IngestionGatewayPipelineDefinition setGatewayStorageCatalog(String gatewayStorageCatalog) {
    this.gatewayStorageCatalog = gatewayStorageCatalog;
    return this;
  }

  public String getGatewayStorageCatalog() {
    return gatewayStorageCatalog;
  }

  public IngestionGatewayPipelineDefinition setGatewayStorageName(String gatewayStorageName) {
    this.gatewayStorageName = gatewayStorageName;
    return this;
  }

  public String getGatewayStorageName() {
    return gatewayStorageName;
  }

  public IngestionGatewayPipelineDefinition setGatewayStorageSchema(String gatewayStorageSchema) {
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
    IngestionGatewayPipelineDefinition that = (IngestionGatewayPipelineDefinition) o;
    return Objects.equals(connectionId, that.connectionId)
        && Objects.equals(gatewayStorageCatalog, that.gatewayStorageCatalog)
        && Objects.equals(gatewayStorageName, that.gatewayStorageName)
        && Objects.equals(gatewayStorageSchema, that.gatewayStorageSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        connectionId, gatewayStorageCatalog, gatewayStorageName, gatewayStorageSchema);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionGatewayPipelineDefinition.class)
        .add("connectionId", connectionId)
        .add("gatewayStorageCatalog", gatewayStorageCatalog)
        .add("gatewayStorageName", gatewayStorageName)
        .add("gatewayStorageSchema", gatewayStorageSchema)
        .toString();
  }
}
