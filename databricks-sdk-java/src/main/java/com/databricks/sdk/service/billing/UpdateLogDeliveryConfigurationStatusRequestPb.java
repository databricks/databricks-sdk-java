// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateLogDeliveryConfigurationStatusRequestPb {
  @JsonIgnore private String logDeliveryConfigurationId;

  @JsonProperty("status")
  private LogDeliveryConfigStatus status;

  public UpdateLogDeliveryConfigurationStatusRequestPb setLogDeliveryConfigurationId(
      String logDeliveryConfigurationId) {
    this.logDeliveryConfigurationId = logDeliveryConfigurationId;
    return this;
  }

  public String getLogDeliveryConfigurationId() {
    return logDeliveryConfigurationId;
  }

  public UpdateLogDeliveryConfigurationStatusRequestPb setStatus(LogDeliveryConfigStatus status) {
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
    UpdateLogDeliveryConfigurationStatusRequestPb that =
        (UpdateLogDeliveryConfigurationStatusRequestPb) o;
    return Objects.equals(logDeliveryConfigurationId, that.logDeliveryConfigurationId)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurationId, status);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateLogDeliveryConfigurationStatusRequestPb.class)
        .add("logDeliveryConfigurationId", logDeliveryConfigurationId)
        .add("status", status)
        .toString();
  }
}
