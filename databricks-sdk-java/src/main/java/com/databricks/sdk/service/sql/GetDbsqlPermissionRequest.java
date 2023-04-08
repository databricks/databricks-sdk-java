// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get object ACL */
public class GetDbsqlPermissionRequest {
  /** Object ID. An ACL is returned for the object with this UUID. */
  private String objectId;

  /** The type of object permissions to check. */
  private ObjectTypePlural objectType;

  public GetDbsqlPermissionRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public GetDbsqlPermissionRequest setObjectType(ObjectTypePlural objectType) {
    this.objectType = objectType;
    return this;
  }

  public ObjectTypePlural getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetDbsqlPermissionRequest that = (GetDbsqlPermissionRequest) o;
    return Objects.equals(objectId, that.objectId) && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDbsqlPermissionRequest.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
