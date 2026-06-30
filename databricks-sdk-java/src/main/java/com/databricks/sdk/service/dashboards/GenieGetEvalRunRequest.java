// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GenieGetEvalRunRequest {
  /** */
  @JsonIgnore private String evalRunId;

  /** The ID associated with the Genie space where the evaluation run is located. */
  @JsonIgnore private String spaceId;

  public GenieGetEvalRunRequest setEvalRunId(String evalRunId) {
    this.evalRunId = evalRunId;
    return this;
  }

  public String getEvalRunId() {
    return evalRunId;
  }

  public GenieGetEvalRunRequest setSpaceId(String spaceId) {
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
    GenieGetEvalRunRequest that = (GenieGetEvalRunRequest) o;
    return Objects.equals(evalRunId, that.evalRunId) && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evalRunId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetEvalRunRequest.class)
        .add("evalRunId", evalRunId)
        .add("spaceId", spaceId)
        .toString();
  }
}
