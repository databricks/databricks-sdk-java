// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GenieCreateEvalRunRequest {
  /**
   * List of benchmark question IDs to evaluate. These questions must exist in the specified Genie
   * space. If none are specified, then all benchmark questions are evaluated.
   */
  @JsonProperty("benchmark_question_ids")
  private Collection<String> benchmarkQuestionIds;

  /** The ID associated with the Genie space where the evaluations will be executed. */
  @JsonIgnore private String spaceId;

  public GenieCreateEvalRunRequest setBenchmarkQuestionIds(
      Collection<String> benchmarkQuestionIds) {
    this.benchmarkQuestionIds = benchmarkQuestionIds;
    return this;
  }

  public Collection<String> getBenchmarkQuestionIds() {
    return benchmarkQuestionIds;
  }

  public GenieCreateEvalRunRequest setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieCreateEvalRunRequest that = (GenieCreateEvalRunRequest) o;
    return Objects.equals(benchmarkQuestionIds, that.benchmarkQuestionIds)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarkQuestionIds, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieCreateEvalRunRequest.class)
        .add("benchmarkQuestionIds", benchmarkQuestionIds)
        .add("spaceId", spaceId)
        .toString();
  }
}
