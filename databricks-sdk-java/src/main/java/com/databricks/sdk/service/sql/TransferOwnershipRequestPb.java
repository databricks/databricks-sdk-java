// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Transfer object ownership */
@Generated
class TransferOwnershipRequestPb {
  @JsonProperty("new_owner")
  private String newOwner;

  @JsonIgnore private TransferOwnershipObjectId objectId;

  @JsonIgnore private OwnableObjectType objectType;

  public TransferOwnershipRequestPb setNewOwner(String newOwner) {
    this.newOwner = newOwner;
    return this;
  }

  public String getNewOwner() {
    return newOwner;
  }

  public TransferOwnershipRequestPb setObjectId(TransferOwnershipObjectId objectId) {
    this.objectId = objectId;
    return this;
  }

  public TransferOwnershipObjectId getObjectId() {
    return objectId;
  }

  public TransferOwnershipRequestPb setObjectType(OwnableObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  public OwnableObjectType getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransferOwnershipRequestPb that = (TransferOwnershipRequestPb) o;
    return Objects.equals(newOwner, that.newOwner)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newOwner, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(TransferOwnershipRequestPb.class)
        .add("newOwner", newOwner)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
