// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteSubscriptionRequest {
  /** UUID identifying the dashboard which the subscription belongs. */
  @JsonIgnore private String dashboardId;

  /**
   * The etag for the subscription. Can be optionally provided to ensure that the subscription has
   * not been modified since the last read.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /** UUID identifying the schedule which the subscription belongs. */
  @JsonIgnore private String scheduleId;

  /** UUID identifying the subscription. */
  @JsonIgnore private String subscriptionId;

  public DeleteSubscriptionRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DeleteSubscriptionRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DeleteSubscriptionRequest setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public DeleteSubscriptionRequest setSubscriptionId(String subscriptionId) {
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
    DeleteSubscriptionRequest that = (DeleteSubscriptionRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(etag, that.etag)
        && Objects.equals(scheduleId, that.scheduleId)
        && Objects.equals(subscriptionId, that.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, etag, scheduleId, subscriptionId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSubscriptionRequest.class)
        .add("dashboardId", dashboardId)
        .add("etag", etag)
        .add("scheduleId", scheduleId)
        .add("subscriptionId", subscriptionId)
        .toString();
  }
}
