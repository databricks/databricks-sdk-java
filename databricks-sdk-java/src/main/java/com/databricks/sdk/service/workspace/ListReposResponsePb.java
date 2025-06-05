// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListReposResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("repos")
  private Collection<RepoInfo> repos;

  public ListReposResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListReposResponsePb setRepos(Collection<RepoInfo> repos) {
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
    ListReposResponsePb that = (ListReposResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(repos, that.repos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, repos);
  }

  @Override
  public String toString() {
    return new ToStringer(ListReposResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("repos", repos)
        .toString();
  }
}
