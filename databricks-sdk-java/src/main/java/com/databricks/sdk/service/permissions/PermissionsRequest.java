// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class PermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<AccessControlRequest> accessControlList;

  /** */
  private String requestObjectId;

  /** <needs content> */
  private String requestObjectType;

  public PermissionsRequest setAccessControlList(
      Collection<AccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<AccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public PermissionsRequest setRequestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
    return this;
  }

  public String getRequestObjectId() {
    return requestObjectId;
  }

  public PermissionsRequest setRequestObjectType(String requestObjectType) {
    this.requestObjectType = requestObjectType;
    return this;
  }

  public String getRequestObjectType() {
    return requestObjectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionsRequest that = (PermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(requestObjectId, that.requestObjectId)
        && Objects.equals(requestObjectType, that.requestObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, requestObjectId, requestObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("requestObjectId", requestObjectId)
        .add("requestObjectType", requestObjectType)
        .toString();
  }
}
