// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EndpointPendingConfig {
  /** The config version that the serving endpoint is currently serving. */
  @JsonProperty("config_version")
  private Long configVersion;

  /** The list of served models belonging to the last issued update to the serving endpoint. */
  @JsonProperty("served_models")
  private Collection<ServedModelOutput> servedModels;

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
    return Objects.equals(configVersion, that.configVersion)
        && Objects.equals(servedModels, that.servedModels)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(trafficConfig, that.trafficConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configVersion, servedModels, startTime, trafficConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointPendingConfig.class)
        .add("configVersion", configVersion)
        .add("servedModels", servedModels)
        .add("startTime", startTime)
        .add("trafficConfig", trafficConfig)
        .toString();
  }
}
