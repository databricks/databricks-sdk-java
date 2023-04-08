// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SqlTaskDashboard {
  /** Subject of the email sent to subscribers of this task. */
  @JsonProperty("custom_subject")
  private String customSubject;

  /** The canonical identifier of the SQL dashboard. */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** If true, the dashboard snapshot is not taken, and emails are not sent to subscribers. */
  @JsonProperty("pause_subscriptions")
  private Boolean pauseSubscriptions;

  /** If specified, dashboard snapshots are sent to subscriptions. */
  @JsonProperty("subscriptions")
  private java.util.List<SqlTaskSubscription> subscriptions;

  public SqlTaskDashboard setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public SqlTaskDashboard setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public SqlTaskDashboard setPauseSubscriptions(Boolean pauseSubscriptions) {
    this.pauseSubscriptions = pauseSubscriptions;
    return this;
  }

  public Boolean getPauseSubscriptions() {
    return pauseSubscriptions;
  }

  public SqlTaskDashboard setSubscriptions(java.util.List<SqlTaskSubscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public java.util.List<SqlTaskSubscription> getSubscriptions() {
    return subscriptions;
  }
}
