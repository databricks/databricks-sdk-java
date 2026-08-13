// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response message for listing all transitive parent groups of a principal. */
@Generated
public class ListTransitiveParentGroupsResponse {
  /**
   * A token, which can be sent as page_token to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The list of transitive parent groups. */
  @JsonProperty("transitive_parent_groups")
  private Collection<TransitiveParentGroup> transitiveParentGroups;

  public ListTransitiveParentGroupsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListTransitiveParentGroupsResponse setTransitiveParentGroups(
      Collection<TransitiveParentGroup> transitiveParentGroups) {
    this.transitiveParentGroups = transitiveParentGroups;
    return this;
  }

  public Collection<TransitiveParentGroup> getTransitiveParentGroups() {
    return transitiveParentGroups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTransitiveParentGroupsResponse that = (ListTransitiveParentGroupsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(transitiveParentGroups, that.transitiveParentGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, transitiveParentGroups);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTransitiveParentGroupsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("transitiveParentGroups", transitiveParentGroups)
        .toString();
  }
}
