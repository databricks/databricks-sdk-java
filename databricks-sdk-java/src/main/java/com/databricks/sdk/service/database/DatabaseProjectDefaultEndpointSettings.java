// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** A collection of settings for a database endpoint. */
@Generated
public class DatabaseProjectDefaultEndpointSettings {
  /** The maximum number of Compute Units. */
  @JsonProperty("autoscaling_limit_max_cu")
  private Double autoscalingLimitMaxCu;

  /** The minimum number of Compute Units. */
  @JsonProperty("autoscaling_limit_min_cu")
  private Double autoscalingLimitMinCu;

  /** A raw representation of Postgres settings. */
  @JsonProperty("pg_settings")
  private Map<String, String> pgSettings;

  /** A raw representation of PgBouncer settings. */
  @JsonProperty("pgbouncer_settings")
  private Map<String, String> pgbouncerSettings;

  /** Duration of inactivity after which the compute endpoint is automatically suspended. */
  @JsonProperty("suspend_timeout_duration")
  private String suspendTimeoutDuration;

  public DatabaseProjectDefaultEndpointSettings setAutoscalingLimitMaxCu(
      Double autoscalingLimitMaxCu) {
    this.autoscalingLimitMaxCu = autoscalingLimitMaxCu;
    return this;
  }

  public Double getAutoscalingLimitMaxCu() {
    return autoscalingLimitMaxCu;
  }

  public DatabaseProjectDefaultEndpointSettings setAutoscalingLimitMinCu(
      Double autoscalingLimitMinCu) {
    this.autoscalingLimitMinCu = autoscalingLimitMinCu;
    return this;
  }

  public Double getAutoscalingLimitMinCu() {
    return autoscalingLimitMinCu;
  }

  public DatabaseProjectDefaultEndpointSettings setPgSettings(Map<String, String> pgSettings) {
    this.pgSettings = pgSettings;
    return this;
  }

  public Map<String, String> getPgSettings() {
    return pgSettings;
  }

  public DatabaseProjectDefaultEndpointSettings setPgbouncerSettings(
      Map<String, String> pgbouncerSettings) {
    this.pgbouncerSettings = pgbouncerSettings;
    return this;
  }

  public Map<String, String> getPgbouncerSettings() {
    return pgbouncerSettings;
  }

  public DatabaseProjectDefaultEndpointSettings setSuspendTimeoutDuration(
      String suspendTimeoutDuration) {
    this.suspendTimeoutDuration = suspendTimeoutDuration;
    return this;
  }

  public String getSuspendTimeoutDuration() {
    return suspendTimeoutDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseProjectDefaultEndpointSettings that = (DatabaseProjectDefaultEndpointSettings) o;
    return Objects.equals(autoscalingLimitMaxCu, that.autoscalingLimitMaxCu)
        && Objects.equals(autoscalingLimitMinCu, that.autoscalingLimitMinCu)
        && Objects.equals(pgSettings, that.pgSettings)
        && Objects.equals(pgbouncerSettings, that.pgbouncerSettings)
        && Objects.equals(suspendTimeoutDuration, that.suspendTimeoutDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoscalingLimitMaxCu,
        autoscalingLimitMinCu,
        pgSettings,
        pgbouncerSettings,
        suspendTimeoutDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseProjectDefaultEndpointSettings.class)
        .add("autoscalingLimitMaxCu", autoscalingLimitMaxCu)
        .add("autoscalingLimitMinCu", autoscalingLimitMinCu)
        .add("pgSettings", pgSettings)
        .add("pgbouncerSettings", pgbouncerSettings)
        .add("suspendTimeoutDuration", suspendTimeoutDuration)
        .toString();
  }
}
