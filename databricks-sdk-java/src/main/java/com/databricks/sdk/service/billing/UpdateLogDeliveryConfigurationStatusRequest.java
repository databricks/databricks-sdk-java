// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateLogDeliveryConfigurationStatusRequest {
  /** Databricks log delivery configuration ID */
  private String logDeliveryConfigurationId;

  /**
   * Status of log delivery configuration. Set to `ENABLED` (enabled) or `DISABLED` (disabled).
   * Defaults to `ENABLED`. You can [enable or disable the
   * configuration](#operation/patch-log-delivery-config-status) later. Deletion of a configuration
   * is not supported, so disable a log delivery configuration that is no longer needed.
   */
  @JsonProperty("status")
  private LogDeliveryConfigStatus status;

  public UpdateLogDeliveryConfigurationStatusRequest setLogDeliveryConfigurationId(
      String logDeliveryConfigurationId) {
    this.logDeliveryConfigurationId = logDeliveryConfigurationId;
    return this;
  }

  public String getLogDeliveryConfigurationId() {
    return logDeliveryConfigurationId;
  }

  public UpdateLogDeliveryConfigurationStatusRequest setStatus(LogDeliveryConfigStatus status) {
    this.status = status;
    return this;
  }

  public LogDeliveryConfigStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateLogDeliveryConfigurationStatusRequest that =
        (UpdateLogDeliveryConfigurationStatusRequest) o;
    return Objects.equals(logDeliveryConfigurationId, that.logDeliveryConfigurationId)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurationId, status);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateLogDeliveryConfigurationStatusRequest.class)
        .add("logDeliveryConfigurationId", logDeliveryConfigurationId)
        .add("status", status)
        .toString();
  }
}
