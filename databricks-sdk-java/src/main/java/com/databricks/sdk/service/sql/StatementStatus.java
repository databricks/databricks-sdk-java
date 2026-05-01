// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The status response includes execution state and if relevant, error information. */
@Generated
public class StatementStatus {
  /** */
  @JsonProperty("error")
  private ServiceError error;

  /**
   * SQLSTATE error code returned when the statement execution fails. Only populated when the
   * statement status is `FAILED`.
   */
  @JsonProperty("sql_state")
  private String sqlState;

  /**
   * Statement execution state: - `PENDING`: waiting for warehouse - `RUNNING`: running -
   * `SUCCEEDED`: execution was successful, result data available for fetch - `FAILED`: execution
   * failed; reason for failure described in accompanying error message - `CANCELED`: user canceled;
   * can come from explicit cancel call, or timeout with `on_wait_timeout=CANCEL` - `CLOSED`:
   * execution successful, and statement closed; result no longer available for fetch
   */
  @JsonProperty("state")
  private StatementState state;

  public StatementStatus setError(ServiceError error) {
    this.error = error;
    return this;
  }

  public ServiceError getError() {
    return error;
  }

  public StatementStatus setSqlState(String sqlState) {
    this.sqlState = sqlState;
    return this;
  }

  public String getSqlState() {
    return sqlState;
  }

  public StatementStatus setState(StatementState state) {
    this.state = state;
    return this;
  }

  public StatementState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StatementStatus that = (StatementStatus) o;
    return Objects.equals(error, that.error)
        && Objects.equals(sqlState, that.sqlState)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, sqlState, state);
  }

  @Override
  public String toString() {
    return new ToStringer(StatementStatus.class)
        .add("error", error)
        .add("sqlState", sqlState)
        .add("state", state)
        .toString();
  }
}
