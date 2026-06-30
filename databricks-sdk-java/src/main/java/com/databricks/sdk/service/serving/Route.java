// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Route {
  /** */
  @JsonProperty("served_entity_name")
  private String servedEntityName;

  /** The name of the served model this route configures traffic for. */
  @JsonProperty("served_model_name")
  private String servedModelName;

  /**
   * The percentage of endpoint traffic to send to this route. It must be an integer between 0 and
   * 100 inclusive.
   */
  @JsonProperty("traffic_percentage")
  private Long trafficPercentage;

  public Route setServedEntityName(String servedEntityName) {
    this.servedEntityName = servedEntityName;
    return this;
  }

  public String getServedEntityName() {
    return servedEntityName;
  }

  public Route setServedModelName(String servedModelName) {
    this.servedModelName = servedModelName;
    return this;
  }

  public String getServedModelName() {
    return servedModelName;
  }

  public Route setTrafficPercentage(Long trafficPercentage) {
    this.trafficPercentage = trafficPercentage;
    return this;
  }

  public Long getTrafficPercentage() {
    return trafficPercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Route that = (Route) o;
    return Objects.equals(servedEntityName, that.servedEntityName)
        && Objects.equals(servedModelName, that.servedModelName)
        && Objects.equals(trafficPercentage, that.trafficPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servedEntityName, servedModelName, trafficPercentage);
  }

  @Override
  public String toString() {
    return new ToStringer(Route.class)
        .add("servedEntityName", servedEntityName)
        .add("servedModelName", servedModelName)
        .add("trafficPercentage", trafficPercentage)
        .toString();
  }
}
