// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class EndpointCoreConfigInputPb {
  @JsonProperty("auto_capture_config")
  private AutoCaptureConfigInput autoCaptureConfig;

  @JsonIgnore private String name;

  @JsonProperty("served_entities")
  private Collection<ServedEntityInput> servedEntities;

  @JsonProperty("served_models")
  private Collection<ServedModelInput> servedModels;

  @JsonProperty("traffic_config")
  private TrafficConfig trafficConfig;

  public EndpointCoreConfigInputPb setAutoCaptureConfig(AutoCaptureConfigInput autoCaptureConfig) {
    this.autoCaptureConfig = autoCaptureConfig;
    return this;
  }

  public AutoCaptureConfigInput getAutoCaptureConfig() {
    return autoCaptureConfig;
  }

  public EndpointCoreConfigInputPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EndpointCoreConfigInputPb setServedEntities(Collection<ServedEntityInput> servedEntities) {
    this.servedEntities = servedEntities;
    return this;
  }

  public Collection<ServedEntityInput> getServedEntities() {
    return servedEntities;
  }

  public EndpointCoreConfigInputPb setServedModels(Collection<ServedModelInput> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  public Collection<ServedModelInput> getServedModels() {
    return servedModels;
  }

  public EndpointCoreConfigInputPb setTrafficConfig(TrafficConfig trafficConfig) {
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
    EndpointCoreConfigInputPb that = (EndpointCoreConfigInputPb) o;
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
    return new ToStringer(EndpointCoreConfigInputPb.class)
        .add("autoCaptureConfig", autoCaptureConfig)
        .add("name", name)
        .add("servedEntities", servedEntities)
        .add("servedModels", servedModels)
        .add("trafficConfig", trafficConfig)
        .toString();
  }
}
