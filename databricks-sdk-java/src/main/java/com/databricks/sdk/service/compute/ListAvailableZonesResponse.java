// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ListAvailableZonesResponse {
  /**
   * The availability zone if no `zone_id` is provided in the cluster creation
   * request.
   */
  @JsonProperty("default_zone")
  private String defaultZone;
  
  /**
   * The list of available zones (e.g., ['us-west-2c', 'us-east-2']).
   */
  @JsonProperty("zones")
  private Collection<String> zones;
  
  public ListAvailableZonesResponse setDefaultZone(String defaultZone) {
    this.defaultZone = defaultZone;
    return this;
  }

  public String getDefaultZone() {
    return defaultZone;
  }
  
  public ListAvailableZonesResponse setZones(Collection<String> zones) {
    this.zones = zones;
    return this;
  }

  public Collection<String> getZones() {
    return zones;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAvailableZonesResponse that = (ListAvailableZonesResponse) o;
    return Objects.equals(defaultZone, that.defaultZone)
    && Objects.equals(zones, that.zones)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultZone, zones);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAvailableZonesResponse.class)
      .add("defaultZone", defaultZone)
      .add("zones", zones).toString();
  }
}
