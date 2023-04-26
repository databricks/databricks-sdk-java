// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Transfer object ownership
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TransferOwnershipRequest {
  /** Email address for the new owner, who must exist in the workspace. */
  @JsonProperty("new_owner")
  private String newOwner;

  /** The ID of the object on which to change ownership. */
  private TransferOwnershipObjectId objectId;

  /** The type of object on which to change ownership. */
  private OwnableObjectType objectType;

  /**
   * <p>Setter for the field <code>newOwner</code>.</p>
   *
   * @param newOwner a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.TransferOwnershipRequest} object
   */
  public TransferOwnershipRequest setNewOwner(String newOwner) {
    this.newOwner = newOwner;
    return this;
  }

  /**
   * <p>Getter for the field <code>newOwner</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNewOwner() {
    return newOwner;
  }

  /**
   * <p>Setter for the field <code>objectId</code>.</p>
   *
   * @param objectId a {@link com.databricks.sdk.service.sql.TransferOwnershipObjectId} object
   * @return a {@link com.databricks.sdk.service.sql.TransferOwnershipRequest} object
   */
  public TransferOwnershipRequest setObjectId(TransferOwnershipObjectId objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * <p>Getter for the field <code>objectId</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.TransferOwnershipObjectId} object
   */
  public TransferOwnershipObjectId getObjectId() {
    return objectId;
  }

  /**
   * <p>Setter for the field <code>objectType</code>.</p>
   *
   * @param objectType a {@link com.databricks.sdk.service.sql.OwnableObjectType} object
   * @return a {@link com.databricks.sdk.service.sql.TransferOwnershipRequest} object
   */
  public TransferOwnershipRequest setObjectType(OwnableObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * <p>Getter for the field <code>objectType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.OwnableObjectType} object
   */
  public OwnableObjectType getObjectType() {
    return objectType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransferOwnershipRequest that = (TransferOwnershipRequest) o;
    return Objects.equals(newOwner, that.newOwner)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(newOwner, objectId, objectType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TransferOwnershipRequest.class)
        .add("newOwner", newOwner)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
