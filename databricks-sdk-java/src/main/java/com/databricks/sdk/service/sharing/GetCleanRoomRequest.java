// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a clean room */
@Generated
public class GetCleanRoomRequest {
  /** Whether to include remote details (central) on the clean room. */
  @JsonIgnore
  @QueryParam("include_remote_details")
  private Boolean includeRemoteDetails;

  /** The name of the clean room. */
  @JsonIgnore private String name;

  public GetCleanRoomRequest setIncludeRemoteDetails(Boolean includeRemoteDetails) {
    this.includeRemoteDetails = includeRemoteDetails;
    return this;
  }

  public Boolean getIncludeRemoteDetails() {
    return includeRemoteDetails;
  }

  public GetCleanRoomRequest setName(String name) {
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
    GetCleanRoomRequest that = (GetCleanRoomRequest) o;
    return Objects.equals(includeRemoteDetails, that.includeRemoteDetails)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeRemoteDetails, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCleanRoomRequest.class)
        .add("includeRemoteDetails", includeRemoteDetails)
        .add("name", name)
        .toString();
  }
}
