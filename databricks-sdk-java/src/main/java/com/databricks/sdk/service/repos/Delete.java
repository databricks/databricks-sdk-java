// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.repos;

/** Delete a repo */
public class Delete {
  /** The ID for the corresponding repo to access. */
  private Long repoId;

  public Delete setRepoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

  public Long getRepoId() {
    return repoId;
  }
}
