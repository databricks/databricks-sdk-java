// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get object ACL
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetDbsqlPermissionRequest {
  /** Object ID. An ACL is returned for the object with this UUID. */
  private String objectId;

  /** The type of object permissions to check. */
  private ObjectTypePlural objectType;

  /**
   * <p>Setter for the field <code>objectId</code>.</p>
   *
   * @param objectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetDbsqlPermissionRequest} object
   */
  public GetDbsqlPermissionRequest setObjectId(String objectId) {
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
   * @return a {@link com.databricks.sdk.service.sql.GetDbsqlPermissionRequest} object
   */
  public GetDbsqlPermissionRequest setObjectType(ObjectTypePlural objectType) {
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
    GetDbsqlPermissionRequest that = (GetDbsqlPermissionRequest) o;
    return Objects.equals(objectId, that.objectId) && Objects.equals(objectType, that.objectType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetDbsqlPermissionRequest.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
