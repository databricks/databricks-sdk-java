// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ClusterEvent {
  /** */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** */
  @JsonProperty("data_plane_event_details")
  private DataPlaneEventDetails dataPlaneEventDetails;

  /** */
  @JsonProperty("details")
  private EventDetails details;

  /**
   * The timestamp when the event occurred, stored as the number of milliseconds since the Unix
   * epoch. If not provided, this will be assigned by the Timeline service.
   */
  @JsonProperty("timestamp")
  private Long timestamp;

  /** */
  @JsonProperty("type")
  private EventType typeValue;

  public ClusterEvent setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterEvent setDataPlaneEventDetails(DataPlaneEventDetails dataPlaneEventDetails) {
    this.dataPlaneEventDetails = dataPlaneEventDetails;
    return this;
  }

  public DataPlaneEventDetails getDataPlaneEventDetails() {
    return dataPlaneEventDetails;
  }

  public ClusterEvent setDetails(EventDetails details) {
    this.details = details;
    return this;
  }

  public EventDetails getDetails() {
    return details;
  }

  public ClusterEvent setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public ClusterEvent setType(EventType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public EventType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterEvent that = (ClusterEvent) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(dataPlaneEventDetails, that.dataPlaneEventDetails)
        && Objects.equals(details, that.details)
        && Objects.equals(timestamp, that.timestamp)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dataPlaneEventDetails, details, timestamp, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterEvent.class)
        .add("clusterId", clusterId)
        .add("dataPlaneEventDetails", dataPlaneEventDetails)
        .add("details", details)
        .add("timestamp", timestamp)
        .add("typeValue", typeValue)
        .toString();
  }
}
