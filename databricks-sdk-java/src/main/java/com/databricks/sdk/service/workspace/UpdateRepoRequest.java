// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateRepoRequest {
  /** Branch that the local version of the repo is checked out to. */
  @JsonProperty("branch")
  private String branch;

  /** ID of the Git folder (repo) object in the workspace. */
  @JsonIgnore private Long repoId;

  /**
   * If specified, update the sparse checkout settings. The update will fail if sparse checkout is
   * not enabled for the repo.
   */
  @JsonProperty("sparse_checkout")
  private SparseCheckoutUpdate sparseCheckout;

  /**
   * Tag that the local version of the repo is checked out to. Updating the repo to a tag puts the
   * repo in a detached HEAD state. Before committing new changes, you must update the repo to a
   * branch instead of the detached HEAD.
   */
  @JsonProperty("tag")
  private String tag;

  public UpdateRepoRequest setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public UpdateRepoRequest setRepoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

  public Long getRepoId() {
    return repoId;
  }

  public UpdateRepoRequest setSparseCheckout(SparseCheckoutUpdate sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
  }

  public SparseCheckoutUpdate getSparseCheckout() {
    return sparseCheckout;
  }

  public UpdateRepoRequest setTag(String tag) {
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
    UpdateRepoRequest that = (UpdateRepoRequest) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(repoId, that.repoId)
        && Objects.equals(sparseCheckout, that.sparseCheckout)
        && Objects.equals(tag, that.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, repoId, sparseCheckout, tag);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRepoRequest.class)
        .add("branch", branch)
        .add("repoId", repoId)
        .add("sparseCheckout", sparseCheckout)
        .add("tag", tag)
        .toString();
  }
}
