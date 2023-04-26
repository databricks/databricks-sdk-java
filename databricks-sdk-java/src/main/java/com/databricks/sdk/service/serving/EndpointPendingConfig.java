// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>EndpointPendingConfig class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>configVersion</code>.</p>
   *
   * @param configVersion a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointPendingConfig} object
   */
  public EndpointPendingConfig setConfigVersion(Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  /**
   * <p>Getter for the field <code>configVersion</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getConfigVersion() {
    return configVersion;
  }

  /**
   * <p>Setter for the field <code>servedModels</code>.</p>
   *
   * @param servedModels a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointPendingConfig} object
   */
  public EndpointPendingConfig setServedModels(Collection<ServedModelOutput> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  /**
   * <p>Getter for the field <code>servedModels</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ServedModelOutput> getServedModels() {
    return servedModels;
  }

  /**
   * <p>Setter for the field <code>startTime</code>.</p>
   *
   * @param startTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointPendingConfig} object
   */
  public EndpointPendingConfig setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTime() {
    return startTime;
  }

  /**
   * <p>Setter for the field <code>trafficConfig</code>.</p>
   *
   * @param trafficConfig a {@link com.databricks.sdk.service.serving.TrafficConfig} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointPendingConfig} object
   */
  public EndpointPendingConfig setTrafficConfig(TrafficConfig trafficConfig) {
    this.trafficConfig = trafficConfig;
    return this;
  }

  /**
   * <p>Getter for the field <code>trafficConfig</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.serving.TrafficConfig} object
   */
  public TrafficConfig getTrafficConfig() {
    return trafficConfig;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(configVersion, servedModels, startTime, trafficConfig);
  }

  /** {@inheritDoc} */
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
