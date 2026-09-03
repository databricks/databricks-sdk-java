// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SandboxStatus {
  /** Lifecycle state of the sandbox. */
  @JsonProperty("state")
  private SandboxState state;

  public SandboxStatus setState(SandboxState state) {
    this.state = state;
    return this;
  }

  public SandboxState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SandboxStatus that = (SandboxStatus) o;
    return Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state);
  }

  @Override
  public String toString() {
    return new ToStringer(SandboxStatus.class).add("state", state).toString();
  }
}
