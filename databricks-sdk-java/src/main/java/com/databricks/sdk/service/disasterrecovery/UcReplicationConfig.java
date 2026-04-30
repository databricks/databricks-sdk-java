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
  /** UC catalogs to replicate. */
  @JsonProperty("catalogs")
  private Collection<UcCatalog> catalogs;

  /**
   * The workspace set whose workspaces will be used for data replication of all UC catalogs'
   * underlying storage.
   */
  @JsonProperty("data_replication_workspace_set")
  private String dataReplicationWorkspaceSet;

  /** Location mappings - storage URI per region for each location. */
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
