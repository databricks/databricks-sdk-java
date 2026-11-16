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
public class NotificationDestination {
  /**
   * The configuration for the notification destination. Will be exactly one of the nested configs.
   * Only returned to users with workspace admin permissions.
   */
  @JsonProperty("config")
  private Config config;

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

  public NotificationDestination setConfig(Config config) {
    this.config = config;
    return this;
  }

  public Config getConfig() {
    return config;
  }

  public NotificationDestination setDestinationType(DestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

  public DestinationType getDestinationType() {
    return destinationType;
  }

  public NotificationDestination setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public NotificationDestination setId(String id) {
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
    NotificationDestination that = (NotificationDestination) o;
    return Objects.equals(config, that.config)
        && Objects.equals(destinationType, that.destinationType)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, destinationType, displayName, id);
  }

  @Override
  public String toString() {
    return new ToStringer(NotificationDestination.class)
        .add("config", config)
        .add("destinationType", destinationType)
        .add("displayName", displayName)
        .add("id", id)
        .toString();
  }
}
