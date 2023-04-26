// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>TrafficConfig class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TrafficConfig {
  /** The list of routes that define traffic to each served model. */
  @JsonProperty("routes")
  private Collection<Route> routes;

  /**
   * <p>Setter for the field <code>routes</code>.</p>
   *
   * @param routes a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.serving.TrafficConfig} object
   */
  public TrafficConfig setRoutes(Collection<Route> routes) {
    this.routes = routes;
    return this;
  }

  /**
   * <p>Getter for the field <code>routes</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Route> getRoutes() {
    return routes;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TrafficConfig that = (TrafficConfig) o;
    return Objects.equals(routes, that.routes);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(routes);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TrafficConfig.class).add("routes", routes).toString();
  }
}
