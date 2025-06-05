// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListUpdatesResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("prev_page_token")
  private String prevPageToken;

  @JsonProperty("updates")
  private Collection<UpdateInfo> updates;

  public ListUpdatesResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListUpdatesResponsePb setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  public ListUpdatesResponsePb setUpdates(Collection<UpdateInfo> updates) {
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
    ListUpdatesResponsePb that = (ListUpdatesResponsePb) o;
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
    return new ToStringer(ListUpdatesResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .add("updates", updates)
        .toString();
  }
}
