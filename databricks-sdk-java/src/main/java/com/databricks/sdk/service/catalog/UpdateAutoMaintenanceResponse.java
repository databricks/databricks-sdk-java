// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateAutoMaintenanceResponse {
  /** Whether auto maintenance is enabled on the metastore. */
  @JsonProperty("state")
  private Boolean state;

  /**
   * Id of the auto maintenance service principal. This will be the user used to run maintenance
   * tasks.
   */
  @JsonProperty("user_id")
  private Long userId;

  /** Name of the auto maintenance service principal. */
  @JsonProperty("username")
  private String username;

  public UpdateAutoMaintenanceResponse setState(Boolean state) {
    this.state = state;
    return this;
  }

  public Boolean getState() {
    return state;
  }

  public UpdateAutoMaintenanceResponse setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  public UpdateAutoMaintenanceResponse setUsername(String username) {
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
    UpdateAutoMaintenanceResponse that = (UpdateAutoMaintenanceResponse) o;
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
    return new ToStringer(UpdateAutoMaintenanceResponse.class)
        .add("state", state)
        .add("userId", userId)
        .add("username", username)
        .toString();
  }
}
