// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete an asset */
@Generated
class DeleteCleanRoomAssetRequestPb {
  @JsonIgnore private CleanRoomAssetAssetType assetType;

  @JsonIgnore private String cleanRoomName;

  @JsonIgnore private String name;

  public DeleteCleanRoomAssetRequestPb setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public DeleteCleanRoomAssetRequestPb setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public DeleteCleanRoomAssetRequestPb setName(String name) {
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
    DeleteCleanRoomAssetRequestPb that = (DeleteCleanRoomAssetRequestPb) o;
    return Objects.equals(assetType, that.assetType)
        && Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetType, cleanRoomName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCleanRoomAssetRequestPb.class)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
        .add("name", name)
        .toString();
  }
}
