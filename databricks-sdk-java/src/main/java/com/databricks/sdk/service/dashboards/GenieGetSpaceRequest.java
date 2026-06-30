// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GenieGetSpaceRequest {
  /**
   * Whether to include the serialized space export in the response. Requires at least CAN EDIT
   * permission on the space.
   */
  @JsonIgnore
  @QueryParam("include_serialized_space")
  private Boolean includeSerializedSpace;

  /** The ID associated with the Genie space */
  @JsonIgnore private String spaceId;

  public GenieGetSpaceRequest setIncludeSerializedSpace(Boolean includeSerializedSpace) {
    this.includeSerializedSpace = includeSerializedSpace;
    return this;
  }

  public Boolean getIncludeSerializedSpace() {
    return includeSerializedSpace;
  }

  public GenieGetSpaceRequest setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieGetSpaceRequest that = (GenieGetSpaceRequest) o;
    return Objects.equals(includeSerializedSpace, that.includeSerializedSpace)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSerializedSpace, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetSpaceRequest.class)
        .add("includeSerializedSpace", includeSerializedSpace)
        .add("spaceId", spaceId)
        .toString();
  }
}
