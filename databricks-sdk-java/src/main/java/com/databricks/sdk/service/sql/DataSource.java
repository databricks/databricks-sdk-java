// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** A JSON object representing a DBSQL data source / SQL warehouse. */
@Generated
@JsonSerialize(using = DataSource.DataSourceSerializer.class)
@JsonDeserialize(using = DataSource.DataSourceDeserializer.class)
public class DataSource {
  /**
   * Data source ID maps to the ID of the data source used by the resource and is distinct from the
   * warehouse ID. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/api/workspace/datasources/list
   */
  private String id;

  /**
   * The string name of this data source / SQL warehouse as it appears in the Databricks SQL web
   * application.
   */
  private String name;

  /** Reserved for internal use. */
  private String pauseReason;

  /** Reserved for internal use. */
  private Long paused;

  /** Reserved for internal use. */
  private Boolean supportsAutoLimit;

  /** Reserved for internal use. */
  private String syntax;

  /** The type of data source. For SQL warehouses, this will be `databricks_internal`. */
  private String typeValue;

  /** Reserved for internal use. */
  private Boolean viewOnly;

  /** The ID of the associated SQL warehouse, if this data source is backed by a SQL warehouse. */
  private String warehouseId;

  public DataSource setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public DataSource setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DataSource setPauseReason(String pauseReason) {
    this.pauseReason = pauseReason;
    return this;
  }

  public String getPauseReason() {
    return pauseReason;
  }

  public DataSource setPaused(Long paused) {
    this.paused = paused;
    return this;
  }

  public Long getPaused() {
    return paused;
  }

  public DataSource setSupportsAutoLimit(Boolean supportsAutoLimit) {
    this.supportsAutoLimit = supportsAutoLimit;
    return this;
  }

  public Boolean getSupportsAutoLimit() {
    return supportsAutoLimit;
  }

  public DataSource setSyntax(String syntax) {
    this.syntax = syntax;
    return this;
  }

  public String getSyntax() {
    return syntax;
  }

  public DataSource setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public DataSource setViewOnly(Boolean viewOnly) {
    this.viewOnly = viewOnly;
    return this;
  }

  public Boolean getViewOnly() {
    return viewOnly;
  }

  public DataSource setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataSource that = (DataSource) o;
    return Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(pauseReason, that.pauseReason)
        && Objects.equals(paused, that.paused)
        && Objects.equals(supportsAutoLimit, that.supportsAutoLimit)
        && Objects.equals(syntax, that.syntax)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(viewOnly, that.viewOnly)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id, name, pauseReason, paused, supportsAutoLimit, syntax, typeValue, viewOnly, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(DataSource.class)
        .add("id", id)
        .add("name", name)
        .add("pauseReason", pauseReason)
        .add("paused", paused)
        .add("supportsAutoLimit", supportsAutoLimit)
        .add("syntax", syntax)
        .add("typeValue", typeValue)
        .add("viewOnly", viewOnly)
        .add("warehouseId", warehouseId)
        .toString();
  }

  DataSourcePb toPb() {
    DataSourcePb pb = new DataSourcePb();
    pb.setId(id);
    pb.setName(name);
    pb.setPauseReason(pauseReason);
    pb.setPaused(paused);
    pb.setSupportsAutoLimit(supportsAutoLimit);
    pb.setSyntax(syntax);
    pb.setType(typeValue);
    pb.setViewOnly(viewOnly);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static DataSource fromPb(DataSourcePb pb) {
    DataSource model = new DataSource();
    model.setId(pb.getId());
    model.setName(pb.getName());
    model.setPauseReason(pb.getPauseReason());
    model.setPaused(pb.getPaused());
    model.setSupportsAutoLimit(pb.getSupportsAutoLimit());
    model.setSyntax(pb.getSyntax());
    model.setType(pb.getType());
    model.setViewOnly(pb.getViewOnly());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class DataSourceSerializer extends JsonSerializer<DataSource> {
    @Override
    public void serialize(DataSource value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DataSourcePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DataSourceDeserializer extends JsonDeserializer<DataSource> {
    @Override
    public DataSource deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DataSourcePb pb = mapper.readValue(p, DataSourcePb.class);
      return DataSource.fromPb(pb);
    }
  }
}
