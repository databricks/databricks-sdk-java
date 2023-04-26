// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ServingEndpoint class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ServingEndpoint {
  /** The config that is currently being served by the endpoint. */
  @JsonProperty("config")
  private EndpointCoreConfigSummary config;

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

  /** Information corresponding to the state of the serving endpoint. */
  @JsonProperty("state")
  private EndpointState state;

  /**
   * <p>Setter for the field <code>config</code>.</p>
   *
   * @param config a {@link com.databricks.sdk.service.serving.EndpointCoreConfigSummary} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpoint} object
   */
  public ServingEndpoint setConfig(EndpointCoreConfigSummary config) {
    this.config = config;
    return this;
  }

  /**
   * <p>Getter for the field <code>config</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.serving.EndpointCoreConfigSummary} object
   */
  public EndpointCoreConfigSummary getConfig() {
    return config;
  }

  /**
   * <p>Setter for the field <code>creationTimestamp</code>.</p>
   *
   * @param creationTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpoint} object
   */
  public ServingEndpoint setCreationTimestamp(Long creationTimestamp) {
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
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpoint} object
   */
  public ServingEndpoint setCreator(String creator) {
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
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpoint} object
   */
  public ServingEndpoint setId(String id) {
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
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpoint} object
   */
  public ServingEndpoint setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
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
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpoint} object
   */
  public ServingEndpoint setName(String name) {
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
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.serving.EndpointState} object
   * @return a {@link com.databricks.sdk.service.serving.ServingEndpoint} object
   */
  public ServingEndpoint setState(EndpointState state) {
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
    ServingEndpoint that = (ServingEndpoint) o;
    return Objects.equals(config, that.config)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(name, that.name)
        && Objects.equals(state, that.state);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(config, creationTimestamp, creator, id, lastUpdatedTimestamp, name, state);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ServingEndpoint.class)
        .add("config", config)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("name", name)
        .add("state", state)
        .toString();
  }
}
