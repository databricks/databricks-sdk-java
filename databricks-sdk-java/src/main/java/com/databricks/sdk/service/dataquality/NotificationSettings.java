// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Settings for sending notifications on the data quality monitoring. */
@Generated
public class NotificationSettings {
  /** Destinations to send notifications on failure/timeout. */
  @JsonProperty("on_failure")
  private NotificationDestination onFailure;

  /**
   * Recipients to notify when anomaly detection finds unhealthy tables in the schema. Each
   * recipient gets one notification per important unhealthy table. Only supported on schema
   * monitors, via `anomaly_detection_config`.
   */
  @JsonProperty("on_unhealthy_table")
  private NotificationDestination onUnhealthyTable;

  public NotificationSettings setOnFailure(NotificationDestination onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public NotificationDestination getOnFailure() {
    return onFailure;
  }

  public NotificationSettings setOnUnhealthyTable(NotificationDestination onUnhealthyTable) {
    this.onUnhealthyTable = onUnhealthyTable;
    return this;
  }

  public NotificationDestination getOnUnhealthyTable() {
    return onUnhealthyTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotificationSettings that = (NotificationSettings) o;
    return Objects.equals(onFailure, that.onFailure)
        && Objects.equals(onUnhealthyTable, that.onUnhealthyTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onFailure, onUnhealthyTable);
  }

  @Override
  public String toString() {
    return new ToStringer(NotificationSettings.class)
        .add("onFailure", onFailure)
        .add("onUnhealthyTable", onUnhealthyTable)
        .toString();
  }
}
