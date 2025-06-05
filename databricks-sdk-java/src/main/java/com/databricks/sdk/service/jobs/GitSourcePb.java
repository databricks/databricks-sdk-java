// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An optional specification for a remote Git repository containing the source code used by tasks.
 * Version-controlled source code is supported by notebook, dbt, Python script, and SQL File tasks.
 *
 * <p>If `git_source` is set, these tasks retrieve the file from the remote repository by default.
 * However, this behavior can be overridden by setting `source` to `WORKSPACE` on the task.
 *
 * <p>Note: dbt and SQL File tasks support only version-controlled sources. If dbt or SQL File tasks
 * are used, `git_source` must be defined on the job.
 */
@Generated
class GitSourcePb {
  @JsonProperty("git_branch")
  private String gitBranch;

  @JsonProperty("git_commit")
  private String gitCommit;

  @JsonProperty("git_provider")
  private GitProvider gitProvider;

  @JsonProperty("git_snapshot")
  private GitSnapshot gitSnapshot;

  @JsonProperty("git_tag")
  private String gitTag;

  @JsonProperty("git_url")
  private String gitUrl;

  @JsonProperty("job_source")
  private JobSource jobSource;

  public GitSourcePb setGitBranch(String gitBranch) {
    this.gitBranch = gitBranch;
    return this;
  }

  public String getGitBranch() {
    return gitBranch;
  }

  public GitSourcePb setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  public String getGitCommit() {
    return gitCommit;
  }

  public GitSourcePb setGitProvider(GitProvider gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public GitProvider getGitProvider() {
    return gitProvider;
  }

  public GitSourcePb setGitSnapshot(GitSnapshot gitSnapshot) {
    this.gitSnapshot = gitSnapshot;
    return this;
  }

  public GitSnapshot getGitSnapshot() {
    return gitSnapshot;
  }

  public GitSourcePb setGitTag(String gitTag) {
    this.gitTag = gitTag;
    return this;
  }

  public String getGitTag() {
    return gitTag;
  }

  public GitSourcePb setGitUrl(String gitUrl) {
    this.gitUrl = gitUrl;
    return this;
  }

  public String getGitUrl() {
    return gitUrl;
  }

  public GitSourcePb setJobSource(JobSource jobSource) {
    this.jobSource = jobSource;
    return this;
  }

  public JobSource getJobSource() {
    return jobSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GitSourcePb that = (GitSourcePb) o;
    return Objects.equals(gitBranch, that.gitBranch)
        && Objects.equals(gitCommit, that.gitCommit)
        && Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitSnapshot, that.gitSnapshot)
        && Objects.equals(gitTag, that.gitTag)
        && Objects.equals(gitUrl, that.gitUrl)
        && Objects.equals(jobSource, that.jobSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitBranch, gitCommit, gitProvider, gitSnapshot, gitTag, gitUrl, jobSource);
  }

  @Override
  public String toString() {
    return new ToStringer(GitSourcePb.class)
        .add("gitBranch", gitBranch)
        .add("gitCommit", gitCommit)
        .add("gitProvider", gitProvider)
        .add("gitSnapshot", gitSnapshot)
        .add("gitTag", gitTag)
        .add("gitUrl", gitUrl)
        .add("jobSource", jobSource)
        .toString();
  }
}
