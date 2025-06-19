// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
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
@JsonSerialize(using = GitSource.GitSourceSerializer.class)
@JsonDeserialize(using = GitSource.GitSourceDeserializer.class)
public class GitSource {
  /**
   * Name of the branch to be checked out and used by this job. This field cannot be specified in
   * conjunction with git_tag or git_commit.
   */
  private String gitBranch;

  /**
   * Commit to be checked out and used by this job. This field cannot be specified in conjunction
   * with git_branch or git_tag.
   */
  private String gitCommit;

  /**
   * Unique identifier of the service used to host the Git repository. The value is case
   * insensitive.
   */
  private GitProvider gitProvider;

  /**
   * Read-only state of the remote repository at the time the job was run. This field is only
   * included on job runs.
   */
  private GitSnapshot gitSnapshot;

  /**
   * Name of the tag to be checked out and used by this job. This field cannot be specified in
   * conjunction with git_branch or git_commit.
   */
  private String gitTag;

  /** URL of the repository to be cloned by this job. */
  private String gitUrl;

  /**
   * The source of the job specification in the remote repository when the job is source controlled.
   */
  private JobSource jobSource;

  public GitSource setGitBranch(String gitBranch) {
    this.gitBranch = gitBranch;
    return this;
  }

  public String getGitBranch() {
    return gitBranch;
  }

  public GitSource setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  public String getGitCommit() {
    return gitCommit;
  }

  public GitSource setGitProvider(GitProvider gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public GitProvider getGitProvider() {
    return gitProvider;
  }

  public GitSource setGitSnapshot(GitSnapshot gitSnapshot) {
    this.gitSnapshot = gitSnapshot;
    return this;
  }

  public GitSnapshot getGitSnapshot() {
    return gitSnapshot;
  }

  public GitSource setGitTag(String gitTag) {
    this.gitTag = gitTag;
    return this;
  }

  public String getGitTag() {
    return gitTag;
  }

  public GitSource setGitUrl(String gitUrl) {
    this.gitUrl = gitUrl;
    return this;
  }

  public String getGitUrl() {
    return gitUrl;
  }

  public GitSource setJobSource(JobSource jobSource) {
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
    GitSource that = (GitSource) o;
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
    return new ToStringer(GitSource.class)
        .add("gitBranch", gitBranch)
        .add("gitCommit", gitCommit)
        .add("gitProvider", gitProvider)
        .add("gitSnapshot", gitSnapshot)
        .add("gitTag", gitTag)
        .add("gitUrl", gitUrl)
        .add("jobSource", jobSource)
        .toString();
  }

  GitSourcePb toPb() {
    GitSourcePb pb = new GitSourcePb();
    pb.setGitBranch(gitBranch);
    pb.setGitCommit(gitCommit);
    pb.setGitProvider(gitProvider);
    pb.setGitSnapshot(gitSnapshot);
    pb.setGitTag(gitTag);
    pb.setGitUrl(gitUrl);
    pb.setJobSource(jobSource);

    return pb;
  }

  static GitSource fromPb(GitSourcePb pb) {
    GitSource model = new GitSource();
    model.setGitBranch(pb.getGitBranch());
    model.setGitCommit(pb.getGitCommit());
    model.setGitProvider(pb.getGitProvider());
    model.setGitSnapshot(pb.getGitSnapshot());
    model.setGitTag(pb.getGitTag());
    model.setGitUrl(pb.getGitUrl());
    model.setJobSource(pb.getJobSource());

    return model;
  }

  public static class GitSourceSerializer extends JsonSerializer<GitSource> {
    @Override
    public void serialize(GitSource value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GitSourcePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GitSourceDeserializer extends JsonDeserializer<GitSource> {
    @Override
    public GitSource deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GitSourcePb pb = mapper.readValue(p, GitSourcePb.class);
      return GitSource.fromPb(pb);
    }
  }
}
