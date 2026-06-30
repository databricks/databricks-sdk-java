// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetListingContentMetadataResponse {
  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("shared_data_objects")
  private Collection<SharedDataObject> sharedDataObjects;

  public GetListingContentMetadataResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public GetListingContentMetadataResponse setSharedDataObjects(
      Collection<SharedDataObject> sharedDataObjects) {
    this.sharedDataObjects = sharedDataObjects;
    return this;
  }

  public Collection<SharedDataObject> getSharedDataObjects() {
    return sharedDataObjects;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetListingContentMetadataResponse that = (GetListingContentMetadataResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(sharedDataObjects, that.sharedDataObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, sharedDataObjects);
  }

  @Override
  public String toString() {
    return new ToStringer(GetListingContentMetadataResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("sharedDataObjects", sharedDataObjects)
        .toString();
  }
}
