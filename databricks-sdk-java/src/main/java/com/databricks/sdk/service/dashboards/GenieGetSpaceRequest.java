// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GenieGetSpaceRequest {
  /** The ID associated with the Genie space */
  @JsonIgnore private String spaceId;

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
    return Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetSpaceRequest.class).add("spaceId", spaceId).toString();
  }
}
