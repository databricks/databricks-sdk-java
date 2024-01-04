// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EndpointInfo {
  /** Timestamp of endpoint creation */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** Creator of the endpoint */
  @JsonProperty("creator")
  private String creator;

  /** Current status of the endpoint */
  @JsonProperty("endpoint_status")
  private EndpointStatus endpointStatus;

  /** Type of endpoint. */
  @JsonProperty("endpoint_type")
  private EndpointType endpointType;

  /** Unique identifier of the endpoint */
  @JsonProperty("id")
  private String id;

  /** Timestamp of last update to the endpoint */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** User who last updated the endpoint */
  @JsonProperty("last_updated_user")
  private String lastUpdatedUser;

  /** Name of endpoint */
  @JsonProperty("name")
  private String name;

  /** Number of indexes on the endpoint */
  @JsonProperty("num_indexes")
  private Long numIndexes;

  public EndpointInfo setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public EndpointInfo setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public EndpointInfo setEndpointStatus(EndpointStatus endpointStatus) {
    this.endpointStatus = endpointStatus;
    return this;
  }

  public EndpointStatus getEndpointStatus() {
    return endpointStatus;
  }

  public EndpointInfo setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  public EndpointType getEndpointType() {
    return endpointType;
  }

  public EndpointInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public EndpointInfo setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public EndpointInfo setLastUpdatedUser(String lastUpdatedUser) {
    this.lastUpdatedUser = lastUpdatedUser;
    return this;
  }

  public String getLastUpdatedUser() {
    return lastUpdatedUser;
  }

  public EndpointInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EndpointInfo setNumIndexes(Long numIndexes) {
    this.numIndexes = numIndexes;
    return this;
  }

  public Long getNumIndexes() {
    return numIndexes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointInfo that = (EndpointInfo) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(endpointStatus, that.endpointStatus)
        && Objects.equals(endpointType, that.endpointType)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(lastUpdatedUser, that.lastUpdatedUser)
        && Objects.equals(name, that.name)
        && Objects.equals(numIndexes, that.numIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        creator,
        endpointStatus,
        endpointType,
        id,
        lastUpdatedTimestamp,
        lastUpdatedUser,
        name,
        numIndexes);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointInfo.class)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("endpointStatus", endpointStatus)
        .add("endpointType", endpointType)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("lastUpdatedUser", lastUpdatedUser)
        .add("name", name)
        .add("numIndexes", numIndexes)
        .toString();
  }
}
