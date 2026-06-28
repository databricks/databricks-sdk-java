// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for listing failover groups. */
@Generated
public class ListFailoverGroupsResponse {
  /** The failover groups for this account. */
  @JsonProperty("failover_groups")
  private Collection<FailoverGroup> failoverGroups;

  /**
   * A token that can be sent as page_token to retrieve the next page. If omitted, there are no
   * subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListFailoverGroupsResponse setFailoverGroups(Collection<FailoverGroup> failoverGroups) {
    this.failoverGroups = failoverGroups;
    return this;
  }

  public Collection<FailoverGroup> getFailoverGroups() {
    return failoverGroups;
  }

  public ListFailoverGroupsResponse setNextPageToken(String nextPageToken) {
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
    ListFailoverGroupsResponse that = (ListFailoverGroupsResponse) o;
    return Objects.equals(failoverGroups, that.failoverGroups)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failoverGroups, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFailoverGroupsResponse.class)
        .add("failoverGroups", failoverGroups)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
