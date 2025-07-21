// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateAccessRequestResponse {
  /**
   * Indicates whether any destinations are hidden from the caller due to a lack of permissions.
   * This value is true if the caller does not have permission to see all destinations.
   */
  @JsonProperty("are_any_destinations_hidden")
  private Boolean areAnyDestinationsHidden;

  /** The principal the request was made on behalf of. */
  @JsonProperty("behalf_of")
  private Principal behalfOf;

  /** The access request destinations for all the securables the principal requested. */
  @JsonProperty("destinations")
  private Collection<SecurableNotificationDestinations> destinations;

  public CreateAccessRequestResponse setAreAnyDestinationsHidden(Boolean areAnyDestinationsHidden) {
    this.areAnyDestinationsHidden = areAnyDestinationsHidden;
    return this;
  }

  public Boolean getAreAnyDestinationsHidden() {
    return areAnyDestinationsHidden;
  }

  public CreateAccessRequestResponse setBehalfOf(Principal behalfOf) {
    this.behalfOf = behalfOf;
    return this;
  }

  public Principal getBehalfOf() {
    return behalfOf;
  }

  public CreateAccessRequestResponse setDestinations(
      Collection<SecurableNotificationDestinations> destinations) {
    this.destinations = destinations;
    return this;
  }

  public Collection<SecurableNotificationDestinations> getDestinations() {
    return destinations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAccessRequestResponse that = (CreateAccessRequestResponse) o;
    return Objects.equals(areAnyDestinationsHidden, that.areAnyDestinationsHidden)
        && Objects.equals(behalfOf, that.behalfOf)
        && Objects.equals(destinations, that.destinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areAnyDestinationsHidden, behalfOf, destinations);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAccessRequestResponse.class)
        .add("areAnyDestinationsHidden", areAnyDestinationsHidden)
        .add("behalfOf", behalfOf)
        .add("destinations", destinations)
        .toString();
  }
}
