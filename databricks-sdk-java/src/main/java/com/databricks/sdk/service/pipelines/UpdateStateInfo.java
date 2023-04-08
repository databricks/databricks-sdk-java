// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateStateInfo {
  /** */
  @JsonProperty("creation_time")
  private String creationTime;

  /** */
  @JsonProperty("state")
  private UpdateStateInfoState state;

  /** */
  @JsonProperty("update_id")
  private String updateId;

  public UpdateStateInfo setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public UpdateStateInfo setState(UpdateStateInfoState state) {
    this.state = state;
    return this;
  }

  public UpdateStateInfoState getState() {
    return state;
  }

  public UpdateStateInfo setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  public String getUpdateId() {
    return updateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateStateInfo that = (UpdateStateInfo) o;
    return Objects.equals(creationTime, that.creationTime)
        && Objects.equals(state, that.state)
        && Objects.equals(updateId, that.updateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, state, updateId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateStateInfo.class)
        .add("creationTime", creationTime)
        .add("state", state)
        .add("updateId", updateId)
        .toString();
  }
}
