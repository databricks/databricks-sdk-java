// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GenieListEvalResultsRequest {
  /** The unique identifier for the evaluation run. */
  @JsonIgnore private String evalRunId;

  /** Maximum number of eval results to return per page. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque token to retrieve the next page of results. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The ID associated with the Genie space where the evaluation run is located. */
  @JsonIgnore private String spaceId;

  public GenieListEvalResultsRequest setEvalRunId(String evalRunId) {
    this.evalRunId = evalRunId;
    return this;
  }

  public String getEvalRunId() {
    return evalRunId;
  }

  public GenieListEvalResultsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public GenieListEvalResultsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GenieListEvalResultsRequest setSpaceId(String spaceId) {
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
    GenieListEvalResultsRequest that = (GenieListEvalResultsRequest) o;
    return Objects.equals(evalRunId, that.evalRunId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evalRunId, pageSize, pageToken, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListEvalResultsRequest.class)
        .add("evalRunId", evalRunId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("spaceId", spaceId)
        .toString();
  }
}
