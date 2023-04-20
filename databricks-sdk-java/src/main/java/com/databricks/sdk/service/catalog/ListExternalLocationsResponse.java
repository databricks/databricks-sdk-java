// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListExternalLocationsResponse {
  /** An array of external locations. */
  @JsonProperty("external_locations")
  private Collection<ExternalLocationInfo> externalLocations;

  public ListExternalLocationsResponse setExternalLocations(
      Collection<ExternalLocationInfo> externalLocations) {
    this.externalLocations = externalLocations;
    return this;
  }

  public Collection<ExternalLocationInfo> getExternalLocations() {
    return externalLocations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExternalLocationsResponse that = (ListExternalLocationsResponse) o;
    return Objects.equals(externalLocations, that.externalLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalLocations);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExternalLocationsResponse.class)
        .add("externalLocations", externalLocations)
        .toString();
  }
}
