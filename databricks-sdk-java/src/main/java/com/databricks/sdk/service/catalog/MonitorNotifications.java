// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class MonitorNotifications {
  /** Destinations to send notifications on failure/timeout. */
  @JsonProperty("on_failure")
  private MonitorDestination onFailure;

  /** Destinations to send notifications on new classification tag detected. */
  @JsonProperty("on_new_classification_tag_detected")
  private MonitorDestination onNewClassificationTagDetected;

  public MonitorNotifications setOnFailure(MonitorDestination onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public MonitorDestination getOnFailure() {
    return onFailure;
  }

  public MonitorNotifications setOnNewClassificationTagDetected(
      MonitorDestination onNewClassificationTagDetected) {
    this.onNewClassificationTagDetected = onNewClassificationTagDetected;
    return this;
  }

  public MonitorDestination getOnNewClassificationTagDetected() {
    return onNewClassificationTagDetected;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorNotifications that = (MonitorNotifications) o;
    return Objects.equals(onFailure, that.onFailure)
        && Objects.equals(onNewClassificationTagDetected, that.onNewClassificationTagDetected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onFailure, onNewClassificationTagDetected);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorNotifications.class)
        .add("onFailure", onFailure)
        .add("onNewClassificationTagDetected", onNewClassificationTagDetected)
        .toString();
  }
}
