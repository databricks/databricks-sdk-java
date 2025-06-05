// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A logged model message includes logged model attributes, tags, registration info, params, and
 * linked run metrics.
 */
@Generated
class LoggedModelPb {
  @JsonProperty("data")
  private LoggedModelData data;

  @JsonProperty("info")
  private LoggedModelInfo info;

  public LoggedModelPb setData(LoggedModelData data) {
    this.data = data;
    return this;
  }

  public LoggedModelData getData() {
    return data;
  }

  public LoggedModelPb setInfo(LoggedModelInfo info) {
    this.info = info;
    return this;
  }

  public LoggedModelInfo getInfo() {
    return info;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LoggedModelPb that = (LoggedModelPb) o;
    return Objects.equals(data, that.data) && Objects.equals(info, that.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, info);
  }

  @Override
  public String toString() {
    return new ToStringer(LoggedModelPb.class).add("data", data).add("info", info).toString();
  }
}
