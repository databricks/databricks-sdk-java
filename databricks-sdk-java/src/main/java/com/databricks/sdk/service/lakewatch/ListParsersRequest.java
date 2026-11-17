// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListParsersRequest {
  /**
   * Name of the parent UC catalog to list parsers from. Required: List is scoped to a single
   * catalog, mirroring the Unity Catalog tables/functions APIs, which take catalog_name as a
   * request field (bound to a query parameter) rather than a catalog path segment.
   */
  @JsonIgnore
  @QueryParam("catalog_name")
  private String catalogName;

  /** AIP-160 filter expression. Parsers are filterable by `parser_name`. */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /**
   * Maximum number of results to return in one page. This is a best-effort upper bound, not a
   * guarantee: the server may return fewer items than requested (even zero) while more results
   * still exist. If unset or 0, the server picks a default.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Page token from a previous `ListParsers` response, used to fetch the next page of results. Send
   * the other request fields unchanged when requesting later pages; a token from a request with
   * different fields is rejected.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Name of the parent UC schema. Optional: when set, results are narrowed to this schema; when
   * omitted, parsers across all schemas in `catalog_name` are returned.
   */
  @JsonIgnore
  @QueryParam("schema_name")
  private String schemaName;

  public ListParsersRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListParsersRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListParsersRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListParsersRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListParsersRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListParsersRequest that = (ListParsersRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(filter, that.filter)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, filter, pageSize, pageToken, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListParsersRequest.class)
        .add("catalogName", catalogName)
        .add("filter", filter)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }
}
