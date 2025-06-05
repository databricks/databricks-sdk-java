// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update an asset */
@Generated
class UpdateCleanRoomAssetRequestPb {
  @JsonProperty("asset")
  private CleanRoomAsset asset;

  @JsonIgnore private CleanRoomAssetAssetType assetType;

  @JsonIgnore private String cleanRoomName;

  @JsonIgnore private String name;

  public UpdateCleanRoomAssetRequestPb setAsset(CleanRoomAsset asset) {
    this.asset = asset;
    return this;
  }

  public CleanRoomAsset getAsset() {
    return asset;
  }

  public UpdateCleanRoomAssetRequestPb setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public UpdateCleanRoomAssetRequestPb setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public UpdateCleanRoomAssetRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCleanRoomAssetRequestPb that = (UpdateCleanRoomAssetRequestPb) o;
    return Objects.equals(asset, that.asset)
        && Objects.equals(assetType, that.assetType)
        && Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, assetType, cleanRoomName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCleanRoomAssetRequestPb.class)
        .add("asset", asset)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
        .add("name", name)
        .toString();
  }
}
