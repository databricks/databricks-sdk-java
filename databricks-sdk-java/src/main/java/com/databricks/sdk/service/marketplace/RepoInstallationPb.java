// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RepoInstallationPb {
  @JsonProperty("repo_name")
  private String repoName;

  @JsonProperty("repo_path")
  private String repoPath;

  public RepoInstallationPb setRepoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

  public String getRepoName() {
    return repoName;
  }

  public RepoInstallationPb setRepoPath(String repoPath) {
    this.repoPath = repoPath;
    return this;
  }

  public String getRepoPath() {
    return repoPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepoInstallationPb that = (RepoInstallationPb) o;
    return Objects.equals(repoName, that.repoName) && Objects.equals(repoPath, that.repoPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoName, repoPath);
  }

  @Override
  public String toString() {
    return new ToStringer(RepoInstallationPb.class)
        .add("repoName", repoName)
        .add("repoPath", repoPath)
        .toString();
  }
}
