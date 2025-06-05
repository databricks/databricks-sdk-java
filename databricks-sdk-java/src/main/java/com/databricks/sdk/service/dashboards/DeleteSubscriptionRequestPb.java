// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete schedule subscription */
@Generated
class DeleteSubscriptionRequestPb {
  @JsonIgnore private String dashboardId;

  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  @JsonIgnore private String scheduleId;

  @JsonIgnore private String subscriptionId;

  public DeleteSubscriptionRequestPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DeleteSubscriptionRequestPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DeleteSubscriptionRequestPb setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public DeleteSubscriptionRequestPb setSubscriptionId(String subscriptionId) {
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
    DeleteSubscriptionRequestPb that = (DeleteSubscriptionRequestPb) o;
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
    return new ToStringer(DeleteSubscriptionRequestPb.class)
        .add("dashboardId", dashboardId)
        .add("etag", etag)
        .add("scheduleId", scheduleId)
        .add("subscriptionId", subscriptionId)
        .toString();
  }
}
