// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateCleanRoomAssetRequest {
  /**
   * The asset to update. The asset's `name` and `asset_type` fields are used to identify the asset
   * to update.
   */
  @JsonProperty("asset")
  private CleanRoomAsset asset;

  /** The type of the asset. */
  @JsonIgnore private CleanRoomAssetAssetType assetType;

  /** Name of the clean room. */
  @JsonIgnore private String cleanRoomName;

  /**
   * A fully qualified name that uniquely identifies the asset within the clean room. This is also
   * the name displayed in the clean room UI.
   *
   * <p>For UC securable assets (tables, volumes, etc.), the format is
   * *shared_catalog*.*shared_schema*.*asset_name*
   *
   * <p>For notebooks, the name is the notebook file name.
   */
  @JsonIgnore private String name;

  public UpdateCleanRoomAssetRequest setAsset(CleanRoomAsset asset) {
    this.asset = asset;
    return this;
  }

  public CleanRoomAsset getAsset() {
    return asset;
  }

  public UpdateCleanRoomAssetRequest setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public UpdateCleanRoomAssetRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public UpdateCleanRoomAssetRequest setName(String name) {
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
    UpdateCleanRoomAssetRequest that = (UpdateCleanRoomAssetRequest) o;
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
    return new ToStringer(UpdateCleanRoomAssetRequest.class)
        .add("asset", asset)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
        .add("name", name)
        .toString();
  }
}
