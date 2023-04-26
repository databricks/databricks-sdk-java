// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ClusterEvent class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ClusterEvent {
  /** <needs content added> */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** <needs content added> */
  @JsonProperty("data_plane_event_details")
  private DataPlaneEventDetails dataPlaneEventDetails;

  /** <needs content added> */
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

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterEvent} object
   */
  public ClusterEvent setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClusterId() {
    return clusterId;
  }

  /**
   * <p>Setter for the field <code>dataPlaneEventDetails</code>.</p>
   *
   * @param dataPlaneEventDetails a {@link com.databricks.sdk.service.compute.DataPlaneEventDetails} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterEvent} object
   */
  public ClusterEvent setDataPlaneEventDetails(DataPlaneEventDetails dataPlaneEventDetails) {
    this.dataPlaneEventDetails = dataPlaneEventDetails;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataPlaneEventDetails</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.DataPlaneEventDetails} object
   */
  public DataPlaneEventDetails getDataPlaneEventDetails() {
    return dataPlaneEventDetails;
  }

  /**
   * <p>Setter for the field <code>details</code>.</p>
   *
   * @param details a {@link com.databricks.sdk.service.compute.EventDetails} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterEvent} object
   */
  public ClusterEvent setDetails(EventDetails details) {
    this.details = details;
    return this;
  }

  /**
   * <p>Getter for the field <code>details</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.EventDetails} object
   */
  public EventDetails getDetails() {
    return details;
  }

  /**
   * <p>Setter for the field <code>timestamp</code>.</p>
   *
   * @param timestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterEvent} object
   */
  public ClusterEvent setTimestamp(Long timestamp) {
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

  /**
   * <p>setType.</p>
   *
   * @param typeValue a {@link com.databricks.sdk.service.compute.EventType} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterEvent} object
   */
  public ClusterEvent setType(EventType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  /**
   * <p>getType.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.EventType} object
   */
  public EventType getType() {
    return typeValue;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dataPlaneEventDetails, details, timestamp, typeValue);
  }

  /** {@inheritDoc} */
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
