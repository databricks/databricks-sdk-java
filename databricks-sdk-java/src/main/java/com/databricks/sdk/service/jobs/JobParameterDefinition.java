// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class JobParameterDefinition {
  /**
   * Default value of the parameter.
   */
  @JsonProperty("default")
  private String defaultValue;
  
  /**
   * The name of the defined parameter. May only contain alphanumeric
   * characters, `_`, `-`, and `.`
   */
  @JsonProperty("name")
  private String name;
  
  public JobParameterDefinition setDefault(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public String getDefault() {
    return defaultValue;
  }
  
  public JobParameterDefinition setName(String name) {
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
    JobParameterDefinition that = (JobParameterDefinition) o;
    return Objects.equals(defaultValue, that.defaultValue)
    && Objects.equals(name, that.name)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, name);
  }

  @Override
  public String toString() {
    return new ToStringer(JobParameterDefinition.class)
      .add("defaultValue", defaultValue)
      .add("name", name).toString();
  }
}
