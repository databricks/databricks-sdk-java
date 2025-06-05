// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get the latest logs for a served model */
@Generated
class LogsRequestPb {
  @JsonIgnore private String name;

  @JsonIgnore private String servedModelName;

  public LogsRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LogsRequestPb setServedModelName(String servedModelName) {
    this.servedModelName = servedModelName;
    return this;
  }

  public String getServedModelName() {
    return servedModelName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogsRequestPb that = (LogsRequestPb) o;
    return Objects.equals(name, that.name) && Objects.equals(servedModelName, that.servedModelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, servedModelName);
  }

  @Override
  public String toString() {
    return new ToStringer(LogsRequestPb.class)
        .add("name", name)
        .add("servedModelName", servedModelName)
        .toString();
  }
}
