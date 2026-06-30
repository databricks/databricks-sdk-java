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
public class LoggedModel {
  /** The params and metrics attached to the logged model. */
  @JsonProperty("data")
  private LoggedModelData data;

  /** The logged model attributes such as model ID, status, tags, etc. */
  @JsonProperty("info")
  private LoggedModelInfo info;

  public LoggedModel setData(LoggedModelData data) {
    this.data = data;
    return this;
  }

  public LoggedModelData getData() {
    return data;
  }

  public LoggedModel setInfo(LoggedModelInfo info) {
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
    LoggedModel that = (LoggedModel) o;
    return Objects.equals(data, that.data) && Objects.equals(info, that.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, info);
  }

  @Override
  public String toString() {
    return new ToStringer(LoggedModel.class).add("data", data).add("info", info).toString();
  }
}
