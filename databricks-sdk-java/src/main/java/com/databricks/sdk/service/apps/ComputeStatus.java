// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ComputeStatus {
  /** Compute status message */
  @JsonProperty("message")
  private String message;

  /** State of the app compute. */
  @JsonProperty("state")
  private ComputeState state;

  public ComputeStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ComputeStatus setState(ComputeState state) {
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
    ComputeStatus that = (ComputeStatus) o;
    return Objects.equals(message, that.message) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, state);
  }

  @Override
  public String toString() {
    return new ToStringer(ComputeStatus.class)
        .add("message", message)
        .add("state", state)
        .toString();
  }
}
