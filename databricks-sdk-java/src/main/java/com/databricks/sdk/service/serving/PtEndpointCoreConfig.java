// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PtEndpointCoreConfig {
  /** The list of served entities under the serving endpoint config. */
  @JsonProperty("served_entities")
  private Collection<PtServedModel> servedEntities;

  /** */
  @JsonProperty("traffic_config")
  private TrafficConfig trafficConfig;

  public PtEndpointCoreConfig setServedEntities(Collection<PtServedModel> servedEntities) {
    this.servedEntities = servedEntities;
    return this;
  }

  public Collection<PtServedModel> getServedEntities() {
    return servedEntities;
  }

  public PtEndpointCoreConfig setTrafficConfig(TrafficConfig trafficConfig) {
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
    PtEndpointCoreConfig that = (PtEndpointCoreConfig) o;
    return Objects.equals(servedEntities, that.servedEntities)
        && Objects.equals(trafficConfig, that.trafficConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servedEntities, trafficConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(PtEndpointCoreConfig.class)
        .add("servedEntities", servedEntities)
        .add("trafficConfig", trafficConfig)
        .toString();
  }
}
