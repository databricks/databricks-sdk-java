// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateProviderAnalyticsDashboardResponse {
  /** ID of the AI/BI dashboard that now contains the updated template. */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** Marketplace-specific ID of the dashboard record, the same as in the request. */
  @JsonProperty("id")
  private String id;

  /** Version of the dashboard template that the dashboard now uses. */
  @JsonProperty("version")
  private Long version;

  public UpdateProviderAnalyticsDashboardResponse setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public UpdateProviderAnalyticsDashboardResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateProviderAnalyticsDashboardResponse setVersion(Long version) {
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
    UpdateProviderAnalyticsDashboardResponse that = (UpdateProviderAnalyticsDashboardResponse) o;
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
    return new ToStringer(UpdateProviderAnalyticsDashboardResponse.class)
        .add("dashboardId", dashboardId)
        .add("id", id)
        .add("version", version)
        .toString();
  }
}
