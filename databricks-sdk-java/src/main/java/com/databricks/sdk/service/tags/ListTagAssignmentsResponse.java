// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListTagAssignmentsResponse {
  /** Pagination token to request the next page of tag assignments */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("tag_assignments")
  private Collection<TagAssignment> tagAssignments;

  public ListTagAssignmentsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListTagAssignmentsResponse setTagAssignments(Collection<TagAssignment> tagAssignments) {
    this.tagAssignments = tagAssignments;
    return this;
  }

  public Collection<TagAssignment> getTagAssignments() {
    return tagAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTagAssignmentsResponse that = (ListTagAssignmentsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(tagAssignments, that.tagAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tagAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTagAssignmentsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("tagAssignments", tagAssignments)
        .toString();
  }
}
