// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListExternalLocationsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListExternalLocationsResponse {
  /** An array of external locations. */
  @JsonProperty("external_locations")
  private Collection<ExternalLocationInfo> externalLocations;

  /**
   * <p>Setter for the field <code>externalLocations</code>.</p>
   *
   * @param externalLocations a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.ListExternalLocationsResponse} object
   */
  public ListExternalLocationsResponse setExternalLocations(
      Collection<ExternalLocationInfo> externalLocations) {
    this.externalLocations = externalLocations;
    return this;
  }

  /**
   * <p>Getter for the field <code>externalLocations</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ExternalLocationInfo> getExternalLocations() {
    return externalLocations;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExternalLocationsResponse that = (ListExternalLocationsResponse) o;
    return Objects.equals(externalLocations, that.externalLocations);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(externalLocations);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListExternalLocationsResponse.class)
        .add("externalLocations", externalLocations)
        .toString();
  }
}
