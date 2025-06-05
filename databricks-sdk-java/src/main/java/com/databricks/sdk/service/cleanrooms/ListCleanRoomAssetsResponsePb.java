// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListCleanRoomAssetsResponsePb {
  @JsonProperty("assets")
  private Collection<CleanRoomAsset> assets;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListCleanRoomAssetsResponsePb setAssets(Collection<CleanRoomAsset> assets) {
    this.assets = assets;
    return this;
  }

  public Collection<CleanRoomAsset> getAssets() {
    return assets;
  }

  public ListCleanRoomAssetsResponsePb setNextPageToken(String nextPageToken) {
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
    ListCleanRoomAssetsResponsePb that = (ListCleanRoomAssetsResponsePb) o;
    return Objects.equals(assets, that.assets) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomAssetsResponsePb.class)
        .add("assets", assets)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
