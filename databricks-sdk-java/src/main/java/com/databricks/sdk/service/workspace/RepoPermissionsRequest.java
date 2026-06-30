// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RepoPermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<RepoAccessControlRequest> accessControlList;

  /** The repo for which to get or manage permissions. */
  @JsonIgnore private String repoId;

  public RepoPermissionsRequest setAccessControlList(
      Collection<RepoAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<RepoAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public RepoPermissionsRequest setRepoId(String repoId) {
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
    RepoPermissionsRequest that = (RepoPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(repoId, that.repoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, repoId);
  }

  @Override
  public String toString() {
    return new ToStringer(RepoPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("repoId", repoId)
        .toString();
  }
}
