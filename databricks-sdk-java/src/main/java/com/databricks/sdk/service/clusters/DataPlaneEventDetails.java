// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataPlaneEventDetails {
  /** <needs content added> */
  @JsonProperty("event_type")
  private DataPlaneEventDetailsEventType eventType;

  /** <needs content added> */
  @JsonProperty("executor_failures")
  private Long executorFailures;

  /** <needs content added> */
  @JsonProperty("host_id")
  private String hostId;

  /** <needs content added> */
  @JsonProperty("timestamp")
  private Long timestamp;

  public DataPlaneEventDetails setEventType(DataPlaneEventDetailsEventType eventType) {
    this.eventType = eventType;
    return this;
  }

  public DataPlaneEventDetailsEventType getEventType() {
    return eventType;
  }

  public DataPlaneEventDetails setExecutorFailures(Long executorFailures) {
    this.executorFailures = executorFailures;
    return this;
  }

  public Long getExecutorFailures() {
    return executorFailures;
  }

  public DataPlaneEventDetails setHostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

  public String getHostId() {
    return hostId;
  }

  public DataPlaneEventDetails setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }
}
