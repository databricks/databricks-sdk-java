// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateBillingUsageDashboardRequest {
  /**
   * Workspace level usage dashboard shows usage data for the specified workspace ID. Global level
   * usage dashboard shows usage data for all workspaces in the account. The request fails if the
   * type is not set.
   */
  @JsonProperty("dashboard_type")
  private UsageDashboardType dashboardType;

  /**
   * The major version of the usage dashboard template to import. Version 2 adds cost forecasting
   * and object-level cost drill-down.
   */
  @JsonProperty("major_version")
  private UsageDashboardMajorVersion majorVersion;

  /**
   * The ID of the workspace to import the usage dashboard into. The workspace must be running,
   * belong to the account, and not be a disaster recovery secondary.
   */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  public CreateBillingUsageDashboardRequest setDashboardType(UsageDashboardType dashboardType) {
    this.dashboardType = dashboardType;
    return this;
  }

  public UsageDashboardType getDashboardType() {
    return dashboardType;
  }

  public CreateBillingUsageDashboardRequest setMajorVersion(
      UsageDashboardMajorVersion majorVersion) {
    this.majorVersion = majorVersion;
    return this;
  }

  public UsageDashboardMajorVersion getMajorVersion() {
    return majorVersion;
  }

  public CreateBillingUsageDashboardRequest setWorkspaceId(Long workspaceId) {
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
    CreateBillingUsageDashboardRequest that = (CreateBillingUsageDashboardRequest) o;
    return Objects.equals(dashboardType, that.dashboardType)
        && Objects.equals(majorVersion, that.majorVersion)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardType, majorVersion, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBillingUsageDashboardRequest.class)
        .add("dashboardType", dashboardType)
        .add("majorVersion", majorVersion)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
