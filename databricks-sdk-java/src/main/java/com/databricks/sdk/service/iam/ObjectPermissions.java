// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ObjectPermissions class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ObjectPermissions {
  /** */
  @JsonProperty("access_control_list")
  private Collection<AccessControlResponse> accessControlList;

  /** */
  @JsonProperty("object_id")
  private String objectId;

  /** */
  @JsonProperty("object_type")
  private String objectType;

  /**
   * <p>Setter for the field <code>accessControlList</code>.</p>
   *
   * @param accessControlList a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.ObjectPermissions} object
   */
  public ObjectPermissions setAccessControlList(
      Collection<AccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  /**
   * <p>Getter for the field <code>accessControlList</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<AccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  /**
   * <p>Setter for the field <code>objectId</code>.</p>
   *
   * @param objectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ObjectPermissions} object
   */
  public ObjectPermissions setObjectId(String objectId) {
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
   * @param objectType a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ObjectPermissions} object
   */
  public ObjectPermissions setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * <p>Getter for the field <code>objectType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getObjectType() {
    return objectType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ObjectPermissions that = (ObjectPermissions) o;
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
    return new ToStringer(ObjectPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
