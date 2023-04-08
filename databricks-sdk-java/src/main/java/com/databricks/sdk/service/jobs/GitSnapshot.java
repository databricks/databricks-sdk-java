// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Read-only state of the remote repository at the time the job was run. This field is only included
 * on job runs.
 */
public class GitSnapshot {
  /**
   * Commit that was used to execute the run. If git_branch was specified, this points to the HEAD
   * of the branch at the time of the run; if git_tag was specified, this points to the commit the
   * tag points to.
   */
  @JsonProperty("used_commit")
  private String usedCommit;

  public GitSnapshot setUsedCommit(String usedCommit) {
    this.usedCommit = usedCommit;
    return this;
  }

  public String getUsedCommit() {
    return usedCommit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GitSnapshot that = (GitSnapshot) o;
    return Objects.equals(usedCommit, that.usedCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usedCommit);
  }

  @Override
  public String toString() {
    return new ToStringer(GitSnapshot.class).add("usedCommit", usedCommit).toString();
  }
}
