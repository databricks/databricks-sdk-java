// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCleanRoom {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the clean room. */
  @JsonProperty("name")
  private String name;

  /** Central clean room details. */
  @JsonProperty("remote_detailed_info")
  private CentralCleanRoomInfo remoteDetailedInfo;

  public CreateCleanRoom setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateCleanRoom setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateCleanRoom setRemoteDetailedInfo(CentralCleanRoomInfo remoteDetailedInfo) {
    this.remoteDetailedInfo = remoteDetailedInfo;
    return this;
  }

  public CentralCleanRoomInfo getRemoteDetailedInfo() {
    return remoteDetailedInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCleanRoom that = (CreateCleanRoom) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(remoteDetailedInfo, that.remoteDetailedInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, remoteDetailedInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoom.class)
        .add("comment", comment)
        .add("name", name)
        .add("remoteDetailedInfo", remoteDetailedInfo)
        .toString();
  }
}
