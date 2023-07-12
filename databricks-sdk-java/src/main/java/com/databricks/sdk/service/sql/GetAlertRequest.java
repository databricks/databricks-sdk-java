// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Get an alert
 */
@Generated
public class GetAlertRequest {
  /**
   
   */
  
  private String alertId;
  
  public GetAlertRequest setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAlertRequest that = (GetAlertRequest) o;
    return Objects.equals(alertId, that.alertId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAlertRequest.class)
      .add("alertId", alertId).toString();
  }
}
