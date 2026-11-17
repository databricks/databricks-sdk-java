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
  /**
   * Identifier of the workspace set, unique within the failover group and referenced by
   * unity_catalog_assets.data_replication_workspace_set. Cannot be changed after creation.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Whether to replicate workspace assets (notebooks, jobs, clusters, SQL warehouses and so on) and
   * their ACLs for this set. Defaults to false. Can be turned on or off with UpdateFailoverGroup.
   */
  @JsonProperty("replicate_workspace_assets")
  private Boolean replicateWorkspaceAssets;

  /**
   * Resource names of stable URLs associated with this workspace set. Format:
   * accounts/{account_id}/stable-urls/{stable_url_id}. The referenced stable URLs must already
   * exist (via CreateStableUrl), and the list can only be set when replicate_workspace_assets is
   * true. While workspace asset replication stays enabled, an update can attach or detach one
   * stable URL at a time.
   */
  @JsonProperty("stable_url_names")
  private Collection<String> stableUrlNames;

  /**
   * IDs of the two workspaces in this set, one in each of the failover group's regions. The system
   * derives and validates each workspace's region. Both workspaces must belong to the account and
   * have the Mission Critical add-on enabled, and they cannot be changed after creation.
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
