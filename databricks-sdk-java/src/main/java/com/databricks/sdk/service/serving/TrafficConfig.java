// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TrafficConfig {
  /** The list of routes that define traffic to each served entity. */
  @JsonProperty("routes")
  private Collection<Route> routes;

  public TrafficConfig setRoutes(Collection<Route> routes) {
    this.routes = routes;
    return this;
  }

  public Collection<Route> getRoutes() {
    return routes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TrafficConfig that = (TrafficConfig) o;
    return Objects.equals(routes, that.routes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routes);
  }

  @Override
  public String toString() {
    return new ToStringer(TrafficConfig.class).add("routes", routes).toString();
  }
}
