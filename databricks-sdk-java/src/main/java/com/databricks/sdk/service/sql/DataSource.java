// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A JSON object representing a DBSQL data source / SQL warehouse.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DataSource {
  /**
   * The unique identifier for this data source / SQL warehouse. Can be used when creating /
   * modifying queries and dashboards.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The string name of this data source / SQL warehouse as it appears in the Databricks SQL web
   * application.
   */
  @JsonProperty("name")
  private String name;

  /** Reserved for internal use. */
  @JsonProperty("pause_reason")
  private String pauseReason;

  /** Reserved for internal use. */
  @JsonProperty("paused")
  private Long paused;

  /** Reserved for internal use. */
  @JsonProperty("supports_auto_limit")
  private Boolean supportsAutoLimit;

  /** Reserved for internal use. */
  @JsonProperty("syntax")
  private String syntax;

  /** The type of data source. For SQL warehouses, this will be `databricks_internal`. */
  @JsonProperty("type")
  private String typeValue;

  /** Reserved for internal use. */
  @JsonProperty("view_only")
  private Boolean viewOnly;

  /** The ID of the associated SQL warehouse, if this data source is backed by a SQL warehouse. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.DataSource} object
   */
  public DataSource setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.DataSource} object
   */
  public DataSource setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>pauseReason</code>.</p>
   *
   * @param pauseReason a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.DataSource} object
   */
  public DataSource setPauseReason(String pauseReason) {
    this.pauseReason = pauseReason;
    return this;
  }

  /**
   * <p>Getter for the field <code>pauseReason</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPauseReason() {
    return pauseReason;
  }

  /**
   * <p>Setter for the field <code>paused</code>.</p>
   *
   * @param paused a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.DataSource} object
   */
  public DataSource setPaused(Long paused) {
    this.paused = paused;
    return this;
  }

  /**
   * <p>Getter for the field <code>paused</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPaused() {
    return paused;
  }

  /**
   * <p>Setter for the field <code>supportsAutoLimit</code>.</p>
   *
   * @param supportsAutoLimit a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.DataSource} object
   */
  public DataSource setSupportsAutoLimit(Boolean supportsAutoLimit) {
    this.supportsAutoLimit = supportsAutoLimit;
    return this;
  }

  /**
   * <p>Getter for the field <code>supportsAutoLimit</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getSupportsAutoLimit() {
    return supportsAutoLimit;
  }

  /**
   * <p>Setter for the field <code>syntax</code>.</p>
   *
   * @param syntax a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.DataSource} object
   */
  public DataSource setSyntax(String syntax) {
    this.syntax = syntax;
    return this;
  }

  /**
   * <p>Getter for the field <code>syntax</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSyntax() {
    return syntax;
  }

  /**
   * <p>setType.</p>
   *
   * @param typeValue a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.DataSource} object
   */
  public DataSource setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  /**
   * <p>getType.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getType() {
    return typeValue;
  }

  /**
   * <p>Setter for the field <code>viewOnly</code>.</p>
   *
   * @param viewOnly a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.DataSource} object
   */
  public DataSource setViewOnly(Boolean viewOnly) {
    this.viewOnly = viewOnly;
    return this;
  }

  /**
   * <p>Getter for the field <code>viewOnly</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getViewOnly() {
    return viewOnly;
  }

  /**
   * <p>Setter for the field <code>warehouseId</code>.</p>
   *
   * @param warehouseId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.DataSource} object
   */
  public DataSource setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  /**
   * <p>Getter for the field <code>warehouseId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWarehouseId() {
    return warehouseId;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        id, name, pauseReason, paused, supportsAutoLimit, syntax, typeValue, viewOnly, warehouseId);
  }

  /** {@inheritDoc} */
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
}
