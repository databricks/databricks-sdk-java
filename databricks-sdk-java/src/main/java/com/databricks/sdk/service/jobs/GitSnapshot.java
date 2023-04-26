// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Read-only state of the remote repository at the time the job was run. This field is only included
 * on job runs.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GitSnapshot {
  /**
   * Commit that was used to execute the run. If git_branch was specified, this points to the HEAD
   * of the branch at the time of the run; if git_tag was specified, this points to the commit the
   * tag points to.
   */
  @JsonProperty("used_commit")
  private String usedCommit;

  /**
   * <p>Setter for the field <code>usedCommit</code>.</p>
   *
   * @param usedCommit a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.GitSnapshot} object
   */
  public GitSnapshot setUsedCommit(String usedCommit) {
    this.usedCommit = usedCommit;
    return this;
  }

  /**
   * <p>Getter for the field <code>usedCommit</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUsedCommit() {
    return usedCommit;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GitSnapshot that = (GitSnapshot) o;
    return Objects.equals(usedCommit, that.usedCommit);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(usedCommit);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GitSnapshot.class).add("usedCommit", usedCommit).toString();
  }
}
