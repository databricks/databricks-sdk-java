// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = AiGatewayInferenceTableConfig.AiGatewayInferenceTableConfigSerializer.class)
@JsonDeserialize(
    using = AiGatewayInferenceTableConfig.AiGatewayInferenceTableConfigDeserializer.class)
public class AiGatewayInferenceTableConfig {
  /**
   * The name of the catalog in Unity Catalog. Required when enabling inference tables. NOTE: On
   * update, you have to disable inference table first in order to change the catalog name.
   */
  private String catalogName;

  /** Indicates whether the inference table is enabled. */
  private Boolean enabled;

  /**
   * The name of the schema in Unity Catalog. Required when enabling inference tables. NOTE: On
   * update, you have to disable inference table first in order to change the schema name.
   */
  private String schemaName;

  /**
   * The prefix of the table in Unity Catalog. NOTE: On update, you have to disable inference table
   * first in order to change the prefix name.
   */
  private String tableNamePrefix;

  public AiGatewayInferenceTableConfig setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public AiGatewayInferenceTableConfig setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public AiGatewayInferenceTableConfig setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public AiGatewayInferenceTableConfig setTableNamePrefix(String tableNamePrefix) {
    this.tableNamePrefix = tableNamePrefix;
    return this;
  }

  public String getTableNamePrefix() {
    return tableNamePrefix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiGatewayInferenceTableConfig that = (AiGatewayInferenceTableConfig) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(tableNamePrefix, that.tableNamePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, enabled, schemaName, tableNamePrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(AiGatewayInferenceTableConfig.class)
        .add("catalogName", catalogName)
        .add("enabled", enabled)
        .add("schemaName", schemaName)
        .add("tableNamePrefix", tableNamePrefix)
        .toString();
  }

  AiGatewayInferenceTableConfigPb toPb() {
    AiGatewayInferenceTableConfigPb pb = new AiGatewayInferenceTableConfigPb();
    pb.setCatalogName(catalogName);
    pb.setEnabled(enabled);
    pb.setSchemaName(schemaName);
    pb.setTableNamePrefix(tableNamePrefix);

    return pb;
  }

  static AiGatewayInferenceTableConfig fromPb(AiGatewayInferenceTableConfigPb pb) {
    AiGatewayInferenceTableConfig model = new AiGatewayInferenceTableConfig();
    model.setCatalogName(pb.getCatalogName());
    model.setEnabled(pb.getEnabled());
    model.setSchemaName(pb.getSchemaName());
    model.setTableNamePrefix(pb.getTableNamePrefix());

    return model;
  }

  public static class AiGatewayInferenceTableConfigSerializer
      extends JsonSerializer<AiGatewayInferenceTableConfig> {
    @Override
    public void serialize(
        AiGatewayInferenceTableConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AiGatewayInferenceTableConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AiGatewayInferenceTableConfigDeserializer
      extends JsonDeserializer<AiGatewayInferenceTableConfig> {
    @Override
    public AiGatewayInferenceTableConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AiGatewayInferenceTableConfigPb pb =
          mapper.readValue(p, AiGatewayInferenceTableConfigPb.class);
      return AiGatewayInferenceTableConfig.fromPb(pb);
    }
  }
}
