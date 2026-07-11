// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Response to a ListCdfStatuses request, containing a page of replicated table statuses and a token
 * for fetching the next page.
 */
@Generated
public class ListCdfStatusesResponse {
  /** The replicated tables under the parent CdfConfig. */
  @JsonProperty("cdf_statuses")
  private Collection<CdfStatus> cdfStatuses;

  /** Token to retrieve the next page of results; empty when there are no more. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListCdfStatusesResponse setCdfStatuses(Collection<CdfStatus> cdfStatuses) {
    this.cdfStatuses = cdfStatuses;
    return this;
  }

  public Collection<CdfStatus> getCdfStatuses() {
    return cdfStatuses;
  }

  public ListCdfStatusesResponse setNextPageToken(String nextPageToken) {
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
    ListCdfStatusesResponse that = (ListCdfStatusesResponse) o;
    return Objects.equals(cdfStatuses, that.cdfStatuses)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdfStatuses, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCdfStatusesResponse.class)
        .add("cdfStatuses", cdfStatuses)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
