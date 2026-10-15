// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** One page of SearchIssues results. */
@Generated
public class SearchIssuesResponse {
  /** The page's Issues, in the requested order. */
  @JsonProperty("issues")
  private Collection<Issue> issues;

  /** Absent on the last page. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Exact number of matching Issues. */
  @JsonProperty("total_size")
  private Long totalSize;

  public SearchIssuesResponse setIssues(Collection<Issue> issues) {
    this.issues = issues;
    return this;
  }

  public Collection<Issue> getIssues() {
    return issues;
  }

  public SearchIssuesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public SearchIssuesResponse setTotalSize(Long totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  public Long getTotalSize() {
    return totalSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchIssuesResponse that = (SearchIssuesResponse) o;
    return Objects.equals(issues, that.issues)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(totalSize, that.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues, nextPageToken, totalSize);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchIssuesResponse.class)
        .add("issues", issues)
        .add("nextPageToken", nextPageToken)
        .add("totalSize", totalSize)
        .toString();
  }
}
