// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.repos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListReposResponse {
  /**
   * Token that can be specified as a query parameter to the GET /repos endpoint to retrieve the
   * next page of results.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("repos")
  private java.util.List<RepoInfo> repos;

  public ListReposResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListReposResponse setRepos(java.util.List<RepoInfo> repos) {
    this.repos = repos;
    return this;
  }

  public java.util.List<RepoInfo> getRepos() {
    return repos;
  }
}
