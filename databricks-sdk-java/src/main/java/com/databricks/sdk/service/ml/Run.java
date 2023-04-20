// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Run {
  /** Run data. */
  @JsonProperty("data")
  private RunData data;

  /** Run metadata. */
  @JsonProperty("info")
  private RunInfo info;

  public Run setData(RunData data) {
    this.data = data;
    return this;
  }

  public RunData getData() {
    return data;
  }

  public Run setInfo(RunInfo info) {
    this.info = info;
    return this;
  }

  public RunInfo getInfo() {
    return info;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Run that = (Run) o;
    return Objects.equals(data, that.data) && Objects.equals(info, that.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, info);
  }

  @Override
  public String toString() {
    return new ToStringer(Run.class).add("data", data).add("info", info).toString();
  }
}
