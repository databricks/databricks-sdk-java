// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for listing refreshes. */
@Generated
public class ListRefreshResponse {
  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("refreshes")
  private Collection<Refresh> refreshes;

  public ListRefreshResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRefreshResponse setRefreshes(Collection<Refresh> refreshes) {
    this.refreshes = refreshes;
    return this;
  }

  public Collection<Refresh> getRefreshes() {
    return refreshes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRefreshResponse that = (ListRefreshResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(refreshes, that.refreshes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, refreshes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRefreshResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("refreshes", refreshes)
        .toString();
  }
}
