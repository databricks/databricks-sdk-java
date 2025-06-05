// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A single run. */
@Generated
class RunPb {
  @JsonProperty("data")
  private RunData data;

  @JsonProperty("info")
  private RunInfo info;

  @JsonProperty("inputs")
  private RunInputs inputs;

  public RunPb setData(RunData data) {
    this.data = data;
    return this;
  }

  public RunData getData() {
    return data;
  }

  public RunPb setInfo(RunInfo info) {
    this.info = info;
    return this;
  }

  public RunInfo getInfo() {
    return info;
  }

  public RunPb setInputs(RunInputs inputs) {
    this.inputs = inputs;
    return this;
  }

  public RunInputs getInputs() {
    return inputs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunPb that = (RunPb) o;
    return Objects.equals(data, that.data)
        && Objects.equals(info, that.info)
        && Objects.equals(inputs, that.inputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, info, inputs);
  }

  @Override
  public String toString() {
    return new ToStringer(RunPb.class)
        .add("data", data)
        .add("info", info)
        .add("inputs", inputs)
        .toString();
  }
}
