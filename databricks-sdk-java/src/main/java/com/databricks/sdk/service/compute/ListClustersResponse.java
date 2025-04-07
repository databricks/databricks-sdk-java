// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListClustersResponse {
  /** */
  @JsonProperty("clusters")
  private Collection<ClusterDetails> clusters;

  /**
   * This field represents the pagination token to retrieve the next page of results. If the value
   * is "", it means no further results for the request.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /**
   * This field represents the pagination token to retrieve the previous page of results. If the
   * value is "", it means no further results for the request.
   */
  @JsonProperty("prev_page_token")
  private String prevPageToken;

  public ListClustersResponse setClusters(Collection<ClusterDetails> clusters) {
    this.clusters = clusters;
    return this;
  }

  public Collection<ClusterDetails> getClusters() {
    return clusters;
  }

  public ListClustersResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListClustersResponse setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersResponse that = (ListClustersResponse) o;
    return Objects.equals(clusters, that.clusters)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters, nextPageToken, prevPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClustersResponse.class)
        .add("clusters", clusters)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .toString();
  }
}
