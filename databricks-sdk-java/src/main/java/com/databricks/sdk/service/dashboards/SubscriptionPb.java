// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SubscriptionPb {
  @JsonProperty("create_time")
  private String createTime;

  @JsonProperty("created_by_user_id")
  private Long createdByUserId;

  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("schedule_id")
  private String scheduleId;

  @JsonProperty("subscriber")
  private Subscriber subscriber;

  @JsonProperty("subscription_id")
  private String subscriptionId;

  @JsonProperty("update_time")
  private String updateTime;

  public SubscriptionPb setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public SubscriptionPb setCreatedByUserId(Long createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

  public Long getCreatedByUserId() {
    return createdByUserId;
  }

  public SubscriptionPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public SubscriptionPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public SubscriptionPb setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public SubscriptionPb setSubscriber(Subscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }

  public Subscriber getSubscriber() {
    return subscriber;
  }

  public SubscriptionPb setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  public String getSubscriptionId() {
    return subscriptionId;
  }

  public SubscriptionPb setUpdateTime(String updateTime) {
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
    SubscriptionPb that = (SubscriptionPb) o;
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
    return new ToStringer(SubscriptionPb.class)
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
