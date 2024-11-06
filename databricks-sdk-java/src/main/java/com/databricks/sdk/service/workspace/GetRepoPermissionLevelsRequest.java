// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get repo permission levels */
@Generated
public class GetRepoPermissionLevelsRequest {
  /** The repo for which to get or manage permissions. */
  @JsonIgnore private String repoId;

  public GetRepoPermissionLevelsRequest setRepoId(String repoId) {
    this.repoId = repoId;
    return this;
  }

  public String getRepoId() {
    return repoId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRepoPermissionLevelsRequest that = (GetRepoPermissionLevelsRequest) o;
    return Objects.equals(repoId, that.repoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRepoPermissionLevelsRequest.class).add("repoId", repoId).toString();
  }
}
