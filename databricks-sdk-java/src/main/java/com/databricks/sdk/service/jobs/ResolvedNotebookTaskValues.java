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
public class ResolvedNotebookTaskValues {
  /**
   
   */
  @JsonProperty("base_parameters")
  private Map<String,String> baseParameters;
  
  public ResolvedNotebookTaskValues setBaseParameters(Map<String,String> baseParameters) {
    this.baseParameters = baseParameters;
    return this;
  }

  public Map<String,String> getBaseParameters() {
    return baseParameters;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedNotebookTaskValues that = (ResolvedNotebookTaskValues) o;
    return Objects.equals(baseParameters, that.baseParameters)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseParameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedNotebookTaskValues.class)
      .add("baseParameters", baseParameters).toString();
  }
}
