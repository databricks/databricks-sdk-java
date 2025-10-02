// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** TODO: Write description later when this method is implemented */
@Generated
public class ListGroupsResponse {
  /** */
  @JsonProperty("groups")
  private Collection<Group> groups;

  /**
   * A token, which can be sent as page_token to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListGroupsResponse setGroups(Collection<Group> groups) {
    this.groups = groups;
    return this;
  }

  public Collection<Group> getGroups() {
    return groups;
  }

  public ListGroupsResponse setNextPageToken(String nextPageToken) {
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
    ListGroupsResponse that = (ListGroupsResponse) o;
    return Objects.equals(groups, that.groups) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListGroupsResponse.class)
        .add("groups", groups)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
