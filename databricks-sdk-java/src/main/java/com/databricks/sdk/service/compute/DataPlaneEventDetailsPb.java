// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DataPlaneEventDetailsPb {
  @JsonProperty("event_type")
  private DataPlaneEventDetailsEventType eventType;

  @JsonProperty("executor_failures")
  private Long executorFailures;

  @JsonProperty("host_id")
  private String hostId;

  @JsonProperty("timestamp")
  private Long timestamp;

  public DataPlaneEventDetailsPb setEventType(DataPlaneEventDetailsEventType eventType) {
    this.eventType = eventType;
    return this;
  }

  public DataPlaneEventDetailsEventType getEventType() {
    return eventType;
  }

  public DataPlaneEventDetailsPb setExecutorFailures(Long executorFailures) {
    this.executorFailures = executorFailures;
    return this;
  }

  public Long getExecutorFailures() {
    return executorFailures;
  }

  public DataPlaneEventDetailsPb setHostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

  public String getHostId() {
    return hostId;
  }

  public DataPlaneEventDetailsPb setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataPlaneEventDetailsPb that = (DataPlaneEventDetailsPb) o;
    return Objects.equals(eventType, that.eventType)
        && Objects.equals(executorFailures, that.executorFailures)
        && Objects.equals(hostId, that.hostId)
        && Objects.equals(timestamp, that.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, executorFailures, hostId, timestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(DataPlaneEventDetailsPb.class)
        .add("eventType", eventType)
        .add("executorFailures", executorFailures)
        .add("hostId", hostId)
        .add("timestamp", timestamp)
        .toString();
  }
}
