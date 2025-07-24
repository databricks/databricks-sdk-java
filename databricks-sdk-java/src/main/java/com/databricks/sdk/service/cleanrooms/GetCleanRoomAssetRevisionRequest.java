// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetCleanRoomAssetRevisionRequest {
  /** Asset type. Only NOTEBOOK_FILE is supported. */
  @JsonIgnore private CleanRoomAssetAssetType assetType;

  /** Name of the clean room. */
  @JsonIgnore private String cleanRoomName;

  /** Revision etag to fetch. If not provided, the latest revision will be returned. */
  @JsonIgnore private String etag;

  /** Name of the asset. */
  @JsonIgnore private String name;

  public GetCleanRoomAssetRevisionRequest setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public GetCleanRoomAssetRevisionRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public GetCleanRoomAssetRevisionRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public GetCleanRoomAssetRevisionRequest setName(String name) {
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
    GetCleanRoomAssetRevisionRequest that = (GetCleanRoomAssetRevisionRequest) o;
    return Objects.equals(assetType, that.assetType)
        && Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(etag, that.etag)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetType, cleanRoomName, etag, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCleanRoomAssetRevisionRequest.class)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
        .add("etag", etag)
        .add("name", name)
        .toString();
  }
}
