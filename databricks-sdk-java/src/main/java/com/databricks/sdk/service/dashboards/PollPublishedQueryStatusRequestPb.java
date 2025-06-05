// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

/** Poll the results for the a query for a published, embedded dashboard */
@Generated
class PollPublishedQueryStatusRequestPb {
  @JsonIgnore
  @QueryParam("dashboard_name")
  private String dashboardName;

  @JsonIgnore
  @QueryParam("dashboard_revision_id")
  private String dashboardRevisionId;

  @JsonIgnore
  @QueryParam("tokens")
  private Collection<String> tokens;

  public PollPublishedQueryStatusRequestPb setDashboardName(String dashboardName) {
    this.dashboardName = dashboardName;
    return this;
  }

  public String getDashboardName() {
    return dashboardName;
  }

  public PollPublishedQueryStatusRequestPb setDashboardRevisionId(String dashboardRevisionId) {
    this.dashboardRevisionId = dashboardRevisionId;
    return this;
  }

  public String getDashboardRevisionId() {
    return dashboardRevisionId;
  }

  public PollPublishedQueryStatusRequestPb setTokens(Collection<String> tokens) {
    this.tokens = tokens;
    return this;
  }

  public Collection<String> getTokens() {
    return tokens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PollPublishedQueryStatusRequestPb that = (PollPublishedQueryStatusRequestPb) o;
    return Objects.equals(dashboardName, that.dashboardName)
        && Objects.equals(dashboardRevisionId, that.dashboardRevisionId)
        && Objects.equals(tokens, that.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardName, dashboardRevisionId, tokens);
  }

  @Override
  public String toString() {
    return new ToStringer(PollPublishedQueryStatusRequestPb.class)
        .add("dashboardName", dashboardName)
        .add("dashboardRevisionId", dashboardRevisionId)
        .add("tokens", tokens)
        .toString();
  }
}
