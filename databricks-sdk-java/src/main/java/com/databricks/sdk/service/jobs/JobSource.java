// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The source of the job specification in the remote repository when the job is source controlled.
 */
@Generated
public class JobSource {
  /** This describes an enum */
  @JsonProperty("dirty_state")
  private JobSourceDirtyState dirtyState;

  /** Name of the branch which the job is imported from. */
  @JsonProperty("import_from_git_branch")
  private String importFromGitBranch;

  /** Path of the job YAML file that contains the job specification. */
  @JsonProperty("job_config_path")
  private String jobConfigPath;

  public JobSource setDirtyState(JobSourceDirtyState dirtyState) {
    this.dirtyState = dirtyState;
    return this;
  }

  public JobSourceDirtyState getDirtyState() {
    return dirtyState;
  }

  public JobSource setImportFromGitBranch(String importFromGitBranch) {
    this.importFromGitBranch = importFromGitBranch;
    return this;
  }

  public String getImportFromGitBranch() {
    return importFromGitBranch;
  }

  public JobSource setJobConfigPath(String jobConfigPath) {
    this.jobConfigPath = jobConfigPath;
    return this;
  }

  public String getJobConfigPath() {
    return jobConfigPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobSource that = (JobSource) o;
    return Objects.equals(dirtyState, that.dirtyState)
        && Objects.equals(importFromGitBranch, that.importFromGitBranch)
        && Objects.equals(jobConfigPath, that.jobConfigPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dirtyState, importFromGitBranch, jobConfigPath);
  }

  @Override
  public String toString() {
    return new ToStringer(JobSource.class)
        .add("dirtyState", dirtyState)
        .add("importFromGitBranch", importFromGitBranch)
        .add("jobConfigPath", jobConfigPath)
        .toString();
  }
}
