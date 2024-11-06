// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateProviderAnalyticsDashboardResponse {
  /** this is newly created Lakeview dashboard for the user */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** id & version should be the same as the request */
  @JsonProperty("id")
  private String id;

  /** */
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
