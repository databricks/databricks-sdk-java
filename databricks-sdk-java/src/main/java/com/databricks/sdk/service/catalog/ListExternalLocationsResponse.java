// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListExternalLocationsResponse {
  /** An array of external locations. */
  @JsonProperty("external_locations")
  private Collection<ExternalLocationInfo> externalLocations;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListExternalLocationsResponse setExternalLocations(
      Collection<ExternalLocationInfo> externalLocations) {
    this.externalLocations = externalLocations;
    return this;
  }

  public Collection<ExternalLocationInfo> getExternalLocations() {
    return externalLocations;
  }

  public ListExternalLocationsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExternalLocationsResponse that = (ListExternalLocationsResponse) o;
    return Objects.equals(externalLocations, that.externalLocations)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalLocations, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExternalLocationsResponse.class)
        .add("externalLocations", externalLocations)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
