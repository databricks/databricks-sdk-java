// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListCleanRoomsResponse {
  /** */
  @JsonProperty("clean_rooms")
  private Collection<CleanRoom> cleanRooms;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * page_token should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListCleanRoomsResponse setCleanRooms(Collection<CleanRoom> cleanRooms) {
    this.cleanRooms = cleanRooms;
    return this;
  }

  public Collection<CleanRoom> getCleanRooms() {
    return cleanRooms;
  }

  public ListCleanRoomsResponse setNextPageToken(String nextPageToken) {
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
    ListCleanRoomsResponse that = (ListCleanRoomsResponse) o;
    return Objects.equals(cleanRooms, that.cleanRooms)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRooms, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomsResponse.class)
        .add("cleanRooms", cleanRooms)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
