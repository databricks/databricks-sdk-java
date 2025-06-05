// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A JSON object representing a DBSQL data source / SQL warehouse. */
@Generated
class DataSourcePb {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pause_reason")
  private String pauseReason;

  @JsonProperty("paused")
  private Long paused;

  @JsonProperty("supports_auto_limit")
  private Boolean supportsAutoLimit;

  @JsonProperty("syntax")
  private String syntax;

  @JsonProperty("type")
  private String typeValue;

  @JsonProperty("view_only")
  private Boolean viewOnly;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public DataSourcePb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public DataSourcePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DataSourcePb setPauseReason(String pauseReason) {
    this.pauseReason = pauseReason;
    return this;
  }

  public String getPauseReason() {
    return pauseReason;
  }

  public DataSourcePb setPaused(Long paused) {
    this.paused = paused;
    return this;
  }

  public Long getPaused() {
    return paused;
  }

  public DataSourcePb setSupportsAutoLimit(Boolean supportsAutoLimit) {
    this.supportsAutoLimit = supportsAutoLimit;
    return this;
  }

  public Boolean getSupportsAutoLimit() {
    return supportsAutoLimit;
  }

  public DataSourcePb setSyntax(String syntax) {
    this.syntax = syntax;
    return this;
  }

  public String getSyntax() {
    return syntax;
  }

  public DataSourcePb setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public DataSourcePb setViewOnly(Boolean viewOnly) {
    this.viewOnly = viewOnly;
    return this;
  }

  public Boolean getViewOnly() {
    return viewOnly;
  }

  public DataSourcePb setWarehouseId(String warehouseId) {
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
    DataSourcePb that = (DataSourcePb) o;
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
    return new ToStringer(DataSourcePb.class)
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
}
