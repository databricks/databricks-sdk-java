// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ServingEndpointPermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<ServingEndpointAccessControlRequest> accessControlList;

  /** The serving endpoint for which to get or manage permissions. */
  @JsonIgnore private String servingEndpointId;

  public ServingEndpointPermissionsRequest setAccessControlList(
      Collection<ServingEndpointAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ServingEndpointAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public ServingEndpointPermissionsRequest setServingEndpointId(String servingEndpointId) {
    this.servingEndpointId = servingEndpointId;
    return this;
  }

  public String getServingEndpointId() {
    return servingEndpointId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServingEndpointPermissionsRequest that = (ServingEndpointPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(servingEndpointId, that.servingEndpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, servingEndpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(ServingEndpointPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("servingEndpointId", servingEndpointId)
        .toString();
  }
}
