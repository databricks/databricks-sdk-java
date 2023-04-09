// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** [DEPRECATED] Get refresh schedules */
public class ListSchedulesRequest {
  /** */
  private String alertId;

  public ListSchedulesRequest setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }
}
