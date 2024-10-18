// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GetRepoResponse {
  /** Branch that the local version of the repo is checked out to. */
  @JsonProperty("branch")
  private String branch;

  /** SHA-1 hash representing the commit ID of the current HEAD of the repo. */
  @JsonProperty("head_commit_id")
  private String headCommitId;

  /** ID of the Git folder (repo) object in the workspace. */
  @JsonProperty("id")
  private Long id;

  /** Path of the Git folder (repo) in the workspace. */
  @JsonProperty("path")
  private String path;

  /** Git provider of the linked Git repository. */
  @JsonProperty("provider")
  private String provider;

  /** Sparse checkout settings for the Git folder (repo). */
  @JsonProperty("sparse_checkout")
  private SparseCheckout sparseCheckout;

  /** URL of the linked Git repository. */
  @JsonProperty("url")
  private String url;

  public GetRepoResponse setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public GetRepoResponse setHeadCommitId(String headCommitId) {
    this.headCommitId = headCommitId;
    return this;
  }

  public String getHeadCommitId() {
    return headCommitId;
  }

  public GetRepoResponse setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  public GetRepoResponse setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public GetRepoResponse setProvider(String provider) {
    this.provider = provider;
    return this;
  }

  public String getProvider() {
    return provider;
  }

  public GetRepoResponse setSparseCheckout(SparseCheckout sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
  }

  public SparseCheckout getSparseCheckout() {
    return sparseCheckout;
  }

  public GetRepoResponse setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRepoResponse that = (GetRepoResponse) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(headCommitId, that.headCommitId)
        && Objects.equals(id, that.id)
        && Objects.equals(path, that.path)
        && Objects.equals(provider, that.provider)
        && Objects.equals(sparseCheckout, that.sparseCheckout)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, headCommitId, id, path, provider, sparseCheckout, url);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRepoResponse.class)
        .add("branch", branch)
        .add("headCommitId", headCommitId)
        .add("id", id)
        .add("path", path)
        .add("provider", provider)
        .add("sparseCheckout", sparseCheckout)
        .add("url", url)
        .toString();
  }
}
