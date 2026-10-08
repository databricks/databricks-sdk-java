// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response containing a page of session items. */
@Generated
public class ListSessionItemsResponse {
  /** Token to retrieve the next page. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Session items in the requested page. */
  @JsonProperty("session_items")
  private Collection<SessionItem> sessionItems;

  public ListSessionItemsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSessionItemsResponse setSessionItems(Collection<SessionItem> sessionItems) {
    this.sessionItems = sessionItems;
    return this;
  }

  public Collection<SessionItem> getSessionItems() {
    return sessionItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSessionItemsResponse that = (ListSessionItemsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(sessionItems, that.sessionItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, sessionItems);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSessionItemsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("sessionItems", sessionItems)
        .toString();
  }
}
