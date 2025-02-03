// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EndpointCoreConfigInput {
  /**
   * Configuration for Inference Tables which automatically logs requests and responses to Unity
   * Catalog. Note: this field is deprecated for creating new provisioned throughput endpoints, or
   * updating existing provisioned throughput endpoints that never have inference table configured;
   * in these cases please use AI Gateway to manage inference tables.
   */
  @JsonProperty("auto_capture_config")
  private AutoCaptureConfigInput autoCaptureConfig;

  /** The name of the serving endpoint to update. This field is required. */
  @JsonIgnore private String name;

  /** The list of served entities under the serving endpoint config. */
  @JsonProperty("served_entities")
  private Collection<ServedEntityInput> servedEntities;

  /**
   * (Deprecated, use served_entities instead) The list of served models under the serving endpoint
   * config.
   */
  @JsonProperty("served_models")
  private Collection<ServedModelInput> servedModels;

  /** The traffic configuration associated with the serving endpoint config. */
  @JsonProperty("traffic_config")
  private TrafficConfig trafficConfig;

  public EndpointCoreConfigInput setAutoCaptureConfig(AutoCaptureConfigInput autoCaptureConfig) {
    this.autoCaptureConfig = autoCaptureConfig;
    return this;
  }

  public AutoCaptureConfigInput getAutoCaptureConfig() {
    return autoCaptureConfig;
  }

  public EndpointCoreConfigInput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EndpointCoreConfigInput setServedEntities(Collection<ServedEntityInput> servedEntities) {
    this.servedEntities = servedEntities;
    return this;
  }

  public Collection<ServedEntityInput> getServedEntities() {
    return servedEntities;
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
    return Objects.equals(autoCaptureConfig, that.autoCaptureConfig)
        && Objects.equals(name, that.name)
        && Objects.equals(servedEntities, that.servedEntities)
        && Objects.equals(servedModels, that.servedModels)
        && Objects.equals(trafficConfig, that.trafficConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCaptureConfig, name, servedEntities, servedModels, trafficConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointCoreConfigInput.class)
        .add("autoCaptureConfig", autoCaptureConfig)
        .add("name", name)
        .add("servedEntities", servedEntities)
        .add("servedModels", servedModels)
        .add("trafficConfig", trafficConfig)
        .toString();
  }
}
