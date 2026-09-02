// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListModelServicesRequest {
  /**
   * Maximum number of model services to return. Defaults to 100 when unset or 0; the maximum is
   * 100. Use `page_token` to retrieve additional pages.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque pagination token from a previous request. */
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
   * Fields to return for each service. `FULL` includes destinations, inference-table details, and
   * rate-limit principal names. `BASIC` omits destinations and inference-table details and omits
   * principal names from rate limits. Defaults to `BASIC` when unset or `VIEW_UNSPECIFIED`.
   */
  @JsonIgnore
  @QueryParam("view")
  private ListModelServicesRequestView view;

  public ListModelServicesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListModelServicesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListModelServicesRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public ListModelServicesRequest setView(ListModelServicesRequestView view) {
    this.view = view;
    return this;
  }

  public ListModelServicesRequestView getView() {
    return view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListModelServicesRequest that = (ListModelServicesRequest) o;
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
    return new ToStringer(ListModelServicesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .add("view", view)
        .toString();
  }
}
