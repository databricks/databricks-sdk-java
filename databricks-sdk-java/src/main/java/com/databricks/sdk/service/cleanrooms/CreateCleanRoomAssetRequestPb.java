// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create an asset */
@Generated
class CreateCleanRoomAssetRequestPb {
  @JsonProperty("asset")
  private CleanRoomAsset asset;

  @JsonIgnore private String cleanRoomName;

  public CreateCleanRoomAssetRequestPb setAsset(CleanRoomAsset asset) {
    this.asset = asset;
    return this;
  }

  public CleanRoomAsset getAsset() {
    return asset;
  }

  public CreateCleanRoomAssetRequestPb setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCleanRoomAssetRequestPb that = (CreateCleanRoomAssetRequestPb) o;
    return Objects.equals(asset, that.asset) && Objects.equals(cleanRoomName, that.cleanRoomName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, cleanRoomName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoomAssetRequestPb.class)
        .add("asset", asset)
        .add("cleanRoomName", cleanRoomName)
        .toString();
  }
}
