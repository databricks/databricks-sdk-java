// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListAvailableZonesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListAvailableZonesResponse {
  /** The availability zone if no `zone_id` is provided in the cluster creation request. */
  @JsonProperty("default_zone")
  private String defaultZone;

  /** The list of available zones (e.g., ['us-west-2c', 'us-east-2']). */
  @JsonProperty("zones")
  private Collection<String> zones;

  /**
   * <p>Setter for the field <code>defaultZone</code>.</p>
   *
   * @param defaultZone a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ListAvailableZonesResponse} object
   */
  public ListAvailableZonesResponse setDefaultZone(String defaultZone) {
    this.defaultZone = defaultZone;
    return this;
  }

  /**
   * <p>Getter for the field <code>defaultZone</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDefaultZone() {
    return defaultZone;
  }

  /**
   * <p>Setter for the field <code>zones</code>.</p>
   *
   * @param zones a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.ListAvailableZonesResponse} object
   */
  public ListAvailableZonesResponse setZones(Collection<String> zones) {
    this.zones = zones;
    return this;
  }

  /**
   * <p>Getter for the field <code>zones</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getZones() {
    return zones;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAvailableZonesResponse that = (ListAvailableZonesResponse) o;
    return Objects.equals(defaultZone, that.defaultZone) && Objects.equals(zones, that.zones);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(defaultZone, zones);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListAvailableZonesResponse.class)
        .add("defaultZone", defaultZone)
        .add("zones", zones)
        .toString();
  }
}
