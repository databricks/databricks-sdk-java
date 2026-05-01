// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for listing stable URLs. */
@Generated
public class ListStableUrlsResponse {
  /**
   * A token that can be sent as page_token to retrieve the next page. If omitted, there are no
   * subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The stable URLs for this account. */
  @JsonProperty("stable_urls")
  private Collection<StableUrl> stableUrls;

  public ListStableUrlsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListStableUrlsResponse setStableUrls(Collection<StableUrl> stableUrls) {
    this.stableUrls = stableUrls;
    return this;
  }

  public Collection<StableUrl> getStableUrls() {
    return stableUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListStableUrlsResponse that = (ListStableUrlsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(stableUrls, that.stableUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, stableUrls);
  }

  @Override
  public String toString() {
    return new ToStringer(ListStableUrlsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("stableUrls", stableUrls)
        .toString();
  }
}
