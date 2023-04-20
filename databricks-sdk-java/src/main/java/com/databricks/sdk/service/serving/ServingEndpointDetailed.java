// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ServingEndpointDetailed {
  /** The config that is currently being served by the endpoint. */
  @JsonProperty("config")
  private EndpointCoreConfigOutput config;

  /** The timestamp when the endpoint was created in Unix time. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** The email of the user who created the serving endpoint. */
  @JsonProperty("creator")
  private String creator;

  /**
   * System-generated ID of the endpoint. This is used to refer to the endpoint in the Permissions
   * API
   */
  @JsonProperty("id")
  private String id;

  /** The timestamp when the endpoint was last updated by a user in Unix time. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** The name of the serving endpoint. */
  @JsonProperty("name")
  private String name;

  /** The config that the endpoint is attempting to update to. */
  @JsonProperty("pending_config")
  private EndpointPendingConfig pendingConfig;

  /** The permission level of the principal making the request. */
  @JsonProperty("permission_level")
  private ServingEndpointDetailedPermissionLevel permissionLevel;

  /** Information corresponding to the state of the serving endpoint. */
  @JsonProperty("state")
  private EndpointState state;

  public ServingEndpointDetailed setConfig(EndpointCoreConfigOutput config) {
    this.config = config;
    return this;
  }

  public EndpointCoreConfigOutput getConfig() {
    return config;
  }

  public ServingEndpointDetailed setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ServingEndpointDetailed setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public ServingEndpointDetailed setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ServingEndpointDetailed setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ServingEndpointDetailed setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServingEndpointDetailed setPendingConfig(EndpointPendingConfig pendingConfig) {
    this.pendingConfig = pendingConfig;
    return this;
  }

  public EndpointPendingConfig getPendingConfig() {
    return pendingConfig;
  }

  public ServingEndpointDetailed setPermissionLevel(
      ServingEndpointDetailedPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ServingEndpointDetailedPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ServingEndpointDetailed setState(EndpointState state) {
    this.state = state;
    return this;
  }

  public EndpointState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServingEndpointDetailed that = (ServingEndpointDetailed) o;
    return Objects.equals(config, that.config)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(name, that.name)
        && Objects.equals(pendingConfig, that.pendingConfig)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        config,
        creationTimestamp,
        creator,
        id,
        lastUpdatedTimestamp,
        name,
        pendingConfig,
        permissionLevel,
        state);
  }

  @Override
  public String toString() {
    return new ToStringer(ServingEndpointDetailed.class)
        .add("config", config)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("name", name)
        .add("pendingConfig", pendingConfig)
        .add("permissionLevel", permissionLevel)
        .add("state", state)
        .toString();
  }
}
