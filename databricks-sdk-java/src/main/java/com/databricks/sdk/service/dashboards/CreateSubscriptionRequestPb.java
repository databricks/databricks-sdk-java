// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create schedule subscription */
@Generated
class CreateSubscriptionRequestPb {
  @JsonIgnore private String dashboardId;

  @JsonIgnore private String scheduleId;

  @JsonProperty("subscription")
  private Subscription subscription;

  public CreateSubscriptionRequestPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public CreateSubscriptionRequestPb setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public CreateSubscriptionRequestPb setSubscription(Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

  public Subscription getSubscription() {
    return subscription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSubscriptionRequestPb that = (CreateSubscriptionRequestPb) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(scheduleId, that.scheduleId)
        && Objects.equals(subscription, that.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, scheduleId, subscription);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSubscriptionRequestPb.class)
        .add("dashboardId", dashboardId)
        .add("scheduleId", scheduleId)
        .add("subscription", subscription)
        .toString();
  }
}
