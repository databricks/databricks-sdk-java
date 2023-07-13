// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CentralCleanRoomInfo {
  /**
   * All assets from all collaborators that are available in the clean room. Only one of table_info
   * or notebook_info will be filled in.
   */
  @JsonProperty("clean_room_assets")
  private Collection<CleanRoomAssetInfo> cleanRoomAssets;

  /** All collaborators who are in the clean room. */
  @JsonProperty("collaborators")
  private Collection<CleanRoomCollaboratorInfo> collaborators;

  /** The collaborator who created the clean room. */
  @JsonProperty("creator")
  private CleanRoomCollaboratorInfo creator;

  /** The cloud where clean room tasks will be run. */
  @JsonProperty("station_cloud")
  private String stationCloud;

  /** The region where clean room tasks will be run. */
  @JsonProperty("station_region")
  private String stationRegion;

  public CentralCleanRoomInfo setCleanRoomAssets(Collection<CleanRoomAssetInfo> cleanRoomAssets) {
    this.cleanRoomAssets = cleanRoomAssets;
    return this;
  }

  public Collection<CleanRoomAssetInfo> getCleanRoomAssets() {
    return cleanRoomAssets;
  }

  public CentralCleanRoomInfo setCollaborators(
      Collection<CleanRoomCollaboratorInfo> collaborators) {
    this.collaborators = collaborators;
    return this;
  }

  public Collection<CleanRoomCollaboratorInfo> getCollaborators() {
    return collaborators;
  }

  public CentralCleanRoomInfo setCreator(CleanRoomCollaboratorInfo creator) {
    this.creator = creator;
    return this;
  }

  public CleanRoomCollaboratorInfo getCreator() {
    return creator;
  }

  public CentralCleanRoomInfo setStationCloud(String stationCloud) {
    this.stationCloud = stationCloud;
    return this;
  }

  public String getStationCloud() {
    return stationCloud;
  }

  public CentralCleanRoomInfo setStationRegion(String stationRegion) {
    this.stationRegion = stationRegion;
    return this;
  }

  public String getStationRegion() {
    return stationRegion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CentralCleanRoomInfo that = (CentralCleanRoomInfo) o;
    return Objects.equals(cleanRoomAssets, that.cleanRoomAssets)
        && Objects.equals(collaborators, that.collaborators)
        && Objects.equals(creator, that.creator)
        && Objects.equals(stationCloud, that.stationCloud)
        && Objects.equals(stationRegion, that.stationRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomAssets, collaborators, creator, stationCloud, stationRegion);
  }

  @Override
  public String toString() {
    return new ToStringer(CentralCleanRoomInfo.class)
        .add("cleanRoomAssets", cleanRoomAssets)
        .add("collaborators", collaborators)
        .add("creator", creator)
        .add("stationCloud", stationCloud)
        .add("stationRegion", stationRegion)
        .toString();
  }
}
