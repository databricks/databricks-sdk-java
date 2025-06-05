// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class JobParameterDefinitionPb {
  @JsonProperty("default")
  private String defaultValue;

  @JsonProperty("name")
  private String name;

  public JobParameterDefinitionPb setDefault(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public String getDefault() {
    return defaultValue;
  }

  public JobParameterDefinitionPb setName(String name) {
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
    JobParameterDefinitionPb that = (JobParameterDefinitionPb) o;
    return Objects.equals(defaultValue, that.defaultValue) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, name);
  }

  @Override
  public String toString() {
    return new ToStringer(JobParameterDefinitionPb.class)
        .add("defaultValue", defaultValue)
        .add("name", name)
        .toString();
  }
}
