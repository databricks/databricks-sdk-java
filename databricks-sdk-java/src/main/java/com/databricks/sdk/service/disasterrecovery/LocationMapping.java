// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A location mapping identified by a name, with URIs per region. The system derives replication
 * direction from effective_primary_region.
 */
@Generated
public class LocationMapping {
  /** Resource name for this location. */
  @JsonProperty("name")
  private String name;

  /** URI for each region. Each entry maps a region name to a storage URI. */
  @JsonProperty("uri_by_region")
  private Collection<LocationMappingEntry> uriByRegion;

  public LocationMapping setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LocationMapping setUriByRegion(Collection<LocationMappingEntry> uriByRegion) {
    this.uriByRegion = uriByRegion;
    return this;
  }

  public Collection<LocationMappingEntry> getUriByRegion() {
    return uriByRegion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationMapping that = (LocationMapping) o;
    return Objects.equals(name, that.name) && Objects.equals(uriByRegion, that.uriByRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uriByRegion);
  }

  @Override
  public String toString() {
    return new ToStringer(LocationMapping.class)
        .add("name", name)
        .add("uriByRegion", uriByRegion)
        .toString();
  }
}
