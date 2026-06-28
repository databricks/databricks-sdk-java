// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GenieListConversationCommentsResponse {
  /** List of comments in the conversation. */
  @JsonProperty("comments")
  private Collection<GenieMessageComment> comments;

  /** Token to get the next page of results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GenieListConversationCommentsResponse setComments(
      Collection<GenieMessageComment> comments) {
    this.comments = comments;
    return this;
  }

  public Collection<GenieMessageComment> getComments() {
    return comments;
  }

  public GenieListConversationCommentsResponse setNextPageToken(String nextPageToken) {
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
    GenieListConversationCommentsResponse that = (GenieListConversationCommentsResponse) o;
    return Objects.equals(comments, that.comments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListConversationCommentsResponse.class)
        .add("comments", comments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
