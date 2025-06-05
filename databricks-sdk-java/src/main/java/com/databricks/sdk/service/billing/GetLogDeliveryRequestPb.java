// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get log delivery configuration */
@Generated
class GetLogDeliveryRequestPb {
  @JsonIgnore private String logDeliveryConfigurationId;

  public GetLogDeliveryRequestPb setLogDeliveryConfigurationId(String logDeliveryConfigurationId) {
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
    GetLogDeliveryRequestPb that = (GetLogDeliveryRequestPb) o;
    return Objects.equals(logDeliveryConfigurationId, that.logDeliveryConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurationId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLogDeliveryRequestPb.class)
        .add("logDeliveryConfigurationId", logDeliveryConfigurationId)
        .toString();
  }
}
