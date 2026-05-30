// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class VectorSearchEndpointPermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<VectorSearchEndpointAccessControlRequest> accessControlList;

  /** The vector search endpoint for which to get or manage permissions. */
  @JsonIgnore private String endpointId;

  public VectorSearchEndpointPermissionsRequest setAccessControlList(
      Collection<VectorSearchEndpointAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<VectorSearchEndpointAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public VectorSearchEndpointPermissionsRequest setEndpointId(String endpointId) {
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
    VectorSearchEndpointPermissionsRequest that = (VectorSearchEndpointPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(endpointId, that.endpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, endpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(VectorSearchEndpointPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("endpointId", endpointId)
        .toString();
  }
}
