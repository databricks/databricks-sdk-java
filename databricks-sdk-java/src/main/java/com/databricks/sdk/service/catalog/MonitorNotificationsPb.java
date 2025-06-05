// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class MonitorNotificationsPb {
  @JsonProperty("on_failure")
  private MonitorDestination onFailure;

  @JsonProperty("on_new_classification_tag_detected")
  private MonitorDestination onNewClassificationTagDetected;

  public MonitorNotificationsPb setOnFailure(MonitorDestination onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public MonitorDestination getOnFailure() {
    return onFailure;
  }

  public MonitorNotificationsPb setOnNewClassificationTagDetected(
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
    MonitorNotificationsPb that = (MonitorNotificationsPb) o;
    return Objects.equals(onFailure, that.onFailure)
        && Objects.equals(onNewClassificationTagDetected, that.onNewClassificationTagDetected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onFailure, onNewClassificationTagDetected);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorNotificationsPb.class)
        .add("onFailure", onFailure)
        .add("onNewClassificationTagDetected", onNewClassificationTagDetected)
        .toString();
  }
}
