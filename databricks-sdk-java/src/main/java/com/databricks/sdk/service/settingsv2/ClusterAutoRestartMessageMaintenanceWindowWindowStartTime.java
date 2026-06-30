// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ClusterAutoRestartMessageMaintenanceWindowWindowStartTime {
  /** */
  @JsonProperty("hours")
  private Long hours;

  /** */
  @JsonProperty("minutes")
  private Long minutes;

  public ClusterAutoRestartMessageMaintenanceWindowWindowStartTime setHours(Long hours) {
    this.hours = hours;
    return this;
  }

  public Long getHours() {
    return hours;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWindowStartTime setMinutes(Long minutes) {
    this.minutes = minutes;
    return this;
  }

  public Long getMinutes() {
    return minutes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterAutoRestartMessageMaintenanceWindowWindowStartTime that =
        (ClusterAutoRestartMessageMaintenanceWindowWindowStartTime) o;
    return Objects.equals(hours, that.hours) && Objects.equals(minutes, that.minutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hours, minutes);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAutoRestartMessageMaintenanceWindowWindowStartTime.class)
        .add("hours", hours)
        .add("minutes", minutes)
        .toString();
  }
}
