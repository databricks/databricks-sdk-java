// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Lifecycle and health state of an AI Search endpoint, along with any human-readable detail about
 * that state.
 */
@Generated
public class EndpointStatus {
  /**
   * Human-readable detail about the endpoint's current state or the reason for a state transition.
   */
  @JsonProperty("message")
  private String message;

  /** Current lifecycle state of the endpoint. See {@code State} for the meaning of each value. */
  @JsonProperty("state")
  private EndpointStatusState state;

  public EndpointStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public EndpointStatus setState(EndpointStatusState state) {
    this.state = state;
    return this;
  }

  public EndpointStatusState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointStatus that = (EndpointStatus) o;
    return Objects.equals(message, that.message) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, state);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointStatus.class)
        .add("message", message)
        .add("state", state)
        .toString();
  }
}
