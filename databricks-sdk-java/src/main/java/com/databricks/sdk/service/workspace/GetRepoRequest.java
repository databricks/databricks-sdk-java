// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get a repo
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetRepoRequest {
  /** The ID for the corresponding repo to access. */
  private Long repoId;

  /**
   * <p>Setter for the field <code>repoId</code>.</p>
   *
   * @param repoId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.workspace.GetRepoRequest} object
   */
  public GetRepoRequest setRepoId(Long repoId) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRepoRequest that = (GetRepoRequest) o;
    return Objects.equals(repoId, that.repoId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(repoId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetRepoRequest.class).add("repoId", repoId).toString();
  }
}
