// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Git folder (repo) information. A Git folder is a workspace folder that is linked to a remote Git
 * repository and tracks the branch or commit that is checked out.
 */
@Generated
public class RepoInfo {
  /**
   * Name of the branch that the Git folder (repo) is checked out to. Omitted when the Git folder is
   * in a detached HEAD state, for example after checking out a tag.
   */
  @JsonProperty("branch")
  private String branch;

  /** SHA-1 hash of the commit that the Git folder (repo) is currently checked out to. */
  @JsonProperty("head_commit_id")
  private String headCommitId;

  /** ID of the Git folder (repo) object in the workspace. */
  @JsonProperty("id")
  private Long id;

  /** Root path of the git folder (repo) in the Workspace. */
  @JsonProperty("path")
  private String path;

  /**
   * Git provider of the remote Git repository. Supported providers are `gitHub`, `bitbucketCloud`,
   * `gitLab`, `azureDevOpsServices`, `gitHubEnterprise`, `bitbucketServer` (Bitbucket Data Center),
   * `gitLabEnterpriseEdition` (GitLab Self-Managed), and `awsCodeCommit`.
   */
  @JsonProperty("provider")
  private String provider;

  /**
   * Sparse checkout configuration of the Git folder (repo). Only present when sparse checkout is
   * enabled for the Git folder.
   */
  @JsonProperty("sparse_checkout")
  private SparseCheckout sparseCheckout;

  /** HTTPS URL of the remote Git repository. */
  @JsonProperty("url")
  private String url;

  public RepoInfo setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public RepoInfo setHeadCommitId(String headCommitId) {
    this.headCommitId = headCommitId;
    return this;
  }

  public String getHeadCommitId() {
    return headCommitId;
  }

  public RepoInfo setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  public RepoInfo setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public RepoInfo setProvider(String provider) {
    this.provider = provider;
    return this;
  }

  public String getProvider() {
    return provider;
  }

  public RepoInfo setSparseCheckout(SparseCheckout sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
  }

  public SparseCheckout getSparseCheckout() {
    return sparseCheckout;
  }

  public RepoInfo setUrl(String url) {
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
    RepoInfo that = (RepoInfo) o;
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
    return new ToStringer(RepoInfo.class)
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
