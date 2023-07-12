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
public class ResolvedPythonWheelTaskValues {
  /**
   
   */
  @JsonProperty("named_parameters")
  private Map<String,String> namedParameters;
  
  /**
   
   */
  @JsonProperty("parameters")
  private Collection<String> parameters;
  
  public ResolvedPythonWheelTaskValues setNamedParameters(Map<String,String> namedParameters) {
    this.namedParameters = namedParameters;
    return this;
  }

  public Map<String,String> getNamedParameters() {
    return namedParameters;
  }
  
  public ResolvedPythonWheelTaskValues setParameters(Collection<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<String> getParameters() {
    return parameters;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedPythonWheelTaskValues that = (ResolvedPythonWheelTaskValues) o;
    return Objects.equals(namedParameters, that.namedParameters)
    && Objects.equals(parameters, that.parameters)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(namedParameters, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedPythonWheelTaskValues.class)
      .add("namedParameters", namedParameters)
      .add("parameters", parameters).toString();
  }
}
