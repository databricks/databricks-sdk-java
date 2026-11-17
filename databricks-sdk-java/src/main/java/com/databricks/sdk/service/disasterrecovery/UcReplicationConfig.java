// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Unity Catalog replication configuration (top-level, not per-set). */
@Generated
public class UcReplicationConfig {
  /**
   * Unity Catalog catalogs to replicate, including their metadata and managed table data. Adding a
   * catalog to an existing failover group returns the group to INITIAL_REPLICATION until the
   * catalog has been replicated.
   */
  @JsonProperty("catalogs")
  private Collection<UcCatalog> catalogs;

  /**
   * Name of the workspace set whose workspaces run the data replication for the catalogs'
   * underlying storage. Must match the name of a workspace set in this failover group.
   */
  @JsonProperty("data_replication_workspace_set")
  private String dataReplicationWorkspaceSet;

  /**
   * Storage location mappings. Each mapping pairs a storage path used by the replicated catalogs in
   * one region with the corresponding path in the other region, so that replicated data is written
   * to the matching storage in the secondary region.
   */
  @JsonProperty("location_mappings")
  private Collection<LocationMapping> locationMappings;

  public UcReplicationConfig setCatalogs(Collection<UcCatalog> catalogs) {
    this.catalogs = catalogs;
    return this;
  }

  public Collection<UcCatalog> getCatalogs() {
    return catalogs;
  }

  public UcReplicationConfig setDataReplicationWorkspaceSet(String dataReplicationWorkspaceSet) {
    this.dataReplicationWorkspaceSet = dataReplicationWorkspaceSet;
    return this;
  }

  public String getDataReplicationWorkspaceSet() {
    return dataReplicationWorkspaceSet;
  }

  public UcReplicationConfig setLocationMappings(Collection<LocationMapping> locationMappings) {
    this.locationMappings = locationMappings;
    return this;
  }

  public Collection<LocationMapping> getLocationMappings() {
    return locationMappings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UcReplicationConfig that = (UcReplicationConfig) o;
    return Objects.equals(catalogs, that.catalogs)
        && Objects.equals(dataReplicationWorkspaceSet, that.dataReplicationWorkspaceSet)
        && Objects.equals(locationMappings, that.locationMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogs, dataReplicationWorkspaceSet, locationMappings);
  }

  @Override
  public String toString() {
    return new ToStringer(UcReplicationConfig.class)
        .add("catalogs", catalogs)
        .add("dataReplicationWorkspaceSet", dataReplicationWorkspaceSet)
        .add("locationMappings", locationMappings)
        .toString();
  }
}
