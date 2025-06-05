// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListCleanRoomsResponsePb {
  @JsonProperty("clean_rooms")
  private Collection<CleanRoom> cleanRooms;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListCleanRoomsResponsePb setCleanRooms(Collection<CleanRoom> cleanRooms) {
    this.cleanRooms = cleanRooms;
    return this;
  }

  public Collection<CleanRoom> getCleanRooms() {
    return cleanRooms;
  }

  public ListCleanRoomsResponsePb setNextPageToken(String nextPageToken) {
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
    ListCleanRoomsResponsePb that = (ListCleanRoomsResponsePb) o;
    return Objects.equals(cleanRooms, that.cleanRooms)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRooms, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomsResponsePb.class)
        .add("cleanRooms", cleanRooms)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
