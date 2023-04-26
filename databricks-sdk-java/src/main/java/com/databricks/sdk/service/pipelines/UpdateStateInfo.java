// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateStateInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>creationTime</code>.</p>
   *
   * @param creationTime a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateStateInfo} object
   */
  public UpdateStateInfo setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTime</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.pipelines.UpdateStateInfoState} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateStateInfo} object
   */
  public UpdateStateInfo setState(UpdateStateInfoState state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateStateInfoState} object
   */
  public UpdateStateInfoState getState() {
    return state;
  }

  /**
   * <p>Setter for the field <code>updateId</code>.</p>
   *
   * @param updateId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateStateInfo} object
   */
  public UpdateStateInfo setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  /**
   * <p>Getter for the field <code>updateId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdateId() {
    return updateId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateStateInfo that = (UpdateStateInfo) o;
    return Objects.equals(creationTime, that.creationTime)
        && Objects.equals(state, that.state)
        && Objects.equals(updateId, that.updateId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(creationTime, state, updateId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateStateInfo.class)
        .add("creationTime", creationTime)
        .add("state", state)
        .add("updateId", updateId)
        .toString();
  }
}
