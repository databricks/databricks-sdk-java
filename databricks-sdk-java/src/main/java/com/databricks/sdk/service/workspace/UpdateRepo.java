// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateRepo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateRepo {
  /** Branch that the local version of the repo is checked out to. */
  @JsonProperty("branch")
  private String branch;

  /** The ID for the corresponding repo to access. */
  private Long repoId;

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

  /**
   * <p>Setter for the field <code>branch</code>.</p>
   *
   * @param branch a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.UpdateRepo} object
   */
  public UpdateRepo setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * <p>Getter for the field <code>branch</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getBranch() {
    return branch;
  }

  /**
   * <p>Setter for the field <code>repoId</code>.</p>
   *
   * @param repoId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.workspace.UpdateRepo} object
   */
  public UpdateRepo setRepoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * <p>Getter for the field <code>repoId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRepoId() {
    return repoId;
  }

  /**
   * <p>Setter for the field <code>sparseCheckout</code>.</p>
   *
   * @param sparseCheckout a {@link com.databricks.sdk.service.workspace.SparseCheckoutUpdate} object
   * @return a {@link com.databricks.sdk.service.workspace.UpdateRepo} object
   */
  public UpdateRepo setSparseCheckout(SparseCheckoutUpdate sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
  }

  /**
   * <p>Getter for the field <code>sparseCheckout</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.SparseCheckoutUpdate} object
   */
  public SparseCheckoutUpdate getSparseCheckout() {
    return sparseCheckout;
  }

  /**
   * <p>Setter for the field <code>tag</code>.</p>
   *
   * @param tag a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.UpdateRepo} object
   */
  public UpdateRepo setTag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * <p>Getter for the field <code>tag</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTag() {
    return tag;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRepo that = (UpdateRepo) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(repoId, that.repoId)
        && Objects.equals(sparseCheckout, that.sparseCheckout)
        && Objects.equals(tag, that.tag);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(branch, repoId, sparseCheckout, tag);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateRepo.class)
        .add("branch", branch)
        .add("repoId", repoId)
        .add("sparseCheckout", sparseCheckout)
        .add("tag", tag)
        .toString();
  }
}
