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
public class ResolvedParamPairValues {
  /**
   
   */
  @JsonProperty("parameters")
  private Map<String,String> parameters;
  
  public ResolvedParamPairValues setParameters(Map<String,String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String,String> getParameters() {
    return parameters;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedParamPairValues that = (ResolvedParamPairValues) o;
    return Objects.equals(parameters, that.parameters)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedParamPairValues.class)
      .add("parameters", parameters).toString();
  }
}
