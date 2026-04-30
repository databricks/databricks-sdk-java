// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/**
 * A failover group manages disaster recovery across workspace sets, coordinating UCDR and CPDR
 * replication.
 */
@Generated
public class FailoverGroup {
  /** Time at which this failover group was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Current effective primary region. Replication flows FROM workspaces in this region. Changes
   * after a successful failover.
   */
  @JsonProperty("effective_primary_region")
  private String effectivePrimaryRegion;

  /**
   * Opaque version string for optimistic locking. Server-generated, returned in responses. Must be
   * provided on Update requests to prevent concurrent modifications.
   */
  @JsonProperty("etag")
  private String etag;

  /**
   * Initial primary region. Used only in Create requests to set the starting primary region. Not
   * returned in responses.
   */
  @JsonProperty("initial_primary_region")
  private String initialPrimaryRegion;

  /**
   * Fully qualified resource name in the format
   * accounts/{account_id}/failover-groups/{failover_group_id}.
   */
  @JsonProperty("name")
  private String name;

  /** List of all regions participating in this failover group. */
  @JsonProperty("regions")
  private Collection<String> regions;

  /** The latest point in time to which data has been replicated. */
  @JsonProperty("replication_point")
  private Timestamp replicationPoint;

  /** Aggregate state of the failover group. */
  @JsonProperty("state")
  private FailoverGroupState state;

  /** Unity Catalog replication configuration. */
  @JsonProperty("unity_catalog_assets")
  private UcReplicationConfig unityCatalogAssets;

  /** Time at which this failover group was last modified. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Workspace sets, each containing workspaces that replicate to each other. */
  @JsonProperty("workspace_sets")
  private Collection<WorkspaceSet> workspaceSets;

  public FailoverGroup setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public FailoverGroup setEffectivePrimaryRegion(String effectivePrimaryRegion) {
    this.effectivePrimaryRegion = effectivePrimaryRegion;
    return this;
  }

  public String getEffectivePrimaryRegion() {
    return effectivePrimaryRegion;
  }

  public FailoverGroup setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public FailoverGroup setInitialPrimaryRegion(String initialPrimaryRegion) {
    this.initialPrimaryRegion = initialPrimaryRegion;
    return this;
  }

  public String getInitialPrimaryRegion() {
    return initialPrimaryRegion;
  }

  public FailoverGroup setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FailoverGroup setRegions(Collection<String> regions) {
    this.regions = regions;
    return this;
  }

  public Collection<String> getRegions() {
    return regions;
  }

  public FailoverGroup setReplicationPoint(Timestamp replicationPoint) {
    this.replicationPoint = replicationPoint;
    return this;
  }

  public Timestamp getReplicationPoint() {
    return replicationPoint;
  }

  public FailoverGroup setState(FailoverGroupState state) {
    this.state = state;
    return this;
  }

  public FailoverGroupState getState() {
    return state;
  }

  public FailoverGroup setUnityCatalogAssets(UcReplicationConfig unityCatalogAssets) {
    this.unityCatalogAssets = unityCatalogAssets;
    return this;
  }

  public UcReplicationConfig getUnityCatalogAssets() {
    return unityCatalogAssets;
  }

  public FailoverGroup setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public FailoverGroup setWorkspaceSets(Collection<WorkspaceSet> workspaceSets) {
    this.workspaceSets = workspaceSets;
    return this;
  }

  public Collection<WorkspaceSet> getWorkspaceSets() {
    return workspaceSets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FailoverGroup that = (FailoverGroup) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(effectivePrimaryRegion, that.effectivePrimaryRegion)
        && Objects.equals(etag, that.etag)
        && Objects.equals(initialPrimaryRegion, that.initialPrimaryRegion)
        && Objects.equals(name, that.name)
        && Objects.equals(regions, that.regions)
        && Objects.equals(replicationPoint, that.replicationPoint)
        && Objects.equals(state, that.state)
        && Objects.equals(unityCatalogAssets, that.unityCatalogAssets)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(workspaceSets, that.workspaceSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        effectivePrimaryRegion,
        etag,
        initialPrimaryRegion,
        name,
        regions,
        replicationPoint,
        state,
        unityCatalogAssets,
        updateTime,
        workspaceSets);
  }

  @Override
  public String toString() {
    return new ToStringer(FailoverGroup.class)
        .add("createTime", createTime)
        .add("effectivePrimaryRegion", effectivePrimaryRegion)
        .add("etag", etag)
        .add("initialPrimaryRegion", initialPrimaryRegion)
        .add("name", name)
        .add("regions", regions)
        .add("replicationPoint", replicationPoint)
        .add("state", state)
        .add("unityCatalogAssets", unityCatalogAssets)
        .add("updateTime", updateTime)
        .add("workspaceSets", workspaceSets)
        .toString();
  }
}
