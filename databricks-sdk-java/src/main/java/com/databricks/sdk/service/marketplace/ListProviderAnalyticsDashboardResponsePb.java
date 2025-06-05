// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ListProviderAnalyticsDashboardResponsePb {
  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("version")
  private Long version;

  public ListProviderAnalyticsDashboardResponsePb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public ListProviderAnalyticsDashboardResponsePb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ListProviderAnalyticsDashboardResponsePb setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProviderAnalyticsDashboardResponsePb that = (ListProviderAnalyticsDashboardResponsePb) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(id, that.id)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, id, version);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProviderAnalyticsDashboardResponsePb.class)
        .add("dashboardId", dashboardId)
        .add("id", id)
        .add("version", version)
        .toString();
  }
}
