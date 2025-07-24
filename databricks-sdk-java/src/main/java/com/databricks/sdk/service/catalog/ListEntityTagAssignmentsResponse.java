// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListEntityTagAssignmentsResponse {
  /** Optional. Pagination token for retrieving the next page of results */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The list of tag assignments */
  @JsonProperty("tag_assignments")
  private Collection<EntityTagAssignment> tagAssignments;

  public ListEntityTagAssignmentsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListEntityTagAssignmentsResponse setTagAssignments(
      Collection<EntityTagAssignment> tagAssignments) {
    this.tagAssignments = tagAssignments;
    return this;
  }

  public Collection<EntityTagAssignment> getTagAssignments() {
    return tagAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListEntityTagAssignmentsResponse that = (ListEntityTagAssignmentsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(tagAssignments, that.tagAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tagAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEntityTagAssignmentsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("tagAssignments", tagAssignments)
        .toString();
  }
}
