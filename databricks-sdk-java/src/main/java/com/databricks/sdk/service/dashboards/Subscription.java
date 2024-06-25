// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Subscription {
  /** A timestamp indicating when the subscription was created. */
  @JsonProperty("create_time")
  private String createTime;

  /**
   * UserId of the user who adds subscribers (users or notification destinations) to the dashboard's
   * schedule.
   */
  @JsonProperty("created_by_user_id")
  private Long createdByUserId;

  /** UUID identifying the dashboard to which the subscription belongs. */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /**
   * The etag for the subscription. Must be left empty on create, can be optionally provided on
   * delete to ensure that the subscription has not been deleted since the last read.
   */
  @JsonProperty("etag")
  private String etag;

  /** UUID identifying the schedule to which the subscription belongs. */
  @JsonProperty("schedule_id")
  private String scheduleId;

  /** Subscriber details for users and destinations to be added as subscribers to the schedule. */
  @JsonProperty("subscriber")
  private Subscriber subscriber;

  /** UUID identifying the subscription. */
  @JsonProperty("subscription_id")
  private String subscriptionId;

  /** A timestamp indicating when the subscription was last updated. */
  @JsonProperty("update_time")
  private String updateTime;

  public Subscription setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public Subscription setCreatedByUserId(Long createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

  public Long getCreatedByUserId() {
    return createdByUserId;
  }

  public Subscription setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public Subscription setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public Subscription setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public Subscription setSubscriber(Subscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }

  public Subscriber getSubscriber() {
    return subscriber;
  }

  public Subscription setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  public String getSubscriptionId() {
    return subscriptionId;
  }

  public Subscription setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Subscription that = (Subscription) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(createdByUserId, that.createdByUserId)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(etag, that.etag)
        && Objects.equals(scheduleId, that.scheduleId)
        && Objects.equals(subscriber, that.subscriber)
        && Objects.equals(subscriptionId, that.subscriptionId)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        createdByUserId,
        dashboardId,
        etag,
        scheduleId,
        subscriber,
        subscriptionId,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Subscription.class)
        .add("createTime", createTime)
        .add("createdByUserId", createdByUserId)
        .add("dashboardId", dashboardId)
        .add("etag", etag)
        .add("scheduleId", scheduleId)
        .add("subscriber", subscriber)
        .add("subscriptionId", subscriptionId)
        .add("updateTime", updateTime)
        .toString();
  }
}
