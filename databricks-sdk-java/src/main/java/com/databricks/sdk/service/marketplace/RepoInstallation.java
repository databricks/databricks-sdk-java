// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RepoInstallation {
  /** the user-specified repo name for their installed git repo listing */
  @JsonProperty("repo_name")
  private String repoName;

  /**
   * refers to the full url file path that navigates the user to the repo's entrypoint (e.g. a
   * README.md file, or the repo file view in the unified UI) should just be a relative path
   */
  @JsonProperty("repo_path")
  private String repoPath;

  public RepoInstallation setRepoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

  public String getRepoName() {
    return repoName;
  }

  public RepoInstallation setRepoPath(String repoPath) {
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
    RepoInstallation that = (RepoInstallation) o;
    return Objects.equals(repoName, that.repoName) && Objects.equals(repoPath, that.repoPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoName, repoPath);
  }

  @Override
  public String toString() {
    return new ToStringer(RepoInstallation.class)
        .add("repoName", repoName)
        .add("repoPath", repoPath)
        .toString();
  }
}
