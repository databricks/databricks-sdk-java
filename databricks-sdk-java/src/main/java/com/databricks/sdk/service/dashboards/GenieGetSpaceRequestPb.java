// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get Genie Space */
@Generated
class GenieGetSpaceRequestPb {
  @JsonIgnore private String spaceId;

  public GenieGetSpaceRequestPb setSpaceId(String spaceId) {
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
    GenieGetSpaceRequestPb that = (GenieGetSpaceRequestPb) o;
    return Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetSpaceRequestPb.class).add("spaceId", spaceId).toString();
  }
}
