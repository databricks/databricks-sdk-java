// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SqlOutput {
  /** The output of a SQL alert task, if available. */
  @JsonProperty("alert_output")
  private SqlAlertOutput alertOutput;

  /** The output of a SQL dashboard task, if available. */
  @JsonProperty("dashboard_output")
  private SqlDashboardOutput dashboardOutput;

  /** The output of a SQL query task, if available. */
  @JsonProperty("query_output")
  private SqlQueryOutput queryOutput;

  public SqlOutput setAlertOutput(SqlAlertOutput alertOutput) {
    this.alertOutput = alertOutput;
    return this;
  }

  public SqlAlertOutput getAlertOutput() {
    return alertOutput;
  }

  public SqlOutput setDashboardOutput(SqlDashboardOutput dashboardOutput) {
    this.dashboardOutput = dashboardOutput;
    return this;
  }

  public SqlDashboardOutput getDashboardOutput() {
    return dashboardOutput;
  }

  public SqlOutput setQueryOutput(SqlQueryOutput queryOutput) {
    this.queryOutput = queryOutput;
    return this;
  }

  public SqlQueryOutput getQueryOutput() {
    return queryOutput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlOutput that = (SqlOutput) o;
    return Objects.equals(alertOutput, that.alertOutput)
        && Objects.equals(dashboardOutput, that.dashboardOutput)
        && Objects.equals(queryOutput, that.queryOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertOutput, dashboardOutput, queryOutput);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlOutput.class)
        .add("alertOutput", alertOutput)
        .add("dashboardOutput", dashboardOutput)
        .add("queryOutput", queryOutput)
        .toString();
  }
}
