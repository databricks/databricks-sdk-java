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
  @JsonProperty("pipeline_task_parameters")
  private Map<String, String> pipelineTaskParameters;

  public ResolvedPipelineTaskValues setPipelineTaskParameters(
      Map<String, String> pipelineTaskParameters) {
    this.pipelineTaskParameters = pipelineTaskParameters;
    return this;
  }

  public Map<String, String> getPipelineTaskParameters() {
    return pipelineTaskParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedPipelineTaskValues that = (ResolvedPipelineTaskValues) o;
    return Objects.equals(pipelineTaskParameters, that.pipelineTaskParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineTaskParameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedPipelineTaskValues.class)
        .add("pipelineTaskParameters", pipelineTaskParameters)
        .toString();
  }
}
