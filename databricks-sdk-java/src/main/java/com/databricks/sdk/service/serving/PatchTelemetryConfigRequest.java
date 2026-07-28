// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Updates the telemetry configuration of a serving endpoint. */
@Generated
public class PatchTelemetryConfigRequest {
  /**
   * The name of the serving endpoint whose telemetry configuration is being updated. This field is
   * required.
   */
  @JsonIgnore private String name;

  /**
   * The telemetry configuration to be applied to the serving endpoint. Can specify either a
   * telemetry_profile_id to use an existing profile, or table_names to create a new profile with
   * the specified Unity Catalog tables. If not provided, the telemetry configuration will be
   * removed from the endpoint.
   */
  @JsonProperty("telemetry_config")
  private TelemetryConfig telemetryConfig;

  public PatchTelemetryConfigRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PatchTelemetryConfigRequest setTelemetryConfig(TelemetryConfig telemetryConfig) {
    this.telemetryConfig = telemetryConfig;
    return this;
  }

  public TelemetryConfig getTelemetryConfig() {
    return telemetryConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PatchTelemetryConfigRequest that = (PatchTelemetryConfigRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(telemetryConfig, that.telemetryConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, telemetryConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchTelemetryConfigRequest.class)
        .add("name", name)
        .add("telemetryConfig", telemetryConfig)
        .toString();
  }
}
