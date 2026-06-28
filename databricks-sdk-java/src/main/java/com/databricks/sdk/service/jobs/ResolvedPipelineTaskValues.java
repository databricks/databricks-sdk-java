// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class ResolvedPipelineTaskValues {
  /**
   * Key/value-map of parameters passed to the pipeline execution. Limited to 10k characters in
   * total.
   */
  @JsonProperty("parameters")
  private Map<String, String> parameters;

  public ResolvedPipelineTaskValues setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedPipelineTaskValues that = (ResolvedPipelineTaskValues) o;
    return Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedPipelineTaskValues.class)
        .add("parameters", parameters)
        .toString();
  }
}
