// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SpaceStatus {
  /** Message providing context about the current state. */
  @JsonProperty("message")
  private String message;

  /** The state of the app space. */
  @JsonProperty("state")
  private SpaceStatusSpaceState state;

  public SpaceStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public SpaceStatus setState(SpaceStatusSpaceState state) {
    this.state = state;
    return this;
  }

  public SpaceStatusSpaceState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SpaceStatus that = (SpaceStatus) o;
    return Objects.equals(message, that.message) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, state);
  }

  @Override
  public String toString() {
    return new ToStringer(SpaceStatus.class).add("message", message).add("state", state).toString();
  }
}
