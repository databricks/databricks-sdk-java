// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DataPlaneEventDetails class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>eventType</code>.</p>
   *
   * @param eventType a {@link com.databricks.sdk.service.compute.DataPlaneEventDetailsEventType} object
   * @return a {@link com.databricks.sdk.service.compute.DataPlaneEventDetails} object
   */
  public DataPlaneEventDetails setEventType(DataPlaneEventDetailsEventType eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * <p>Getter for the field <code>eventType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.DataPlaneEventDetailsEventType} object
   */
  public DataPlaneEventDetailsEventType getEventType() {
    return eventType;
  }

  /**
   * <p>Setter for the field <code>executorFailures</code>.</p>
   *
   * @param executorFailures a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.DataPlaneEventDetails} object
   */
  public DataPlaneEventDetails setExecutorFailures(Long executorFailures) {
    this.executorFailures = executorFailures;
    return this;
  }

  /**
   * <p>Getter for the field <code>executorFailures</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getExecutorFailures() {
    return executorFailures;
  }

  /**
   * <p>Setter for the field <code>hostId</code>.</p>
   *
   * @param hostId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.DataPlaneEventDetails} object
   */
  public DataPlaneEventDetails setHostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

  /**
   * <p>Getter for the field <code>hostId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getHostId() {
    return hostId;
  }

  /**
   * <p>Setter for the field <code>timestamp</code>.</p>
   *
   * @param timestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.DataPlaneEventDetails} object
   */
  public DataPlaneEventDetails setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>timestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTimestamp() {
    return timestamp;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataPlaneEventDetails that = (DataPlaneEventDetails) o;
    return Objects.equals(eventType, that.eventType)
        && Objects.equals(executorFailures, that.executorFailures)
        && Objects.equals(hostId, that.hostId)
        && Objects.equals(timestamp, that.timestamp);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(eventType, executorFailures, hostId, timestamp);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DataPlaneEventDetails.class)
        .add("eventType", eventType)
        .add("executorFailures", executorFailures)
        .add("hostId", hostId)
        .add("timestamp", timestamp)
        .toString();
  }
}
