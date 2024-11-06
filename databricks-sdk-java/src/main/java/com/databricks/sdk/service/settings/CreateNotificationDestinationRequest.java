// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateNotificationDestinationRequest {
  /**
   * The configuration for the notification destination. Must wrap EXACTLY one of the nested
   * configs.
   */
  @JsonProperty("config")
  private Config config;

  /** The display name for the notification destination. */
  @JsonProperty("display_name")
  private String displayName;

  public CreateNotificationDestinationRequest setConfig(Config config) {
    this.config = config;
    return this;
  }

  public Config getConfig() {
    return config;
  }

  public CreateNotificationDestinationRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateNotificationDestinationRequest that = (CreateNotificationDestinationRequest) o;
    return Objects.equals(config, that.config) && Objects.equals(displayName, that.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, displayName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateNotificationDestinationRequest.class)
        .add("config", config)
        .add("displayName", displayName)
        .toString();
  }
}
