// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Next field marker: 12 */
@Generated
class SyncedDatabaseTablePb {
  @JsonProperty("data_synchronization_status")
  private SyncedTableStatus dataSynchronizationStatus;

  @JsonProperty("database_instance_name")
  private String databaseInstanceName;

  @JsonProperty("logical_database_name")
  private String logicalDatabaseName;

  @JsonProperty("name")
  private String name;

  @JsonProperty("spec")
  private SyncedTableSpec spec;

  @JsonProperty("table_serving_url")
  private String tableServingUrl;

  @JsonProperty("unity_catalog_provisioning_state")
  private ProvisioningInfoState unityCatalogProvisioningState;

  public SyncedDatabaseTablePb setDataSynchronizationStatus(
      SyncedTableStatus dataSynchronizationStatus) {
    this.dataSynchronizationStatus = dataSynchronizationStatus;
    return this;
  }

  public SyncedTableStatus getDataSynchronizationStatus() {
    return dataSynchronizationStatus;
  }

  public SyncedDatabaseTablePb setDatabaseInstanceName(String databaseInstanceName) {
    this.databaseInstanceName = databaseInstanceName;
    return this;
  }

  public String getDatabaseInstanceName() {
    return databaseInstanceName;
  }

  public SyncedDatabaseTablePb setLogicalDatabaseName(String logicalDatabaseName) {
    this.logicalDatabaseName = logicalDatabaseName;
    return this;
  }

  public String getLogicalDatabaseName() {
    return logicalDatabaseName;
  }

  public SyncedDatabaseTablePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SyncedDatabaseTablePb setSpec(SyncedTableSpec spec) {
    this.spec = spec;
    return this;
  }

  public SyncedTableSpec getSpec() {
    return spec;
  }

  public SyncedDatabaseTablePb setTableServingUrl(String tableServingUrl) {
    this.tableServingUrl = tableServingUrl;
    return this;
  }

  public String getTableServingUrl() {
    return tableServingUrl;
  }

  public SyncedDatabaseTablePb setUnityCatalogProvisioningState(
      ProvisioningInfoState unityCatalogProvisioningState) {
    this.unityCatalogProvisioningState = unityCatalogProvisioningState;
    return this;
  }

  public ProvisioningInfoState getUnityCatalogProvisioningState() {
    return unityCatalogProvisioningState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedDatabaseTablePb that = (SyncedDatabaseTablePb) o;
    return Objects.equals(dataSynchronizationStatus, that.dataSynchronizationStatus)
        && Objects.equals(databaseInstanceName, that.databaseInstanceName)
        && Objects.equals(logicalDatabaseName, that.logicalDatabaseName)
        && Objects.equals(name, that.name)
        && Objects.equals(spec, that.spec)
        && Objects.equals(tableServingUrl, that.tableServingUrl)
        && Objects.equals(unityCatalogProvisioningState, that.unityCatalogProvisioningState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataSynchronizationStatus,
        databaseInstanceName,
        logicalDatabaseName,
        name,
        spec,
        tableServingUrl,
        unityCatalogProvisioningState);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedDatabaseTablePb.class)
        .add("dataSynchronizationStatus", dataSynchronizationStatus)
        .add("databaseInstanceName", databaseInstanceName)
        .add("logicalDatabaseName", logicalDatabaseName)
        .add("name", name)
        .add("spec", spec)
        .add("tableServingUrl", tableServingUrl)
        .add("unityCatalogProvisioningState", unityCatalogProvisioningState)
        .toString();
  }
}
