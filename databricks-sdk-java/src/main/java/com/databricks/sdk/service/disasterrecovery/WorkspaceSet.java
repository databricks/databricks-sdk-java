// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A set of workspaces that replicate to each other across regions. */
@Generated
public class WorkspaceSet {
  /** Resource name for this workspace set. */
  @JsonProperty("name")
  private String name;

  /**
   * Whether to enable control plane DR (notebooks, jobs, clusters, etc.) for this set. Requires all
   * workspaces in the set to be Mission Critical tier.
   */
  @JsonProperty("replicate_workspace_assets")
  private Boolean replicateWorkspaceAssets;

  /**
   * Resource names of stable URLs associated with this workspace set. Format:
   * accounts/{account_id}/stable-urls/{stable_url_id}. The referenced stable URLs must already
   * exist (via CreateStableUrl).
   */
  @JsonProperty("stable_url_names")
  private Collection<String> stableUrlNames;

  /**
   * Workspace IDs in this set. The system derives and validates regions. EA: exactly 2 workspaces
   * (one per region).
   */
  @JsonProperty("workspace_ids")
  private Collection<String> workspaceIds;

  public WorkspaceSet setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public WorkspaceSet setReplicateWorkspaceAssets(Boolean replicateWorkspaceAssets) {
    this.replicateWorkspaceAssets = replicateWorkspaceAssets;
    return this;
  }

  public Boolean getReplicateWorkspaceAssets() {
    return replicateWorkspaceAssets;
  }

  public WorkspaceSet setStableUrlNames(Collection<String> stableUrlNames) {
    this.stableUrlNames = stableUrlNames;
    return this;
  }

  public Collection<String> getStableUrlNames() {
    return stableUrlNames;
  }

  public WorkspaceSet setWorkspaceIds(Collection<String> workspaceIds) {
    this.workspaceIds = workspaceIds;
    return this;
  }

  public Collection<String> getWorkspaceIds() {
    return workspaceIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceSet that = (WorkspaceSet) o;
    return Objects.equals(name, that.name)
        && Objects.equals(replicateWorkspaceAssets, that.replicateWorkspaceAssets)
        && Objects.equals(stableUrlNames, that.stableUrlNames)
        && Objects.equals(workspaceIds, that.workspaceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, replicateWorkspaceAssets, stableUrlNames, workspaceIds);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceSet.class)
        .add("name", name)
        .add("replicateWorkspaceAssets", replicateWorkspaceAssets)
        .add("stableUrlNames", stableUrlNames)
        .add("workspaceIds", workspaceIds)
        .toString();
  }
}
