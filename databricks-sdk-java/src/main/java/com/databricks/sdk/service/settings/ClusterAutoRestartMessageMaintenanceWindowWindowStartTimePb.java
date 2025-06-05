// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb {
  @JsonProperty("hours")
  private Long hours;

  @JsonProperty("minutes")
  private Long minutes;

  public ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb setHours(Long hours) {
    this.hours = hours;
    return this;
  }

  public Long getHours() {
    return hours;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb setMinutes(Long minutes) {
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
    ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb that =
        (ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb) o;
    return Objects.equals(hours, that.hours) && Objects.equals(minutes, that.minutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hours, minutes);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb.class)
        .add("hours", hours)
        .add("minutes", minutes)
        .toString();
  }
}
