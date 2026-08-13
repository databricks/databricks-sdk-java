// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response message for listing direct group members. */
@Generated
public class ListDirectGroupMembersResponse {
  /** The list of direct group members with their membership source type. */
  @JsonProperty("direct_group_members")
  private Collection<DirectGroupMember> directGroupMembers;

  /**
   * A token, which can be sent as page_token to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDirectGroupMembersResponse setDirectGroupMembers(
      Collection<DirectGroupMember> directGroupMembers) {
    this.directGroupMembers = directGroupMembers;
    return this;
  }

  public Collection<DirectGroupMember> getDirectGroupMembers() {
    return directGroupMembers;
  }

  public ListDirectGroupMembersResponse setNextPageToken(String nextPageToken) {
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
    ListDirectGroupMembersResponse that = (ListDirectGroupMembersResponse) o;
    return Objects.equals(directGroupMembers, that.directGroupMembers)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directGroupMembers, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDirectGroupMembersResponse.class)
        .add("directGroupMembers", directGroupMembers)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
