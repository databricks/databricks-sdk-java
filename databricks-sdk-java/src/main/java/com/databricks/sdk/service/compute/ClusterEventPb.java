// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ClusterEventPb {
  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("data_plane_event_details")
  private DataPlaneEventDetails dataPlaneEventDetails;

  @JsonProperty("details")
  private EventDetails details;

  @JsonProperty("timestamp")
  private Long timestamp;

  @JsonProperty("type")
  private EventType typeValue;

  public ClusterEventPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterEventPb setDataPlaneEventDetails(DataPlaneEventDetails dataPlaneEventDetails) {
    this.dataPlaneEventDetails = dataPlaneEventDetails;
    return this;
  }

  public DataPlaneEventDetails getDataPlaneEventDetails() {
    return dataPlaneEventDetails;
  }

  public ClusterEventPb setDetails(EventDetails details) {
    this.details = details;
    return this;
  }

  public EventDetails getDetails() {
    return details;
  }

  public ClusterEventPb setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public ClusterEventPb setType(EventType typeValue) {
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
    ClusterEventPb that = (ClusterEventPb) o;
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
    return new ToStringer(ClusterEventPb.class)
        .add("clusterId", clusterId)
        .add("dataPlaneEventDetails", dataPlaneEventDetails)
        .add("details", details)
        .add("timestamp", timestamp)
        .add("typeValue", typeValue)
        .toString();
  }
}
