// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Status of an online table. */
@Generated
public class OnlineTableStatus {
  /**
   * Detailed status of an online table. Shown if the online table is in the
   * ONLINE_CONTINUOUS_UPDATE or the ONLINE_UPDATING_PIPELINE_RESOURCES state.
   */
  @JsonProperty("continuous_update_status")
  private ContinuousUpdateStatus continuousUpdateStatus;

  /** The state of the online table. */
  @JsonProperty("detailed_state")
  private OnlineTableState detailedState;

  /**
   * Detailed status of an online table. Shown if the online table is in the OFFLINE_FAILED or the
   * ONLINE_PIPELINE_FAILED state.
   */
  @JsonProperty("failed_status")
  private FailedStatus failedStatus;

  /** A text description of the current state of the online table. */
  @JsonProperty("message")
  private String message;

  /**
   * Detailed status of an online table. Shown if the online table is in the
   * PROVISIONING_PIPELINE_RESOURCES or the PROVISIONING_INITIAL_SNAPSHOT state.
   */
  @JsonProperty("provisioning_status")
  private ProvisioningStatus provisioningStatus;

  /**
   * Detailed status of an online table. Shown if the online table is in the ONLINE_TRIGGERED_UPDATE
   * or the ONLINE_NO_PENDING_UPDATE state.
   */
  @JsonProperty("triggered_update_status")
  private TriggeredUpdateStatus triggeredUpdateStatus;

  public OnlineTableStatus setContinuousUpdateStatus(
      ContinuousUpdateStatus continuousUpdateStatus) {
    this.continuousUpdateStatus = continuousUpdateStatus;
    return this;
  }

  public ContinuousUpdateStatus getContinuousUpdateStatus() {
    return continuousUpdateStatus;
  }

  public OnlineTableStatus setDetailedState(OnlineTableState detailedState) {
    this.detailedState = detailedState;
    return this;
  }

  public OnlineTableState getDetailedState() {
    return detailedState;
  }

  public OnlineTableStatus setFailedStatus(FailedStatus failedStatus) {
    this.failedStatus = failedStatus;
    return this;
  }

  public FailedStatus getFailedStatus() {
    return failedStatus;
  }

  public OnlineTableStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public OnlineTableStatus setProvisioningStatus(ProvisioningStatus provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
    return this;
  }

  public ProvisioningStatus getProvisioningStatus() {
    return provisioningStatus;
  }

  public OnlineTableStatus setTriggeredUpdateStatus(TriggeredUpdateStatus triggeredUpdateStatus) {
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
    OnlineTableStatus that = (OnlineTableStatus) o;
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
    return new ToStringer(OnlineTableStatus.class)
        .add("continuousUpdateStatus", continuousUpdateStatus)
        .add("detailedState", detailedState)
        .add("failedStatus", failedStatus)
        .add("message", message)
        .add("provisioningStatus", provisioningStatus)
        .add("triggeredUpdateStatus", triggeredUpdateStatus)
        .toString();
  }
}
