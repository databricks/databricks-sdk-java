// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request to revert a dashboard draft to its last published state. */
@Generated
public class RevertDashboardRequest {
  /** UUID identifying the dashboard. */
  @JsonIgnore private String dashboardId;

  /**
   * The etag for the dashboard. Optionally, it can be provided to verify that the dashboard has not
   * been modified from its last retrieval. TODO(TSE-3937): update to new non-CMK-encrypted label
   * when available
   */
  @JsonProperty("etag")
  private String etag;

  public RevertDashboardRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public RevertDashboardRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RevertDashboardRequest that = (RevertDashboardRequest) o;
    return Objects.equals(dashboardId, that.dashboardId) && Objects.equals(etag, that.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, etag);
  }

  @Override
  public String toString() {
    return new ToStringer(RevertDashboardRequest.class)
        .add("dashboardId", dashboardId)
        .add("etag", etag)
        .toString();
  }
}
