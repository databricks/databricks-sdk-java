// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Status response includes execution state and if relevant, error information. */
public class StatementStatus {
  /** */
  @JsonProperty("error")
  private ServiceError error;

  /**
   * Statement execution state: - `PENDING`: waiting for warehouse - `RUNNING`: running -
   * `SUCCEEDED`: execution was successful, result data available for fetch - `FAILED`: execution
   * failed; reason for failure described in accomanying error message - `CANCELED`: user canceled;
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
    return Objects.equals(error, that.error) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, state);
  }

  @Override
  public String toString() {
    return new ToStringer(StatementStatus.class).add("error", error).add("state", state).toString();
  }
}
