// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Set object ACL */
public class SetRequest {
  /** */
  @JsonProperty("access_control_list")
  private java.util.List<AccessControl> accessControlList;

  /**
   * Object ID. The ACL for the object with this UUID is overwritten by this request's POST content.
   */
  private String objectId;

  /** The type of object permission to set. */
  private ObjectTypePlural objectType;

  public SetRequest setAccessControlList(java.util.List<AccessControl> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public java.util.List<AccessControl> getAccessControlList() {
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
}
