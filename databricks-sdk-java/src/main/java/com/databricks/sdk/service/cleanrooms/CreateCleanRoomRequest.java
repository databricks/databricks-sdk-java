// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCleanRoomRequest {
  /** */
  @JsonProperty("clean_room")
  private CleanRoom cleanRoom;

  public CreateCleanRoomRequest setCleanRoom(CleanRoom cleanRoom) {
    this.cleanRoom = cleanRoom;
    return this;
  }

  public CleanRoom getCleanRoom() {
    return cleanRoom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCleanRoomRequest that = (CreateCleanRoomRequest) o;
    return Objects.equals(cleanRoom, that.cleanRoom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoom);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoomRequest.class).add("cleanRoom", cleanRoom).toString();
  }
}
