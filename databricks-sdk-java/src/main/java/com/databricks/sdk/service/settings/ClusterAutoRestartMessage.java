// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ClusterAutoRestartMessage {
  /** */
  @JsonProperty("can_toggle")
  private Boolean canToggle;

  /** */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** */
  @JsonProperty("enablement_details")
  private ClusterAutoRestartMessageEnablementDetails enablementDetails;

  /** */
  @JsonProperty("maintenance_window")
  private ClusterAutoRestartMessageMaintenanceWindow maintenanceWindow;

  /** */
  @JsonProperty("restart_even_if_no_updates_available")
  private Boolean restartEvenIfNoUpdatesAvailable;

  public ClusterAutoRestartMessage setCanToggle(Boolean canToggle) {
    this.canToggle = canToggle;
    return this;
  }

  public Boolean getCanToggle() {
    return canToggle;
  }

  public ClusterAutoRestartMessage setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public ClusterAutoRestartMessage setEnablementDetails(
      ClusterAutoRestartMessageEnablementDetails enablementDetails) {
    this.enablementDetails = enablementDetails;
    return this;
  }

  public ClusterAutoRestartMessageEnablementDetails getEnablementDetails() {
    return enablementDetails;
  }

  public ClusterAutoRestartMessage setMaintenanceWindow(
      ClusterAutoRestartMessageMaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

  public ClusterAutoRestartMessageMaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }

  public ClusterAutoRestartMessage setRestartEvenIfNoUpdatesAvailable(
      Boolean restartEvenIfNoUpdatesAvailable) {
    this.restartEvenIfNoUpdatesAvailable = restartEvenIfNoUpdatesAvailable;
    return this;
  }

  public Boolean getRestartEvenIfNoUpdatesAvailable() {
    return restartEvenIfNoUpdatesAvailable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterAutoRestartMessage that = (ClusterAutoRestartMessage) o;
    return Objects.equals(canToggle, that.canToggle)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(enablementDetails, that.enablementDetails)
        && Objects.equals(maintenanceWindow, that.maintenanceWindow)
        && Objects.equals(restartEvenIfNoUpdatesAvailable, that.restartEvenIfNoUpdatesAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        canToggle, enabled, enablementDetails, maintenanceWindow, restartEvenIfNoUpdatesAvailable);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAutoRestartMessage.class)
        .add("canToggle", canToggle)
        .add("enabled", enabled)
        .add("enablementDetails", enablementDetails)
        .add("maintenanceWindow", maintenanceWindow)
        .add("restartEvenIfNoUpdatesAvailable", restartEvenIfNoUpdatesAvailable)
        .toString();
  }
}
