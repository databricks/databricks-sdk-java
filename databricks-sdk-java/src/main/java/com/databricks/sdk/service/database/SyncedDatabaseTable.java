// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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

/** Next field marker: 12 */
@Generated
@JsonSerialize(using = SyncedDatabaseTable.SyncedDatabaseTableSerializer.class)
@JsonDeserialize(using = SyncedDatabaseTable.SyncedDatabaseTableDeserializer.class)
public class SyncedDatabaseTable {
  /** Synced Table data synchronization status */
  private SyncedTableStatus dataSynchronizationStatus;

  /**
   * Name of the target database instance. This is required when creating synced database tables in
   * standard catalogs. This is optional when creating synced database tables in registered
   * catalogs. If this field is specified when creating synced database tables in registered
   * catalogs, the database instance name MUST match that of the registered catalog (or the request
   * will be rejected).
   */
  private String databaseInstanceName;

  /**
   * Target Postgres database object (logical database) name for this table. This field is optional
   * in all scenarios.
   *
   * <p>When creating a synced table in a registered Postgres catalog, the target Postgres database
   * name is inferred to be that of the registered catalog. If this field is specified in this
   * scenario, the Postgres database name MUST match that of the registered catalog (or the request
   * will be rejected).
   *
   * <p>When creating a synced table in a standard catalog, the target database name is inferred to
   * be that of the standard catalog. In this scenario, specifying this field will allow targeting
   * an arbitrary postgres database.
   */
  private String logicalDatabaseName;

  /** Full three-part (catalog, schema, table) name of the table. */
  private String name;

  /** Specification of a synced database table. */
  private SyncedTableSpec spec;

  /** Data serving REST API URL for this table */
  private String tableServingUrl;

  /**
   * The provisioning state of the synced table entity in Unity Catalog. This is distinct from the
   * state of the data synchronization pipeline (i.e. the table may be in "ACTIVE" but the pipeline
   * may be in "PROVISIONING" as it runs asynchronously).
   */
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

  public SyncedDatabaseTable setTableServingUrl(String tableServingUrl) {
    this.tableServingUrl = tableServingUrl;
    return this;
  }

  public String getTableServingUrl() {
    return tableServingUrl;
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
    return new ToStringer(SyncedDatabaseTable.class)
        .add("dataSynchronizationStatus", dataSynchronizationStatus)
        .add("databaseInstanceName", databaseInstanceName)
        .add("logicalDatabaseName", logicalDatabaseName)
        .add("name", name)
        .add("spec", spec)
        .add("tableServingUrl", tableServingUrl)
        .add("unityCatalogProvisioningState", unityCatalogProvisioningState)
        .toString();
  }

  SyncedDatabaseTablePb toPb() {
    SyncedDatabaseTablePb pb = new SyncedDatabaseTablePb();
    pb.setDataSynchronizationStatus(dataSynchronizationStatus);
    pb.setDatabaseInstanceName(databaseInstanceName);
    pb.setLogicalDatabaseName(logicalDatabaseName);
    pb.setName(name);
    pb.setSpec(spec);
    pb.setTableServingUrl(tableServingUrl);
    pb.setUnityCatalogProvisioningState(unityCatalogProvisioningState);

    return pb;
  }

  static SyncedDatabaseTable fromPb(SyncedDatabaseTablePb pb) {
    SyncedDatabaseTable model = new SyncedDatabaseTable();
    model.setDataSynchronizationStatus(pb.getDataSynchronizationStatus());
    model.setDatabaseInstanceName(pb.getDatabaseInstanceName());
    model.setLogicalDatabaseName(pb.getLogicalDatabaseName());
    model.setName(pb.getName());
    model.setSpec(pb.getSpec());
    model.setTableServingUrl(pb.getTableServingUrl());
    model.setUnityCatalogProvisioningState(pb.getUnityCatalogProvisioningState());

    return model;
  }

  public static class SyncedDatabaseTableSerializer extends JsonSerializer<SyncedDatabaseTable> {
    @Override
    public void serialize(SyncedDatabaseTable value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SyncedDatabaseTablePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SyncedDatabaseTableDeserializer
      extends JsonDeserializer<SyncedDatabaseTable> {
    @Override
    public SyncedDatabaseTable deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SyncedDatabaseTablePb pb = mapper.readValue(p, SyncedDatabaseTablePb.class);
      return SyncedDatabaseTable.fromPb(pb);
    }
  }
}
