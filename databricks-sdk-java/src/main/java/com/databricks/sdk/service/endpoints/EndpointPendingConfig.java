// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EndpointPendingConfig {
  /** The config version that the serving endpoint is currently serving. */
  @JsonProperty("config_version")
  private Long configVersion;

  /** The list of served models belonging to the last issued update to the serving endpoint. */
  @JsonProperty("served_models")
  private java.util.List<ServedModelOutput> servedModels;

  /** The timestamp when the update to the pending config started. */
  @JsonProperty("start_time")
  private Long startTime;

  /** The traffic config defining how invocations to the serving endpoint should be routed. */
  @JsonProperty("traffic_config")
  private TrafficConfig trafficConfig;

  public EndpointPendingConfig setConfigVersion(Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  public Long getConfigVersion() {
    return configVersion;
  }

  public EndpointPendingConfig setServedModels(java.util.List<ServedModelOutput> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  public java.util.List<ServedModelOutput> getServedModels() {
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
}
