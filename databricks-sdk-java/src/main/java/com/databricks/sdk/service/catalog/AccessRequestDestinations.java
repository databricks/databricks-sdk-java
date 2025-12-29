// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AccessRequestDestinations {
  /**
   * Indicates whether any destinations are hidden from the caller due to a lack of permissions.
   * This value is true if the caller does not have permission to see all destinations.
   */
  @JsonProperty("are_any_destinations_hidden")
  private Boolean areAnyDestinationsHidden;

  /**
   * The source securable from which the destinations are inherited. Either the same value as
   * securable (if destination is set directly on the securable) or the nearest parent securable
   * with destinations set.
   */
  @JsonProperty("destination_source_securable")
  private Securable destinationSourceSecurable;

  /** The access request destinations for the securable. */
  @JsonProperty("destinations")
  private Collection<NotificationDestination> destinations;

  /** The securable for which the access request destinations are being modified or read. */
  @JsonProperty("securable")
  private Securable securable;

  public AccessRequestDestinations setAreAnyDestinationsHidden(Boolean areAnyDestinationsHidden) {
    this.areAnyDestinationsHidden = areAnyDestinationsHidden;
    return this;
  }

  public Boolean getAreAnyDestinationsHidden() {
    return areAnyDestinationsHidden;
  }

  public AccessRequestDestinations setDestinationSourceSecurable(
      Securable destinationSourceSecurable) {
    this.destinationSourceSecurable = destinationSourceSecurable;
    return this;
  }

  public Securable getDestinationSourceSecurable() {
    return destinationSourceSecurable;
  }

  public AccessRequestDestinations setDestinations(
      Collection<NotificationDestination> destinations) {
    this.destinations = destinations;
    return this;
  }

  public Collection<NotificationDestination> getDestinations() {
    return destinations;
  }

  public AccessRequestDestinations setSecurable(Securable securable) {
    this.securable = securable;
    return this;
  }

  public Securable getSecurable() {
    return securable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccessRequestDestinations that = (AccessRequestDestinations) o;
    return Objects.equals(areAnyDestinationsHidden, that.areAnyDestinationsHidden)
        && Objects.equals(destinationSourceSecurable, that.destinationSourceSecurable)
        && Objects.equals(destinations, that.destinations)
        && Objects.equals(securable, that.securable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        areAnyDestinationsHidden, destinationSourceSecurable, destinations, securable);
  }

  @Override
  public String toString() {
    return new ToStringer(AccessRequestDestinations.class)
        .add("areAnyDestinationsHidden", areAnyDestinationsHidden)
        .add("destinationSourceSecurable", destinationSourceSecurable)
        .add("destinations", destinations)
        .add("securable", securable)
        .toString();
  }
}
