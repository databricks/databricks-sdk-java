// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class Run {
  /**
   * Run data.
   */
  @JsonProperty("data")
  private RunData data;
  
  /**
   * Run metadata.
   */
  @JsonProperty("info")
  private RunInfo info;
  
  /**
   * Run inputs.
   */
  @JsonProperty("inputs")
  private RunInputs inputs;
  
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
  
  public Run setInputs(RunInputs inputs) {
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
    Run that = (Run) o;
    return Objects.equals(data, that.data)
    && Objects.equals(info, that.info)
    && Objects.equals(inputs, that.inputs)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, info, inputs);
  }

  @Override
  public String toString() {
    return new ToStringer(Run.class)
      .add("data", data)
      .add("info", info)
      .add("inputs", inputs).toString();
  }
}
