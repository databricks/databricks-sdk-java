// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Route class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Route {
  /** The name of the served model this route configures traffic for. */
  @JsonProperty("served_model_name")
  private String servedModelName;

  /**
   * The percentage of endpoint traffic to send to this route. It must be an integer between 0 and
   * 100 inclusive.
   */
  @JsonProperty("traffic_percentage")
  private Long trafficPercentage;

  /**
   * <p>Setter for the field <code>servedModelName</code>.</p>
   *
   * @param servedModelName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.Route} object
   */
  public Route setServedModelName(String servedModelName) {
    this.servedModelName = servedModelName;
    return this;
  }

  /**
   * <p>Getter for the field <code>servedModelName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getServedModelName() {
    return servedModelName;
  }

  /**
   * <p>Setter for the field <code>trafficPercentage</code>.</p>
   *
   * @param trafficPercentage a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.serving.Route} object
   */
  public Route setTrafficPercentage(Long trafficPercentage) {
    this.trafficPercentage = trafficPercentage;
    return this;
  }

  /**
   * <p>Getter for the field <code>trafficPercentage</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTrafficPercentage() {
    return trafficPercentage;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Route that = (Route) o;
    return Objects.equals(servedModelName, that.servedModelName)
        && Objects.equals(trafficPercentage, that.trafficPercentage);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(servedModelName, trafficPercentage);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Route.class)
        .add("servedModelName", servedModelName)
        .add("trafficPercentage", trafficPercentage)
        .toString();
  }
}
