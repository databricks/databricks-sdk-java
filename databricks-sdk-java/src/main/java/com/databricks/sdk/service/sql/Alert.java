// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Alert class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Alert {
  /** Timestamp when the alert was created. */
  @JsonProperty("created_at")
  private String createdAt;

  /** ID of the alert. */
  @JsonProperty("id")
  private String id;

  /** Timestamp when the alert was last triggered. */
  @JsonProperty("last_triggered_at")
  private String lastTriggeredAt;

  /** Name of the alert. */
  @JsonProperty("name")
  private String name;

  /** Alert configuration options. */
  @JsonProperty("options")
  private AlertOptions options;

  /**
   * The identifier of the parent folder containing the alert. Available for alerts in workspace.
   */
  @JsonProperty("parent")
  private String parent;

  /** */
  @JsonProperty("query")
  private Query query;

  /**
   * Number of seconds after being triggered before the alert rearms itself and can be triggered
   * again. If `null`, alert will never be triggered again.
   */
  @JsonProperty("rearm")
  private Long rearm;

  /**
   * State of the alert. Possible values are: `unknown` (yet to be evaluated), `triggered`
   * (evaluated and fulfilled trigger conditions), or `ok` (evaluated and did not fulfill trigger
   * conditions).
   */
  @JsonProperty("state")
  private AlertState state;

  /** Timestamp when the alert was last updated. */
  @JsonProperty("updated_at")
  private String updatedAt;

  /** */
  @JsonProperty("user")
  private User user;

  /**
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdAt</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert setId(String id) {
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
   * <p>Setter for the field <code>lastTriggeredAt</code>.</p>
   *
   * @param lastTriggeredAt a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert setLastTriggeredAt(String lastTriggeredAt) {
    this.lastTriggeredAt = lastTriggeredAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastTriggeredAt</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLastTriggeredAt() {
    return lastTriggeredAt;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert setName(String name) {
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
   * <p>Setter for the field <code>options</code>.</p>
   *
   * @param options a {@link com.databricks.sdk.service.sql.AlertOptions} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert setOptions(AlertOptions options) {
    this.options = options;
    return this;
  }

  /**
   * <p>Getter for the field <code>options</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.AlertOptions} object
   */
  public AlertOptions getOptions() {
    return options;
  }

  /**
   * <p>Setter for the field <code>parent</code>.</p>
   *
   * @param parent a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert setParent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * <p>Getter for the field <code>parent</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getParent() {
    return parent;
  }

  /**
   * <p>Setter for the field <code>query</code>.</p>
   *
   * @param query a {@link com.databricks.sdk.service.sql.Query} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert setQuery(Query query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Getter for the field <code>query</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  public Query getQuery() {
    return query;
  }

  /**
   * <p>Setter for the field <code>rearm</code>.</p>
   *
   * @param rearm a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert setRearm(Long rearm) {
    this.rearm = rearm;
    return this;
  }

  /**
   * <p>Getter for the field <code>rearm</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRearm() {
    return rearm;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.sql.AlertState} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert setState(AlertState state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.AlertState} object
   */
  public AlertState getState() {
    return state;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedAt</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   * <p>Setter for the field <code>user</code>.</p>
   *
   * @param user a {@link com.databricks.sdk.service.sql.User} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert setUser(User user) {
    this.user = user;
    return this;
  }

  /**
   * <p>Getter for the field <code>user</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.User} object
   */
  public User getUser() {
    return user;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Alert that = (Alert) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(id, that.id)
        && Objects.equals(lastTriggeredAt, that.lastTriggeredAt)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(parent, that.parent)
        && Objects.equals(query, that.query)
        && Objects.equals(rearm, that.rearm)
        && Objects.equals(state, that.state)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(user, that.user);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        id,
        lastTriggeredAt,
        name,
        options,
        parent,
        query,
        rearm,
        state,
        updatedAt,
        user);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Alert.class)
        .add("createdAt", createdAt)
        .add("id", id)
        .add("lastTriggeredAt", lastTriggeredAt)
        .add("name", name)
        .add("options", options)
        .add("parent", parent)
        .add("query", query)
        .add("rearm", rearm)
        .add("state", state)
        .add("updatedAt", updatedAt)
        .add("user", user)
        .toString();
  }
}
