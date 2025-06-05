// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ComputeStatusPb {
  @JsonProperty("message")
  private String message;

  @JsonProperty("state")
  private ComputeState state;

  public ComputeStatusPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ComputeStatusPb setState(ComputeState state) {
    this.state = state;
    return this;
  }

  public ComputeState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComputeStatusPb that = (ComputeStatusPb) o;
    return Objects.equals(message, that.message) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, state);
  }

  @Override
  public String toString() {
    return new ToStringer(ComputeStatusPb.class)
        .add("message", message)
        .add("state", state)
        .toString();
  }
}
