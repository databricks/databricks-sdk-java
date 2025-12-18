// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Complete git source specification including repository location and reference. */
@Generated
public class GitSource {
  /** Git branch to checkout. */
  @JsonProperty("branch")
  private String branch;

  /** Git commit SHA to checkout. */
  @JsonProperty("commit")
  private String commit;

  /** Git repository configuration. Populated from the app's git_repository configuration. */
  @JsonProperty("git_repository")
  private GitRepository gitRepository;

  /**
   * The resolved commit SHA that was actually used for the deployment. This is populated by the
   * system after resolving the reference (branch, tag, or commit). If commit is specified directly,
   * this will match commit. If a branch or tag is specified, this contains the commit SHA that the
   * branch or tag pointed to at deployment time.
   */
  @JsonProperty("resolved_commit")
  private String resolvedCommit;

  /**
   * Relative path to the app source code within the Git repository. If not specified, the root of
   * the repository is used.
   */
  @JsonProperty("source_code_path")
  private String sourceCodePath;

  /** Git tag to checkout. */
  @JsonProperty("tag")
  private String tag;

  public GitSource setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public GitSource setCommit(String commit) {
    this.commit = commit;
    return this;
  }

  public String getCommit() {
    return commit;
  }

  public GitSource setGitRepository(GitRepository gitRepository) {
    this.gitRepository = gitRepository;
    return this;
  }

  public GitRepository getGitRepository() {
    return gitRepository;
  }

  public GitSource setResolvedCommit(String resolvedCommit) {
    this.resolvedCommit = resolvedCommit;
    return this;
  }

  public String getResolvedCommit() {
    return resolvedCommit;
  }

  public GitSource setSourceCodePath(String sourceCodePath) {
    this.sourceCodePath = sourceCodePath;
    return this;
  }

  public String getSourceCodePath() {
    return sourceCodePath;
  }

  public GitSource setTag(String tag) {
    this.tag = tag;
    return this;
  }

  public String getTag() {
    return tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GitSource that = (GitSource) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(commit, that.commit)
        && Objects.equals(gitRepository, that.gitRepository)
        && Objects.equals(resolvedCommit, that.resolvedCommit)
        && Objects.equals(sourceCodePath, that.sourceCodePath)
        && Objects.equals(tag, that.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, commit, gitRepository, resolvedCommit, sourceCodePath, tag);
  }

  @Override
  public String toString() {
    return new ToStringer(GitSource.class)
        .add("branch", branch)
        .add("commit", commit)
        .add("gitRepository", gitRepository)
        .add("resolvedCommit", resolvedCommit)
        .add("sourceCodePath", sourceCodePath)
        .add("tag", tag)
        .toString();
  }
}
