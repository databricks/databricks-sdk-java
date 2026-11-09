// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for listing serverless computes. */
@Generated
public class ListServerlessComputesResponse {
  /** Token for the next page of results. Empty if no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The list of serverless computes. */
  @JsonProperty("serverless_computes")
  private Collection<ServerlessCompute> serverlessComputes;

  public ListServerlessComputesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListServerlessComputesResponse setServerlessComputes(
      Collection<ServerlessCompute> serverlessComputes) {
    this.serverlessComputes = serverlessComputes;
    return this;
  }

  public Collection<ServerlessCompute> getServerlessComputes() {
    return serverlessComputes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListServerlessComputesResponse that = (ListServerlessComputesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(serverlessComputes, that.serverlessComputes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, serverlessComputes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServerlessComputesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("serverlessComputes", serverlessComputes)
        .toString();
  }
}
