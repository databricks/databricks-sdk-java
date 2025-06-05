// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class EndpointPendingConfigPb {
  @JsonProperty("auto_capture_config")
  private AutoCaptureConfigOutput autoCaptureConfig;

  @JsonProperty("config_version")
  private Long configVersion;

  @JsonProperty("served_entities")
  private Collection<ServedEntityOutput> servedEntities;

  @JsonProperty("served_models")
  private Collection<ServedModelOutput> servedModels;

  @JsonProperty("start_time")
  private Long startTime;

  @JsonProperty("traffic_config")
  private TrafficConfig trafficConfig;

  public EndpointPendingConfigPb setAutoCaptureConfig(AutoCaptureConfigOutput autoCaptureConfig) {
    this.autoCaptureConfig = autoCaptureConfig;
    return this;
  }

  public AutoCaptureConfigOutput getAutoCaptureConfig() {
    return autoCaptureConfig;
  }

  public EndpointPendingConfigPb setConfigVersion(Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  public Long getConfigVersion() {
    return configVersion;
  }

  public EndpointPendingConfigPb setServedEntities(Collection<ServedEntityOutput> servedEntities) {
    this.servedEntities = servedEntities;
    return this;
  }

  public Collection<ServedEntityOutput> getServedEntities() {
    return servedEntities;
  }

  public EndpointPendingConfigPb setServedModels(Collection<ServedModelOutput> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  public Collection<ServedModelOutput> getServedModels() {
    return servedModels;
  }

  public EndpointPendingConfigPb setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public EndpointPendingConfigPb setTrafficConfig(TrafficConfig trafficConfig) {
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
    EndpointPendingConfigPb that = (EndpointPendingConfigPb) o;
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
    return new ToStringer(EndpointPendingConfigPb.class)
        .add("autoCaptureConfig", autoCaptureConfig)
        .add("configVersion", configVersion)
        .add("servedEntities", servedEntities)
        .add("servedModels", servedModels)
        .add("startTime", startTime)
        .add("trafficConfig", trafficConfig)
        .toString();
  }
}
