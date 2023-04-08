// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateAlert {
  /** Name of the alert. */
  @JsonProperty("name")
  private String name;

  /** Alert configuration options. */
  @JsonProperty("options")
  private AlertOptions options;

  /**
   * The identifier of the workspace folder containing the alert. The default is ther user's home
   * folder.
   */
  @JsonProperty("parent")
  private String parent;

  /** ID of the query evaluated by the alert. */
  @JsonProperty("query_id")
  private String queryId;

  /**
   * Number of seconds after being triggered before the alert rearms itself and can be triggered
   * again. If `null`, alert will never be triggered again.
   */
  @JsonProperty("rearm")
  private Long rearm;

  public CreateAlert setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateAlert setOptions(AlertOptions options) {
    this.options = options;
    return this;
  }

  public AlertOptions getOptions() {
    return options;
  }

  public CreateAlert setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateAlert setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public CreateAlert setRearm(Long rearm) {
    this.rearm = rearm;
    return this;
  }

  public Long getRearm() {
    return rearm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAlert that = (CreateAlert) o;
    return Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(parent, that.parent)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(rearm, that.rearm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options, parent, queryId, rearm);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAlert.class)
        .add("name", name)
        .add("options", options)
        .add("parent", parent)
        .add("queryId", queryId)
        .add("rearm", rearm)
        .toString();
  }
}
