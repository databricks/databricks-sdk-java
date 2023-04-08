// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

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

  public Alert setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public Alert setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Alert setLastTriggeredAt(String lastTriggeredAt) {
    this.lastTriggeredAt = lastTriggeredAt;
    return this;
  }

  public String getLastTriggeredAt() {
    return lastTriggeredAt;
  }

  public Alert setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Alert setOptions(AlertOptions options) {
    this.options = options;
    return this;
  }

  public AlertOptions getOptions() {
    return options;
  }

  public Alert setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public Alert setQuery(Query query) {
    this.query = query;
    return this;
  }

  public Query getQuery() {
    return query;
  }

  public Alert setRearm(Long rearm) {
    this.rearm = rearm;
    return this;
  }

  public Long getRearm() {
    return rearm;
  }

  public Alert setState(AlertState state) {
    this.state = state;
    return this;
  }

  public AlertState getState() {
    return state;
  }

  public Alert setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public Alert setUser(User user) {
    this.user = user;
    return this;
  }

  public User getUser() {
    return user;
  }
}
