// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PowerBiTaskPb {
  @JsonProperty("connection_resource_name")
  private String connectionResourceName;

  @JsonProperty("power_bi_model")
  private PowerBiModel powerBiModel;

  @JsonProperty("refresh_after_update")
  private Boolean refreshAfterUpdate;

  @JsonProperty("tables")
  private Collection<PowerBiTable> tables;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public PowerBiTaskPb setConnectionResourceName(String connectionResourceName) {
    this.connectionResourceName = connectionResourceName;
    return this;
  }

  public String getConnectionResourceName() {
    return connectionResourceName;
  }

  public PowerBiTaskPb setPowerBiModel(PowerBiModel powerBiModel) {
    this.powerBiModel = powerBiModel;
    return this;
  }

  public PowerBiModel getPowerBiModel() {
    return powerBiModel;
  }

  public PowerBiTaskPb setRefreshAfterUpdate(Boolean refreshAfterUpdate) {
    this.refreshAfterUpdate = refreshAfterUpdate;
    return this;
  }

  public Boolean getRefreshAfterUpdate() {
    return refreshAfterUpdate;
  }

  public PowerBiTaskPb setTables(Collection<PowerBiTable> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<PowerBiTable> getTables() {
    return tables;
  }

  public PowerBiTaskPb setWarehouseId(String warehouseId) {
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
    PowerBiTaskPb that = (PowerBiTaskPb) o;
    return Objects.equals(connectionResourceName, that.connectionResourceName)
        && Objects.equals(powerBiModel, that.powerBiModel)
        && Objects.equals(refreshAfterUpdate, that.refreshAfterUpdate)
        && Objects.equals(tables, that.tables)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        connectionResourceName, powerBiModel, refreshAfterUpdate, tables, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(PowerBiTaskPb.class)
        .add("connectionResourceName", connectionResourceName)
        .add("powerBiModel", powerBiModel)
        .add("refreshAfterUpdate", refreshAfterUpdate)
        .add("tables", tables)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
