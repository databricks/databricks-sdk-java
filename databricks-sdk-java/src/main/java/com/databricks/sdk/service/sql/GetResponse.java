// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetResponse {
  /** */
  @JsonProperty("access_control_list")
  private Collection<AccessControl> accessControlList;

  /** A singular noun object type. */
  @JsonProperty("object_id")
  private ObjectType objectId;

  /** An object's type and UUID, separated by a forward slash (/) character. */
  @JsonProperty("object_type")
  private String objectType;

  /**
   * <p>Setter for the field <code>accessControlList</code>.</p>
   *
   * @param accessControlList a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.GetResponse} object
   */
  public GetResponse setAccessControlList(Collection<AccessControl> accessControlList) {
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
   * @param objectId a {@link com.databricks.sdk.service.sql.ObjectType} object
   * @return a {@link com.databricks.sdk.service.sql.GetResponse} object
   */
  public GetResponse setObjectId(ObjectType objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * <p>Getter for the field <code>objectId</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.ObjectType} object
   */
  public ObjectType getObjectId() {
    return objectId;
  }

  /**
   * <p>Setter for the field <code>objectType</code>.</p>
   *
   * @param objectType a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetResponse} object
   */
  public GetResponse setObjectType(String objectType) {
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
    GetResponse that = (GetResponse) o;
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
    return new ToStringer(GetResponse.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
