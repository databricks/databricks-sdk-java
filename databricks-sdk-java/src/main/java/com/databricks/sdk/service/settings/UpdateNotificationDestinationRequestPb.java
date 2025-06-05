// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateNotificationDestinationRequestPb {
  @JsonProperty("config")
  private Config config;

  @JsonProperty("display_name")
  private String displayName;

  @JsonIgnore private String id;

  public UpdateNotificationDestinationRequestPb setConfig(Config config) {
    this.config = config;
    return this;
  }

  public Config getConfig() {
    return config;
  }

  public UpdateNotificationDestinationRequestPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateNotificationDestinationRequestPb setId(String id) {
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
    UpdateNotificationDestinationRequestPb that = (UpdateNotificationDestinationRequestPb) o;
    return Objects.equals(config, that.config)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, displayName, id);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateNotificationDestinationRequestPb.class)
        .add("config", config)
        .add("displayName", displayName)
        .add("id", id)
        .toString();
  }
}
