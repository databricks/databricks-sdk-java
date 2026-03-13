// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AlertTask {
  /** The alert_id is the canonical identifier of the alert. */
  @JsonProperty("alert_id")
  private String alertId;

  /**
   * The subscribers receive alert evaluation result notifications after the alert task is
   * completed. The number of subscriptions is limited to 100.
   */
  @JsonProperty("subscribers")
  private Collection<AlertTaskSubscriber> subscribers;

  /** The warehouse_id identifies the warehouse settings used by the alert task. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  /**
   * The workspace_path is the path to the alert file in the workspace. The path: * must start with
   * "/Workspace" * must be a normalized path. User has to select only one of alert_id or
   * workspace_path to identify the alert.
   */
  @JsonProperty("workspace_path")
  private String workspacePath;

  public AlertTask setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  public AlertTask setSubscribers(Collection<AlertTaskSubscriber> subscribers) {
    this.subscribers = subscribers;
    return this;
  }

  public Collection<AlertTaskSubscriber> getSubscribers() {
    return subscribers;
  }

  public AlertTask setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  public AlertTask setWorkspacePath(String workspacePath) {
    this.workspacePath = workspacePath;
    return this;
  }

  public String getWorkspacePath() {
    return workspacePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertTask that = (AlertTask) o;
    return Objects.equals(alertId, that.alertId)
        && Objects.equals(subscribers, that.subscribers)
        && Objects.equals(warehouseId, that.warehouseId)
        && Objects.equals(workspacePath, that.workspacePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, subscribers, warehouseId, workspacePath);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertTask.class)
        .add("alertId", alertId)
        .add("subscribers", subscribers)
        .add("warehouseId", warehouseId)
        .add("workspacePath", workspacePath)
        .toString();
  }
}
