// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListCleanRoomAssetsRequest {
  /** Name of the clean room. */
  @JsonIgnore private String cleanRoomName;

  /** Opaque pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListCleanRoomAssetsRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public ListCleanRoomAssetsRequest setPageToken(String pageToken) {
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
    ListCleanRoomAssetsRequest that = (ListCleanRoomAssetsRequest) o;
    return Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomName, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomAssetsRequest.class)
        .add("cleanRoomName", cleanRoomName)
        .add("pageToken", pageToken)
        .toString();
  }
}
