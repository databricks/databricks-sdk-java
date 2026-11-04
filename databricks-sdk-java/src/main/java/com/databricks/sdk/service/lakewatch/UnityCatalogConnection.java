// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Map;
import java.util.Objects;

/**
 * Ingests data through a managed connector that uses a Unity Catalog connection. Mutually exclusive
 * with `autoloader` and `existing_table`.
 */
@Generated
public class UnityCatalogConnection {
  /** Free-form key-value configuration for the managed ingestion pipeline. */
  @JsonProperty("configuration")
  private Map<String, String> configuration;

  /** Name of the Unity Catalog connection to ingest through. */
  @JsonProperty("connection_name")
  private String connectionName;

  /**
   * Connector type of the connection, such as `SLACK_AUDIT_LOGS`. Resolved by the server from
   * `connection_name` through Unity Catalog; not accepted as input.
   */
  @JsonProperty("connector")
  private String connector;

  /**
   * The start time ingestion uses: the supplied `start_time`, or the creation time when it was
   * omitted. Always populated.
   */
  @JsonProperty("effective_start_time")
  private Timestamp effectiveStartTime;

  /**
   * Earliest source event time to ingest. Leave unset to start at creation time, with no history
   * backfilled. Rejected if in the future, beyond the connector's history window, or for a
   * connector without start-time support. Takes effect only at first start and cannot be changed.
   * Reads return the value as supplied; the start time ingestion uses is reported in
   * `effective_start_time`.
   */
  @JsonProperty("start_time")
  private Timestamp startTime;

  public UnityCatalogConnection setConfiguration(Map<String, String> configuration) {
    this.configuration = configuration;
    return this;
  }

  public Map<String, String> getConfiguration() {
    return configuration;
  }

  public UnityCatalogConnection setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public UnityCatalogConnection setConnector(String connector) {
    this.connector = connector;
    return this;
  }

  public String getConnector() {
    return connector;
  }

  public UnityCatalogConnection setEffectiveStartTime(Timestamp effectiveStartTime) {
    this.effectiveStartTime = effectiveStartTime;
    return this;
  }

  public Timestamp getEffectiveStartTime() {
    return effectiveStartTime;
  }

  public UnityCatalogConnection setStartTime(Timestamp startTime) {
    this.startTime = startTime;
    return this;
  }

  public Timestamp getStartTime() {
    return startTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UnityCatalogConnection that = (UnityCatalogConnection) o;
    return Objects.equals(configuration, that.configuration)
        && Objects.equals(connectionName, that.connectionName)
        && Objects.equals(connector, that.connector)
        && Objects.equals(effectiveStartTime, that.effectiveStartTime)
        && Objects.equals(startTime, that.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, connectionName, connector, effectiveStartTime, startTime);
  }

  @Override
  public String toString() {
    return new ToStringer(UnityCatalogConnection.class)
        .add("configuration", configuration)
        .add("connectionName", connectionName)
        .add("connector", connector)
        .add("effectiveStartTime", effectiveStartTime)
        .add("startTime", startTime)
        .toString();
  }
}
