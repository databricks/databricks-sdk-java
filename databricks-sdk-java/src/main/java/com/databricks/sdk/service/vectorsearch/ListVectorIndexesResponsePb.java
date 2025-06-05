// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListVectorIndexesResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("vector_indexes")
  private Collection<MiniVectorIndex> vectorIndexes;

  public ListVectorIndexesResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListVectorIndexesResponsePb setVectorIndexes(Collection<MiniVectorIndex> vectorIndexes) {
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
    ListVectorIndexesResponsePb that = (ListVectorIndexesResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(vectorIndexes, that.vectorIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, vectorIndexes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVectorIndexesResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("vectorIndexes", vectorIndexes)
        .toString();
  }
}
