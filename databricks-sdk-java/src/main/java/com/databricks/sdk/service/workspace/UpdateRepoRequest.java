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

  /**
   * WARNING: DESTRUCTIVE AND IRREVERSIBLE. If true, permanently deletes ALL uncommitted changes in
   * the Git folder — staged, unstaged, and untracked files — before updating. Lost data CANNOT be
   * recovered.
   *
   * <p>NEVER use this on Git folders where users author or edit files. This flag is intended ONLY
   * for automated jobs that treat the Git folder as a read-only mirror of a remote branch and need
   * to force-sync it. If any user has uncommitted work in the Git folder, that work will be
   * permanently destroyed without warning.
   *
   * <p>Local commits that have been made but not yet pushed to the remote are preserved.
   */
  @JsonProperty("dangerously_force_discard_all")
  private Boolean dangerouslyForceDiscardAll;

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

  public UpdateRepoRequest setDangerouslyForceDiscardAll(Boolean dangerouslyForceDiscardAll) {
    this.dangerouslyForceDiscardAll = dangerouslyForceDiscardAll;
    return this;
  }

  public Boolean getDangerouslyForceDiscardAll() {
    return dangerouslyForceDiscardAll;
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
        && Objects.equals(dangerouslyForceDiscardAll, that.dangerouslyForceDiscardAll)
        && Objects.equals(repoId, that.repoId)
        && Objects.equals(sparseCheckout, that.sparseCheckout)
        && Objects.equals(tag, that.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, dangerouslyForceDiscardAll, repoId, sparseCheckout, tag);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRepoRequest.class)
        .add("branch", branch)
        .add("dangerouslyForceDiscardAll", dangerouslyForceDiscardAll)
        .add("repoId", repoId)
        .add("sparseCheckout", sparseCheckout)
        .add("tag", tag)
        .toString();
  }
}
