// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdatePredictiveOptimizationResponse {
  /** Whether predictive optimization is enabled on the metastore. */
  @JsonProperty("state")
  private Boolean state;

  /**
   * Id of the predictive optimization service principal. This will be the user used to run
   * optimization tasks.
   */
  @JsonProperty("user_id")
  private Long userId;

  /** Name of the predictive optimization service principal. */
  @JsonProperty("username")
  private String username;

  public UpdatePredictiveOptimizationResponse setState(Boolean state) {
    this.state = state;
    return this;
  }

  public Boolean getState() {
    return state;
  }

  public UpdatePredictiveOptimizationResponse setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  public UpdatePredictiveOptimizationResponse setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getUsername() {
    return username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePredictiveOptimizationResponse that = (UpdatePredictiveOptimizationResponse) o;
    return Objects.equals(state, that.state)
        && Objects.equals(userId, that.userId)
        && Objects.equals(username, that.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, userId, username);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePredictiveOptimizationResponse.class)
        .add("state", state)
        .add("userId", userId)
        .add("username", username)
        .toString();
  }
}
