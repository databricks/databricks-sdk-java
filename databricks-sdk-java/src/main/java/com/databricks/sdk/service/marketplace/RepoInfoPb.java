// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RepoInfoPb {
  @JsonProperty("git_repo_url")
  private String gitRepoUrl;

  public RepoInfoPb setGitRepoUrl(String gitRepoUrl) {
    this.gitRepoUrl = gitRepoUrl;
    return this;
  }

  public String getGitRepoUrl() {
    return gitRepoUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepoInfoPb that = (RepoInfoPb) o;
    return Objects.equals(gitRepoUrl, that.gitRepoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitRepoUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(RepoInfoPb.class).add("gitRepoUrl", gitRepoUrl).toString();
  }
}
