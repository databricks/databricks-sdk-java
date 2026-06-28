// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Set object ACL */
@Generated
public class SetRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<AccessControl> accessControlList;

  /**
   * Object ID. The ACL for the object with this UUID is overwritten by this request's POST content.
   */
  @JsonIgnore private String objectId;

  /** The type of object permission to set. */
  @JsonIgnore private ObjectTypePlural objectType;

  public SetRequest setAccessControlList(Collection<AccessControl> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<AccessControl> getAccessControlList() {
    return accessControlList;
  }

  public SetRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public SetRequest setObjectType(ObjectTypePlural objectType) {
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
    SetRequest that = (SetRequest) o;
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
    return new ToStringer(SetRequest.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
