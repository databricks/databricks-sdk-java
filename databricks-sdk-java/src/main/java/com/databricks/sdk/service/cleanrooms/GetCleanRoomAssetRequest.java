// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get an asset */
@Generated
public class GetCleanRoomAssetRequest {
  /** The fully qualified name of the asset, it is same as the name field in CleanRoomAsset. */
  @JsonIgnore private String assetFullName;

  /** The type of the asset. */
  @JsonIgnore private CleanRoomAssetAssetType assetType;

  /** Name of the clean room. */
  @JsonIgnore private String cleanRoomName;

  public GetCleanRoomAssetRequest setAssetFullName(String assetFullName) {
    this.assetFullName = assetFullName;
    return this;
  }

  public String getAssetFullName() {
    return assetFullName;
  }

  public GetCleanRoomAssetRequest setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public GetCleanRoomAssetRequest setCleanRoomName(String cleanRoomName) {
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
    GetCleanRoomAssetRequest that = (GetCleanRoomAssetRequest) o;
    return Objects.equals(assetFullName, that.assetFullName)
        && Objects.equals(assetType, that.assetType)
        && Objects.equals(cleanRoomName, that.cleanRoomName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetFullName, assetType, cleanRoomName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCleanRoomAssetRequest.class)
        .add("assetFullName", assetFullName)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
        .toString();
  }
}
