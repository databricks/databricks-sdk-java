// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RegisteredModelPermissions {
  /** */
  @JsonProperty("access_control_list")
  private Collection<RegisteredModelAccessControlResponse> accessControlList;

  /** */
  @JsonProperty("object_id")
  private String objectId;

  /** */
  @JsonProperty("object_type")
  private String objectType;

  public RegisteredModelPermissions setAccessControlList(
      Collection<RegisteredModelAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<RegisteredModelAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public RegisteredModelPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public RegisteredModelPermissions setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegisteredModelPermissions that = (RegisteredModelPermissions) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
