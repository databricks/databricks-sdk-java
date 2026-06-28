// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListCleanRoomAssetRevisionsResponse {
  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("revisions")
  private Collection<CleanRoomAsset> revisions;

  public ListCleanRoomAssetRevisionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListCleanRoomAssetRevisionsResponse setRevisions(Collection<CleanRoomAsset> revisions) {
    this.revisions = revisions;
    return this;
  }

  public Collection<CleanRoomAsset> getRevisions() {
    return revisions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCleanRoomAssetRevisionsResponse that = (ListCleanRoomAssetRevisionsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(revisions, that.revisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, revisions);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomAssetRevisionsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("revisions", revisions)
        .toString();
  }
}
