// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A reusable definition of where a workspace sends notifications, such as a Slack channel, a set of
 * email addresses, a PagerDuty service, a Microsoft Teams channel or a generic webhook. Job
 * notifications, SQL alerts and other workspace features reference a destination by its id. Only
 * workspace admins can create, update and delete destinations; once created, a destination is
 * available to all users in the workspace. Secret values such as webhook URLs and tokens are
 * write-only: responses report whether each one is set, never its value.
 */
@Generated
public class ListNotificationDestinationsResult {
  /**
   * [Output-only] The type of the notification destination, determined by which nested config was
   * provided on creation. The type can not be changed once set.
   */
  @JsonProperty("destination_type")
  private DestinationType destinationType;

  /** The display name for the notification destination. */
  @JsonProperty("display_name")
  private String displayName;

  /** A UUID identifying the notification destination. */
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
