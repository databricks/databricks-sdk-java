// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetBillingUsageDashboardRequest {
  /**
   * Workspace level usage dashboard shows usage data for the specified workspace ID. Global level
   * usage dashboard shows usage data for all workspaces in the account. The request fails if the
   * type is not set.
   */
  @JsonIgnore
  @QueryParam("dashboard_type")
  private UsageDashboardType dashboardType;

  /**
   * The ID of the workspace that contains the usage dashboard. If omitted, the most recently
   * created dashboard of the given type across all workspaces in the account is returned.
   */
  @JsonIgnore
  @QueryParam("workspace_id")
  private Long workspaceId;

  public GetBillingUsageDashboardRequest setDashboardType(UsageDashboardType dashboardType) {
    this.dashboardType = dashboardType;
    return this;
  }

  public UsageDashboardType getDashboardType() {
    return dashboardType;
  }

  public GetBillingUsageDashboardRequest setWorkspaceId(Long workspaceId) {
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
    GetBillingUsageDashboardRequest that = (GetBillingUsageDashboardRequest) o;
    return Objects.equals(dashboardType, that.dashboardType)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardType, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBillingUsageDashboardRequest.class)
        .add("dashboardType", dashboardType)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
