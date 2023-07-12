// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Get log delivery configuration
 */
@Generated
public class GetLogDeliveryRequest {
  /**
   * Databricks log delivery configuration ID
   */
  
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
    return Objects.equals(logDeliveryConfigurationId, that.logDeliveryConfigurationId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurationId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLogDeliveryRequest.class)
      .add("logDeliveryConfigurationId", logDeliveryConfigurationId).toString();
  }
}
