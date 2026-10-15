// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Request for SearchIssues. */
@Generated
public class SearchIssuesRequest {
  /** Matches Issues with any of these categories, case-insensitively. */
  @JsonProperty("categories")
  private Collection<String> categories;

  /** Defaults to 20; values above 100 are clamped. */
  @JsonProperty("page_size")
  private Long pageSize;

  /**
   * Expires after 15 minutes. Every other argument except `view` must match the request that
   * returned the token.
   */
  @JsonProperty("page_token")
  private String pageToken;

  /** experiments/{experiment} */
  @JsonIgnore private String parent;

  /** Case-insensitive substring match on title. */
  @JsonProperty("query")
  private String query;

  /** Matches Issues with any of these severities. */
  @JsonProperty("severities")
  private Collection<IssueSeverity> severities;

  /** Defaults to SEVERITY. */
  @JsonProperty("sort_key")
  private IssueSortKey sortKey;

  /** Defaults to DESCENDING. */
  @JsonProperty("sort_order")
  private SortOrder sortOrder;

  /**
   * Matches Issues with any of these statuses. Different filters AND together, and an empty filter
   * matches every Issue.
   */
  @JsonProperty("statuses")
  private Collection<IssueStatus> statuses;

  /** Matches Issues that satisfy every filter. At most 10 filters of 20 values each. */
  @JsonProperty("tag_filters")
  private Collection<IssueTagFilter> tagFilters;

  /** Defaults to BASIC. */
  @JsonProperty("view")
  private IssueView view;

  public SearchIssuesRequest setCategories(Collection<String> categories) {
    this.categories = categories;
    return this;
  }

  public Collection<String> getCategories() {
    return categories;
  }

  public SearchIssuesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public SearchIssuesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public SearchIssuesRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public SearchIssuesRequest setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public SearchIssuesRequest setSeverities(Collection<IssueSeverity> severities) {
    this.severities = severities;
    return this;
  }

  public Collection<IssueSeverity> getSeverities() {
    return severities;
  }

  public SearchIssuesRequest setSortKey(IssueSortKey sortKey) {
    this.sortKey = sortKey;
    return this;
  }

  public IssueSortKey getSortKey() {
    return sortKey;
  }

  public SearchIssuesRequest setSortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  public SortOrder getSortOrder() {
    return sortOrder;
  }

  public SearchIssuesRequest setStatuses(Collection<IssueStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Collection<IssueStatus> getStatuses() {
    return statuses;
  }

  public SearchIssuesRequest setTagFilters(Collection<IssueTagFilter> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public Collection<IssueTagFilter> getTagFilters() {
    return tagFilters;
  }

  public SearchIssuesRequest setView(IssueView view) {
    this.view = view;
    return this;
  }

  public IssueView getView() {
    return view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchIssuesRequest that = (SearchIssuesRequest) o;
    return Objects.equals(categories, that.categories)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent)
        && Objects.equals(query, that.query)
        && Objects.equals(severities, that.severities)
        && Objects.equals(sortKey, that.sortKey)
        && Objects.equals(sortOrder, that.sortOrder)
        && Objects.equals(statuses, that.statuses)
        && Objects.equals(tagFilters, that.tagFilters)
        && Objects.equals(view, that.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        categories,
        pageSize,
        pageToken,
        parent,
        query,
        severities,
        sortKey,
        sortOrder,
        statuses,
        tagFilters,
        view);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchIssuesRequest.class)
        .add("categories", categories)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .add("query", query)
        .add("severities", severities)
        .add("sortKey", sortKey)
        .add("sortOrder", sortOrder)
        .add("statuses", statuses)
        .add("tagFilters", tagFilters)
        .add("view", view)
        .toString();
  }
}
