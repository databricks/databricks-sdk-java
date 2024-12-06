// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateCleanRoomRequest {
  /** */
  @JsonProperty("clean_room")
  private CleanRoom cleanRoom;

  /** Name of the clean room. */
  @JsonIgnore private String name;

  public UpdateCleanRoomRequest setCleanRoom(CleanRoom cleanRoom) {
    this.cleanRoom = cleanRoom;
    return this;
  }

  public CleanRoom getCleanRoom() {
    return cleanRoom;
  }

  public UpdateCleanRoomRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCleanRoomRequest that = (UpdateCleanRoomRequest) o;
    return Objects.equals(cleanRoom, that.cleanRoom) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoom, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCleanRoomRequest.class)
        .add("cleanRoom", cleanRoom)
        .add("name", name)
        .toString();
  }
}
