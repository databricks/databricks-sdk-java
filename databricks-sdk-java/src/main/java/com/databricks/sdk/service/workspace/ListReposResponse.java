// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListReposResponse {
  /**
   * Token that can be specified as a query parameter to the GET /repos endpoint to retrieve the
   * next page of results.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("repos")
  private Collection<RepoInfo> repos;

  public ListReposResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListReposResponse setRepos(Collection<RepoInfo> repos) {
    this.repos = repos;
    return this;
  }

  public Collection<RepoInfo> getRepos() {
    return repos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListReposResponse that = (ListReposResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(repos, that.repos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, repos);
  }

  @Override
  public String toString() {
    return new ToStringer(ListReposResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("repos", repos)
        .toString();
  }
}
