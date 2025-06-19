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
@JsonSerialize(
    using = IngestionGatewayPipelineDefinition.IngestionGatewayPipelineDefinitionSerializer.class)
@JsonDeserialize(
    using = IngestionGatewayPipelineDefinition.IngestionGatewayPipelineDefinitionDeserializer.class)
public class IngestionGatewayPipelineDefinition {
  /**
   * [Deprecated, use connection_name instead] Immutable. The Unity Catalog connection that this
   * gateway pipeline uses to communicate with the source.
   */
  private String connectionId;

  /**
   * Immutable. The Unity Catalog connection that this gateway pipeline uses to communicate with the
   * source.
   */
  private String connectionName;

  /** Required, Immutable. The name of the catalog for the gateway pipeline's storage location. */
  private String gatewayStorageCatalog;

  /**
   * Optional. The Unity Catalog-compatible name for the gateway storage location. This is the
   * destination to use for the data that is extracted by the gateway. Delta Live Tables system will
   * automatically create the storage location under the catalog and schema.
   */
  private String gatewayStorageName;

  /** Required, Immutable. The name of the schema for the gateway pipelines's storage location. */
  private String gatewayStorageSchema;

  public IngestionGatewayPipelineDefinition setConnectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  public String getConnectionId() {
    return connectionId;
  }

  public IngestionGatewayPipelineDefinition setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
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
    return new ToStringer(IngestionGatewayPipelineDefinition.class)
        .add("connectionId", connectionId)
        .add("connectionName", connectionName)
        .add("gatewayStorageCatalog", gatewayStorageCatalog)
        .add("gatewayStorageName", gatewayStorageName)
        .add("gatewayStorageSchema", gatewayStorageSchema)
        .toString();
  }

  IngestionGatewayPipelineDefinitionPb toPb() {
    IngestionGatewayPipelineDefinitionPb pb = new IngestionGatewayPipelineDefinitionPb();
    pb.setConnectionId(connectionId);
    pb.setConnectionName(connectionName);
    pb.setGatewayStorageCatalog(gatewayStorageCatalog);
    pb.setGatewayStorageName(gatewayStorageName);
    pb.setGatewayStorageSchema(gatewayStorageSchema);

    return pb;
  }

  static IngestionGatewayPipelineDefinition fromPb(IngestionGatewayPipelineDefinitionPb pb) {
    IngestionGatewayPipelineDefinition model = new IngestionGatewayPipelineDefinition();
    model.setConnectionId(pb.getConnectionId());
    model.setConnectionName(pb.getConnectionName());
    model.setGatewayStorageCatalog(pb.getGatewayStorageCatalog());
    model.setGatewayStorageName(pb.getGatewayStorageName());
    model.setGatewayStorageSchema(pb.getGatewayStorageSchema());

    return model;
  }

  public static class IngestionGatewayPipelineDefinitionSerializer
      extends JsonSerializer<IngestionGatewayPipelineDefinition> {
    @Override
    public void serialize(
        IngestionGatewayPipelineDefinition value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      IngestionGatewayPipelineDefinitionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class IngestionGatewayPipelineDefinitionDeserializer
      extends JsonDeserializer<IngestionGatewayPipelineDefinition> {
    @Override
    public IngestionGatewayPipelineDefinition deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      IngestionGatewayPipelineDefinitionPb pb =
          mapper.readValue(p, IngestionGatewayPipelineDefinitionPb.class);
      return IngestionGatewayPipelineDefinition.fromPb(pb);
    }
  }
}
