// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Anomaly Detection Configurations. */
@Generated
public class AnomalyDetectionConfig {
  /** List of fully qualified table names to exclude from anomaly detection. */
  @JsonProperty("excluded_table_full_names")
  private Collection<String> excludedTableFullNames;

  /**
   * Who to alert when anomaly detection finds unhealthy tables in this schema. Applicable to
   * `schema` monitors only. This is the same schema alert you manage from **Manage alerts** in the
   * Data Quality Monitoring UI, so a change made in either place shows in both.
   *
   * <p>Set the recipients in `on_unhealthy_table`; `on_failure` is not supported here. Only
   * `destination_ids` and `destination_user_ids` are supported.
   *
   * <p>On update, an update mask of `*`, `anomaly_detection_config`, or
   * `anomaly_detection_config.notification_settings` replaces the alert's recipients with the ones
   * in the request; omitting the field, or leaving both recipient lists empty, removes the alert.
   * Other masks leave the alert unchanged.
   */
  @JsonProperty("notification_settings")
  private NotificationSettings notificationSettings;

  public AnomalyDetectionConfig setExcludedTableFullNames(
      Collection<String> excludedTableFullNames) {
    this.excludedTableFullNames = excludedTableFullNames;
    return this;
  }

  public Collection<String> getExcludedTableFullNames() {
    return excludedTableFullNames;
  }

  public AnomalyDetectionConfig setNotificationSettings(NotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public NotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnomalyDetectionConfig that = (AnomalyDetectionConfig) o;
    return Objects.equals(excludedTableFullNames, that.excludedTableFullNames)
        && Objects.equals(notificationSettings, that.notificationSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedTableFullNames, notificationSettings);
  }

  @Override
  public String toString() {
    return new ToStringer(AnomalyDetectionConfig.class)
        .add("excludedTableFullNames", excludedTableFullNames)
        .add("notificationSettings", notificationSettings)
        .toString();
  }
}
