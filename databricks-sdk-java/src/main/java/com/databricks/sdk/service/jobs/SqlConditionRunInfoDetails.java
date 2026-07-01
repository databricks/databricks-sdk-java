// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** SQL condition evaluation details captured at the time the run was triggered */
@Generated
public class SqlConditionRunInfoDetails {
  /** Whether the last condition evaluation was satisfied (query returned truthy result). */
  @JsonProperty("condition_evaluation_satisfied")
  private Boolean conditionEvaluationSatisfied;

  /**
   * The ID of the SQL session, used by the UI to track session context. Set for the
   * QUERY_RETURNS_ROWS trigger mode.
   */
  @JsonProperty("condition_evaluation_sql_session_id")
  private String conditionEvaluationSqlSessionId;

  /**
   * The SQL statement ID of the condition evaluation, set when the condition is evaluated by
   * running a single SQL statement (the RESULT_VALUE_CHANGES trigger mode). The UI uses it to link
   * to the query execution details.
   */
  @JsonProperty("condition_evaluation_sql_statement_id")
  private String conditionEvaluationSqlStatementId;

  public SqlConditionRunInfoDetails setConditionEvaluationSatisfied(
      Boolean conditionEvaluationSatisfied) {
    this.conditionEvaluationSatisfied = conditionEvaluationSatisfied;
    return this;
  }

  public Boolean getConditionEvaluationSatisfied() {
    return conditionEvaluationSatisfied;
  }

  public SqlConditionRunInfoDetails setConditionEvaluationSqlSessionId(
      String conditionEvaluationSqlSessionId) {
    this.conditionEvaluationSqlSessionId = conditionEvaluationSqlSessionId;
    return this;
  }

  public String getConditionEvaluationSqlSessionId() {
    return conditionEvaluationSqlSessionId;
  }

  public SqlConditionRunInfoDetails setConditionEvaluationSqlStatementId(
      String conditionEvaluationSqlStatementId) {
    this.conditionEvaluationSqlStatementId = conditionEvaluationSqlStatementId;
    return this;
  }

  public String getConditionEvaluationSqlStatementId() {
    return conditionEvaluationSqlStatementId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlConditionRunInfoDetails that = (SqlConditionRunInfoDetails) o;
    return Objects.equals(conditionEvaluationSatisfied, that.conditionEvaluationSatisfied)
        && Objects.equals(conditionEvaluationSqlSessionId, that.conditionEvaluationSqlSessionId)
        && Objects.equals(
            conditionEvaluationSqlStatementId, that.conditionEvaluationSqlStatementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conditionEvaluationSatisfied,
        conditionEvaluationSqlSessionId,
        conditionEvaluationSqlStatementId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlConditionRunInfoDetails.class)
        .add("conditionEvaluationSatisfied", conditionEvaluationSatisfied)
        .add("conditionEvaluationSqlSessionId", conditionEvaluationSqlSessionId)
        .add("conditionEvaluationSqlStatementId", conditionEvaluationSqlStatementId)
        .toString();
  }
}
