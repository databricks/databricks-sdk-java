// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class NotificationDestination {
  /**
   * The configuration for the notification destination. Will be exactly one of the nested configs.
   * Only returns for users with workspace admin permissions.
   */
  @JsonProperty("config")
  private Config config;

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
