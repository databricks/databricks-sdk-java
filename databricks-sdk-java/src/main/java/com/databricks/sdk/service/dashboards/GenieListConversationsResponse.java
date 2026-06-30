// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GenieListConversationsResponse {
  /** List of conversations in the Genie space */
  @JsonProperty("conversations")
  private Collection<GenieConversationSummary> conversations;

  /** Token to get the next page of results */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GenieListConversationsResponse setConversations(
      Collection<GenieConversationSummary> conversations) {
    this.conversations = conversations;
    return this;
  }

  public Collection<GenieConversationSummary> getConversations() {
    return conversations;
  }

  public GenieListConversationsResponse setNextPageToken(String nextPageToken) {
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
    GenieListConversationsResponse that = (GenieListConversationsResponse) o;
    return Objects.equals(conversations, that.conversations)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversations, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListConversationsResponse.class)
        .add("conversations", conversations)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
