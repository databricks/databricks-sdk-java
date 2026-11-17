// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A subscription registers a workspace user or a notification destination as a subscriber of a
 * dashboard schedule. Each time the schedule runs, the subscriber receives a snapshot of the
 * published dashboard, unless the subscription is refresh-only. See [Manage scheduled dashboard
 * updates and subscriptions].
 *
 * <p>[Manage scheduled dashboard updates and subscriptions]:
 * https://docs.databricks.com/dashboards/share/schedule-subscribe
 */
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
   * The etag of the subscription. It must be left empty on create. It can be passed as the `etag`
   * parameter of the delete method to make sure the subscription has not changed since it was read.
   */
  @JsonProperty("etag")
  private String etag;

  /** UUID identifying the schedule to which the subscription belongs. */
  @JsonProperty("schedule_id")
  private String scheduleId;

  /**
   * Whether the subscription is refresh-only. When true, each scheduled run refreshes the dashboard
   * data for the subscriber without sending a notification. Defaults to false. Refresh-only
   * subscriptions are only allowed on dashboards published without embedded credentials.
   */
  @JsonProperty("skip_notify")
  private Boolean skipNotify;

  /**
   * The subscriber that receives the dashboard snapshot. Exactly one of `user_subscriber` and
   * `destination_subscriber` must be set.
   */
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

  public Subscription setSkipNotify(Boolean skipNotify) {
    this.skipNotify = skipNotify;
    return this;
  }

  public Boolean getSkipNotify() {
    return skipNotify;
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
        && Objects.equals(skipNotify, that.skipNotify)
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
        skipNotify,
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
        .add("skipNotify", skipNotify)
        .add("subscriber", subscriber)
        .add("subscriptionId", subscriptionId)
        .add("updateTime", updateTime)
        .toString();
  }
}
