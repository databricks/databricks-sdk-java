// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateBillingUsageDashboardRequestPb {
  @JsonProperty("dashboard_type")
  private UsageDashboardType dashboardType;

  @JsonProperty("workspace_id")
  private Long workspaceId;

  public CreateBillingUsageDashboardRequestPb setDashboardType(UsageDashboardType dashboardType) {
    this.dashboardType = dashboardType;
    return this;
  }

  public UsageDashboardType getDashboardType() {
    return dashboardType;
  }

  public CreateBillingUsageDashboardRequestPb setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateBillingUsageDashboardRequestPb that = (CreateBillingUsageDashboardRequestPb) o;
    return Objects.equals(dashboardType, that.dashboardType)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardType, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBillingUsageDashboardRequestPb.class)
        .add("dashboardType", dashboardType)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
