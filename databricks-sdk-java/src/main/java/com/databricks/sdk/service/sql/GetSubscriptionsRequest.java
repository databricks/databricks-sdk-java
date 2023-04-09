// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** [DEPRECATED] Get an alert's subscriptions */
public class GetSubscriptionsRequest {
  /** */
  private String alertId;

  public GetSubscriptionsRequest setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }
}
