// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get log delivery configuration */
public class GetLogDeliveryRequest {
  /** Databricks log delivery configuration ID */
  private String logDeliveryConfigurationId;

  public GetLogDeliveryRequest setLogDeliveryConfigurationId(String logDeliveryConfigurationId) {
    this.logDeliveryConfigurationId = logDeliveryConfigurationId;
    return this;
  }

  public String getLogDeliveryConfigurationId() {
    return logDeliveryConfigurationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLogDeliveryRequest that = (GetLogDeliveryRequest) o;
    return Objects.equals(logDeliveryConfigurationId, that.logDeliveryConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurationId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLogDeliveryRequest.class)
        .add("logDeliveryConfigurationId", logDeliveryConfigurationId)
        .toString();
  }
}
