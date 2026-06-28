// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListExternalMetadataResponse {
  /** */
  @JsonProperty("external_metadata")
  private Collection<ExternalMetadata> externalMetadata;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListExternalMetadataResponse setExternalMetadata(
      Collection<ExternalMetadata> externalMetadata) {
    this.externalMetadata = externalMetadata;
    return this;
  }

  public Collection<ExternalMetadata> getExternalMetadata() {
    return externalMetadata;
  }

  public ListExternalMetadataResponse setNextPageToken(String nextPageToken) {
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
    ListExternalMetadataResponse that = (ListExternalMetadataResponse) o;
    return Objects.equals(externalMetadata, that.externalMetadata)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalMetadata, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExternalMetadataResponse.class)
        .add("externalMetadata", externalMetadata)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
