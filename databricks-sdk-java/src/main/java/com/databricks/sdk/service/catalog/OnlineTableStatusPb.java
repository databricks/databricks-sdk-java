// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Status of an online table. */
@Generated
class OnlineTableStatusPb {
  @JsonProperty("continuous_update_status")
  private ContinuousUpdateStatus continuousUpdateStatus;

  @JsonProperty("detailed_state")
  private OnlineTableState detailedState;

  @JsonProperty("failed_status")
  private FailedStatus failedStatus;

  @JsonProperty("message")
  private String message;

  @JsonProperty("provisioning_status")
  private ProvisioningStatus provisioningStatus;

  @JsonProperty("triggered_update_status")
  private TriggeredUpdateStatus triggeredUpdateStatus;

  public OnlineTableStatusPb setContinuousUpdateStatus(
      ContinuousUpdateStatus continuousUpdateStatus) {
    this.continuousUpdateStatus = continuousUpdateStatus;
    return this;
  }

  public ContinuousUpdateStatus getContinuousUpdateStatus() {
    return continuousUpdateStatus;
  }

  public OnlineTableStatusPb setDetailedState(OnlineTableState detailedState) {
    this.detailedState = detailedState;
    return this;
  }

  public OnlineTableState getDetailedState() {
    return detailedState;
  }

  public OnlineTableStatusPb setFailedStatus(FailedStatus failedStatus) {
    this.failedStatus = failedStatus;
    return this;
  }

  public FailedStatus getFailedStatus() {
    return failedStatus;
  }

  public OnlineTableStatusPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public OnlineTableStatusPb setProvisioningStatus(ProvisioningStatus provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
    return this;
  }

  public ProvisioningStatus getProvisioningStatus() {
    return provisioningStatus;
  }

  public OnlineTableStatusPb setTriggeredUpdateStatus(TriggeredUpdateStatus triggeredUpdateStatus) {
    this.triggeredUpdateStatus = triggeredUpdateStatus;
    return this;
  }

  public TriggeredUpdateStatus getTriggeredUpdateStatus() {
    return triggeredUpdateStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineTableStatusPb that = (OnlineTableStatusPb) o;
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
    return new ToStringer(OnlineTableStatusPb.class)
        .add("continuousUpdateStatus", continuousUpdateStatus)
        .add("detailedState", detailedState)
        .add("failedStatus", failedStatus)
        .add("message", message)
        .add("provisioningStatus", provisioningStatus)
        .add("triggeredUpdateStatus", triggeredUpdateStatus)
        .toString();
  }
}
