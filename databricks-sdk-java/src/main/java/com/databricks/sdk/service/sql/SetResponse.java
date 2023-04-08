// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetResponse {
  /** */
  @JsonProperty("access_control_list")
  private java.util.List<AccessControl> accessControlList;

  /** A singular noun object type. */
  @JsonProperty("object_id")
  private ObjectType objectId;

  /** An object's type and UUID, separated by a forward slash (/) character. */
  @JsonProperty("object_type")
  private String objectType;

  public SetResponse setAccessControlList(java.util.List<AccessControl> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public java.util.List<AccessControl> getAccessControlList() {
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
}
