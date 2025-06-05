// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Read-only state of the remote repository at the time the job was run. This field is only included
 * on job runs.
 */
@Generated
class GitSnapshotPb {
  @JsonProperty("used_commit")
  private String usedCommit;

  public GitSnapshotPb setUsedCommit(String usedCommit) {
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
    GitSnapshotPb that = (GitSnapshotPb) o;
    return Objects.equals(usedCommit, that.usedCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usedCommit);
  }

  @Override
  public String toString() {
    return new ToStringer(GitSnapshotPb.class).add("usedCommit", usedCommit).toString();
  }
}
