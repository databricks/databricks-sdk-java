// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GetBillingUsageDashboardResponsePb {
  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonProperty("dashboard_url")
  private String dashboardUrl;

  public GetBillingUsageDashboardResponsePb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public GetBillingUsageDashboardResponsePb setDashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
    return this;
  }

  public String getDashboardUrl() {
    return dashboardUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetBillingUsageDashboardResponsePb that = (GetBillingUsageDashboardResponsePb) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(dashboardUrl, that.dashboardUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, dashboardUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBillingUsageDashboardResponsePb.class)
        .add("dashboardId", dashboardId)
        .add("dashboardUrl", dashboardUrl)
        .toString();
  }
}
