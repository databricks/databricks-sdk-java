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

  /** */
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
