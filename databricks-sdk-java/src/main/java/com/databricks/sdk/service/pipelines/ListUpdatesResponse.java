// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListUpdatesResponse {
  /**
   * If present, then there are more results, and this a token to be used in a subsequent request to
   * fetch the next page.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** If present, then this token can be used in a subsequent request to fetch the previous page. */
  @JsonProperty("prev_page_token")
  private String prevPageToken;

  /** */
  @JsonProperty("updates")
  private Collection<UpdateInfo> updates;

  public ListUpdatesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListUpdatesResponse setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  public ListUpdatesResponse setUpdates(Collection<UpdateInfo> updates) {
    this.updates = updates;
    return this;
  }

  public Collection<UpdateInfo> getUpdates() {
    return updates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListUpdatesResponse that = (ListUpdatesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken)
        && Objects.equals(updates, that.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, prevPageToken, updates);
  }

  @Override
  public String toString() {
    return new ToStringer(ListUpdatesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .add("updates", updates)
        .toString();
  }
}
