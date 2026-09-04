// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListMcpServicesRequest {
  /**
   * Maximum number of MCP services to return. Defaults to 100 when unset or 0; the maximum is 100.
   * Use `page_token` to retrieve additional pages.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque pagination token from the previous response. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Parent schema to list within, in the form `schemas/{catalog}.{schema}`. Required. Each `{...}`
   * component is capped at 255 characters individually.
   */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  /**
   * Fields to return for each service. `FULL` includes source-connection details and rate-limit
   * principal names. `BASIC` omits the source connection and omits principal names from rate
   * limits. Defaults to `BASIC` when unset.
   */
  @JsonIgnore
  @QueryParam("view")
  private ListMcpServicesRequestView view;

  public ListMcpServicesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListMcpServicesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListMcpServicesRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public ListMcpServicesRequest setView(ListMcpServicesRequestView view) {
    this.view = view;
    return this;
  }

  public ListMcpServicesRequestView getView() {
    return view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListMcpServicesRequest that = (ListMcpServicesRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent)
        && Objects.equals(view, that.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, parent, view);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMcpServicesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .add("view", view)
        .toString();
  }
}
