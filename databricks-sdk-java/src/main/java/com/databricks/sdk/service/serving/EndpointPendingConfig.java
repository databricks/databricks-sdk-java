// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EndpointPendingConfig {
  /**
   * Configuration for Inference Tables which automatically logs requests and responses to Unity
   * Catalog.
   */
  @JsonProperty("auto_capture_config")
  private AutoCaptureConfigOutput autoCaptureConfig;

  /** The config version that the serving endpoint is currently serving. */
  @JsonProperty("config_version")
  private Long configVersion;

  /** The list of served entities belonging to the last issued update to the serving endpoint. */
  @JsonProperty("served_entities")
  private Collection<ServedEntityOutput> servedEntities;

  /**
   * (Deprecated, use served_entities instead) The list of served models belonging to the last
   * issued update to the serving endpoint.
   */
  @JsonProperty("served_models")
  private Collection<ServedModelOutput> servedModels;

  /** The timestamp when the update to the pending config started. */
  @JsonProperty("start_time")
  private Long startTime;

  /** The traffic config defining how invocations to the serving endpoint should be routed. */
  @JsonProperty("traffic_config")
  private TrafficConfig trafficConfig;

  public EndpointPendingConfig setAutoCaptureConfig(AutoCaptureConfigOutput autoCaptureConfig) {
    this.autoCaptureConfig = autoCaptureConfig;
    return this;
  }

  public AutoCaptureConfigOutput getAutoCaptureConfig() {
    return autoCaptureConfig;
  }

  public EndpointPendingConfig setConfigVersion(Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  public Long getConfigVersion() {
    return configVersion;
  }

  public EndpointPendingConfig setServedEntities(Collection<ServedEntityOutput> servedEntities) {
    this.servedEntities = servedEntities;
    return this;
  }

  public Collection<ServedEntityOutput> getServedEntities() {
    return servedEntities;
  }

  public EndpointPendingConfig setServedModels(Collection<ServedModelOutput> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  public Collection<ServedModelOutput> getServedModels() {
    return servedModels;
  }

  public EndpointPendingConfig setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public EndpointPendingConfig setTrafficConfig(TrafficConfig trafficConfig) {
    this.trafficConfig = trafficConfig;
    return this;
  }

  public TrafficConfig getTrafficConfig() {
    return trafficConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointPendingConfig that = (EndpointPendingConfig) o;
    return Objects.equals(autoCaptureConfig, that.autoCaptureConfig)
        && Objects.equals(configVersion, that.configVersion)
        && Objects.equals(servedEntities, that.servedEntities)
        && Objects.equals(servedModels, that.servedModels)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(trafficConfig, that.trafficConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoCaptureConfig, configVersion, servedEntities, servedModels, startTime, trafficConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointPendingConfig.class)
        .add("autoCaptureConfig", autoCaptureConfig)
        .add("configVersion", configVersion)
        .add("servedEntities", servedEntities)
        .add("servedModels", servedModels)
        .add("startTime", startTime)
        .add("trafficConfig", trafficConfig)
        .toString();
  }
}
