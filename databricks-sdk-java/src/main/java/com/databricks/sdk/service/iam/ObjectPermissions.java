// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The permissions set on an object, with one entry per principal that holds a permission on it. */
@Generated
public class ObjectPermissions {
  /**
   * Permissions on the object, with one entry per principal. Each entry lists the principal's
   * direct and inherited permission levels.
   */
  @JsonProperty("access_control_list")
  private Collection<AccessControlResponse> accessControlList;

  /**
   * Path that identifies the object in the access control list, built from the object type and the
   * object id.
   */
  @JsonProperty("object_id")
  private String objectId;

  /**
   * Type of the object, as recorded in the access control list. It can differ from the
   * `request_object_type` path segment, for example a request for `clusters` returns `cluster`.
   */
  @JsonProperty("object_type")
  private String objectType;

  public ObjectPermissions setAccessControlList(
      Collection<AccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<AccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public ObjectPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public ObjectPermissions setObjectType(String objectType) {
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
    ObjectPermissions that = (ObjectPermissions) o;
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
    return new ToStringer(ObjectPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
