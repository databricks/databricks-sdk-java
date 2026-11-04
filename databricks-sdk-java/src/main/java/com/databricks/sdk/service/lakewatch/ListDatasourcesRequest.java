// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListDatasourcesRequest {
  /**
   * Name of the Unity Catalog catalog to list datasources from. Required; each request lists the
   * datasources of a single catalog.
   */
  @JsonIgnore
  @QueryParam("catalog_name")
  private String catalogName;

  /**
   * Filter expression that restricts the results to datasources with a given name, for example
   * `datasource_name = "my_source"`. Only a single exact-match comparison on `datasource_name` is
   * supported, and it matches the datasource's current Unity Catalog name, which reads report in
   * `effective_datasource_name`. Filtered results are returned in a single page.
   */
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

  /** */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Name of a Unity Catalog schema in `catalog_name`. Optional; if set, only the datasources in
   * this schema are returned, and if omitted, the datasources in all schemas of the catalog are
   * returned.
   */
  @JsonIgnore
  @QueryParam("schema_name")
  private String schemaName;

  /**
   * Which fields to return for each datasource. Defaults to `DATASOURCE_VIEW_FULL`.
   * `DATASOURCE_VIEW_BASIC` returns only the identity and Unity Catalog location fields.
   */
  @JsonIgnore
  @QueryParam("view")
  private DatasourceView view;

  public ListDatasourcesRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListDatasourcesRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListDatasourcesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDatasourcesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListDatasourcesRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public ListDatasourcesRequest setView(DatasourceView view) {
    this.view = view;
    return this;
  }

  public DatasourceView getView() {
    return view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDatasourcesRequest that = (ListDatasourcesRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(filter, that.filter)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(view, that.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, filter, pageSize, pageToken, schemaName, view);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatasourcesRequest.class)
        .add("catalogName", catalogName)
        .add("filter", filter)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .add("view", view)
        .toString();
  }
}
