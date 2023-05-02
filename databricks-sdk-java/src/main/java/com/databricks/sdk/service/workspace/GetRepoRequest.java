// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a repo */
@Generated
public class GetRepoRequest {
  /** The ID for the corresponding repo to access. */
  private Long repoId;

  public GetRepoRequest setRepoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

  public Long getRepoId() {
    return repoId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRepoRequest that = (GetRepoRequest) o;
    return Objects.equals(repoId, that.repoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRepoRequest.class).add("repoId", repoId).toString();
  }
}
