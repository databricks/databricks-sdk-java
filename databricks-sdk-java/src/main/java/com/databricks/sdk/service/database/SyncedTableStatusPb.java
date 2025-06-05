// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Status of a synced table. */
@Generated
class SyncedTableStatusPb {
  @JsonProperty("continuous_update_status")
  private SyncedTableContinuousUpdateStatus continuousUpdateStatus;

  @JsonProperty("detailed_state")
  private SyncedTableState detailedState;

  @JsonProperty("failed_status")
  private SyncedTableFailedStatus failedStatus;

  @JsonProperty("message")
  private String message;

  @JsonProperty("provisioning_status")
  private SyncedTableProvisioningStatus provisioningStatus;

  @JsonProperty("triggered_update_status")
  private SyncedTableTriggeredUpdateStatus triggeredUpdateStatus;

  public SyncedTableStatusPb setContinuousUpdateStatus(
      SyncedTableContinuousUpdateStatus continuousUpdateStatus) {
    this.continuousUpdateStatus = continuousUpdateStatus;
    return this;
  }

  public SyncedTableContinuousUpdateStatus getContinuousUpdateStatus() {
    return continuousUpdateStatus;
  }

  public SyncedTableStatusPb setDetailedState(SyncedTableState detailedState) {
    this.detailedState = detailedState;
    return this;
  }

  public SyncedTableState getDetailedState() {
    return detailedState;
  }

  public SyncedTableStatusPb setFailedStatus(SyncedTableFailedStatus failedStatus) {
    this.failedStatus = failedStatus;
    return this;
  }

  public SyncedTableFailedStatus getFailedStatus() {
    return failedStatus;
  }

  public SyncedTableStatusPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public SyncedTableStatusPb setProvisioningStatus(
      SyncedTableProvisioningStatus provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
    return this;
  }

  public SyncedTableProvisioningStatus getProvisioningStatus() {
    return provisioningStatus;
  }

  public SyncedTableStatusPb setTriggeredUpdateStatus(
      SyncedTableTriggeredUpdateStatus triggeredUpdateStatus) {
    this.triggeredUpdateStatus = triggeredUpdateStatus;
    return this;
  }

  public SyncedTableTriggeredUpdateStatus getTriggeredUpdateStatus() {
    return triggeredUpdateStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableStatusPb that = (SyncedTableStatusPb) o;
    return Objects.equals(continuousUpdateStatus, that.continuousUpdateStatus)
        && Objects.equals(detailedState, that.detailedState)
        && Objects.equals(failedStatus, that.failedStatus)
        && Objects.equals(message, that.message)
        && Objects.equals(provisioningStatus, that.provisioningStatus)
        && Objects.equals(triggeredUpdateStatus, that.triggeredUpdateStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        continuousUpdateStatus,
        detailedState,
        failedStatus,
        message,
        provisioningStatus,
        triggeredUpdateStatus);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableStatusPb.class)
        .add("continuousUpdateStatus", continuousUpdateStatus)
        .add("detailedState", detailedState)
        .add("failedStatus", failedStatus)
        .add("message", message)
        .add("provisioningStatus", provisioningStatus)
        .add("triggeredUpdateStatus", triggeredUpdateStatus)
        .toString();
  }
}
