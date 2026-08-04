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
   * Whether to include model services for which the principal can only access selective metadata.
   */
  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  /**
   * Maximum number of model services to return. Defaults to 100 when unset or 0; the maximum is
   * 100. Use `next_page_token` to retrieve additional pages.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque pagination token from a previous request. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Resource name of the parent schema to list within, as `schemas/{catalog}.{schema}`. Each
   * `{...}` component is capped at 255 characters individually.
   */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  /** View selector controlling which fields are populated per row. */
  @JsonIgnore
  @QueryParam("view")
  private ListModelServicesRequestView view;

  public ListModelServicesRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

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
    return Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent)
        && Objects.equals(view, that.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBrowse, pageSize, pageToken, parent, view);
  }

  @Override
  public String toString() {
    return new ToStringer(ListModelServicesRequest.class)
        .add("includeBrowse", includeBrowse)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .add("view", view)
        .toString();
  }
}
