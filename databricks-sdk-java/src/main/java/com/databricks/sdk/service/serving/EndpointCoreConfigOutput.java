// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>EndpointCoreConfigOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>configVersion</code>.</p>
   *
   * @param configVersion a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointCoreConfigOutput} object
   */
  public EndpointCoreConfigOutput setConfigVersion(Long configVersion) {
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
   * @return a {@link com.databricks.sdk.service.serving.EndpointCoreConfigOutput} object
   */
  public EndpointCoreConfigOutput setServedModels(Collection<ServedModelOutput> servedModels) {
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
   * <p>Setter for the field <code>trafficConfig</code>.</p>
   *
   * @param trafficConfig a {@link com.databricks.sdk.service.serving.TrafficConfig} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointCoreConfigOutput} object
   */
  public EndpointCoreConfigOutput setTrafficConfig(TrafficConfig trafficConfig) {
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
    EndpointCoreConfigOutput that = (EndpointCoreConfigOutput) o;
    return Objects.equals(configVersion, that.configVersion)
        && Objects.equals(servedModels, that.servedModels)
        && Objects.equals(trafficConfig, that.trafficConfig);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(configVersion, servedModels, trafficConfig);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EndpointCoreConfigOutput.class)
        .add("configVersion", configVersion)
        .add("servedModels", servedModels)
        .add("trafficConfig", trafficConfig)
        .toString();
  }
}
