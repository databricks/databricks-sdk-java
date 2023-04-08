// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** Delete an alert */
public class DeleteAlertRequest {
  /** */
  private String alertId;

  public DeleteAlertRequest setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }
}
