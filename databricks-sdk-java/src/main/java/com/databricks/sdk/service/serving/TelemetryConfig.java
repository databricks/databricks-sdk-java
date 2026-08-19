// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TelemetryConfig {
  /**
   * The telemetry signals to enable for this endpoint. If empty or omitted, all signals are
   * enabled; otherwise only the listed signals are enabled.
   */
  @JsonProperty("enabled_telemetry_features")
  private Collection<TelemetryFeature> enabledTelemetryFeatures;

  /** Configuration for inference table payload logging, including sampling. */
  @JsonProperty("inference_table_config")
  private TelemetryInferenceTableConfig inferenceTableConfig;

  /**
   * The Unity Catalog tables to which endpoint telemetry (logs, traces, and metrics) is exported.
   * Provide this to create a new telemetry profile for the endpoint from the given tables.
   */
  @JsonProperty("table_names")
  private UnityCatalogTableNames tableNames;

  /**
   * The ID of an existing telemetry profile to apply to this endpoint. Provide this to reuse a
   * telemetry profile that has already been created, instead of specifying table_names.
   */
  @JsonProperty("telemetry_profile_id")
  private String telemetryProfileId;

  public TelemetryConfig setEnabledTelemetryFeatures(
      Collection<TelemetryFeature> enabledTelemetryFeatures) {
    this.enabledTelemetryFeatures = enabledTelemetryFeatures;
    return this;
  }

  public Collection<TelemetryFeature> getEnabledTelemetryFeatures() {
    return enabledTelemetryFeatures;
  }

  public TelemetryConfig setInferenceTableConfig(
      TelemetryInferenceTableConfig inferenceTableConfig) {
    this.inferenceTableConfig = inferenceTableConfig;
    return this;
  }

  public TelemetryInferenceTableConfig getInferenceTableConfig() {
    return inferenceTableConfig;
  }

  public TelemetryConfig setTableNames(UnityCatalogTableNames tableNames) {
    this.tableNames = tableNames;
    return this;
  }

  public UnityCatalogTableNames getTableNames() {
    return tableNames;
  }

  public TelemetryConfig setTelemetryProfileId(String telemetryProfileId) {
    this.telemetryProfileId = telemetryProfileId;
    return this;
  }

  public String getTelemetryProfileId() {
    return telemetryProfileId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TelemetryConfig that = (TelemetryConfig) o;
    return Objects.equals(enabledTelemetryFeatures, that.enabledTelemetryFeatures)
        && Objects.equals(inferenceTableConfig, that.inferenceTableConfig)
        && Objects.equals(tableNames, that.tableNames)
        && Objects.equals(telemetryProfileId, that.telemetryProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        enabledTelemetryFeatures, inferenceTableConfig, tableNames, telemetryProfileId);
  }

  @Override
  public String toString() {
    return new ToStringer(TelemetryConfig.class)
        .add("enabledTelemetryFeatures", enabledTelemetryFeatures)
        .add("inferenceTableConfig", inferenceTableConfig)
        .add("tableNames", tableNames)
        .add("telemetryProfileId", telemetryProfileId)
        .toString();
  }
}
