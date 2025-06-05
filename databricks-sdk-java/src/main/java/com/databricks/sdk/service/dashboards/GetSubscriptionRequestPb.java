// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get schedule subscription */
@Generated
class GetSubscriptionRequestPb {
  @JsonIgnore private String dashboardId;

  @JsonIgnore private String scheduleId;

  @JsonIgnore private String subscriptionId;

  public GetSubscriptionRequestPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public GetSubscriptionRequestPb setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public GetSubscriptionRequestPb setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  public String getSubscriptionId() {
    return subscriptionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSubscriptionRequestPb that = (GetSubscriptionRequestPb) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(scheduleId, that.scheduleId)
        && Objects.equals(subscriptionId, that.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, scheduleId, subscriptionId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSubscriptionRequestPb.class)
        .add("dashboardId", dashboardId)
        .add("scheduleId", scheduleId)
        .add("subscriptionId", subscriptionId)
        .toString();
  }
}
