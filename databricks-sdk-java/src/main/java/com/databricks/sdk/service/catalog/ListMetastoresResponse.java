// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListMetastoresResponse {
  /** An array of metastore information objects. */
  @JsonProperty("metastores")
  private Collection<MetastoreInfo> metastores;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListMetastoresResponse setMetastores(Collection<MetastoreInfo> metastores) {
    this.metastores = metastores;
    return this;
  }

  public Collection<MetastoreInfo> getMetastores() {
    return metastores;
  }

  public ListMetastoresResponse setNextPageToken(String nextPageToken) {
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
    ListMetastoresResponse that = (ListMetastoresResponse) o;
    return Objects.equals(metastores, that.metastores)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastores, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMetastoresResponse.class)
        .add("metastores", metastores)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
