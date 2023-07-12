// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class DataPlaneEventDetails {
  /**
   * <needs content added>
   */
  @JsonProperty("event_type")
  private DataPlaneEventDetailsEventType eventType;
  
  /**
   * <needs content added>
   */
  @JsonProperty("executor_failures")
  private Long executorFailures;
  
  /**
   * <needs content added>
   */
  @JsonProperty("host_id")
  private String hostId;
  
  /**
   * <needs content added>
   */
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
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataPlaneEventDetails that = (DataPlaneEventDetails) o;
    return Objects.equals(eventType, that.eventType)
    && Objects.equals(executorFailures, that.executorFailures)
    && Objects.equals(hostId, that.hostId)
    && Objects.equals(timestamp, that.timestamp)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, executorFailures, hostId, timestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(DataPlaneEventDetails.class)
      .add("eventType", eventType)
      .add("executorFailures", executorFailures)
      .add("hostId", hostId)
      .add("timestamp", timestamp).toString();
  }
}
