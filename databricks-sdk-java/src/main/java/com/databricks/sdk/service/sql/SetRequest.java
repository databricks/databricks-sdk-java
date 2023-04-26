// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Set object ACL
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SetRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<AccessControl> accessControlList;

  /**
   * Object ID. The ACL for the object with this UUID is overwritten by this request's POST content.
   */
  private String objectId;

  /** The type of object permission to set. */
  private ObjectTypePlural objectType;

  /**
   * <p>Setter for the field <code>accessControlList</code>.</p>
   *
   * @param accessControlList a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.SetRequest} object
   */
  public SetRequest setAccessControlList(Collection<AccessControl> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  /**
   * <p>Getter for the field <code>accessControlList</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<AccessControl> getAccessControlList() {
    return accessControlList;
  }

  /**
   * <p>Setter for the field <code>objectId</code>.</p>
   *
   * @param objectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.SetRequest} object
   */
  public SetRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * <p>Getter for the field <code>objectId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getObjectId() {
    return objectId;
  }

  /**
   * <p>Setter for the field <code>objectType</code>.</p>
   *
   * @param objectType a {@link com.databricks.sdk.service.sql.ObjectTypePlural} object
   * @return a {@link com.databricks.sdk.service.sql.SetRequest} object
   */
  public SetRequest setObjectType(ObjectTypePlural objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * <p>Getter for the field <code>objectType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.ObjectTypePlural} object
   */
  public ObjectTypePlural getObjectType() {
    return objectType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetRequest that = (SetRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, objectId, objectType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SetRequest.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
