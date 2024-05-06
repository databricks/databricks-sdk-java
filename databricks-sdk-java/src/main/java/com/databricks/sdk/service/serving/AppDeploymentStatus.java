// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppDeploymentStatus {
  /** Message corresponding with the deployment state. */
  @JsonProperty("message")
  private String message;

  /** State of the deployment. */
  @JsonProperty("state")
  private AppDeploymentState state;

  public AppDeploymentStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public AppDeploymentStatus setState(AppDeploymentState state) {
    this.state = state;
    return this;
  }

  public AppDeploymentState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppDeploymentStatus that = (AppDeploymentStatus) o;
    return Objects.equals(message, that.message) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, state);
  }

  @Override
  public String toString() {
    return new ToStringer(AppDeploymentStatus.class)
        .add("message", message)
        .add("state", state)
        .toString();
  }
}
