// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class JobParameterPb {
  @JsonProperty("default")
  private String defaultValue;

  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  public JobParameterPb setDefault(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public String getDefault() {
    return defaultValue;
  }

  public JobParameterPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public JobParameterPb setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobParameterPb that = (JobParameterPb) o;
    return Objects.equals(defaultValue, that.defaultValue)
        && Objects.equals(name, that.name)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, name, value);
  }

  @Override
  public String toString() {
    return new ToStringer(JobParameterPb.class)
        .add("defaultValue", defaultValue)
        .add("name", name)
        .add("value", value)
        .toString();
  }
}
