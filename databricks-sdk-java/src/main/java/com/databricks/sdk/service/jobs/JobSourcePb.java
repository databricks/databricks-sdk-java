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
class JobSourcePb {
  @JsonProperty("dirty_state")
  private JobSourceDirtyState dirtyState;

  @JsonProperty("import_from_git_branch")
  private String importFromGitBranch;

  @JsonProperty("job_config_path")
  private String jobConfigPath;

  public JobSourcePb setDirtyState(JobSourceDirtyState dirtyState) {
    this.dirtyState = dirtyState;
    return this;
  }

  public JobSourceDirtyState getDirtyState() {
    return dirtyState;
  }

  public JobSourcePb setImportFromGitBranch(String importFromGitBranch) {
    this.importFromGitBranch = importFromGitBranch;
    return this;
  }

  public String getImportFromGitBranch() {
    return importFromGitBranch;
  }

  public JobSourcePb setJobConfigPath(String jobConfigPath) {
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
    JobSourcePb that = (JobSourcePb) o;
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
    return new ToStringer(JobSourcePb.class)
        .add("dirtyState", dirtyState)
        .add("importFromGitBranch", importFromGitBranch)
        .add("jobConfigPath", jobConfigPath)
        .toString();
  }
}
