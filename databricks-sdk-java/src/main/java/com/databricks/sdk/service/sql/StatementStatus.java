// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Status response includes execution state and if relevant, error information.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>error</code>.</p>
   *
   * @param error a {@link com.databricks.sdk.service.sql.ServiceError} object
   * @return a {@link com.databricks.sdk.service.sql.StatementStatus} object
   */
  public StatementStatus setError(ServiceError error) {
    this.error = error;
    return this;
  }

  /**
   * <p>Getter for the field <code>error</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.ServiceError} object
   */
  public ServiceError getError() {
    return error;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.sql.StatementState} object
   * @return a {@link com.databricks.sdk.service.sql.StatementStatus} object
   */
  public StatementStatus setState(StatementState state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.StatementState} object
   */
  public StatementState getState() {
    return state;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StatementStatus that = (StatementStatus) o;
    return Objects.equals(error, that.error) && Objects.equals(state, that.state);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(error, state);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(StatementStatus.class).add("error", error).add("state", state).toString();
  }
}
