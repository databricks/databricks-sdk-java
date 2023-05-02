// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SetResponse {
  /** */
  @JsonProperty("access_control_list")
  private Collection<AccessControl> accessControlList;

  /** A singular noun object type. */
  @JsonProperty("object_id")
  private ObjectType objectId;

  /** An object's type and UUID, separated by a forward slash (/) character. */
  @JsonProperty("object_type")
  private String objectType;

  public SetResponse setAccessControlList(Collection<AccessControl> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<AccessControl> getAccessControlList() {
    return accessControlList;
  }

  public SetResponse setObjectId(ObjectType objectId) {
    this.objectId = objectId;
    return this;
  }

  public ObjectType getObjectId() {
    return objectId;
  }

  public SetResponse setObjectType(String objectType) {
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
    SetResponse that = (SetResponse) o;
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
    return new ToStringer(SetResponse.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
