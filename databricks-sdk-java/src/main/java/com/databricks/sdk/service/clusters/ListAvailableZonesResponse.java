// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListAvailableZonesResponse {
  /** The availability zone if no `zone_id` is provided in the cluster creation request. */
  @JsonProperty("default_zone")
  private String defaultZone;

  /** The list of available zones (e.g., ['us-west-2c', 'us-east-2']). */
  @JsonProperty("zones")
  private java.util.List<String> zones;

  public ListAvailableZonesResponse setDefaultZone(String defaultZone) {
    this.defaultZone = defaultZone;
    return this;
  }

  public String getDefaultZone() {
    return defaultZone;
  }

  public ListAvailableZonesResponse setZones(java.util.List<String> zones) {
    this.zones = zones;
    return this;
  }

  public java.util.List<String> getZones() {
    return zones;
  }
}
