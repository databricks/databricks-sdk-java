// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class EndpointCoreConfigOutput {
  /** The config version that the serving endpoint is currently serving. */
  @JsonProperty("config_version")
  private Long configVersion;

  /** The list of served models under the serving endpoint config. */
  @JsonProperty("served_models")
  private Collection<ServedModelOutput> servedModels;

  /** The traffic configuration associated with the serving endpoint config. */
  @JsonProperty("traffic_config")
  private TrafficConfig trafficConfig;

  public EndpointCoreConfigOutput setConfigVersion(Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  public Long getConfigVersion() {
    return configVersion;
  }

  public EndpointCoreConfigOutput setServedModels(Collection<ServedModelOutput> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  public Collection<ServedModelOutput> getServedModels() {
    return servedModels;
  }

  public EndpointCoreConfigOutput setTrafficConfig(TrafficConfig trafficConfig) {
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
    EndpointCoreConfigOutput that = (EndpointCoreConfigOutput) o;
    return Objects.equals(configVersion, that.configVersion)
        && Objects.equals(servedModels, that.servedModels)
        && Objects.equals(trafficConfig, that.trafficConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configVersion, servedModels, trafficConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointCoreConfigOutput.class)
        .add("configVersion", configVersion)
        .add("servedModels", servedModels)
        .add("trafficConfig", trafficConfig)
        .toString();
  }
}
