// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Status information of an endpoint */
@Generated
class EndpointStatusPb {
  @JsonProperty("message")
  private String message;

  @JsonProperty("state")
  private EndpointStatusState state;

  public EndpointStatusPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public EndpointStatusPb setState(EndpointStatusState state) {
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
    EndpointStatusPb that = (EndpointStatusPb) o;
    return Objects.equals(message, that.message) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, state);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointStatusPb.class)
        .add("message", message)
        .add("state", state)
        .toString();
  }
}
