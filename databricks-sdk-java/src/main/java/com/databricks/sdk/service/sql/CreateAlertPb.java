// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateAlertPb {
  @JsonProperty("name")
  private String name;

  @JsonProperty("options")
  private AlertOptions options;

  @JsonProperty("parent")
  private String parent;

  @JsonProperty("query_id")
  private String queryId;

  @JsonProperty("rearm")
  private Long rearm;

  public CreateAlertPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateAlertPb setOptions(AlertOptions options) {
    this.options = options;
    return this;
  }

  public AlertOptions getOptions() {
    return options;
  }

  public CreateAlertPb setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateAlertPb setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public CreateAlertPb setRearm(Long rearm) {
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
    CreateAlertPb that = (CreateAlertPb) o;
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
    return new ToStringer(CreateAlertPb.class)
        .add("name", name)
        .add("options", options)
        .add("parent", parent)
        .add("queryId", queryId)
        .add("rearm", rearm)
        .toString();
  }
}
