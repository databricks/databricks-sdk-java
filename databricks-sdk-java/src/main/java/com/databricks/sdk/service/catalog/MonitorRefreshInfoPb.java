// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class MonitorRefreshInfoPb {
  @JsonProperty("end_time_ms")
  private Long endTimeMs;

  @JsonProperty("message")
  private String message;

  @JsonProperty("refresh_id")
  private Long refreshId;

  @JsonProperty("start_time_ms")
  private Long startTimeMs;

  @JsonProperty("state")
  private MonitorRefreshInfoState state;

  @JsonProperty("trigger")
  private MonitorRefreshInfoTrigger trigger;

  public MonitorRefreshInfoPb setEndTimeMs(Long endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }

  public Long getEndTimeMs() {
    return endTimeMs;
  }

  public MonitorRefreshInfoPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public MonitorRefreshInfoPb setRefreshId(Long refreshId) {
    this.refreshId = refreshId;
    return this;
  }

  public Long getRefreshId() {
    return refreshId;
  }

  public MonitorRefreshInfoPb setStartTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  public Long getStartTimeMs() {
    return startTimeMs;
  }

  public MonitorRefreshInfoPb setState(MonitorRefreshInfoState state) {
    this.state = state;
    return this;
  }

  public MonitorRefreshInfoState getState() {
    return state;
  }

  public MonitorRefreshInfoPb setTrigger(MonitorRefreshInfoTrigger trigger) {
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
    MonitorRefreshInfoPb that = (MonitorRefreshInfoPb) o;
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
    return new ToStringer(MonitorRefreshInfoPb.class)
        .add("endTimeMs", endTimeMs)
        .add("message", message)
        .add("refreshId", refreshId)
        .add("startTimeMs", startTimeMs)
        .add("state", state)
        .add("trigger", trigger)
        .toString();
  }
}
