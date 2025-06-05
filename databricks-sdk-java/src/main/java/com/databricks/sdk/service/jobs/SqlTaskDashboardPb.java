// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SqlTaskDashboardPb {
  @JsonProperty("custom_subject")
  private String customSubject;

  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonProperty("pause_subscriptions")
  private Boolean pauseSubscriptions;

  @JsonProperty("subscriptions")
  private Collection<SqlTaskSubscription> subscriptions;

  public SqlTaskDashboardPb setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public SqlTaskDashboardPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public SqlTaskDashboardPb setPauseSubscriptions(Boolean pauseSubscriptions) {
    this.pauseSubscriptions = pauseSubscriptions;
    return this;
  }

  public Boolean getPauseSubscriptions() {
    return pauseSubscriptions;
  }

  public SqlTaskDashboardPb setSubscriptions(Collection<SqlTaskSubscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public Collection<SqlTaskSubscription> getSubscriptions() {
    return subscriptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskDashboardPb that = (SqlTaskDashboardPb) o;
    return Objects.equals(customSubject, that.customSubject)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(pauseSubscriptions, that.pauseSubscriptions)
        && Objects.equals(subscriptions, that.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customSubject, dashboardId, pauseSubscriptions, subscriptions);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskDashboardPb.class)
        .add("customSubject", customSubject)
        .add("dashboardId", dashboardId)
        .add("pauseSubscriptions", pauseSubscriptions)
        .add("subscriptions", subscriptions)
        .toString();
  }
}
