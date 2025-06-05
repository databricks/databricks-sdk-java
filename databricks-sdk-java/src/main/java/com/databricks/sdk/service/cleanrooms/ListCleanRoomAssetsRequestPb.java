// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List assets */
@Generated
class ListCleanRoomAssetsRequestPb {
  @JsonIgnore private String cleanRoomName;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListCleanRoomAssetsRequestPb setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public ListCleanRoomAssetsRequestPb setPageToken(String pageToken) {
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
    ListCleanRoomAssetsRequestPb that = (ListCleanRoomAssetsRequestPb) o;
    return Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomName, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomAssetsRequestPb.class)
        .add("cleanRoomName", cleanRoomName)
        .add("pageToken", pageToken)
        .toString();
  }
}
