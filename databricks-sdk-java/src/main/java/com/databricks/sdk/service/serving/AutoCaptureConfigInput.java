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
@JsonSerialize(using = AutoCaptureConfigInput.AutoCaptureConfigInputSerializer.class)
@JsonDeserialize(using = AutoCaptureConfigInput.AutoCaptureConfigInputDeserializer.class)
public class AutoCaptureConfigInput {
  /**
   * The name of the catalog in Unity Catalog. NOTE: On update, you cannot change the catalog name
   * if the inference table is already enabled.
   */
  private String catalogName;

  /** Indicates whether the inference table is enabled. */
  private Boolean enabled;

  /**
   * The name of the schema in Unity Catalog. NOTE: On update, you cannot change the schema name if
   * the inference table is already enabled.
   */
  private String schemaName;

  /**
   * The prefix of the table in Unity Catalog. NOTE: On update, you cannot change the prefix name if
   * the inference table is already enabled.
   */
  private String tableNamePrefix;

  public AutoCaptureConfigInput setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public AutoCaptureConfigInput setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public AutoCaptureConfigInput setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public AutoCaptureConfigInput setTableNamePrefix(String tableNamePrefix) {
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
    AutoCaptureConfigInput that = (AutoCaptureConfigInput) o;
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
    return new ToStringer(AutoCaptureConfigInput.class)
        .add("catalogName", catalogName)
        .add("enabled", enabled)
        .add("schemaName", schemaName)
        .add("tableNamePrefix", tableNamePrefix)
        .toString();
  }

  AutoCaptureConfigInputPb toPb() {
    AutoCaptureConfigInputPb pb = new AutoCaptureConfigInputPb();
    pb.setCatalogName(catalogName);
    pb.setEnabled(enabled);
    pb.setSchemaName(schemaName);
    pb.setTableNamePrefix(tableNamePrefix);

    return pb;
  }

  static AutoCaptureConfigInput fromPb(AutoCaptureConfigInputPb pb) {
    AutoCaptureConfigInput model = new AutoCaptureConfigInput();
    model.setCatalogName(pb.getCatalogName());
    model.setEnabled(pb.getEnabled());
    model.setSchemaName(pb.getSchemaName());
    model.setTableNamePrefix(pb.getTableNamePrefix());

    return model;
  }

  public static class AutoCaptureConfigInputSerializer
      extends JsonSerializer<AutoCaptureConfigInput> {
    @Override
    public void serialize(
        AutoCaptureConfigInput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AutoCaptureConfigInputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AutoCaptureConfigInputDeserializer
      extends JsonDeserializer<AutoCaptureConfigInput> {
    @Override
    public AutoCaptureConfigInput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AutoCaptureConfigInputPb pb = mapper.readValue(p, AutoCaptureConfigInputPb.class);
      return AutoCaptureConfigInput.fromPb(pb);
    }
  }
}
