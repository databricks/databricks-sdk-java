// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

/** Cancel the results for the a query for a published, embedded dashboard */
@Generated
public class CancelPublishedQueryExecutionRequest {
  /** */
  @JsonIgnore
  @QueryParam("dashboard_name")
  private String dashboardName;

  /** */
  @JsonIgnore
  @QueryParam("dashboard_revision_id")
  private String dashboardRevisionId;

  /** Example: EC0A..ChAB7WCEn_4Qo4vkLqEbXsxxEgh3Y2pbWw45WhoQXgZSQo9aS5q2ZvFcbvbx9CgA-PAEAQ */
  @JsonIgnore
  @QueryParam("tokens")
  private Collection<String> tokens;

  public CancelPublishedQueryExecutionRequest setDashboardName(String dashboardName) {
    this.dashboardName = dashboardName;
    return this;
  }

  public String getDashboardName() {
    return dashboardName;
  }

  public CancelPublishedQueryExecutionRequest setDashboardRevisionId(String dashboardRevisionId) {
    this.dashboardRevisionId = dashboardRevisionId;
    return this;
  }

  public String getDashboardRevisionId() {
    return dashboardRevisionId;
  }

  public CancelPublishedQueryExecutionRequest setTokens(Collection<String> tokens) {
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
    CancelPublishedQueryExecutionRequest that = (CancelPublishedQueryExecutionRequest) o;
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
    return new ToStringer(CancelPublishedQueryExecutionRequest.class)
        .add("dashboardName", dashboardName)
        .add("dashboardRevisionId", dashboardRevisionId)
        .add("tokens", tokens)
        .toString();
  }
}
