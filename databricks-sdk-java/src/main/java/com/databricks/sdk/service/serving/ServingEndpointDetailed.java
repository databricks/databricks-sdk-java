// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ServingEndpointDetailed class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>config</code>.</p>
   *
   * @param config a {@link com.databricks.sdk.service.serving.EndpointCoreConfigOutput} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpointDetailed} object
   */
  public ServingEndpointDetailed setConfig(EndpointCoreConfigOutput config) {
    this.config = config;
    return this;
  }

  /**
   * <p>Getter for the field <code>config</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.serving.EndpointCoreConfigOutput} object
   */
  public EndpointCoreConfigOutput getConfig() {
    return config;
  }

  /**
   * <p>Setter for the field <code>creationTimestamp</code>.</p>
   *
   * @param creationTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpointDetailed} object
   */
  public ServingEndpointDetailed setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * <p>Setter for the field <code>creator</code>.</p>
   *
   * @param creator a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpointDetailed} object
   */
  public ServingEndpointDetailed setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * <p>Getter for the field <code>creator</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreator() {
    return creator;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpointDetailed} object
   */
  public ServingEndpointDetailed setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>lastUpdatedTimestamp</code>.</p>
   *
   * @param lastUpdatedTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpointDetailed} object
   */
  public ServingEndpointDetailed setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastUpdatedTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpointDetailed} object
   */
  public ServingEndpointDetailed setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>pendingConfig</code>.</p>
   *
   * @param pendingConfig a {@link com.databricks.sdk.service.serving.EndpointPendingConfig} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpointDetailed} object
   */
  public ServingEndpointDetailed setPendingConfig(EndpointPendingConfig pendingConfig) {
    this.pendingConfig = pendingConfig;
    return this;
  }

  /**
   * <p>Getter for the field <code>pendingConfig</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.serving.EndpointPendingConfig} object
   */
  public EndpointPendingConfig getPendingConfig() {
    return pendingConfig;
  }

  /**
   * <p>Setter for the field <code>permissionLevel</code>.</p>
   *
   * @param permissionLevel a {@link com.databricks.sdk.service.serving.ServingEndpointDetailedPermissionLevel} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpointDetailed} object
   */
  public ServingEndpointDetailed setPermissionLevel(
      ServingEndpointDetailedPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissionLevel</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpointDetailedPermissionLevel} object
   */
  public ServingEndpointDetailedPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.serving.EndpointState} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpointDetailed} object
   */
  public ServingEndpointDetailed setState(EndpointState state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.serving.EndpointState} object
   */
  public EndpointState getState() {
    return state;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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
