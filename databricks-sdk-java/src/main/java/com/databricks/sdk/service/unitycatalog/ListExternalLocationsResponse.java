// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListExternalLocationsResponse {
  /** An array of external locations. */
  @JsonProperty("external_locations")
  private java.util.List<ExternalLocationInfo> externalLocations;

  public ListExternalLocationsResponse setExternalLocations(
      java.util.List<ExternalLocationInfo> externalLocations) {
    this.externalLocations = externalLocations;
    return this;
  }

  public java.util.List<ExternalLocationInfo> getExternalLocations() {
    return externalLocations;
  }
}
