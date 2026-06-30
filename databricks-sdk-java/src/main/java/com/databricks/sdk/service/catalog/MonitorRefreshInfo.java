// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class MonitorRefreshInfo {
  /** Time at which refresh operation completed (milliseconds since 1/1/1970 UTC). */
  @JsonProperty("end_time_ms")
  private Long endTimeMs;

  /**
   * An optional message to give insight into the current state of the job (e.g. FAILURE messages).
   */
  @JsonProperty("message")
  private String message;

  /** Unique id of the refresh operation. */
  @JsonProperty("refresh_id")
  private Long refreshId;

  /** Time at which refresh operation was initiated (milliseconds since 1/1/1970 UTC). */
  @JsonProperty("start_time_ms")
  private Long startTimeMs;

  /** The current state of the refresh. */
  @JsonProperty("state")
  private MonitorRefreshInfoState state;

  /** The method by which the refresh was triggered. */
  @JsonProperty("trigger")
  private MonitorRefreshInfoTrigger trigger;

  public MonitorRefreshInfo setEndTimeMs(Long endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }

  public Long getEndTimeMs() {
    return endTimeMs;
  }

  public MonitorRefreshInfo setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public MonitorRefreshInfo setRefreshId(Long refreshId) {
    this.refreshId = refreshId;
    return this;
  }

  public Long getRefreshId() {
    return refreshId;
  }

  public MonitorRefreshInfo setStartTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  public Long getStartTimeMs() {
    return startTimeMs;
  }

  public MonitorRefreshInfo setState(MonitorRefreshInfoState state) {
    this.state = state;
    return this;
  }

  public MonitorRefreshInfoState getState() {
    return state;
  }

  public MonitorRefreshInfo setTrigger(MonitorRefreshInfoTrigger trigger) {
    this.trigger = trigger;
    return this;
  }

  public MonitorRefreshInfoTrigger getTrigger() {
    return trigger;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorRefreshInfo that = (MonitorRefreshInfo) o;
    return Objects.equals(endTimeMs, that.endTimeMs)
        && Objects.equals(message, that.message)
        && Objects.equals(refreshId, that.refreshId)
        && Objects.equals(startTimeMs, that.startTimeMs)
        && Objects.equals(state, that.state)
        && Objects.equals(trigger, that.trigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTimeMs, message, refreshId, startTimeMs, state, trigger);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorRefreshInfo.class)
        .add("endTimeMs", endTimeMs)
        .add("message", message)
        .add("refreshId", refreshId)
        .add("startTimeMs", startTimeMs)
        .add("state", state)
        .add("trigger", trigger)
        .toString();
  }
}
