// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class QueryEndpointInput {
  /** Pandas Dataframe input in the records orientation. */
  @JsonProperty("dataframe_records")
  private Collection<Object> dataframeRecords;

  /** Pandas Dataframe input in the split orientation. */
  @JsonProperty("dataframe_split")
  private DataframeSplitInput dataframeSplit;

  /** Tensor-based input in columnar format. */
  @JsonProperty("inputs")
  private Object inputs;

  /** Tensor-based input in row format. */
  @JsonProperty("instances")
  private Collection<Object> instances;

  /** The name of the serving endpoint. This field is required. */
  private String name;

  public QueryEndpointInput setDataframeRecords(Collection<Object> dataframeRecords) {
    this.dataframeRecords = dataframeRecords;
    return this;
  }

  public Collection<Object> getDataframeRecords() {
    return dataframeRecords;
  }

  public QueryEndpointInput setDataframeSplit(DataframeSplitInput dataframeSplit) {
    this.dataframeSplit = dataframeSplit;
    return this;
  }

  public DataframeSplitInput getDataframeSplit() {
    return dataframeSplit;
  }

  public QueryEndpointInput setInputs(Object inputs) {
    this.inputs = inputs;
    return this;
  }

  public Object getInputs() {
    return inputs;
  }

  public QueryEndpointInput setInstances(Collection<Object> instances) {
    this.instances = instances;
    return this;
  }

  public Collection<Object> getInstances() {
    return instances;
  }

  public QueryEndpointInput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryEndpointInput that = (QueryEndpointInput) o;
    return Objects.equals(dataframeRecords, that.dataframeRecords)
        && Objects.equals(dataframeSplit, that.dataframeSplit)
        && Objects.equals(inputs, that.inputs)
        && Objects.equals(instances, that.instances)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataframeRecords, dataframeSplit, inputs, instances, name);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryEndpointInput.class)
        .add("dataframeRecords", dataframeRecords)
        .add("dataframeSplit", dataframeSplit)
        .add("inputs", inputs)
        .add("instances", instances)
        .add("name", name)
        .toString();
  }
}
