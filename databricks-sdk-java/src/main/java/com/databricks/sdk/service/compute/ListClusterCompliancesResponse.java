// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListClusterCompliancesResponse {
  /** A list of clusters and their policy compliance statuses. */
  @JsonProperty("clusters")
  private Collection<ClusterCompliance> clusters;

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

  public ListClusterCompliancesResponse setClusters(Collection<ClusterCompliance> clusters) {
    this.clusters = clusters;
    return this;
  }

  public Collection<ClusterCompliance> getClusters() {
    return clusters;
  }

  public ListClusterCompliancesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListClusterCompliancesResponse setPrevPageToken(String prevPageToken) {
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
    ListClusterCompliancesResponse that = (ListClusterCompliancesResponse) o;
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
    return new ToStringer(ListClusterCompliancesResponse.class)
        .add("clusters", clusters)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .toString();
  }
}
