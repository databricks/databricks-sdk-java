// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetPublishedDashboardTokenInfoRequest {
  /** UUID identifying the published dashboard. */
  @JsonIgnore private String dashboardId;

  /**
   * Value to carry in the token for this viewer, such as a tenant or region key. Dashboard dataset
   * queries can reference it as `__aibi_external_value` to filter data per viewer. The combined
   * size of `external_value` and `external_viewer_id` must be less than 1 KB.
   */
  @JsonIgnore
  @QueryParam("external_value")
  private String externalValue;

  /**
   * Identifier of the viewer in the external application. It is recorded in dashboard audit logs,
   * so it should be unique per viewer and must not contain personally identifiable information.
   */
  @JsonIgnore
  @QueryParam("external_viewer_id")
  private String externalViewerId;

  public GetPublishedDashboardTokenInfoRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public GetPublishedDashboardTokenInfoRequest setExternalValue(String externalValue) {
    this.externalValue = externalValue;
    return this;
  }

  public String getExternalValue() {
    return externalValue;
  }

  public GetPublishedDashboardTokenInfoRequest setExternalViewerId(String externalViewerId) {
    this.externalViewerId = externalViewerId;
    return this;
  }

  public String getExternalViewerId() {
    return externalViewerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPublishedDashboardTokenInfoRequest that = (GetPublishedDashboardTokenInfoRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(externalValue, that.externalValue)
        && Objects.equals(externalViewerId, that.externalViewerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, externalValue, externalViewerId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedDashboardTokenInfoRequest.class)
        .add("dashboardId", dashboardId)
        .add("externalValue", externalValue)
        .add("externalViewerId", externalViewerId)
        .toString();
  }
}
