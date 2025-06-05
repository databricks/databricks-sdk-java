// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SqlOutputPb {
  @JsonProperty("alert_output")
  private SqlAlertOutput alertOutput;

  @JsonProperty("dashboard_output")
  private SqlDashboardOutput dashboardOutput;

  @JsonProperty("query_output")
  private SqlQueryOutput queryOutput;

  public SqlOutputPb setAlertOutput(SqlAlertOutput alertOutput) {
    this.alertOutput = alertOutput;
    return this;
  }

  public SqlAlertOutput getAlertOutput() {
    return alertOutput;
  }

  public SqlOutputPb setDashboardOutput(SqlDashboardOutput dashboardOutput) {
    this.dashboardOutput = dashboardOutput;
    return this;
  }

  public SqlDashboardOutput getDashboardOutput() {
    return dashboardOutput;
  }

  public SqlOutputPb setQueryOutput(SqlQueryOutput queryOutput) {
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
    SqlOutputPb that = (SqlOutputPb) o;
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
    return new ToStringer(SqlOutputPb.class)
        .add("alertOutput", alertOutput)
        .add("dashboardOutput", dashboardOutput)
        .add("queryOutput", queryOutput)
        .toString();
  }
}
