// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GenieListConversationMessagesResponse {
  /** List of messages in the conversation. */
  @JsonProperty("messages")
  private Collection<GenieMessage> messages;

  /** The token to use for retrieving the next page of results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GenieListConversationMessagesResponse setMessages(Collection<GenieMessage> messages) {
    this.messages = messages;
    return this;
  }

  public Collection<GenieMessage> getMessages() {
    return messages;
  }

  public GenieListConversationMessagesResponse setNextPageToken(String nextPageToken) {
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
    GenieListConversationMessagesResponse that = (GenieListConversationMessagesResponse) o;
    return Objects.equals(messages, that.messages)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListConversationMessagesResponse.class)
        .add("messages", messages)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
