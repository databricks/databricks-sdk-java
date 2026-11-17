// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A single entry in a location mapping, mapping a region to a storage URI. Used instead of
 * map<string, string> for proto2 compatibility.
 */
@Generated
public class LocationMappingEntry {
  /** Cloud region this URI applies to. Must be one of the failover group's regions. */
  @JsonProperty("region")
  private String region;

  /**
   * Cloud storage URI of the location in this region. End the URI with `/*` to map every path under
   * it as a prefix; within one mapping, either all URIs or none carry the `/*` suffix.
   */
  @JsonProperty("uri")
  private String uri;

  public LocationMappingEntry setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public LocationMappingEntry setUri(String uri) {
    this.uri = uri;
    return this;
  }

  public String getUri() {
    return uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationMappingEntry that = (LocationMappingEntry) o;
    return Objects.equals(region, that.region) && Objects.equals(uri, that.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, uri);
  }

  @Override
  public String toString() {
    return new ToStringer(LocationMappingEntry.class)
        .add("region", region)
        .add("uri", uri)
        .toString();
  }
}
