// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Git provenance of a bundle's source, captured at deploy time. Lets consumers link a deployed
 * resource back to its source in version control.
 */
@Generated
public class GitInfo {
  /** Branch the source was deployed from. */
  @JsonProperty("branch")
  private String branch;

  /** Commit SHA of the deployed source. */
  @JsonProperty("commit")
  private String commit;

  /** URL of the git remote the source was deployed from. */
  @JsonProperty("origin_url")
  private String originUrl;

  public GitInfo setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public GitInfo setCommit(String commit) {
    this.commit = commit;
    return this;
  }

  public String getCommit() {
    return commit;
  }

  public GitInfo setOriginUrl(String originUrl) {
    this.originUrl = originUrl;
    return this;
  }

  public String getOriginUrl() {
    return originUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GitInfo that = (GitInfo) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(commit, that.commit)
        && Objects.equals(originUrl, that.originUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, commit, originUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(GitInfo.class)
        .add("branch", branch)
        .add("commit", commit)
        .add("originUrl", originUrl)
        .toString();
  }
}
