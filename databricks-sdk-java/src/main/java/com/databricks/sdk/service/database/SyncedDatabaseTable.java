// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Next field marker: 12 */
@Generated
public class SyncedDatabaseTable {
  /** Synced Table data synchronization status */
  @JsonProperty("data_synchronization_status")
  private SyncedTableStatus dataSynchronizationStatus;

  /**
   * Name of the target database instance. This is required when creating synced database tables in
   * standard catalogs. This is optional when creating synced database tables in registered
   * catalogs. If this field is specified when creating synced database tables in registered
   * catalogs, the database instance name MUST match that of the registered catalog (or the request
   * will be rejected).
   */
  @JsonProperty("database_instance_name")
  private String databaseInstanceName;

  /**
   * Target Postgres database object (logical database) name for this table.
   *
   * <p>When creating a synced table in a registered Postgres catalog, the target Postgres database
   * name is inferred to be that of the registered catalog. If this field is specified in this
   * scenario, the Postgres database name MUST match that of the registered catalog (or the request
   * will be rejected).
   *
   * <p>When creating a synced table in a standard catalog, this field is required. In this
   * scenario, specifying this field will allow targeting an arbitrary postgres database. Note that
   * this has implications for the `create_database_objects_is_missing` field in `spec`.
   */
  @JsonProperty("logical_database_name")
  private String logicalDatabaseName;

  /** Full three-part (catalog, schema, table) name of the table. */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("spec")
  private SyncedTableSpec spec;

  /**
   * The provisioning state of the synced table entity in Unity Catalog. This is distinct from the
   * state of the data synchronization pipeline (i.e. the table may be in "ACTIVE" but the pipeline
   * may be in "PROVISIONING" as it runs asynchronously).
   */
  @JsonProperty("unity_catalog_provisioning_state")
  private ProvisioningInfoState unityCatalogProvisioningState;

  public SyncedDatabaseTable setDataSynchronizationStatus(
      SyncedTableStatus dataSynchronizationStatus) {
    this.dataSynchronizationStatus = dataSynchronizationStatus;
    return this;
  }

  public SyncedTableStatus getDataSynchronizationStatus() {
    return dataSynchronizationStatus;
  }

  public SyncedDatabaseTable setDatabaseInstanceName(String databaseInstanceName) {
    this.databaseInstanceName = databaseInstanceName;
    return this;
  }

  public String getDatabaseInstanceName() {
    return databaseInstanceName;
  }

  public SyncedDatabaseTable setLogicalDatabaseName(String logicalDatabaseName) {
    this.logicalDatabaseName = logicalDatabaseName;
    return this;
  }

  public String getLogicalDatabaseName() {
    return logicalDatabaseName;
  }

  public SyncedDatabaseTable setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SyncedDatabaseTable setSpec(SyncedTableSpec spec) {
    this.spec = spec;
    return this;
  }

  public SyncedTableSpec getSpec() {
    return spec;
  }

  public SyncedDatabaseTable setUnityCatalogProvisioningState(
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
    SyncedDatabaseTable that = (SyncedDatabaseTable) o;
    return Objects.equals(dataSynchronizationStatus, that.dataSynchronizationStatus)
        && Objects.equals(databaseInstanceName, that.databaseInstanceName)
        && Objects.equals(logicalDatabaseName, that.logicalDatabaseName)
        && Objects.equals(name, that.name)
        && Objects.equals(spec, that.spec)
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
        unityCatalogProvisioningState);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedDatabaseTable.class)
        .add("dataSynchronizationStatus", dataSynchronizationStatus)
        .add("databaseInstanceName", databaseInstanceName)
        .add("logicalDatabaseName", logicalDatabaseName)
        .add("name", name)
        .add("spec", spec)
        .add("unityCatalogProvisioningState", unityCatalogProvisioningState)
        .toString();
  }
}
