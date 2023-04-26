// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>EndpointCoreConfigInput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointCoreConfigInput} object
   */
  public EndpointCoreConfigInput setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>servedModels</code>.</p>
   *
   * @param servedModels a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointCoreConfigInput} object
   */
  public EndpointCoreConfigInput setServedModels(Collection<ServedModelInput> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  /**
   * <p>Getter for the field <code>servedModels</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ServedModelInput> getServedModels() {
    return servedModels;
  }

  /**
   * <p>Setter for the field <code>trafficConfig</code>.</p>
   *
   * @param trafficConfig a {@link com.databricks.sdk.service.serving.TrafficConfig} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointCoreConfigInput} object
   */
  public EndpointCoreConfigInput setTrafficConfig(TrafficConfig trafficConfig) {
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
    EndpointCoreConfigInput that = (EndpointCoreConfigInput) o;
    return Objects.equals(name, that.name)
        && Objects.equals(servedModels, that.servedModels)
        && Objects.equals(trafficConfig, that.trafficConfig);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(name, servedModels, trafficConfig);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EndpointCoreConfigInput.class)
        .add("name", name)
        .add("servedModels", servedModels)
        .add("trafficConfig", trafficConfig)
        .toString();
  }
}
