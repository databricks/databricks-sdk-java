// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListBatchesResponse {
  /** The batches in this page. */
  @JsonProperty("batches")
  private Collection<Batch> batches;

  /** A token to get the next page. It is empty on the last page. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListBatchesResponse setBatches(Collection<Batch> batches) {
    this.batches = batches;
    return this;
  }

  public Collection<Batch> getBatches() {
    return batches;
  }

  public ListBatchesResponse setNextPageToken(String nextPageToken) {
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
    ListBatchesResponse that = (ListBatchesResponse) o;
    return Objects.equals(batches, that.batches)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batches, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBatchesResponse.class)
        .add("batches", batches)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
