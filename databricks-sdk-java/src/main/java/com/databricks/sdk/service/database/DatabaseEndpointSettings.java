// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** A collection of settings for a compute endpoint */
@Generated
public class DatabaseEndpointSettings {
  /** A raw representation of Postgres settings. */
  @JsonProperty("pg_settings")
  private Map<String, String> pgSettings;

  /** A raw representation of PgBouncer settings. */
  @JsonProperty("pgbouncer_settings")
  private Map<String, String> pgbouncerSettings;

  public DatabaseEndpointSettings setPgSettings(Map<String, String> pgSettings) {
    this.pgSettings = pgSettings;
    return this;
  }

  public Map<String, String> getPgSettings() {
    return pgSettings;
  }

  public DatabaseEndpointSettings setPgbouncerSettings(Map<String, String> pgbouncerSettings) {
    this.pgbouncerSettings = pgbouncerSettings;
    return this;
  }

  public Map<String, String> getPgbouncerSettings() {
    return pgbouncerSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseEndpointSettings that = (DatabaseEndpointSettings) o;
    return Objects.equals(pgSettings, that.pgSettings)
        && Objects.equals(pgbouncerSettings, that.pgbouncerSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pgSettings, pgbouncerSettings);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseEndpointSettings.class)
        .add("pgSettings", pgSettings)
        .add("pgbouncerSettings", pgbouncerSettings)
        .toString();
  }
}
