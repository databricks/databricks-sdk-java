// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SqlConditionState {
  /** Whether the last condition evaluation was satisfied (query returned truthy result). */
  @JsonProperty("latest_condition_evaluation_satisfied")
  private Boolean latestConditionEvaluationSatisfied;

  /**
   * The ID of the SQL session, used by UI to track session context. Populated for
   * QUERY_RETURNS_ROWS, which executes the query through Redash.
   */
  @JsonProperty("latest_condition_evaluation_sql_session_id")
  private String latestConditionEvaluationSqlSessionId;

  /**
   * The SEA statement ID of the SQL statement executed for the latest condition evaluation.
   * Populated for RESULT_VALUE_CHANGES, which executes the query through the SQL execution API.
   */
  @JsonProperty("latest_condition_evaluation_sql_statement_id")
  private String latestConditionEvaluationSqlStatementId;

  public SqlConditionState setLatestConditionEvaluationSatisfied(
      Boolean latestConditionEvaluationSatisfied) {
    this.latestConditionEvaluationSatisfied = latestConditionEvaluationSatisfied;
    return this;
  }

  public Boolean getLatestConditionEvaluationSatisfied() {
    return latestConditionEvaluationSatisfied;
  }

  public SqlConditionState setLatestConditionEvaluationSqlSessionId(
      String latestConditionEvaluationSqlSessionId) {
    this.latestConditionEvaluationSqlSessionId = latestConditionEvaluationSqlSessionId;
    return this;
  }

  public String getLatestConditionEvaluationSqlSessionId() {
    return latestConditionEvaluationSqlSessionId;
  }

  public SqlConditionState setLatestConditionEvaluationSqlStatementId(
      String latestConditionEvaluationSqlStatementId) {
    this.latestConditionEvaluationSqlStatementId = latestConditionEvaluationSqlStatementId;
    return this;
  }

  public String getLatestConditionEvaluationSqlStatementId() {
    return latestConditionEvaluationSqlStatementId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlConditionState that = (SqlConditionState) o;
    return Objects.equals(
            latestConditionEvaluationSatisfied, that.latestConditionEvaluationSatisfied)
        && Objects.equals(
            latestConditionEvaluationSqlSessionId, that.latestConditionEvaluationSqlSessionId)
        && Objects.equals(
            latestConditionEvaluationSqlStatementId, that.latestConditionEvaluationSqlStatementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        latestConditionEvaluationSatisfied,
        latestConditionEvaluationSqlSessionId,
        latestConditionEvaluationSqlStatementId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlConditionState.class)
        .add("latestConditionEvaluationSatisfied", latestConditionEvaluationSatisfied)
        .add("latestConditionEvaluationSqlSessionId", latestConditionEvaluationSqlSessionId)
        .add("latestConditionEvaluationSqlStatementId", latestConditionEvaluationSqlStatementId)
        .toString();
  }
}
