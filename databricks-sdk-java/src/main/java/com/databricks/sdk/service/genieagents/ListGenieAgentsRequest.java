// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListGenieAgentsRequest {
  /**
   * Maximum number of Genie Agents to return per page. Defaults to 20 when unset or 0; values above
   * 100 are coerced to 100. Negative values are rejected with INVALID_PARAMETER_VALUE. With
   * `GENIE_AGENT_VIEW_FULL`, a smaller per-page maximum applies.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Pagination token from a previous response's `next_page_token`. A token that was not returned by
   * this method is rejected with INVALID_PARAMETER_VALUE.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The fields to return for each Genie Agent. Defaults to `GENIE_AGENT_VIEW_BASIC`. Use
   * `GENIE_AGENT_VIEW_FULL` only when the agent bodies are needed, since it returns smaller pages.
   */
  @JsonIgnore
  @QueryParam("view")
  private GenieAgentView view;

  public ListGenieAgentsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListGenieAgentsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListGenieAgentsRequest setView(GenieAgentView view) {
    this.view = view;
    return this;
  }

  public GenieAgentView getView() {
    return view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListGenieAgentsRequest that = (ListGenieAgentsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(view, that.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, view);
  }

  @Override
  public String toString() {
    return new ToStringer(ListGenieAgentsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("view", view)
        .toString();
  }
}
