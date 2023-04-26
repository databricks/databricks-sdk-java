// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListReposResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.ListReposResponse} object
   */
  public ListReposResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * <p>Setter for the field <code>repos</code>.</p>
   *
   * @param repos a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.workspace.ListReposResponse} object
   */
  public ListReposResponse setRepos(Collection<RepoInfo> repos) {
    this.repos = repos;
    return this;
  }

  /**
   * <p>Getter for the field <code>repos</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<RepoInfo> getRepos() {
    return repos;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListReposResponse that = (ListReposResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(repos, that.repos);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, repos);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListReposResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("repos", repos)
        .toString();
  }
}
