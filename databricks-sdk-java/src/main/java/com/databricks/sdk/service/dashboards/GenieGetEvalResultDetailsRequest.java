// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GenieGetEvalResultDetailsRequest {
  /** The unique identifier for the evaluation run. */
  @JsonIgnore private String evalRunId;

  /** The unique identifier for the evaluation result. */
  @JsonIgnore private String resultId;

  /** The ID associated with the Genie space where the evaluation run is located. */
  @JsonIgnore private String spaceId;

  public GenieGetEvalResultDetailsRequest setEvalRunId(String evalRunId) {
    this.evalRunId = evalRunId;
    return this;
  }

  public String getEvalRunId() {
    return evalRunId;
  }

  public GenieGetEvalResultDetailsRequest setResultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  public String getResultId() {
    return resultId;
  }

  public GenieGetEvalResultDetailsRequest setSpaceId(String spaceId) {
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
    GenieGetEvalResultDetailsRequest that = (GenieGetEvalResultDetailsRequest) o;
    return Objects.equals(evalRunId, that.evalRunId)
        && Objects.equals(resultId, that.resultId)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evalRunId, resultId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetEvalResultDetailsRequest.class)
        .add("evalRunId", evalRunId)
        .add("resultId", resultId)
        .add("spaceId", spaceId)
        .toString();
  }
}
