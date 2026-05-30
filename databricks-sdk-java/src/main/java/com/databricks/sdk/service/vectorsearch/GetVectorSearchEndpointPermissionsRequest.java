// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetVectorSearchEndpointPermissionsRequest {
  /** The vector search endpoint for which to get or manage permissions. */
  @JsonIgnore private String endpointId;

  public GetVectorSearchEndpointPermissionsRequest setEndpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  public String getEndpointId() {
    return endpointId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetVectorSearchEndpointPermissionsRequest that = (GetVectorSearchEndpointPermissionsRequest) o;
    return Objects.equals(endpointId, that.endpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetVectorSearchEndpointPermissionsRequest.class)
        .add("endpointId", endpointId)
        .toString();
  }
}
