// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A page of restricted sharing groups in the caller's workspace. */
@Generated
public class ListRestrictedSharingGroupsResponse {
  /**
   * A token that can be sent as page_token to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The restricted sharing groups in the workspace. */
  @JsonProperty("restricted_sharing_groups")
  private Collection<RestrictedSharingGroup> restrictedSharingGroups;

  public ListRestrictedSharingGroupsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRestrictedSharingGroupsResponse setRestrictedSharingGroups(
      Collection<RestrictedSharingGroup> restrictedSharingGroups) {
    this.restrictedSharingGroups = restrictedSharingGroups;
    return this;
  }

  public Collection<RestrictedSharingGroup> getRestrictedSharingGroups() {
    return restrictedSharingGroups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRestrictedSharingGroupsResponse that = (ListRestrictedSharingGroupsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(restrictedSharingGroups, that.restrictedSharingGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, restrictedSharingGroups);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRestrictedSharingGroupsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("restrictedSharingGroups", restrictedSharingGroups)
        .toString();
  }
}
