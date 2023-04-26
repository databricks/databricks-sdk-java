// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An optional specification for a remote repository containing the notebooks used by this job's
 * notebook tasks.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GitSource {
  /**
   * Name of the branch to be checked out and used by this job. This field cannot be specified in
   * conjunction with git_tag or git_commit.
   *
   * <p>The maximum length is 255 characters.
   */
  @JsonProperty("git_branch")
  private String gitBranch;

  /**
   * Commit to be checked out and used by this job. This field cannot be specified in conjunction
   * with git_branch or git_tag. The maximum length is 64 characters.
   */
  @JsonProperty("git_commit")
  private String gitCommit;

  /**
   * Unique identifier of the service used to host the Git repository. The value is case
   * insensitive.
   */
  @JsonProperty("git_provider")
  private GitSourceGitProvider gitProvider;

  /**
   * Read-only state of the remote repository at the time the job was run. This field is only
   * included on job runs.
   */
  @JsonProperty("git_snapshot")
  private GitSnapshot gitSnapshot;

  /**
   * Name of the tag to be checked out and used by this job. This field cannot be specified in
   * conjunction with git_branch or git_commit.
   *
   * <p>The maximum length is 255 characters.
   */
  @JsonProperty("git_tag")
  private String gitTag;

  /** URL of the repository to be cloned by this job. The maximum length is 300 characters. */
  @JsonProperty("git_url")
  private String gitUrl;

  /**
   * <p>Setter for the field <code>gitBranch</code>.</p>
   *
   * @param gitBranch a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.GitSource} object
   */
  public GitSource setGitBranch(String gitBranch) {
    this.gitBranch = gitBranch;
    return this;
  }

  /**
   * <p>Getter for the field <code>gitBranch</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGitBranch() {
    return gitBranch;
  }

  /**
   * <p>Setter for the field <code>gitCommit</code>.</p>
   *
   * @param gitCommit a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.GitSource} object
   */
  public GitSource setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  /**
   * <p>Getter for the field <code>gitCommit</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGitCommit() {
    return gitCommit;
  }

  /**
   * <p>Setter for the field <code>gitProvider</code>.</p>
   *
   * @param gitProvider a {@link com.databricks.sdk.service.jobs.GitSourceGitProvider} object
   * @return a {@link com.databricks.sdk.service.jobs.GitSource} object
   */
  public GitSource setGitProvider(GitSourceGitProvider gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  /**
   * <p>Getter for the field <code>gitProvider</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.GitSourceGitProvider} object
   */
  public GitSourceGitProvider getGitProvider() {
    return gitProvider;
  }

  /**
   * <p>Setter for the field <code>gitSnapshot</code>.</p>
   *
   * @param gitSnapshot a {@link com.databricks.sdk.service.jobs.GitSnapshot} object
   * @return a {@link com.databricks.sdk.service.jobs.GitSource} object
   */
  public GitSource setGitSnapshot(GitSnapshot gitSnapshot) {
    this.gitSnapshot = gitSnapshot;
    return this;
  }

  /**
   * <p>Getter for the field <code>gitSnapshot</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.GitSnapshot} object
   */
  public GitSnapshot getGitSnapshot() {
    return gitSnapshot;
  }

  /**
   * <p>Setter for the field <code>gitTag</code>.</p>
   *
   * @param gitTag a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.GitSource} object
   */
  public GitSource setGitTag(String gitTag) {
    this.gitTag = gitTag;
    return this;
  }

  /**
   * <p>Getter for the field <code>gitTag</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGitTag() {
    return gitTag;
  }

  /**
   * <p>Setter for the field <code>gitUrl</code>.</p>
   *
   * @param gitUrl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.GitSource} object
   */
  public GitSource setGitUrl(String gitUrl) {
    this.gitUrl = gitUrl;
    return this;
  }

  /**
   * <p>Getter for the field <code>gitUrl</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGitUrl() {
    return gitUrl;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GitSource that = (GitSource) o;
    return Objects.equals(gitBranch, that.gitBranch)
        && Objects.equals(gitCommit, that.gitCommit)
        && Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitSnapshot, that.gitSnapshot)
        && Objects.equals(gitTag, that.gitTag)
        && Objects.equals(gitUrl, that.gitUrl);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(gitBranch, gitCommit, gitProvider, gitSnapshot, gitTag, gitUrl);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GitSource.class)
        .add("gitBranch", gitBranch)
        .add("gitCommit", gitCommit)
        .add("gitProvider", gitProvider)
        .add("gitSnapshot", gitSnapshot)
        .add("gitTag", gitTag)
        .add("gitUrl", gitUrl)
        .toString();
  }
}
