// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListVectorIndexesResponse {
  /**
   * A token that can be used to get the next page of results. If not present, there are no more
   * results to show.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("vector_indexes")
  private Collection<MiniVectorIndex> vectorIndexes;

  public ListVectorIndexesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListVectorIndexesResponse setVectorIndexes(Collection<MiniVectorIndex> vectorIndexes) {
    this.vectorIndexes = vectorIndexes;
    return this;
  }

  public Collection<MiniVectorIndex> getVectorIndexes() {
    return vectorIndexes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListVectorIndexesResponse that = (ListVectorIndexesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(vectorIndexes, that.vectorIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, vectorIndexes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVectorIndexesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("vectorIndexes", vectorIndexes)
        .toString();
  }
}
