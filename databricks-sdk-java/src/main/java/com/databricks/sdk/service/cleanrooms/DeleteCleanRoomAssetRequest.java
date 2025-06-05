// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete an asset */
@Generated
public class DeleteCleanRoomAssetRequest {
  /** The type of the asset. */
  @JsonIgnore private CleanRoomAssetAssetType assetType;

  /** Name of the clean room. */
  @JsonIgnore private String cleanRoomName;

  /** The fully qualified name of the asset, it is same as the name field in CleanRoomAsset. */
  @JsonIgnore private String name;

  public DeleteCleanRoomAssetRequest setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public DeleteCleanRoomAssetRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public DeleteCleanRoomAssetRequest setName(String name) {
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
    DeleteCleanRoomAssetRequest that = (DeleteCleanRoomAssetRequest) o;
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
    return new ToStringer(DeleteCleanRoomAssetRequest.class)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
        .add("name", name)
        .toString();
  }
}
