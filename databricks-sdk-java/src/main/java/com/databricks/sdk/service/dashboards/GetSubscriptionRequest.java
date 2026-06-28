// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetSubscriptionRequest {
  /** UUID identifying the dashboard which the subscription belongs. */
  @JsonIgnore private String dashboardId;

  /** UUID identifying the schedule which the subscription belongs. */
  @JsonIgnore private String scheduleId;

  /** UUID identifying the subscription. */
  @JsonIgnore private String subscriptionId;

  public GetSubscriptionRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public GetSubscriptionRequest setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public GetSubscriptionRequest setSubscriptionId(String subscriptionId) {
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
    GetSubscriptionRequest that = (GetSubscriptionRequest) o;
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
    return new ToStringer(GetSubscriptionRequest.class)
        .add("dashboardId", dashboardId)
        .add("scheduleId", scheduleId)
        .add("subscriptionId", subscriptionId)
        .toString();
  }
}
