// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = PowerBiTable.PowerBiTableSerializer.class)
@JsonDeserialize(using = PowerBiTable.PowerBiTableDeserializer.class)
public class PowerBiTable {
  /** The catalog name in Databricks */
  private String catalog;

  /** The table name in Databricks */
  private String name;

  /** The schema name in Databricks */
  private String schema;

  /** The Power BI storage mode of the table */
  private StorageMode storageMode;

  public PowerBiTable setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public PowerBiTable setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PowerBiTable setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public PowerBiTable setStorageMode(StorageMode storageMode) {
    this.storageMode = storageMode;
    return this;
  }

  public StorageMode getStorageMode() {
    return storageMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PowerBiTable that = (PowerBiTable) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(name, that.name)
        && Objects.equals(schema, that.schema)
        && Objects.equals(storageMode, that.storageMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, name, schema, storageMode);
  }

  @Override
  public String toString() {
    return new ToStringer(PowerBiTable.class)
        .add("catalog", catalog)
        .add("name", name)
        .add("schema", schema)
        .add("storageMode", storageMode)
        .toString();
  }

  PowerBiTablePb toPb() {
    PowerBiTablePb pb = new PowerBiTablePb();
    pb.setCatalog(catalog);
    pb.setName(name);
    pb.setSchema(schema);
    pb.setStorageMode(storageMode);

    return pb;
  }

  static PowerBiTable fromPb(PowerBiTablePb pb) {
    PowerBiTable model = new PowerBiTable();
    model.setCatalog(pb.getCatalog());
    model.setName(pb.getName());
    model.setSchema(pb.getSchema());
    model.setStorageMode(pb.getStorageMode());

    return model;
  }

  public static class PowerBiTableSerializer extends JsonSerializer<PowerBiTable> {
    @Override
    public void serialize(PowerBiTable value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PowerBiTablePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PowerBiTableDeserializer extends JsonDeserializer<PowerBiTable> {
    @Override
    public PowerBiTable deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PowerBiTablePb pb = mapper.readValue(p, PowerBiTablePb.class);
      return PowerBiTable.fromPb(pb);
    }
  }
}
