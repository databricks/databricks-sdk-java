// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ListNotificationDestinationsResult {
  /**
   * [Output-only] The type of the notification destination. The type can not be changed once set.
   */
  @JsonProperty("destination_type")
  private DestinationType destinationType;

  /** The display name for the notification destination. */
  @JsonProperty("display_name")
  private String displayName;

  /** UUID identifying notification destination. */
  @JsonProperty("id")
  private String id;

  public ListNotificationDestinationsResult setDestinationType(DestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

  public DestinationType getDestinationType() {
    return destinationType;
  }

  public ListNotificationDestinationsResult setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ListNotificationDestinationsResult setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNotificationDestinationsResult that = (ListNotificationDestinationsResult) o;
    return Objects.equals(destinationType, that.destinationType)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationType, displayName, id);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNotificationDestinationsResult.class)
        .add("destinationType", destinationType)
        .add("displayName", displayName)
        .add("id", id)
        .toString();
  }
}
