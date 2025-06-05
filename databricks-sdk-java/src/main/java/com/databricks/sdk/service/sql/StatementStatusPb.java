// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The status response includes execution state and if relevant, error information. */
@Generated
class StatementStatusPb {
  @JsonProperty("error")
  private ServiceError error;

  @JsonProperty("state")
  private StatementState state;

  public StatementStatusPb setError(ServiceError error) {
    this.error = error;
    return this;
  }

  public ServiceError getError() {
    return error;
  }

  public StatementStatusPb setState(StatementState state) {
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
    StatementStatusPb that = (StatementStatusPb) o;
    return Objects.equals(error, that.error) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, state);
  }

  @Override
  public String toString() {
    return new ToStringer(StatementStatusPb.class)
        .add("error", error)
        .add("state", state)
        .toString();
  }
}
