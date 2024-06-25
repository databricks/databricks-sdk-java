// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateSubscriptionRequest {
  /** UUID identifying the dashboard to which the subscription belongs. */
  private String dashboardId;

  /** UUID identifying the schedule to which the subscription belongs. */
  private String scheduleId;

  /** Subscriber details for users and destinations to be added as subscribers to the schedule. */
  @JsonProperty("subscriber")
  private Subscriber subscriber;

  public CreateSubscriptionRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public CreateSubscriptionRequest setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public CreateSubscriptionRequest setSubscriber(Subscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }

  public Subscriber getSubscriber() {
    return subscriber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSubscriptionRequest that = (CreateSubscriptionRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(scheduleId, that.scheduleId)
        && Objects.equals(subscriber, that.subscriber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, scheduleId, subscriber);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSubscriptionRequest.class)
        .add("dashboardId", dashboardId)
        .add("scheduleId", scheduleId)
        .add("subscriber", subscriber)
        .toString();
  }
}
