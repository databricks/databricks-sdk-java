// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EndpointCoreConfigInput {
  /**
   * Configuration for Inference Tables which automatically logs requests and responses to Unity
   * Catalog.
   */
  @JsonProperty("auto_capture_config")
  private AutoCaptureConfigInput autoCaptureConfig;

  /** The name of the serving endpoint to update. This field is required. */
  private String name;

  /**
   * A list of served entities for the endpoint to serve. A serving endpoint can have up to 15
   * served entities.
   */
  @JsonProperty("served_entities")
  private Collection<ServedEntityInput> servedEntities;

  /**
   * (Deprecated, use served_entities instead) A list of served models for the endpoint to serve. A
   * serving endpoint can have up to 15 served models.
   */
  @JsonProperty("served_models")
  private Collection<ServedModelInput> servedModels;

  /** The traffic config defining how invocations to the serving endpoint should be routed. */
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
