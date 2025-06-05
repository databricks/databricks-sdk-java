// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RoutePb {
  @JsonProperty("served_model_name")
  private String servedModelName;

  @JsonProperty("traffic_percentage")
  private Long trafficPercentage;

  public RoutePb setServedModelName(String servedModelName) {
    this.servedModelName = servedModelName;
    return this;
  }

  public String getServedModelName() {
    return servedModelName;
  }

  public RoutePb setTrafficPercentage(Long trafficPercentage) {
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
    RoutePb that = (RoutePb) o;
    return Objects.equals(servedModelName, that.servedModelName)
        && Objects.equals(trafficPercentage, that.trafficPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servedModelName, trafficPercentage);
  }

  @Override
  public String toString() {
    return new ToStringer(RoutePb.class)
        .add("servedModelName", servedModelName)
        .add("trafficPercentage", trafficPercentage)
        .toString();
  }
}
