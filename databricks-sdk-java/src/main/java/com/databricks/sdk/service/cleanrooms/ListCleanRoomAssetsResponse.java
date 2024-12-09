// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListCleanRoomAssetsResponse {
  /** Assets in the clean room. */
  @JsonProperty("assets")
  private Collection<CleanRoomAsset> assets;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * page_token should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListCleanRoomAssetsResponse setAssets(Collection<CleanRoomAsset> assets) {
    this.assets = assets;
    return this;
  }

  public Collection<CleanRoomAsset> getAssets() {
    return assets;
  }

  public ListCleanRoomAssetsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCleanRoomAssetsResponse that = (ListCleanRoomAssetsResponse) o;
    return Objects.equals(assets, that.assets) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomAssetsResponse.class)
        .add("assets", assets)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
