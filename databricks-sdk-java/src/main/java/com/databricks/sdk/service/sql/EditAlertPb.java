// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EditAlertPb {
  @JsonIgnore private String alertId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("options")
  private AlertOptions options;

  @JsonProperty("query_id")
  private String queryId;

  @JsonProperty("rearm")
  private Long rearm;

  public EditAlertPb setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  public EditAlertPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EditAlertPb setOptions(AlertOptions options) {
    this.options = options;
    return this;
  }

  public AlertOptions getOptions() {
    return options;
  }

  public EditAlertPb setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public EditAlertPb setRearm(Long rearm) {
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
    EditAlertPb that = (EditAlertPb) o;
    return Objects.equals(alertId, that.alertId)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(rearm, that.rearm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, name, options, queryId, rearm);
  }

  @Override
  public String toString() {
    return new ToStringer(EditAlertPb.class)
        .add("alertId", alertId)
        .add("name", name)
        .add("options", options)
        .add("queryId", queryId)
        .add("rearm", rearm)
        .toString();
  }
}
