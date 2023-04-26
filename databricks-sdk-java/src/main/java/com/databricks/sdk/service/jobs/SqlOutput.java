// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SqlOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>alertOutput</code>.</p>
   *
   * @param alertOutput a {@link com.databricks.sdk.service.jobs.SqlAlertOutput} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlOutput} object
   */
  public SqlOutput setAlertOutput(SqlAlertOutput alertOutput) {
    this.alertOutput = alertOutput;
    return this;
  }

  /**
   * <p>Getter for the field <code>alertOutput</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlAlertOutput} object
   */
  public SqlAlertOutput getAlertOutput() {
    return alertOutput;
  }

  /**
   * <p>Setter for the field <code>dashboardOutput</code>.</p>
   *
   * @param dashboardOutput a {@link com.databricks.sdk.service.jobs.SqlDashboardOutput} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlOutput} object
   */
  public SqlOutput setDashboardOutput(SqlDashboardOutput dashboardOutput) {
    this.dashboardOutput = dashboardOutput;
    return this;
  }

  /**
   * <p>Getter for the field <code>dashboardOutput</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardOutput} object
   */
  public SqlDashboardOutput getDashboardOutput() {
    return dashboardOutput;
  }

  /**
   * <p>Setter for the field <code>queryOutput</code>.</p>
   *
   * @param queryOutput a {@link com.databricks.sdk.service.jobs.SqlQueryOutput} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlOutput} object
   */
  public SqlOutput setQueryOutput(SqlQueryOutput queryOutput) {
    this.queryOutput = queryOutput;
    return this;
  }

  /**
   * <p>Getter for the field <code>queryOutput</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlQueryOutput} object
   */
  public SqlQueryOutput getQueryOutput() {
    return queryOutput;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlOutput that = (SqlOutput) o;
    return Objects.equals(alertOutput, that.alertOutput)
        && Objects.equals(dashboardOutput, that.dashboardOutput)
        && Objects.equals(queryOutput, that.queryOutput);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(alertOutput, dashboardOutput, queryOutput);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SqlOutput.class)
        .add("alertOutput", alertOutput)
        .add("dashboardOutput", dashboardOutput)
        .add("queryOutput", queryOutput)
        .toString();
  }
}
