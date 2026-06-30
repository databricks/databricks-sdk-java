// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class JobParameter {
  /** The optional default value of the parameter */
  @JsonProperty("default")
  private String defaultValue;

  /** The name of the parameter */
  @JsonProperty("name")
  private String name;

  /** The value used in the run */
  @JsonProperty("value")
  private String value;

  public JobParameter setDefault(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public String getDefault() {
    return defaultValue;
  }

  public JobParameter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public JobParameter setValue(String value) {
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
    JobParameter that = (JobParameter) o;
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
    return new ToStringer(JobParameter.class)
        .add("defaultValue", defaultValue)
        .add("name", name)
        .add("value", value)
        .toString();
  }
}
