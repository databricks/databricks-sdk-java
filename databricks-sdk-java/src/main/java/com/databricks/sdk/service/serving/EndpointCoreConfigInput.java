// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class EndpointCoreConfigInput {
  /** The name of the serving endpoint to update. This field is required. */
  private String name;

  /**
   * A list of served models for the endpoint to serve. A serving endpoint can have up to 10 served
   * models.
   */
  @JsonProperty("served_models")
  private Collection<ServedModelInput> servedModels;

  /** The traffic config defining how invocations to the serving endpoint should be routed. */
  @JsonProperty("traffic_config")
  private TrafficConfig trafficConfig;

  public EndpointCoreConfigInput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EndpointCoreConfigInput setServedModels(Collection<ServedModelInput> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  public Collection<ServedModelInput> getServedModels() {
    return servedModels;
  }

  public EndpointCoreConfigInput setTrafficConfig(TrafficConfig trafficConfig) {
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
    EndpointCoreConfigInput that = (EndpointCoreConfigInput) o;
    return Objects.equals(name, that.name)
        && Objects.equals(servedModels, that.servedModels)
        && Objects.equals(trafficConfig, that.trafficConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, servedModels, trafficConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointCoreConfigInput.class)
        .add("name", name)
        .add("servedModels", servedModels)
        .add("trafficConfig", trafficConfig)
        .toString();
  }
}
