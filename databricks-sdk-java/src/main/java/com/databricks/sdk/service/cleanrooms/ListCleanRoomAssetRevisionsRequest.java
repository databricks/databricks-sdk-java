// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListCleanRoomAssetRevisionsRequest {
  /** Asset type. Only NOTEBOOK_FILE is supported. */
  @JsonIgnore private CleanRoomAssetAssetType assetType;

  /** Name of the clean room. */
  @JsonIgnore private String cleanRoomName;

  /** Name of the asset. */
  @JsonIgnore private String name;

  /** Maximum number of asset revisions to return. Defaults to 10. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque pagination token to go to next page based on the previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListCleanRoomAssetRevisionsRequest setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public ListCleanRoomAssetRevisionsRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public ListCleanRoomAssetRevisionsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ListCleanRoomAssetRevisionsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListCleanRoomAssetRevisionsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCleanRoomAssetRevisionsRequest that = (ListCleanRoomAssetRevisionsRequest) o;
    return Objects.equals(assetType, that.assetType)
        && Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(name, that.name)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetType, cleanRoomName, name, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomAssetRevisionsRequest.class)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
        .add("name", name)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
