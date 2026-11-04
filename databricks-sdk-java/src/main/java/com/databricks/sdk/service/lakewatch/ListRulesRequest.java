// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListRulesRequest {
  /** Name of the Unity Catalog catalog to list rules from. Required. */
  @JsonIgnore
  @QueryParam("catalog_name")
  private String catalogName;

  /**
   * Filter expression that restricts the results, such as `rule_name = "my_rule"` to return only
   * the rule with that name. The name is matched against the current UC name, which reads report in
   * `effective_rule_name`.
   */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /**
   * Maximum number of rules to return. The server may return fewer. If unset or 0, the server picks
   * a default page size.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Page token from a previous `ListRules` response, used to fetch the next page of results. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Name of a Unity Catalog schema in `catalog_name`. If set, only rules in this schema are
   * returned. If unset, rules in all schemas of the catalog are returned.
   */
  @JsonIgnore
  @QueryParam("schema_name")
  private String schemaName;

  /**
   * How much of each rule to return. Defaults to `RULE_VIEW_FULL`. `RULE_VIEW_BASIC` returns only
   * each rule's identity and Unity Catalog location.
   */
  @JsonIgnore
  @QueryParam("view")
  private RuleView view;

  public ListRulesRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListRulesRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListRulesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListRulesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListRulesRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public ListRulesRequest setView(RuleView view) {
    this.view = view;
    return this;
  }

  public RuleView getView() {
    return view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRulesRequest that = (ListRulesRequest) o;
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
    return new ToStringer(ListRulesRequest.class)
        .add("catalogName", catalogName)
        .add("filter", filter)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .add("view", view)
        .toString();
  }
}
