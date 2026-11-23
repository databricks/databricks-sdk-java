// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The notification destinations that receive access requests for a Unity Catalog securable. A
 * securable without destinations of its own uses its owner's email when default owner email
 * destinations are on; otherwise it inherits the destinations of its nearest parent that has any.
 */
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

  /** The full name of the securable, repeated from **securable**. */
  @JsonProperty("full_name")
  private String fullName;

  /** The securable for which the access request destinations are being modified or read. */
  @JsonProperty("securable")
  private Securable securable;

  /** The type of the securable, repeated from **securable** as a plain string. */
  @JsonProperty("securable_type")
  private String securableType;

  /**
   * The access request URLs shared by every workspace in the metastore. Only set when the securable
   * is a metastore. These URLs are used when neither the requested securable nor its parents have
   * an explicit destination or a default owner email destination, and they take precedence over
   * metastore destinations.
   *
   * <p>A **dynamic_url** and default owner email destinations cannot both be on: saving one turns
   * the other off. Saving a **dynamic_url** while they are on requires a metastore admin.
   *
   * <p>Setting this field removes the metastore destinations in this workspace. The first save also
   * removes the metastore URL destinations of other workspaces. Once set, the configuration can be
   * cleared but not removed.
   */
  @JsonProperty("url_configuration")
  private UrlConfiguration urlConfiguration;

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

  public AccessRequestDestinations setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public AccessRequestDestinations setSecurable(Securable securable) {
    this.securable = securable;
    return this;
  }

  public Securable getSecurable() {
    return securable;
  }

  public AccessRequestDestinations setSecurableType(String securableType) {
    this.securableType = securableType;
    return this;
  }

  public String getSecurableType() {
    return securableType;
  }

  public AccessRequestDestinations setUrlConfiguration(UrlConfiguration urlConfiguration) {
    this.urlConfiguration = urlConfiguration;
    return this;
  }

  public UrlConfiguration getUrlConfiguration() {
    return urlConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccessRequestDestinations that = (AccessRequestDestinations) o;
    return Objects.equals(areAnyDestinationsHidden, that.areAnyDestinationsHidden)
        && Objects.equals(destinationSourceSecurable, that.destinationSourceSecurable)
        && Objects.equals(destinations, that.destinations)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(securable, that.securable)
        && Objects.equals(securableType, that.securableType)
        && Objects.equals(urlConfiguration, that.urlConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        areAnyDestinationsHidden,
        destinationSourceSecurable,
        destinations,
        fullName,
        securable,
        securableType,
        urlConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(AccessRequestDestinations.class)
        .add("areAnyDestinationsHidden", areAnyDestinationsHidden)
        .add("destinationSourceSecurable", destinationSourceSecurable)
        .add("destinations", destinations)
        .add("fullName", fullName)
        .add("securable", securable)
        .add("securableType", securableType)
        .add("urlConfiguration", urlConfiguration)
        .toString();
  }
}
