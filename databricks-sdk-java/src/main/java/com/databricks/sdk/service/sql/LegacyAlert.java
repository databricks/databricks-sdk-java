// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class LegacyAlert {
  /** Timestamp when the alert was created. */
  @JsonProperty("created_at")
  private String createdAt;

  /** Alert ID. */
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

  /** The identifier of the workspace folder containing the object. */
  @JsonProperty("parent")
  private String parent;

  /** */
  @JsonProperty("query")
  private AlertQuery query;

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
  private LegacyAlertState state;

  /** Timestamp when the alert was last updated. */
  @JsonProperty("updated_at")
  private String updatedAt;

  /** */
  @JsonProperty("user")
  private User user;

  public LegacyAlert setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public LegacyAlert setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public LegacyAlert setLastTriggeredAt(String lastTriggeredAt) {
    this.lastTriggeredAt = lastTriggeredAt;
    return this;
  }

  public String getLastTriggeredAt() {
    return lastTriggeredAt;
  }

  public LegacyAlert setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LegacyAlert setOptions(AlertOptions options) {
    this.options = options;
    return this;
  }

  public AlertOptions getOptions() {
    return options;
  }

  public LegacyAlert setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public LegacyAlert setQuery(AlertQuery query) {
    this.query = query;
    return this;
  }

  public AlertQuery getQuery() {
    return query;
  }

  public LegacyAlert setRearm(Long rearm) {
    this.rearm = rearm;
    return this;
  }

  public Long getRearm() {
    return rearm;
  }

  public LegacyAlert setState(LegacyAlertState state) {
    this.state = state;
    return this;
  }

  public LegacyAlertState getState() {
    return state;
  }

  public LegacyAlert setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public LegacyAlert setUser(User user) {
    this.user = user;
    return this;
  }

  public User getUser() {
    return user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LegacyAlert that = (LegacyAlert) o;
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

  @Override
  public String toString() {
    return new ToStringer(LegacyAlert.class)
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
