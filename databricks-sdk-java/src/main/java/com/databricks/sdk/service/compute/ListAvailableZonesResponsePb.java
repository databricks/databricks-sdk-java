// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListAvailableZonesResponsePb {
  @JsonProperty("default_zone")
  private String defaultZone;

  @JsonProperty("zones")
  private Collection<String> zones;

  public ListAvailableZonesResponsePb setDefaultZone(String defaultZone) {
    this.defaultZone = defaultZone;
    return this;
  }

  public String getDefaultZone() {
    return defaultZone;
  }

  public ListAvailableZonesResponsePb setZones(Collection<String> zones) {
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
    ListAvailableZonesResponsePb that = (ListAvailableZonesResponsePb) o;
    return Objects.equals(defaultZone, that.defaultZone) && Objects.equals(zones, that.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultZone, zones);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAvailableZonesResponsePb.class)
        .add("defaultZone", defaultZone)
        .add("zones", zones)
        .toString();
  }
}
