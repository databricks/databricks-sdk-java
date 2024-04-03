// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class MonitorNotificationsConfig {
  /** Who to send notifications to on monitor failure. */
  @JsonProperty("on_failure")
  private MonitorDestinations onFailure;

  public MonitorNotificationsConfig setOnFailure(MonitorDestinations onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public MonitorDestinations getOnFailure() {
    return onFailure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorNotificationsConfig that = (MonitorNotificationsConfig) o;
    return Objects.equals(onFailure, that.onFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onFailure);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorNotificationsConfig.class).add("onFailure", onFailure).toString();
  }
}
