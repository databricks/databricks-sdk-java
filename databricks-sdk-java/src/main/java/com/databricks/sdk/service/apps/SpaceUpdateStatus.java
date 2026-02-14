// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Status of an app space update operation */
@Generated
public class SpaceUpdateStatus {
  /** */
  @JsonProperty("message")
  private String message;

  /** */
  @JsonProperty("state")
  private SpaceUpdateState state;

  public SpaceUpdateStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public SpaceUpdateStatus setState(SpaceUpdateState state) {
    this.state = state;
    return this;
  }

  public SpaceUpdateState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SpaceUpdateStatus that = (SpaceUpdateStatus) o;
    return Objects.equals(message, that.message) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, state);
  }

  @Override
  public String toString() {
    return new ToStringer(SpaceUpdateStatus.class)
        .add("message", message)
        .add("state", state)
        .toString();
  }
}
